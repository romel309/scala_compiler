//Cuando construyes tu gramática en ANTLR le das un nombre en este caso la llame scala.
grammar Scala;		

//tokens { ABSTRACT, CASE, CATCH, CLASS, DEF, DO, ELSE, EXTENDS, FALSE, FINAL, FINALLY, FOR, FORSOME, IF, IMPLICIT, IMPORT, LAZY, MACRO, MATCH, NEW, NULL, OBJECT, OVERRIDE, PACKAGE, PRIVATE, PROTECTED, RETURN, SEALED, SUPER, THIS, THROW, TRAIT, TRY, TRUE, TYPE, VAL, VAR, WHILE, WITH, YIELD}

//Mi primera regla llamada prog verifica si el ejemplo contiene una estructura objeto y que le siga un fin de documento
prog
	:	obj EOF 
	;
//Estructura de un obj
obj
	: OBJECT ID LEFTKEY body* RIGHTKEY
	;
// El cuerpo de un objeto
body
	: def
	| obj
	;
// Definition
/*
definition
	: DEF ID LPARENTHESIS (variables|COMMA)+ RPARENTHESIS TWODOTS (INT|BOOLEAN|STRING) ASSIGN keyblock
	;
*/
// Estructura de una definicion
def 
	: DEF ID LPARENTHESIS 'args' TWODOTS ARRAY RPARENTHESIS keyblock
	;
// contenido de una definicion
cnt
	: variables* SCOLON
	| expr
	;
// Estructuras de if y while
expr
	: IF condition keyblock (ELSEIF condition keyblock)* (ELSE keyblock)? 
	| WHILE condition keyblock
	;
// Condiciones de if y while
condition
	: LPARENTHESIS tm+ RPARENTHESIS
 	;
// Llaves
 keyblock
 	: LEFTKEY cnt* RIGHTKEY
 	;
// Comparacion
 tm 
 	: (ID|NUMBER) comparison (ID|NUMBER)
 	;
// Llamadas de variables
variables
	: val
	| var
	;
// Estructura constante val
val 
	: VAL? ID (TWODOTS INT)? (ASSIGN NEGATIVE? NUMBER)?
	| VAL? ID (TWODOTS STRING)? (ASSIGN STRINGSTRUCT)?
	| VAL? ID (TWODOTS BOOLEAN)? (ASSIGN LOGIC)?
	;
var 
	: VAR? ID (TWODOTS INT)? (ASSIGN NEGATIVE? NUMBER)?
	| VAR? ID (TWODOTS STRING)? (ASSIGN STRINGSTRUCT)?
	| VAR? ID (TWODOTS BOOLEAN)? (ASSIGN LOGIC)?
	;
// Operadores de comparacion
comparison
	: EQUAL
	| NOTEQUAL
	| GREATER
	| LESS
	;
// Estructura string
STRINGSTRUCT
	: STRINGCONTENT DOUBLECOLONS
	;	
// Contenido string
STRINGCONTENT
  	: DOUBLECOLONS (~["\\\r\n] | '\\' (. | EOF))*
  	;

NUMBER     		   : [0-9]+ ;

OBJECT             : 'object' ;
DEF 			   : 'def';
VAR                : 'var' ;
VAL 			   : 'val';
INT                : 'Int';
BOOLEAN			   : 'Boolean';
STRING			   : 'String';
IF				   : 'if';
ELSEIF			   : 'else if';
ELSE			   : 'else';
WHILE			   : 'while';
FOR 			   : 'for';
DO				   : 'do';
RETURN			   : 'return';
LOGIC			   : ('true'|'false');
NEGATIVE		   : '-';
ARRAY              : 'Array[String]';
ID 				   : [a-zA-Z_] [a-zA-Z_0-9]*;
COMMENT			   : ( '//' ~[\r\n]* '\r'? '\n'?| '/*' .*? '*/') -> skip;
OPERATORS		   : ('+' | '-' | '/' | '%' | '*')+;
AND				   : ('&&');
OR 				   : ('||');
LESS 			   : ('<');
GREATER			   : ('>');
EQUAL			   : ('==');
NOTEQUAL		   : ('!=');
ASSIGN			   : ('=');
LEFTKEY            : '{';
RIGHTKEY		   : '}';
LPARENTHESIS	   : '(';
RPARENTHESIS	   : ')';
LCELL	   		   : '[';
RCELL			   : ']';
TWODOTS			   : ':';
SCOLON			   : ';';
DOUBLECOLONS	   : '"';
COMMA			   : ',';
NEWLINE            : ('\r'? '\n' | '\r')+ -> skip;
WHITESPACE         : (' ' | '\t' | '\n')+ -> skip;