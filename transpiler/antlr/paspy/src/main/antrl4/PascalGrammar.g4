parser grammar PascalGrammar;

options { tokenVocab=pascalTokens; }

program
   : programHeading block DOT
   ;

programHeading
   : PROGRAM identifier SEMI
   ;

identifier
   : IDENT
   ;

block
   : (constantDefinitionPart | variableDeclarationPart | procedureAndFunctionDeclarationPart)* compoundStatement
   ;

constantDefinitionPart
   : CONST (constantDefinition SEMI) +
   ;

constantDefinition
   : identifier EQUAL constant
   ;

constant
   : unsignedNumber
   | sign unsignedNumber
   | identifier
   | string
   ;

unsignedNumber
   : unsignedInteger
   | unsignedReal
   ;

unsignedInteger
   : NUM_INT
   ;

unsignedReal
   : NUM_REAL
   ;

sign
   : PLUS
   | MINUS
   ;

bool
   : TRUE
   | FALSE
   ;

string
   : STRING_LITERAL
   ;

type
   : (CHAR | BOOLEAN | INTEGER | REAL | STRING)
   ;

variableDeclarationPart
   : VAR variableDeclaration (SEMI variableDeclaration)* SEMI
   ;

variableDeclaration
   : identifierList COLON type
   ;

procedureAndFunctionDeclarationPart
   : procedureOrFunctionDeclaration SEMI
   ;

procedureOrFunctionDeclaration
   : procedureDeclaration
   | functionDeclaration
   ;

procedureDeclaration
   : PROCEDURE identifier (formalParameterList)? SEMI block
   ;

formalParameterList
   : LPAREN identifierList COLON type RPAREN
   ;

identifierList
   : identifier (COMMA identifier)*
   ;

functionDeclaration
   : FUNCTION identifier (formalParameterList)? COLON type SEMI block
   ;

statement
   : simpleStatement
   | structuredStatement
   ;

simpleStatement
   : assignmentStatement
   | procedureStatement
   | emptyStatement
   ;

assignmentStatement
   : variable ASSIGN expression
   ;

variable
   : (identifier) (expression (COMMA expression)*)*
   ;

expression
   : simpleExpression (relationaloperator expression)?
   ;

relationaloperator
   : EQUAL
   | NOT_EQUAL
   | LT
   | LE
   | GE
   | GT
   ;

simpleExpression
   : term (additiveoperator simpleExpression)?
   ;

additiveoperator
   : PLUS
   | MINUS
   | OR
   ;

term
   : signedFactor (multiplicativeoperator term)?
   ;

multiplicativeoperator
   : STAR
   | SLASH
   | DIV
   | AND
   ;

signedFactor
   : (PLUS | MINUS)? factor
   ;

factor
   : variable
   | unsignedNumber
   | string
   | bool
   | NIL
   ;

parameterList
   : expression (COMMA expression)*
   ;

procedureStatement
   : identifier (LPAREN parameterList RPAREN)?
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
   ;

compoundStatement
   : BEGIN statements END
   ;

statements
   : statement (SEMI statement)*
   ;

ifStatement
   : IF expression THEN statement (:elifstatement)* (:elsestatement)?
   ;

elifstatement
   : ELSE IF expression THEN statement
   ;

elsestatement
   : ELSE statement
   ;
