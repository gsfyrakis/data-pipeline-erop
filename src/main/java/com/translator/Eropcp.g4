// Grammar for EROP language
grammar Eropcp;
// Package specification
@header { package com.translator.antlr; }
// Contract definition
contractDocument: WS? declarationSection WS? ruleSet WS?;
// Structure of the declaration section
declarationSection: declaration (WS declaration)*;
declaration: businessOpDeclaration | roleplayerDeclaration | compobligDeclaration;
//businessOpDeclaration: BUSINESSOP WS bopIdentifier (COMMA WS? bopIdentifier)* SEMICOLON;
//roleplayerDeclaration: ROLEPLAYER WS roleplayeridentifyer (COMMA WS? roleplayeridentifyer)* SEMICOLON;
businessOpDeclaration: BUSINESSOP WS upalphanum (COMMA upalphanum)* SEMICOLON;
roleplayerDeclaration: ROLEPLAYER WS alphanum (COMMA alphanum)* SEMICOLON;
compobligDeclaration: COMPOBLIG WS upalphanum BRA upalphanum (COMMA WS? upalphanum)+ KET SEMICOLON;
// Rule set structure
ruleSet : singlerule (WS singlerule)*;
// Rule structure
singlerule: RULE WS rulename WS WHEN WS lhs WS THEN WS rhs WS END;
// : 'rule' WS rulename WS lhs WS rhs WS ’end’;
rulename: '"' upalphanum '"';
// Left hand side structure
lhs : eventmatch WS BRA (eventMcond COMMA?)* KET (WS constraint)*;
eventmatch: alphanum WS MATCHES;
eventMcond: field WS? oper WS? (alphanum|upalphanum);
rolePlayerConstraintIssuer: (ORIGINATOR|RESPONDER);
field: (BOTYPE|OUTCOME|ORIGINATOR|RESPONDER|TIMESTAMP);
oper: (EQUALS|NOTEQ);
timeOperators: (EQUALS|NOTEQ|BEFORE|AFTER);
rangeOperators: (IN|NOTIN);
andOR: (AND|OR);
bool: (BOOLEANTRUE|BOOLEANFALSE);
constraint: attributeConstraint | historicalQuery | ropConstraint;
attributeConstraint: roleplayerConstraint | outcomeConstraint | timeConstraint;
roleplayerConstraint: alphanum DOT rolePlayerConstraintIssuer WS? oper WS? alphanum;
outcomeConstraint: upalphanum DOT outcome WS? oper WS? bool;
timeConstraint: timeDirectComparison | timePartialComparison;
timeDirectComparison: alphanum DOT TIMESTAMP WS? timeOperators WS? absoluteTime;
timePartialComparison: alphanum DOT dayKey WS? oper WS? dayOfWeek
|alphanum DOT dayKey WS? rangeOperators WS? dayRange
|alphanum DOT dateKey WS? timeOperators WS? dateIdent
|alphanum DOT dateKey WS? rangeOperators WS? dateRange
|alphanum DOT monthKey WS? timeOperators WS? monthIdent
|alphanum DOT monthKey WS? rangeOperators WS? monthRange
|alphanum DOT yearKey WS? timeOperators WS? yearIdent
|alphanum DOT yearKey WS? rangeOperators WS? yearRange;
dayKey: DAY;
dayOfWeek: WEEKDAY;
dateKey: DATE;
dateIdent: DIGIT DIGIT;
monthKey: MONTH;
monthIdent: MONTHID;
yearKey: YEAR;
yearIdent: DIGIT DIGIT DIGIT DIGIT;
dayRange: SQUAREBRA WEEKDAY DOT DOT WEEKDAY SQUAREKET;
dateRange: SQUAREBRA DIGIT DIGIT DOT DOT DIGIT DIGIT SQUAREKET;
monthRange: SQUAREBRA MONTHID DOT DOT MONTHID SQUAREKET;
yearRange: SQUAREBRA DIGIT DIGIT DIGIT DIGIT DOT DOT DIGIT DIGIT DIGIT DIGIT SQUAREKET;
historicalQueryOp: (HAPPENED|CTHAPPENED);
historicalQuery: historicalQueryOp WS? BRA upalphanum COMMA WS? alphanum
COMMA WS? alphanum COMMA WS? genericString COMMA WS? outcome KET;
ropConstraint: upalphanum WS? rangeOperators WS? alphanum DOT ropset;
// Right hand side structure
rhs : rhsaction (WS? rhsActionNoIfs)*;
rhsActionNoIfs: (termaction|passaction|resetaction|addRemAction|outcomeConstraint);
rhsaction: (ifstatement|termaction|passaction|resetaction|addRemAction|outcomeConstraint);
ifThen: THEN WS rhsActionNoIfs (WS (addRemAction|outcomeConstraint|resetaction))*;
ifElse: (WS ELSE WS rhsActionNoIfs (WS (addRemAction|outcomeConstraint|resetaction))*)?;
// : addaction|remaction|termaction|passaction SEMICOLON;
// Support for if-then-else-endif statement
ifstatement: IF WS condition WS ifThen ifElse WS ENDIF;
condition: BRA WS? NOT? constraint (WS? andOR WS? constraint)* WS? KET;
resetaction: RESET WS alphanum;
termaction: TERMINATE WS? BRA outcome KET;
passaction: PASS;
addRemRopOperator: (ADDROP|REMROP);
addRemAction: alphanum DOT ropset WS? addRemRopOperator WS? upalphanum BRA alphanum (COMMA timeSpec)? KET;
//addaction: alphanum DOT ropset WS? ADDROP WS? upalphanum BRA timeSpec? KET;
//remaction: alphanum DOT ropset WS? REMROP WS? upalphanum BRA timeSpec? KET;
// Rules for both lhs and rhs
outcome: SUCCESS | TECFAIL | INITFAIL | BIZFAIL;
ropset: RIGHTS|OBLIGS|PROHIBS;
timeSpec: absoluteTime; //| relativeTime; UNCOMMENT IF FIXED LATER
absoluteTime: DQUOTE DIGIT DIGIT DASH DIGIT DIGIT DASH DIGIT DIGIT DIGIT DIGIT
WS DIGIT DIGIT COLON DIGIT DIGIT COLON DIGIT DIGIT DQUOTE;
//relativeTime: relTimeElement+;
//relTimeElement: DIGIT+ ('s'|'m'|'h'|'d'|'M'|'Y');
// Token for declaration section
ROLEPLAYER: 'roleplayer';
BUSINESSOP: 'businessoperation';
COMPOBLIG: 'compoblig';
// Tokens for Basic rule structure
RULE: 'rule';
END: 'end';
WHEN: 'when';
THEN: 'then';
// Tokens for left hand side
MATCHES: 'matches';
HAPPENED: 'happened';
CTHAPPENED: 'counthappened';
BEFORE: 'before';
AFTER: 'after';
BOTYPE: 'botype';
ORIGINATOR: 'originator';
RESPONDER: 'responder';
OUTCOME: 'outcome';
TIMESTAMP: 'timestamp';
DAY : 'day';
DATE: 'date';
SECOND: 'second';
MINUTE: 'minute';
HOUR: 'hour';
MONTH: 'month';
YEAR: 'year';
IN: 'in';
NOTIN: '!in';
EQUALS: '==';
NOTEQ: '!=';
AND: '&&';
OR: '||';
NOT: '!';
WEEKDAY: 'Mon' | 'Tue' | 'Wed' | 'Thu' | 'Fri' | 'Sat' | 'Sun';
MONTHID: 'Jan' | 'Feb' | 'Mar' | 'Apr' | 'May' | 'Jun'
|'Jul' | 'Aug' | 'Sep' | 'Oct' | 'Nov' | 'Dec';
// Tokens occurring in both lhs and rhs
SUCCESS: 'Success';
TECFAIL: 'TecFail';
BIZFAIL: 'BizFail';
INITFAIL: 'InitFail';
BOOLEANTRUE: 'true';
BOOLEANFALSE: 'false';
// Right hand side tokens
ADDROP: '+=';
REMROP: '-=';
TERMINATE: 'terminate';
PASS: 'pass';
RESET: 'reset';
OBLIGS: 'obligs';
RIGHTS: 'rights';
PROHIBS: 'prohibs';
// Tokens for Right hand side: structured statements
IF: 'if';
//THEN: 'then';
ELSE: 'else';
ENDIF: 'endif';
// Tokens for Right hand side: status guards
OTHERWISE: 'Otherwise';
// Identifiers, with uppercase and lowercase initials
upalphanum: UPPER (LOWER | UPPER | DIGIT)*;
alphanum: LOWER (LOWER | UPPER | DIGIT)*;
roleplayeridentifyer: alphanum; // change so that only alphanum is used.
bopIdentifier: upalphanum;
genericString: DQUOTE (LOWER | UPPER | DIGIT | WS | SEMICOLON
| COLON | COMMA | QUOTE | DOT | DASH | BACKSLASH)* DQUOTE;
// Alphabet, numbers
//LOWER: [a-z];
//UPPER: [A-Z];
//DIGIT: [0-9];
LOWER: 'a'..'z';
UPPER: 'A'..'Z';
DIGIT: '0'..'9';
// Various characters
SEMICOLON: ';';
COLON: ':';
HASH: '#';
BRA: '(';
KET: ')';
COMMA: ',';
QUOTE: '\'';
DQUOTE: '"'; // "
SQUAREBRA: '['; // may have to escape this
SQUAREKET: ']'; // may have to escape this
DOT : '.'; // may have to escape this
DASH: '-';
BACKSLASH: '\\';
WS : [ \t\r\n]+;