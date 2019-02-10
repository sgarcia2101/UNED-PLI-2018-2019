package compiler.lexical;

import compiler.syntax.sym;
import compiler.lexical.Token;
import es.uned.lsi.compiler.lexical.ScannerIF;
import es.uned.lsi.compiler.lexical.LexicalError;
import es.uned.lsi.compiler.lexical.LexicalErrorManager;

// incluir aqui, si es necesario otras importaciones

%%

%unicode
 
%public
%class Scanner
%char
%line
%column
%cup


%implements ScannerIF
%scanerror LexicalError

// incluir aqui, si es necesario otras directivas

%{
	LexicalErrorManager lexicalErrorManager = new LexicalErrorManager ();
	private int commentCount = 0;
	
	Token createToken(int id) {
		Token token = new Token(id);
		token.setLine(yyline + 1);
		token.setColumn(yycolumn + 1);
		token.setLexema(yytext());
		return token;
	}
	
	void createError() {
		LexicalError error = new LexicalError ();
		error.setLine (yyline + 1);
		error.setColumn (yycolumn + 1);
		error.setLexema (yytext ());
		lexicalErrorManager.lexicalError (error);
	}
%}  
  

ESPACIO_BLANCO=[ \t\r\n\f]

FIN_DE_LINEA = \r\n
COMENTARIO   = #.*{FIN_DE_LINEA}
NUMERO       = (0 | [1-9][0-9]*)
CADENA       = \".*\"
CARACTER     = [A-Za-z]
GUION_BAJO   = _
IDENTIFICADOR= {GUION_BAJO}?({CARACTER}|{GUION_BAJO}|{NUMERO})*


%%

<YYINITIAL> 
{

	{FIN_DE_LINEA}		{}
	{COMENTARIO}		{}
	{NUMERO}			{	return createToken(sym.NUMBER);			}
	{CADENA}			{	return createToken(sym.STRING);			}
	
	// Palabras reservadas
	"booleano"			{	return createToken(sym.BOOLEAN);		}
	"cierto"			{	return createToken(sym.TRUE);			}
	"comienzo"			{	return createToken(sym.BEGIN);			}
	"constantes"		{	return createToken(sym.CONSTANTS);		}
	"de"				{	return createToken(sym.OF);				}
	"en"				{	return createToken(sym.IN);				}
	"devolver"			{  	return createToken(sym.RETURN);			}
	"entero"			{  	return createToken(sym.INTEGER);		}
	"entonces"			{  	return createToken(sym.THEN);			}
	"escribir"			{  	return createToken(sym.WRITE);			}
	"falso"				{  	return createToken(sym.FALSE);			}
	"fin"				{  	return createToken(sym.END);			}
	"funcion"			{  	return createToken(sym.FUNCTION);		}
	"no"				{  	return createToken(sym.NOT);			}
	"para"				{  	return createToken(sym.FOR);			}
	"procedimiento"		{  	return createToken(sym.PROCEDURE);		}
	"programa"			{  	return createToken(sym.PROGRAM);		}
	"si"				{  	return createToken(sym.IF);				}
	"sino"				{  	return createToken(sym.ELSE);			}
	"subprogramas"		{  	return createToken(sym.SUBPROGRAM);		}
	"tipos"				{  	return createToken(sym.TYPES);			}
	"var"				{  	return createToken(sym.VAR);			}
	"variables"			{  	return createToken(sym.VARIABLES);		}
	"vector"			{  	return createToken(sym.VECTOR);			}
	"y"					{  	return createToken(sym.AND);			}

	// Delimitadores

	"("					{  	return createToken(sym.LEFT_PARENTHESIS);	}
	")"					{  	return createToken(sym.RIGHT_PARENTHESIS);	}
	"["					{  	return createToken(sym.LEFT_BRACKET);		}
	"]"					{  	return createToken(sym.RIGHT_BRACKET);		}
	","					{  	return createToken(sym.COMMA);				}
	";"					{  	return createToken(sym.SEMICOLON);			}
	":"					{  	return createToken(sym.COLON);				}
	".."				{  	return createToken(sym.RANGE);				}
	"."					{  	return createToken(sym.DOT);				}
	
	// Operadores
	
	"+"                	{  	return createToken(sym.PLUS);				} 
    "*"                	{  	return createToken(sym.ASTERISK);			}
	"<"                	{  	return createToken(sym.LESS);				}  
    "=="                {  	return createToken(sym.EQUAL);				}  
    "="                	{  	return createToken(sym.ASSIGN);				}  
    "[]"                {  	return createToken(sym.VECTOR_ACCESS);		}
                        
	{IDENTIFICADOR}		{  	return createToken(sym.ID);					}

    // incluir aqui el resto de las reglas patron - accion
    
    // "procedure" 		{	return createToken(1);						}

   {ESPACIO_BLANCO}		{}
    
    // error en caso de coincidir con ningún patrón
	[^]					{	createError();								}
    
}


                         


