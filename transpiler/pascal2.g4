grammar pascal;

program
    : PROGRAM interface ; block DOT
    ;

interface
    : identifier LPAREN identifierList RPAREN SEMICOLON
    ;

identifier
    : IDENT
    ;

identifierList
    :
    ;

block
    : (constsDeclare | typesDeclare | varsDeclare | procFuncDeclare)* compoundStatement
    ;

//const block
constsDeclare
    : CONST (constDefine SEMICOLON) +
    ;

constDefine
    : identifier EQUAL constant
    ;

constChar
    : CHR LPAREN unsignedInt RPAREN
    ;

constant
    : unsingedNum | sign unsignedNum | identifier | sign identifier | string | constChar
    ;

//types block
typesDeclare
    : TYPE (typeDefine SEMICOLON) +
    ;

typeDefine
    : identifier EQUAL (type | functionType | procedureType)
    ;

functionType
    : FUNCTION (parameterList)? COLON resultType
    ;

procedureType
    : PROCEDURE (parameterList)?
    ;

type
    : simpleType
    | structuredType
    ;

simpleType
    : LPAREN identifierList RPAREN
    | stringType
    ;

structuredType
    : arrayType
    | setType
    ;

stringType
    : STRING LBRACK (identifier | unsignedNum) RBRACK
    ;

arrayType
    : ARRAY LBRACK typeList RBRACK OF type
    | ARRAY LBRACK2 typeList RBRACK2 OF type
    ;

typeList
    : simpleType (COMMA simpleType)*
    ;

//sets
setType
    : SET OF simpleType
    ;

//variables block
varsDeclare
    : VAR varsDefine (SEMICOLON varsDefine)* SEMICOLON
    ;

varsDefine
    : identifierList COLON type
    ;

//procedures and functions
procFuncDeclare
    : procFuncDefine SEMICOLON
    ;

procFuncDefine
    : procedure | function
    ;

procedure
    : PROCEDURE identifier (parameterList)? SEMICOLON block
    ;

parameterList
    : LPAREN parameterSection (SEMICOLON parameterSection)* RPAREN
    ;

parameterSection
    : parameters | VAR parameters | FUNCTION parameters | PROCEDURE parameters
    ;

parameters
    : identifierList COLON typeIdentifier
    ;

identifierList
    : identifier (COMMA identifier)*
    ;

constList
    : constant (COMMA constant)*
    ;

function
    : FUNCTION identifier (parameterList)? COLON resultType SEMICOLON block
    ;

resultType
    : typeIdentifier
    ;

//statements
statement   
    : assignmentStatement
    | procedureStatement
    | emptyStatement
    ;

assignmentStatement
    : variable ASSIGN expression
    ;

variable
    : (identifier) (LBRACK expression (COMMA expression)* RBRACK | LBRACK2 expression (COMMA expression)* RBRACK2 | DOT identifier)*
    ;

expression
    : simpleExpression (relationalOp expression)?
    ;

relationalOp
    : EQUAL
    | NOT_EQUAL
    | LT
    | LE
    | GE
    | GT
    | IN
    ;

additiveOp
    : PLUS
    | MINUS
    | OR
    ;

multiplicativeOp
    : STAR
    | SLASH
    | AND
    ;

simpleExpression
    : term (additiveOp simpleExpression)?
    ;

term
    : sign? factor (multiplicativeOp term)?
    ;

factor
    : variable
    | LPAREN expression RPAREN
    | functionCall
    | unsignedConst
    | NOT factor
    | bool
    ;

unsignedConst
    : unsignedNum
    | constChar
    | string
    | NIL
    ;

functionCall
    : identifier LPAREN param (COMMA param)* RPAREN
    ;

param
    : expression (':' expression)*

procedureStatement
    : identifier (LPAREN param (COMMA param)* RPAREN)?
    ;

emptyStatement
    :
    ;

empty
    :
    /* empty */
    ;

structuredStatement
    : compoundStatement
    | ifStatement
    | loopStatement
    ;

compoundStatement
    : BEGIN statements END
    ;

statements
    : statement (SEMICOLON statement)*
    ;

ifStatement
    : IF expression THEN statement (: ELSE statement)?
    ;

loopStatement
    : whileStatement
    | forStatement
    ;

whileStatement
    : WHILE expression DO statement
    ;

forStatement
    : FOR identifier ASSIGN forList DO statement 
    ;

forList
    : expression (TO | DOWNTO) expression
    ;

//numbers and signs
unsignedNum
    : unsignedInt | unsignedReal
    ;

