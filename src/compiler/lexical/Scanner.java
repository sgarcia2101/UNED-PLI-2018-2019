/* The following code was generated by JFlex 1.4.1 on 10/02/19 14:10 */

package compiler.lexical;

import compiler.syntax.sym;
import compiler.lexical.Token;
import es.uned.lsi.compiler.lexical.ScannerIF;
import es.uned.lsi.compiler.lexical.LexicalError;
import es.uned.lsi.compiler.lexical.LexicalErrorManager;

// incluir aqui, si es necesario otras importaciones


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.1
 * on 10/02/19 14:10 from the specification file
 * <tt>C:/Users/sergi/eclipse-workspace/ArquitecturaPLI-2018-2019/doc/specs/scanner.flex</tt>
 */
public class Scanner implements java_cup.runtime.Scanner, ScannerIF {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0,  1,  3,  0,  1,  2,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     1,  0,  6,  4,  0,  0,  0,  0, 29, 30, 38, 37, 33,  0, 36,  0, 
     5,  5,  5,  5,  5,  5,  5,  5,  5,  5, 35, 34, 39, 40,  0,  0, 
     0,  7,  7,  7,  7,  7,  7,  7,  7,  7,  7,  7,  7,  7,  7,  7, 
     7,  7,  7,  7,  7,  7,  7,  7,  7,  7,  7, 31,  0, 32,  0,  8, 
     0, 13,  9, 15, 22, 12, 24, 27,  7, 16,  7,  7, 11, 19, 14, 10, 
    26,  7, 17, 21, 18, 25, 23,  7,  7, 28, 20,  0,  0,  0,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\1\1\3\1\1\1\4\1\1"+
    "\12\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13"+
    "\1\14\1\15\1\16\1\17\1\20\1\21\3\0\1\22"+
    "\1\4\1\23\1\4\1\24\3\4\1\25\1\4\1\26"+
    "\7\4\1\27\1\30\1\31\13\4\1\32\1\4\1\33"+
    "\13\4\1\34\6\4\1\35\11\4\1\36\4\4\1\37"+
    "\5\4\1\40\3\4\1\41\2\4\1\42\14\4\1\43"+
    "\2\4\1\44\1\45\1\46\1\4\1\47\1\4\1\50"+
    "\2\4\1\51\2\4\1\52\1\4\1\53\4\4\1\54"+
    "\1\4\1\55";

