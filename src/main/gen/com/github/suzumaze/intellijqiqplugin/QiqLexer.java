// Generated by JFlex 1.9.1 http://jflex.de/  (tweaked for IntelliJ platform)
// source: Qiq.flex

package com.github.suzumaze.intellijqiqplugin;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.github.suzumaze.intellijqiqplugin.psi.QiqTypes;
import com.intellij.psi.TokenType;


class QiqLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int IN_QIQ = 2;
  public static final int IN_PHP = 4;
  public static final int IN_DOC_COMMENT = 6;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0,  0,  1,  1,  2,  2,  3, 3
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\37\u0100\1\u0200\267\u0100\10\u0300\u1020\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
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
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\1\3\1\1\1\4\22\0\1\1"+
    "\1\5\1\6\1\0\1\7\1\10\1\11\1\12\1\13"+
    "\1\14\1\15\1\16\1\17\1\20\1\21\1\22\12\23"+
    "\1\24\1\25\1\26\1\27\1\30\1\31\1\32\32\33"+
    "\1\34\1\35\1\36\1\0\1\37\1\0\1\40\1\33"+
    "\1\41\1\33\1\42\2\33\1\43\1\33\1\41\5\33"+
    "\1\44\2\33\1\45\1\33\1\46\5\33\1\47\1\50"+
    "\1\51\1\52\6\0\1\3\u01a2\0\2\3\326\0\u0100\53";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1024];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
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
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\4\0\3\1\1\2\1\3\2\4\1\5\2\2\1\6"+
    "\2\2\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\2"+
    "\1\25\1\26\1\27\1\30\2\25\3\2\1\31\1\2"+
    "\4\32\1\33\1\0\1\34\1\35\1\0\1\36\1\0"+
    "\1\37\1\40\1\0\1\41\1\0\1\42\1\0\1\43"+
    "\1\17\1\44\1\45\1\46\1\47\1\0\1\50\1\25"+
    "\1\51\1\52\1\0\1\31\1\53\1\54\1\55\1\56"+
    "\1\57\1\0\1\60\1\34\1\61\1\62\1\63\1\64"+
    "\1\65\1\0\1\66";

  private static int [] zzUnpackAction() {
    int [] result = new int[89];
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
    "\0\0\0\54\0\130\0\204\0\260\0\334\0\u0108\0\u0134"+
    "\0\u0160\0\u0134\0\u018c\0\u01b8\0\u01e4\0\u0210\0\u0134\0\u023c"+
    "\0\u0268\0\u0134\0\u0134\0\u0134\0\u0134\0\u0134\0\u0294\0\u0134"+
    "\0\u02c0\0\u02ec\0\u0134\0\u0134\0\u0318\0\u0344\0\u0370\0\u039c"+
    "\0\u03c8\0\u0134\0\u0134\0\u0134\0\u03f4\0\u0420\0\u044c\0\u0478"+
    "\0\u04a4\0\u04d0\0\u04fc\0\u0134\0\u0528\0\u0554\0\u0580\0\u05ac"+
    "\0\u05d8\0\u0604\0\u0630\0\u01e4\0\u0134\0\u065c\0\u0688\0\u0134"+
    "\0\u0268\0\u0134\0\u06b4\0\u0134\0\u06e0\0\u070c\0\u0738\0\u0134"+
    "\0\u0764\0\u0134\0\u0134\0\u0790\0\u03c8\0\u07bc\0\u0134\0\u0134"+
    "\0\u0478\0\u0134\0\u0134\0\u07e8\0\u0134\0\u0580\0\u0134\0\u0814"+
    "\0\u0134\0\u0134\0\u0134\0\u0134\0\u0134\0\u0134\0\u03c8\0\u0840"+
    "\0\u0134";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[89];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length() - 1;
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpacktrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\26\5\1\6\20\5\1\7\4\5\1\10\2\11\1\12"+
    "\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22"+
    "\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32"+
    "\1\33\1\34\1\35\1\36\1\37\1\40\1\10\1\41"+
    "\1\42\1\43\1\44\1\41\1\45\5\41\1\46\1\10"+
    "\1\47\1\50\1\51\1\10\30\52\1\10\1\53\22\52"+
    "\1\54\2\11\2\10\2\54\1\55\5\54\1\56\14\54"+
    "\1\57\1\60\1\54\1\43\1\54\10\60\4\54\1\10"+
    "\26\5\1\0\20\5\1\0\4\5\31\0\1\61\71\0"+
    "\1\62\61\0\2\11\53\0\1\12\100\0\1\63\24\0"+
    "\2\64\1\0\1\64\1\0\1\64\1\65\26\64\1\66"+
    "\16\64\33\0\1\67\3\0\10\67\16\0\1\70\42\0"+
    "\2\71\1\0\1\71\1\0\5\71\1\72\22\71\1\73"+
    "\16\71\30\0\1\74\40\0\1\75\4\0\1\76\52\0"+
    "\1\77\1\0\1\32\57\0\1\100\53\0\1\101\1\102"+
    "\52\0\1\103\44\0\1\104\56\0\1\41\7\0\1\41"+
    "\3\0\10\41\30\0\1\41\7\0\1\41\3\0\6\41"+
    "\1\105\1\41\30\0\1\41\7\0\1\41\3\0\6\41"+
    "\1\106\1\41\55\0\1\107\54\0\1\110\53\0\1\111"+
    "\2\0\31\52\1\0\22\52\30\112\1\113\23\112\33\0"+
    "\1\114\3\0\10\114\27\0\1\115\64\0\1\116\4\0"+
    "\7\116\30\0\1\60\7\0\1\60\3\0\10\60\34\0"+
    "\1\117\14\0\1\120\36\0\1\121\10\0\2\122\1\0"+
    "\1\122\2\0\1\122\34\0\1\123\24\0\2\64\1\0"+
    "\1\64\1\0\47\64\23\0\1\67\7\0\1\67\3\0"+
    "\10\67\5\0\2\71\1\0\1\71\1\0\47\71\15\0"+
    "\1\124\36\0\2\76\1\0\1\76\1\0\44\76\1\0"+
    "\2\76\23\0\1\77\57\0\1\125\54\0\1\126\46\0"+
    "\1\41\7\0\1\41\3\0\3\41\1\127\4\41\30\0"+
    "\1\114\7\0\1\114\3\0\10\114\50\0\1\130\54\0"+
    "\1\131\7\0";

  private static int [] zzUnpacktrans() {
    int [] result = new int[2156];
    int offset = 0;
    offset = zzUnpacktrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpacktrans(String packed, int offset, int [] result) {
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
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\4\0\3\1\1\11\1\1\1\11\4\1\1\11\2\1"+
    "\5\11\1\1\1\11\2\1\2\11\5\1\3\11\7\1"+
    "\1\11\4\1\1\0\2\1\1\0\1\11\1\0\1\1"+
    "\1\11\1\0\1\11\1\0\1\11\1\0\2\1\1\11"+
    "\1\1\2\11\1\0\2\1\2\11\1\0\2\11\1\1"+
    "\1\11\1\1\1\11\1\0\6\11\1\1\1\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[89];
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
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** Number of newlines encountered up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  @SuppressWarnings("unused")
  protected int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  QiqLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** Returns the maximum size of the scanner buffer, which limits the size of tokens. */
  private int zzMaxBufferLen() {
    return Integer.MAX_VALUE;
  }

  /**  Whether the scanner buffer can grow to accommodate a larger token. */
  private boolean zzCanGrow() {
    return true;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      {@code false}, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
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
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position {@code pos} from the
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
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
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
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException
  {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { return QiqTypes.TEMPLATE_TEXT;
            }
          // fall through
          case 55: break;
          case 2:
            { return TokenType.BAD_CHARACTER;
            }
          // fall through
          case 56: break;
          case 3:
            { return TokenType.WHITE_SPACE;
            }
          // fall through
          case 57: break;
          case 4:
            { return QiqTypes.CRLF;
            }
          // fall through
          case 58: break;
          case 5:
            { return QiqTypes.NOT_OP;
            }
          // fall through
          case 59: break;
          case 6:
            { return QiqTypes.MOD;
            }
          // fall through
          case 60: break;
          case 7:
            { return QiqTypes.LEFT_PAREN;
            }
          // fall through
          case 61: break;
          case 8:
            { return QiqTypes.RIGHT_PAREN;
            }
          // fall through
          case 62: break;
          case 9:
            { return QiqTypes.MULTIPLY;
            }
          // fall through
          case 63: break;
          case 10:
            { return QiqTypes.PLUS;
            }
          // fall through
          case 64: break;
          case 11:
            { return QiqTypes.COMMA;
            }
          // fall through
          case 65: break;
          case 12:
            { return QiqTypes.MINUS;
            }
          // fall through
          case 66: break;
          case 13:
            { return QiqTypes.DOT;
            }
          // fall through
          case 67: break;
          case 14:
            { return QiqTypes.DIVIDE;
            }
          // fall through
          case 68: break;
          case 15:
            { return QiqTypes.NUMBER;
            }
          // fall through
          case 69: break;
          case 16:
            { return QiqTypes.COLON;
            }
          // fall through
          case 70: break;
          case 17:
            { return QiqTypes.SEMICOLON;
            }
          // fall through
          case 71: break;
          case 18:
            { return QiqTypes.LESS_THAN;
            }
          // fall through
          case 72: break;
          case 19:
            { return QiqTypes.EQUALS;
            }
          // fall through
          case 73: break;
          case 20:
            { return QiqTypes.GREATER_THAN;
            }
          // fall through
          case 74: break;
          case 21:
            { return QiqTypes.IDENTIFIER;
            }
          // fall through
          case 75: break;
          case 22:
            { return QiqTypes.LEFT_BRACKET;
            }
          // fall through
          case 76: break;
          case 23:
            { return QiqTypes.BACKSLASH;
            }
          // fall through
          case 77: break;
          case 24:
            { return QiqTypes.RIGHT_BRACKET;
            }
          // fall through
          case 78: break;
          case 25:
            { return QiqTypes.PHP_CODE;
            }
          // fall through
          case 79: break;
          case 26:
            { return QiqTypes.DOC_COMMENT_TEXT;
            }
          // fall through
          case 80: break;
          case 27:
            { return QiqTypes.DOC_IDENTIFIER;
            }
          // fall through
          case 81: break;
          case 28:
            { yybegin(IN_QIQ); return QiqTypes.QIQ_OPENING_TAG;
            }
          // fall through
          case 82: break;
          case 29:
            { return QiqTypes.NOT_EQUAL;
            }
          // fall through
          case 83: break;
          case 30:
            { return QiqTypes.DOUBLE_QUOTED_STRING;
            }
          // fall through
          case 84: break;
          case 31:
            { return QiqTypes.VARIABLE;
            }
          // fall through
          case 85: break;
          case 32:
            { return QiqTypes.AND_OP;
            }
          // fall through
          case 86: break;
          case 33:
            { return QiqTypes.SINGLE_QUOTED_STRING;
            }
          // fall through
          case 87: break;
          case 34:
            { return QiqTypes.OBJECT_OPERATOR;
            }
          // fall through
          case 88: break;
          case 35:
            { return QiqTypes.LINE_COMMENT;
            }
          // fall through
          case 89: break;
          case 36:
            { return QiqTypes.LESS_EQUAL;
            }
          // fall through
          case 90: break;
          case 37:
            { return QiqTypes.EQUAL_TO;
            }
          // fall through
          case 91: break;
          case 38:
            { return QiqTypes.ARROW;
            }
          // fall through
          case 92: break;
          case 39:
            { return QiqTypes.GREATER_EQUAL;
            }
          // fall through
          case 93: break;
          case 40:
            { return QiqTypes.AS;
            }
          // fall through
          case 94: break;
          case 41:
            { return QiqTypes.OR_OP;
            }
          // fall through
          case 95: break;
          case 42:
            { yybegin(YYINITIAL); return QiqTypes.QIQ_CLOSING_TAG;
            }
          // fall through
          case 96: break;
          case 43:
            { yybegin(YYINITIAL); return QiqTypes.PHP_CLOSING_TAG;
            }
          // fall through
          case 97: break;
          case 44:
            { return QiqTypes.DOC_VARIABLE;
            }
          // fall through
          case 98: break;
          case 45:
            { yybegin(IN_QIQ); return QiqTypes.DOC_COMMENT_END;
            }
          // fall through
          case 99: break;
          case 46:
            { return QiqTypes.DOC_TAG_NAME;
            }
          // fall through
          case 100: break;
          case 47:
            { yybegin(IN_PHP); return QiqTypes.PHP_ECHO_OPENING_TAG;
            }
          // fall through
          case 101: break;
          case 48:
            { yybegin(IN_QIQ); return QiqTypes.QIQ_ECHO_OPENING_TAG;
            }
          // fall through
          case 102: break;
          case 49:
            { return QiqTypes.NOT_IDENTICAL;
            }
          // fall through
          case 103: break;
          case 50:
            { yybegin(IN_DOC_COMMENT); return QiqTypes.DOC_COMMENT_START;
            }
          // fall through
          case 104: break;
          case 51:
            { return QiqTypes.IDENTICAL;
            }
          // fall through
          case 105: break;
          case 52:
            { return QiqTypes.NULL_SAFE_OPERATOR;
            }
          // fall through
          case 106: break;
          case 53:
            { return QiqTypes.USE;
            }
          // fall through
          case 107: break;
          case 54:
            { yybegin(IN_PHP); return QiqTypes.PHP_OPENING_TAG;
            }
          // fall through
          case 108: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
