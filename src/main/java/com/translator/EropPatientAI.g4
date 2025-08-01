
// Complete Grammar for EROP Language - EU AI Act Compliance Contract
grammar EropPatientAI;

// Contract definition - should include both declarations and rules
contractDocument
   : declaration+ WS* ruleSet
   ;

declaration
       : roleplayerDeclaration # RolePlayer
       | businessOpDeclaration # GovernanceOperation
       | compobligDeclaration # CompositeObligation
       ;

roleplayerDeclaration
   : ROLEPLAYER identifierList SEMICOLON
   ;

businessOpDeclaration
   : BUSINESSOP businessOpReference SEMICOLON
   ;

compobligDeclaration
   : COMPOBLIG IDENTIFIER BRA identifierList KET SEMICOLON
   ;

// Helper rule for comma-separated identifiers
identifierList
   : IDENTIFIER (COMMA IDENTIFIER)*
   ;

// Rule set structure
ruleSet
   : singlerule+
   ;

// Rule structure
singlerule
   : RULE rulename WHEN lhs THEN rhs END
   ;

rulename
   : DQUOTE IDENTIFIER DQUOTE
   ;

// Left hand side structure
lhs
   : eventmatch constraintList?
   ;

constraintList
   : constraint (logicalOperator constraint)*
   ;

// Event match with support for multiple operations
eventmatch
   : IDENTIFIER MATCHES BRA eventCondition (COMMA eventCondition)* KET
   ;

eventCondition
   : (BOTYPE EQUALS IDENTIFIER) # GovernanceOperationType
   | (ORIGINATOR EQUALS IDENTIFIER) # Originator
   | (RESPONDER EQUALS IDENTIFIER) # Responder
   | (OUTCOME EQUALS outcome) # OutcomeCondition
   ;

// Support for multiple business operations
businessOpReference
   : IDENTIFIER (COMMA IDENTIFIER)*
   ;

// Fixed constraint hierarchy - eliminated mutual left recursion
constraint
   : NOT constraint # NotConstraint
   | BRA constraintList KET # Constraints
   | attributeConstraint # AttributeConstraintItem
   | historicalQuery # HistoricalQueryItem
   | ropConstraint # RopConstraintItem
   ;

logicalOperator
   : (AND | OR)
   ;

attributeConstraint
   : roleplayerConstraint # RolePlayerConstraintAttr
   | outcomeConstraint # OutcomeConstraintAttr
   | timeConstraint # TimeConstraintAttr
   | booleanConstraint # BooleanConstraintAttr
   ;

// Role player constraint syntax
roleplayerConstraint
   : IDENTIFIER DOT (ORIGINATOR | RESPONDER) (EQUALS | NOTEQ) IDENTIFIER
   ;

outcomeConstraint
   : IDENTIFIER DOT OUTCOME (EQUALS | NOTEQ) outcome
   ;

// Boolean constraints for complex conditions
booleanConstraint
   : IDENTIFIER IN IDENTIFIER DOT ropset # InDotRopSet
   | IDENTIFIER DOT BOTYPE (EQUALS | NOTEQ) IDENTIFIER # BoTypeEqualNotEq
   | IDENTIFIER DOT (ORIGINATOR | RESPONDER) (EQUALS | NOTEQ) IDENTIFIER # OriginatorResponderEqNotEq
   ;

timeConstraint
   : timeDirectComparison # TimeDirectComparisonConstraint
   | timePartialComparison # TimePartialComparisonConstraint
   ;

timeDirectComparison
   : IDENTIFIER DOT TIMESTAMP (EQUALS | NOTEQ | BEFORE | AFTER) absoluteTime
   ;

timePartialComparison
   : IDENTIFIER DOT DAY (EQUALS | NOTEQ) WEEKDAY # EqualsNotEqWeekDay
   | IDENTIFIER DOT DAY (IN | NOTIN) SQUAREBRA WEEKDAY DOT DOT WEEKDAY SQUAREKET # DayInNotInWeekDay
   | IDENTIFIER DOT DATE (EQUALS | NOTEQ | BEFORE | AFTER) DIGIT DIGIT # DateEqNotEqBeforeAfter
   | IDENTIFIER DOT HOUR (EQUALS | NOTEQ | BEFORE | AFTER) DIGIT+ # HourEqualsNotEqBeforeAfter
   | IDENTIFIER DOT TIME (IN | NOTIN) SQUAREBRA DIGIT+ DOT DOT DOT DIGIT+ SQUAREKET # TimeInNotInDigit
   ;