unsignedInt
    : NUM_INT
    ;

unsignedReal
    : NUM_REAL
    ;

sign
    : PLUS | MINUS
    ;

bool
    : TRUE | FALSE
    ;

string
    : STR_LITERAL
    ;

//TOKENS
fragment A
   : ('a' | 'A')
   ;


fragment B
   : ('b' | 'B')
   ;


fragment C
   : ('c' | 'C')
   ;


fragment D
   : ('d' | 'D')
   ;


fragment E
   : ('e' | 'E')
   ;


fragment F
   : ('f' | 'F')
   ;


fragment G
   : ('g' | 'G')
   ;


fragment H
   : ('h' | 'H')
   ;


fragment I
   : ('i' | 'I')
   ;


fragment J
   : ('j' | 'J')
   ;


fragment K
   : ('k' | 'K')
   ;


fragment L
   : ('l' | 'L')
   ;


fragment M
   : ('m' | 'M')
   ;


fragment N
   : ('n' | 'N')
   ;


fragment O
   : ('o' | 'O')
   ;


fragment P
   : ('p' | 'P')
   ;


fragment Q
   : ('q' | 'Q')
   ;


fragment R
   : ('r' | 'R')
   ;


fragment S
   : ('s' | 'S')
   ;


fragment T
   : ('t' | 'T')
   ;


fragment U
   : ('u' | 'U')
   ;


fragment V
   : ('v' | 'V')
   ;


fragment W
   : ('w' | 'W')
   ;


fragment X
   : ('x' | 'X')
   ;


fragment Y
   : ('y' | 'Y')
   ;


fragment Z
   : ('z' | 'Z')
   ;

PROGRAM
    : P R O G R A M
    ;

IDENT
    : ('a' .. 'z' | 'A' .. 'Z') ('a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_')*
    ;

COMMENT1
    : '(*' .*? '*)' -> skip
    ;

COMMENT2
    : '{' .*? '}' -> skip
    ;

WHITESPACE
    : [ \t\r\n] -> skip
    ;

TRUE
    : T R U E
    ;

FALSE
    : F A L S E
    ;

AND
    : A N D
    ;

ARRAY
    : A R R A Y
    ;

BEGIN
    : B E G I N
    ;

END
    : E N D
    ;

BOOLEAN
    : B O O L E A N
    ;

CHR
    : C H R
    ;

CONST
    : C O N S T
    ;

DO
    : D O 
    ;

DOWNTO
    : D O W N T O
    ;

ELSE
    : E L S E 
    ;

FOR
    : F O R
    ;

FUNCTION
    : F U N C T I O N
    ;

IF
    : I F
    ;

IN
    : I N
    ;

INTEGER
    : I N T E G E R
    ;

NIL
    : N I L
    ;

NOT
    : N O T
    ;

OF
    : O F
    ;

OR
    : O R 
    ;

PROCEDURE
    : P R O C E D U R E
    ;

REAL
    : R E A L
    ;

SET
    : S E T
    ;

THEN
    : T H E N
    ;

TO
    : T O
    ;

TYPE
    : T Y P E
    ;

VAR
    : V A R
    ;

WHILE
    : W H I L E
    ;

WITH
    : W I T H
    ;

PLUS
    : '+'
    ;

MINUS
    : '-'
    ;

STAR
    : '*'
    ;

SLASH
   : '/'
   ;


ASSIGN
   : ':='
   ;


COMMA
   : ','
   ;


COLON
   : ':'
   ;


EQUAL
   : '='
   ;


NOT_EQUAL
   : '<>'
   ;

LT
   : '<'
   ;

LE
   : '<='
   ;

GE
   : '>='
   ;

GT
   : '>'
   ;

DOT
    : '.'
    ;

LPAREN
    : '('
    ;

RPAREN
    : ')'
    ;

SEMICOLON
    : ';'
    ;

LBRACK
    : '['
    ;

RBRACK
    : ']'
    ;

LBRACK2
    : '(.'
    ;

RBRACK2
    : '.)'
    ;

LCURLY
    : '{'
    ;

RCURLY
    : '}'
    ;

STRING
    : S T R I N G
    ;

STR_LITERAL
    : '\' ('\'\'' | ~ ('\''))* '\''
    ;

NUM_INT
    : ('0' .. '9') +
    ;

NUM_REAL
    : ('0' .. '9') + (('.' ('0' .. '9') + (EXPONENT)?)? | EXPONENT)

fragment EXPONENT
    : ('e') ('+' | '-')? ('0' .. '9') +
    ;