  private static int [] zzUnpackAction() {
    int [] result = new int[153];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\51\0\51\0\122\0\51\0\173\0\244\0\315"+
    "\0\366\0\u011f\0\u0148\0\u0171\0\u019a\0\u01c3\0\u01ec\0\u0215"+
    "\0\u023e\0\u0267\0\244\0\51\0\51\0\u0290\0\51\0\51"+
    "\0\51\0\51\0\u02b9\0\51\0\51\0\51\0\u02e2\0\122"+
    "\0\u030b\0\173\0\173\0\u0334\0\u035d\0\u0386\0\244\0\u03af"+
    "\0\u03d8\0\u0401\0\u042a\0\u0453\0\u047c\0\u04a5\0\u04ce\0\u04f7"+
    "\0\u0520\0\u0549\0\u0572\0\u059b\0\51\0\51\0\51\0\u05c4"+
    "\0\u05ed\0\u0616\0\u063f\0\u0668\0\u0691\0\u06ba\0\u06e3\0\u070c"+
    "\0\u0735\0\u075e\0\u0787\0\u07b0\0\244\0\u07d9\0\u0802\0\u082b"+
    "\0\u0854\0\u087d\0\u08a6\0\u08cf\0\u08f8\0\u0921\0\u094a\0\u0973"+
    "\0\244\0\u099c\0\u09c5\0\u09ee\0\u0a17\0\u0a40\0\u0a69\0\244"+
    "\0\u0a92\0\u0abb\0\u0ae4\0\u0b0d\0\u0b36\0\u0b5f\0\u0b88\0\u0bb1"+
    "\0\u0bda\0\244\0\u0c03\0\u0c2c\0\u0c55\0\u0c7e\0\244\0\u0ca7"+
    "\0\u0cd0\0\u0cf9\0\u0d22\0\u0d4b\0\244\0\u0d74\0\u0d9d\0\u0dc6"+
    "\0\244\0\u0def\0\u0e18\0\244\0\u0e41\0\u0e6a\0\u0e93\0\u0ebc"+
    "\0\u0ee5\0\u0f0e\0\u0f37\0\u0f60\0\u0f89\0\u0fb2\0\u0fdb\0\u1004"+
    "\0\244\0\u102d\0\u1056\0\244\0\244\0\244\0\u107f\0\244"+
    "\0\u10a8\0\244\0\u10d1\0\u10fa\0\244\0\u1123\0\u114c\0\244"+
    "\0\u1175\0\244\0\u119e\0\u11c7\0\u11f0\0\u1219\0\244\0\u1242"+
    "\0\244";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[153];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\3\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\2\7\1\12\1\7\1\13\1\14\2\7\1\15\2\7"+
    "\1\16\1\17\1\20\1\21\1\7\1\22\1\7\1\23"+
    "\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33"+
    "\1\34\1\35\1\36\1\37\51\0\2\40\1\41\1\0"+
    "\45\40\3\42\1\0\2\42\1\43\42\42\5\0\1\7"+
    "\1\0\1\7\1\0\24\7\23\0\1\7\1\0\24\7"+
    "\21\0\1\7\1\0\1\7\1\0\1\7\1\44\22\7"+
    "\21\0\1\7\1\0\1\7\1\0\5\7\1\45\6\7"+
    "\1\46\7\7\21\0\1\7\1\0\1\7\1\0\1\7"+
    "\1\47\22\7\21\0\1\7\1\0\1\7\1\0\1\7"+
    "\1\50\5\7\1\51\14\7\21\0\1\7\1\0\1\7"+
    "\1\0\7\7\1\52\14\7\21\0\1\7\1\0\1\7"+
    "\1\0\7\7\1\53\10\7\1\54\3\7\21\0\1\7"+
    "\1\0\1\7\1\0\3\7\1\55\20\7\21\0\1\7"+
    "\1\0\1\7\1\0\3\7\1\56\1\57\17\7\21\0"+
    "\1\7\1\0\1\7\1\0\4\7\1\60\2\7\1\61"+
    "\10\7\1\62\3\7\21\0\1\7\1\0\1\7\1\0"+
    "\4\7\1\63\3\7\1\64\13\7\54\0\1\65\54\0"+
    "\1\66\54\0\1\67\2\40\1\41\1\3\45\40\5\0"+
    "\1\7\1\0\1\7\1\0\1\7\1\70\22\7\21\0"+
    "\1\7\1\0\1\7\1\0\11\7\1\71\12\7\21\0"+
    "\1\7\1\0\1\7\1\0\6\7\1\72\15\7\21\0"+
    "\1\7\1\0\1\7\1\0\5\7\1\73\4\7\1\74"+
    "\11\7\21\0\1\7\1\0\1\7\1\0\3\7\1\75"+
    "\20\7\21\0\1\7\1\0\1\7\1\0\21\7\1\76"+
    "\2\7\21\0\1\7\1\0\1\7\1\0\5\7\1\77"+
    "\16\7\21\0\1\7\1\0\1\7\1\0\1\100\23\7"+
    "\21\0\1\7\1\0\1\7\1\0\16\7\1\101\5\7"+
    "\21\0\1\7\1\0\1\7\1\0\6\7\1\102\15\7"+
    "\21\0\1\7\1\0\1\7\1\0\10\7\1\103\13\7"+
    "\21\0\1\7\1\0\1\7\1\0\2\7\1\104\21\7"+
    "\21\0\1\7\1\0\1\7\1\0\5\7\1\105\16\7"+
    "\21\0\1\7\1\0\1\7\1\0\5\7\1\106\16\7"+
    "\21\0\1\7\1\0\1\7\1\0\10\7\1\107\13\7"+
    "\21\0\1\7\1\0\1\7\1\0\1\7\1\110\22\7"+
    "\21\0\1\7\1\0\1\7\1\0\2\7\1\111\21\7"+
    "\21\0\1\7\1\0\1\7\1\0\1\7\1\112\1\7"+
    "\1\113\20\7\21\0\1\7\1\0\1\7\1\0\10\7"+
    "\1\114\13\7\21\0\1\7\1\0\1\7\1\0\14\7"+
    "\1\115\7\7\21\0\1\7\1\0\1\7\1\0\7\7"+
    "\1\116\14\7\21\0\1\7\1\0\1\7\1\0\10\7"+
    "\1\117\13\7\21\0\1\7\1\0\1\7\1\0\1\7"+
    "\1\120\22\7\21\0\1\7\1\0\1\7\1\0\1\7"+
    "\1\121\22\7\21\0\1\7\1\0\1\7\1\0\21\7"+
    "\1\122\2\7\21\0\1\7\1\0\1\7\1\0\1\7"+
    "\1\123\22\7\21\0\1\7\1\0\1\7\1\0\11\7"+
    "\1\124\12\7\21\0\1\7\1\0\1\7\1\0\7\7"+
    "\1\125\14\7\21\0\1\7\1\0\1\7\1\0\14\7"+
    "\1\126\7\7\21\0\1\7\1\0\1\7\1\0\6\7"+
    "\1\127\15\7\21\0\1\7\1\0\1\7\1\0\4\7"+
    "\1\130\17\7\21\0\1\7\1\0\1\7\1\0\6\7"+
    "\1\131\13\7\1\132\1\7\21\0\1\7\1\0\1\7"+
    "\1\0\3\7\1\133\20\7\21\0\1\7\1\0\1\7"+
    "\1\0\5\7\1\134\16\7\21\0\1\7\1\0\1\7"+
    "\1\0\10\7\1\135\13\7\21\0\1\7\1\0\1\7"+
    "\1\0\7\7\1\136\14\7\21\0\1\7\1\0\1\7"+
    "\1\0\11\7\1\137\12\7\21\0\1\7\1\0\1\7"+
    "\1\0\3\7\1\140\20\7\21\0\1\7\1\0\1\7"+
    "\1\0\11\7\1\141\12\7\21\0\1\7\1\0\1\7"+
    "\1\0\14\7\1\142\7\7\21\0\1\7\1\0\1\7"+
    "\1\0\10\7\1\143\13\7\21\0\1\7\1\0\1\7"+
    "\1\0\2\7\1\144\21\7\21\0\1\7\1\0\1\7"+
    "\1\0\1\7\1\145\22\7\21\0\1\7\1\0\1\7"+
    "\1\0\4\7\1\146\17\7\21\0\1\7\1\0\1\7"+
    "\1\0\1\7\1\147\22\7\21\0\1\7\1\0\1\7"+
    "\1\0\7\7\1\150\14\7\21\0\1\7\1\0\1\7"+
    "\1\0\3\7\1\151\20\7\21\0\1\7\1\0\1\7"+
    "\1\0\10\7\1\152\13\7\21\0\1\7\1\0\1\7"+
    "\1\0\4\7\1\153\17\7\21\0\1\7\1\0\1\7"+
    "\1\0\6\7\1\154\15\7\21\0\1\7\1\0\1\7"+
    "\1\0\1\7\1\155\22\7\21\0\1\7\1\0\1\7"+
    "\1\0\1\156\23\7\21\0\1\7\1\0\1\7\1\0"+
    "\4\7\1\157\17\7\21\0\1\7\1\0\1\7\1\0"+
    "\5\7\1\160\16\7\21\0\1\7\1\0\1\7\1\0"+
    "\1\7\1\161\22\7\21\0\1\7\1\0\1\7\1\0"+
    "\1\7\1\162\22\7\21\0\1\7\1\0\1\7\1\0"+
    "\16\7\1\163\5\7\21\0\1\7\1\0\1\7\1\0"+
    "\10\7\1\164\13\7\21\0\1\7\1\0\1\7\1\0"+
    "\1\165\23\7\21\0\1\7\1\0\1\7\1\0\1\7"+
    "\1\166\22\7\21\0\1\7\1\0\1\7\1\0\15\7"+
    "\1\167\6\7\21\0\1\7\1\0\1\7\1\0\4\7"+
    "\1\170\17\7\21\0\1\7\1\0\1\7\1\0\5\7"+
    "\1\171\16\7\21\0\1\7\1\0\1\7\1\0\3\7"+
    "\1\172\20\7\21\0\1\7\1\0\1\7\1\0\7\7"+
    "\1\173\14\7\21\0\1\7\1\0\1\7\1\0\5\7"+
    "\1\174\16\7\21\0\1\7\1\0\1\7\1\0\13\7"+
    "\1\175\10\7\21\0\1\7\1\0\1\7\1\0\22\7"+
    "\1\176\1\7\21\0\1\7\1\0\1\7\1\0\3\7"+
    "\1\177\20\7\21\0\1\7\1\0\1\7\1\0\2\7"+
    "\1\200\21\7\21\0\1\7\1\0\1\7\1\0\5\7"+
    "\1\201\16\7\21\0\1\7\1\0\1\7\1\0\7\7"+
    "\1\202\14\7\21\0\1\7\1\0\1\7\1\0\12\7"+
    "\1\203\11\7\21\0\1\7\1\0\1\7\1\0\1\7"+
    "\1\204\22\7\21\0\1\7\1\0\1\7\1\0\14\7"+
    "\1\205\7\7\21\0\1\7\1\0\1\7\1\0\10\7"+
    "\1\206\13\7\21\0\1\7\1\0\1\7\1\0\11\7"+
    "\1\207\12\7\21\0\1\7\1\0\1\7\1\0\1\7"+
    "\1\210\22\7\21\0\1\7\1\0\1\7\1\0\10\7"+
    "\1\211\13\7\21\0\1\7\1\0\1\7\1\0\10\7"+
    "\1\212\13\7\21\0\1\7\1\0\1\7\1\0\3\7"+
    "\1\213\20\7\21\0\1\7\1\0\1\7\1\0\12\7"+
    "\1\214\11\7\21\0\1\7\1\0\1\7\1\0\4\7"+
    "\1\215\17\7\21\0\1\7\1\0\1\7\1\0\3\7"+
    "\1\216\20\7\21\0\1\7\1\0\1\7\1\0\4\7"+
    "\1\217\17\7\21\0\1\7\1\0\1\7\1\0\14\7"+
    "\1\220\7\7\21\0\1\7\1\0\1\7\1\0\7\7"+
    "\1\221\14\7\21\0\1\7\1\0\1\7\1\0\14\7"+
    "\1\222\7\7\21\0\1\7\1\0\1\7\1\0\12\7"+
    "\1\223\11\7\21\0\1\7\1\0\1\7\1\0\3\7"+
    "\1\224\20\7\21\0\1\7\1\0\1\7\1\0\4\7"+
    "\1\225\17\7\21\0\1\7\1\0\1\7\1\0\5\7"+
    "\1\226\16\7\21\0\1\7\1\0\1\7\1\0\14\7"+
    "\1\227\7\7\21\0\1\7\1\0\1\7\1\0\11\7"+
    "\1\230\12\7\21\0\1\7\1\0\1\7\1\0\1\7"+
    "\1\231\22\7\14\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4715];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\2\11\1\1\1\11\16\1\2\11\1\1\4\11"+
    "\1\1\3\11\1\1\3\0\22\1\3\11\142\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[153];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  LexicalErrorManager lexicalErrorManager = new LexicalErrorManager ();
  private int commentCount = 0;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Scanner(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public Scanner(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzPushbackPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead < 0) {
      return true;
    }
    else {
      zzEndRead+= numRead;
      return false;
    }
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = zzPushbackPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) throws LexicalError {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new LexicalError(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  throws LexicalError {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException, LexicalError {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = zzLexicalState;


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 12: 
          { Token token = new Token (sym.COLON);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
          }
        case 46: break;
        case 37: 
          { Token token = new Token (sym.THEN);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
          }
        case 47: break;
        case 29: 
          { Token token = new Token (sym.FOR);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
          }
        case 48: break;
        case 41: 
          { Token token = new Token (sym.PROGRAM);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
          }
        case 49: break;
        case 14: 
          { Token token = new Token (sym.PLUS);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
          }
        case 50: break;
        case 8: 
          { Token token = new Token (sym.LEFT_BRACKET);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
          }
        case 51: break;
        case 13: 
          { Token token = new Token (sym.DOT);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
          }
        case 52: break;
        case 1: 
          { LexicalError error = new LexicalError ();
                           error.setLine (yyline + 1);
                           error.setColumn (yycolumn + 1);
                           error.setLexema (yytext ());
                           lexicalErrorManager.lexicalError (error);
          }
        case 53: break;
        case 5: 
          { Token token = new Token (sym.AND);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
          }
        case 54: break;
        case 6: 
          { Token token = new Token (sym.LEFT_PARENTHESIS);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
          }
        case 55: break;
        case 9: 
          { Token token = new Token (sym.RIGHT_BRACKET);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
          }
        case 56: break;
        case 21: 
          { Token token = new Token (sym.IF);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
          }
        case 57: break;
        case 42: 
          { Token token = new Token (sym.VARIABLES);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
          }
        case 58: break;
        case 23: 
          { Token token = new Token (sym.VECTOR_ACCESS);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
          }
        case 59: break;
        case 19: 
          { Token token = new Token (sym.IN);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
          }
        case 60: break;
        case 26: 
          { Token token = new Token (sym.VAR);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
          }
        case 61: break;
        case 22: 
          { Token token = new Token (sym.OF);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
          }
        case 62: break;
        case 16: 
          { Token token = new Token (sym.LESS);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
          }
        case 63: break;
        case 20: 
          { Token token = new Token (sym.NOT);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
          }
        case 64: break;
        case 7: 
          { Token token = new Token (sym.RIGHT_PARENTHESIS);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
          }
        case 65: break;
        case 25: 
          { Token token = new Token (sym.EQUAL);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
          }
        case 66: break;
        case 3: 
          { Token token = new Token (sym.NUMBER);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
          }
        case 67: break;
        case 27: 
          { Token token = new Token (sym.END);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
          }
        case 68: break;
        case 24: 
          { Token token = new Token (sym.RANGE);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
          }
        case 69: break;
        case 34: 
          { Token token = new Token (sym.VECTOR);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
          }
        case 70: break;
        case 31: 
          { Token token = new Token (sym.FALSE);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
          }
        case 71: break;
        case 4: 
          { Token token = new Token (sym.ID);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
          }
        case 72: break;
        case 17: 
          { Token token = new Token (sym.ASSIGN);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
          }
        case 73: break;
        case 45: 
          { Token token = new Token (sym.PROCEDURE);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
          }
        case 74: break;
        case 44: 
          { Token token = new Token (sym.SUBPROGRAM);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
          }
        case 75: break;
        case 11: 
          { Token token = new Token (sym.SEMICOLON);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
          }
        case 76: break;
        case 43: 
          { Token token = new Token (sym.CONSTANTS);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
          }
        case 77: break;
        case 10: 
          { Token token = new Token (sym.COMMA);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
          }
        case 78: break;
        case 35: 
          { Token token = new Token (sym.FUNCTION);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
          }
        case 79: break;
        case 15: 
          { Token token = new Token (sym.ASTERISK);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
          }
        case 80: break;
        case 30: 
          { Token token = new Token (sym.TYPES);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
          }
        case 81: break;
        case 32: 
          { Token token = new Token (sym.INTEGER);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
          }
        case 82: break;
        case 18: 
          { Token token = new Token (sym.STRING);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
          }
        case 83: break;
        case 40: 
          { Token token = new Token (sym.RETURN);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
          }
        case 84: break;
        case 36: 
          { Token token = new Token (sym.BOOLEAN);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
          }
        case 85: break;
        case 39: 
          { Token token = new Token (sym.BEGIN);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
          }
        case 86: break;
        case 38: 
          { Token token = new Token (sym.WRITE);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
          }
        case 87: break;
        case 28: 
          { Token token = new Token (sym.ELSE);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
          }
        case 88: break;
        case 33: 
          { Token token = new Token (sym.TRUE);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
          }
        case 89: break;
        case 2: 
          { 
          }
        case 90: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