// Historical query support
historicalQuery
   : (HAPPENED | CTHAPPENED) BRA IDENTIFIER COMMA rolePlayerRef COMMA rolePlayerRef COMMA outcome COMMA timeConstraintString KET
   ;

rolePlayerRef
   : IDENTIFIER # RolePlayerRefId
   | ASTERISK # RolePlayerAsterisk
   ;

timeConstraintString
   : DQUOTE timeConstraintContent DQUOTE # TimeConstraintText
   | ASTERISK # TimeConstraintAsterisk
   ;

timeConstraintContent
   : (LOWER | UPPER | DIGIT | COLON | DASH | DOT | LESS | GREATER | EQUALS | QUOTE)*
   ;

// ROP constraint syntax
ropConstraint
   : IDENTIFIER IN IDENTIFIER DOT ropset # InRopSet
   | IDENTIFIER NOTIN IDENTIFIER DOT ropset # NotInRopSet
   ;

// Right hand side structure with status guards support
rhs
   : statusGuardBlock+ # StatusGuardBlockRhs
   | rhsaction+ # RhsactionLabel
   ;

statusGuardBlock
   : statusGuard COLON rhsactionList
   ;

statusGuard
   : SUCCESS # Success
   | TECFAIL # TecFail
   | BIZFAIL # BizFail
   | INITFAIL # InitFail
   | OTHERWISE # Otherwise
   ;

rhsactionList
   : rhsaction+
   ;

rhsaction
   : ifstatement # IfstatementAction
   | termaction # TermactionLabel
   | passaction # PassactionLabel
   | addaction # AddActionLabel
   | remaction # RemactionLabel
//   | commentAction
   ;

// Enhanced if-then-else-endif statement - fixed left recursion
ifstatement
   : IF conditionExpr THEN rhsactionList (ELSE rhsactionList)? ENDIF
   ;

conditionExpr
   : conditionTerm (logicalOperator conditionTerm)*
   ;

conditionTerm
   : NOT conditionTerm # NotConditionTerm
   | BRA conditionExpr KET # ConditionExpressionTerm
   | simpleCondition # SimpleConditionTerm
   ;

simpleCondition
   : IDENTIFIER DOT (ORIGINATOR | RESPONDER) EQUALS IDENTIFIER #OriginatorResponderSimpleCondition
   | IDENTIFIER IN IDENTIFIER DOT ropset # InRopSetSimpleCondition
   | historicalQuery # HistoricalQuerySimpleCondition
   | logicalExpression # LogicalExpressionSimpleCondition
   | comparisonExpression # ComparisonExpressionSimpleCondition
   ;

logicalExpression
   : IDENTIFIER DOT BOTYPE EQUALS  IDENTIFIER # BoTypeLogicalExpression
   | happened_expression # HappenedExpression
   ;

// Support for count comparisons in historical queries
comparisonExpression
   : CTHAPPENED BRA historicalParams KET (GREATEREQ | LESSEQ | EQUALS) DIGIT+
   ;

happened_expression
   : HAPPENED BRA historicalParams KET
   ;

historicalParams
   : IDENTIFIER COMMA rolePlayerRef COMMA rolePlayerRef COMMA outcome COMMA timeConstraintString
   ;

termaction
   : TERMINATE BRA DQUOTE outcome DQUOTE KET SEMICOLON
   ;

passaction
   : PASS
   ;

// Enhanced add/remove actions with time support
addaction
   : IDENTIFIER DOT ropset ADDROP ropEntity (BRA actionResponder COMMA timeSpec KET)? SEMICOLON
   ;

remaction
   : IDENTIFIER DOT ropset REMROP ropEntity (BRA actionResponder COMMA timeSpec KET)? SEMICOLON
   ;

actionResponder
   :  IDENTIFIER # ActionResponderIdentifier
   ;

ropEntity
   : IDENTIFIER
   ;

// Rules for both lhs and rhs
outcome
   : SUCCESS # SuccessOutcome
   | TECFAIL # TecFailOutcome
   | INITFAIL # InitFailOutcome
   | BIZFAIL # BizFailOutcome
   ;

