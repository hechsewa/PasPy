lexer grammar pascalTokens;

//keywords
AND:                'and';
ARRAY:              'array';
BEGIN:              'begin';
BOOLEAN:            'boolean';
CASE:               'case';
CHAR:               'char';
CONST:              'const';
DIV:                'div';
DO:                 'do';
DOWNTO:             'downto';
ELSE:               'else';
END:                'end';
FOR:                'for';
FUNCTION:           'function';
IF:                 'if';
INTEGER:            'integer';
LABEL:              'label';
NIL:                'nil';
OF:                 'of';
OR:                 'or';
PROCEDURE:          'procedure';
PROGRAM:            'program';
REAL:               'real';
SET:                'set';
THEN:               'then';
TO:                 'to';
TYPE:               'type';
UNTIL:              'until';
VAR:                'var';
WHILE:              'while';
WITH:               'with';
INTERFACE:          'interface';
USES:               'uses';
STRING:             'string';
TRUE:               'true';
FALSE:              'false';

//operators
PLUS:               '+';
MINUS:              '-';
STAR:               '*';
SLASH:              '/';
ASSIGN:             ':=';
COMMA:              ',';
SEMI:               ';';
COLON:              ':';
EQUAL:              '=';
NOT_EQUAL:          '<>';
LT:                 '<';
LE:                 '<=';
GT:                 '>';
GE:                 '>=';
LPAREN:             '(';
RPAREN:             ')';
LBRACK:             '[';
LBRACK2:            '(.';
RBRACK:             ']';
RBRACK2:            '.)';
AT:                 '@';
DOT:                '.';
LCURLY:             '{';
RCURLY:             '}';

//whitespace&comments
WS
   : [ \t\r\n] -> skip
   ;

COMMENT_1
   : '(*' .*? '*)' -> skip
   ;

COMMENT_2
   : '{' .*? '}' -> skip
   ;

//literals
IDENT
   : ('a' .. 'z' | 'A' .. 'Z') ('a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_')*
   ;

STRING_LITERAL
   : '\'' ('\'\'' | ~ ('\''))* '\''
   ;

NUM_INT
   : ('0' .. '9') +
   ;


NUM_REAL
   : ('0' .. '9') + ('.' ('0' .. '9')+)
   ;

