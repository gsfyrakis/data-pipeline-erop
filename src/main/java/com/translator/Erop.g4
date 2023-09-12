// Grammar for EROP language
grammar Erop;
// Package specification
//@header { package com.translator.antlr; }
// Contract definition
contractDocument: WS? declarationSection WS? ruleSet WS?;
// Structure of the declaration section
declarationSection: declaration (WS declaration)*;
declaration: businessOpDeclaration | roleplayerDeclaration | compobligDeclaration;
businessOpDeclaration: BUSINESSOP upalphanum (COMMA upalphanum)* SEMICOLON;
roleplayerDeclaration: ROLEPLAYER WS alphanum (COMMA alphanum)* SEMICOLON;
compobligDeclaration: COMPOBLIG upalphanum BRA upalphanum (COMMA upalphanum)+ KET SEMICOLON;
// Rule set structure
ruleSet : singlerule (WS singlerule)*;
// Rule structure
singlerule: RULE WS rulename WS WHEN WS lhs WS THEN WS rhs WS END;
// : 'rule' WS rulename WS lhs WS rhs WS 'end';
rulename: '"' upalphanum '"';
// Left hand side structure
lhs : eventmatch (WS constraint)*;
eventmatch: alphanum WS MATCHES WS upalphanum;
constraint: attributeConstraint | historicalQuery | ropConstraint;
attributeConstraint: roleplayerConstraint | outcomeConstraint | timeConstraint;
roleplayerConstraint: alphanum DOT (ORIGINATOR|RESPONDER) WS? (EQUALS|NOTEQ) WS? alphanum;
outcomeConstraint: alphanum DOT OUTCOME WS? (EQUALS|NOTEQ) WS? outcome;
timeConstraint: timeDirectComparison | timePartialComparison;
timeDirectComparison: alphanum DOT TIMESTAMP WS? (EQUALS|NOTEQ|BEFORE|AFTER) WS? absoluteTime;
timePartialComparison: alphanum DOT DAY WS? (EQUALS|NOTEQ) WS? WEEKDAY
|alphanum DOT DAY WS? (IN|NOTIN) WS?
SQUAREBRA WEEKDAY DOT DOT WEEKDAY SQUAREKET
|alphanum DOT DATE WS? (EQUALS|NOTEQ|BEFORE|AFTER) WS? DIGIT DIGIT
|alphanum DOT DATE WS? (IN|NOTIN) WS?
SQUAREBRA DIGIT DIGIT DOT DOT DIGIT DIGIT SQUAREKET
|alphanum DOT MONTH WS? (EQUALS|NOTEQ|BEFORE|AFTER) WS? MONTHID
|alphanum DOT MONTH WS? (IN|NOTIN) WS?
SQUAREBRA MONTHID DOT DOT MONTHID SQUAREKET
|alphanum DOT YEAR WS? (EQUALS|NOTEQ|BEFORE|AFTER)
WS? DIGIT DIGIT DIGIT DIGIT
|alphanum DOT MONTH WS? (IN|NOTIN) WS?
SQUAREBRA DIGIT DIGIT DIGIT DIGIT
DOT DOT DIGIT DIGIT DIGIT DIGIT SQUAREKET;
historicalQuery: (HAPPENED | CTHAPPENED) WS? BRA upalphanum COMMA WS? alphanum
COMMA WS? alphanum COMMA WS? genericString COMMA WS? outcome KET;
ropConstraint: upalphanum IN|NOTIN alphanum DOT ropset;
// Right hand side structure
rhs : rhsaction (WS? rhsaction)*;
rhsaction
// : addaction|remaction|termaction|passaction SEMICOLON;
: (ifstatement|termaction|passaction|addaction|remaction) WS? SEMICOLON;
// Support for if-then-else-endif statement
ifstatement: IF WS condition WS THEN WS rhs WS (ELSE WS rhs WS)? ENDIF;
condition: BRA WS? NOT? constraint WS? ((AND|OR) condition ) WS? KET;
termaction: TERMINATE WS? BRA outcome KET;
passaction: PASS;
addaction: alphanum DOT ropset WS? ADDROP WS? upalphanum BRA timeSpec? KET;
remaction: alphanum DOT ropset WS? REMROP WS? upalphanum BRA timeSpec? KET;
// Rules for both lhs and rhs
outcome: SUCCESS | TECFAIL | INITFAIL | BIZFAIL;
ropset: RIGHTS|OBLIGS|PROHIBS;
timeSpec: absoluteTime | relativeTime;
absoluteTime: DQUOTE DIGIT DIGIT DASH DIGIT DIGIT DASH DIGIT DIGIT DIGIT DIGIT
WS DIGIT DIGIT COLON DIGIT DIGIT COLON DIGIT DIGIT DQUOTE;
relativeTime: relTimeElement+;
relTimeElement: DIGIT+ ('s'|'m'|'h'|'d'|'M'|'Y');
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
// Right hand side tokens
ADDROP: '+=';
REMROP: '-=';
TERMINATE: 'terminate';
PASS: 'pass';
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
genericString: DQUOTE (LOWER | UPPER | DIGIT | WS | SEMICOLON
| COLON | COMMA | QUOTE | DOT | DASH | BACKSLASH)* DQUOTE;
// Alphabet, numbers
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
SQUAREBRA: '[';
SQUAREKET: ']';
DOT : '.';
DASH: '-';
BACKSLASH: '\\';
// Whitespace includes spaces, newlines and tabs
WS: (' ' | '\t' | '\r' | '\n' )+;