ropset
   : RIGHTS # RightsRopSet
   | OBLIGS # ObligsRopSet
   | PROHIBS # ProhibitionsRopSet
   ;

timeSpec
   : relativeTime # RelativeTimeSpec
   | absoluteTime # AbsoluteTimeSpec
   ;

absoluteTime
   : DQUOTE DIGIT DIGIT DASH DIGIT DIGIT DASH DIGIT DIGIT DIGIT DIGIT SPACE DIGIT DIGIT COLON DIGIT DIGIT COLON DIGIT DIGIT DQUOTE
   ;

relativeTime
   : DQUOTE DIGIT+ timeUnit DQUOTE
   ;

timeUnit
   : 'h'
   | 'd'
   | 'm'
   | 's'
   | 'hour'
   | 'day'
   | 'minute'
   | 'month'
   | 'year'
   ;

// Tokens for declaration section
ROLEPLAYER : 'roleplayer';
BUSINESSOP : 'businessoperation';
COMPOBLIG : 'compoblig';

// Tokens for basic rule structure
RULE : 'rule';
END : 'end';
WHEN : 'when';
THEN : 'then';

// Tokens for left hand side
MATCHES : 'matches';
HAPPENED : 'happened';
CTHAPPENED : 'counthappened';
BEFORE : 'before';
AFTER : 'after';
BOTYPE : 'botype';
ORIGINATOR : 'originator';
RESPONDER : 'responder';
OUTCOME : 'outcome';
TIMESTAMP : 'timestamp';
DAY : 'day';
DATE : 'date';
TIME : 'time';
SECOND : 'second';
MINUTE : 'minute';
HOUR : 'hour';
MONTH : 'month';
YEAR : 'year';
IN : 'in';
NOTIN : '!in';

// Tokens occurring in both lhs and rhs
SUCCESS : 'Success';
TECFAIL : 'TecFail';
BIZFAIL : 'BizFail';
INITFAIL : 'InitFail';

// Right hand side tokens
ADDROP : '+=';
REMROP : '-=';
TERMINATE : 'terminate';
PASS : 'pass';
OBLIGS : 'obligs';
RIGHTS : 'rights';
PROHIBS : 'prohibs';

// Tokens for structured statements
IF : 'if';
ELSE : 'else';
ENDIF : 'endif';
OTHERWISE : 'Otherwise';

WEEKDAY
   : 'Mon' | 'Tue' | 'Wed' | 'Thu' | 'Fri' | 'Sat' | 'Sun'
   ;

MONTHID
   : 'Jan' | 'Feb' | 'Mar' | 'Apr' | 'May' | 'Jun'
   | 'Jul' | 'Aug' | 'Sep' | 'Oct' | 'Nov' | 'Dec'
   ;

// Operators - must come before IDENTIFIER
EQUALS : '==';
NOTEQ : '!=';
AND : '&&';
OR : '||';
NOT : '!';
LESS : '<';
LESSEQ : '<=';
GREATER : '>';
GREATEREQ : '>=';

// Special characters and operators
ASTERISK : '*';
SEMICOLON : ';';
COLON : ':';
HASH : '//';
BRA : '(';
KET : ')';
COMMA : ',';
QUOTE : '\'';
DQUOTE : '"';
SQUAREBRA : '[';
SQUAREKET : ']';
DOT : '.';
DASH : '-';
UNDERSCORE : '_';
BACKSLASH : '\\';

// Identifiers - MUST come after all keywords
IDENTIFIER
   : (UPPER | LOWER) (LOWER | UPPER | DIGIT)*
   ;
//ruleNameContent
//   : (UPPER | LOWER | DIGIT | UNDERSCORE)?
//   ;
// Character classes
LOWER : 'a'..'z';
UPPER : 'A'..'Z';
DIGIT : '0'..'9';

// Unified whitespace handling - skip all whitespace
WS : [ \t\r\n]+ -> skip;
SPACE: ' ';
   // Whitespace includes spaces, newlines and tabs
//WS
//   : (' ' | '\t' | '\r' | '\n')+
//   ;
// Comments - handle both inline and standalone comments
COMMENT :'//' .*? '\n' -> skip;