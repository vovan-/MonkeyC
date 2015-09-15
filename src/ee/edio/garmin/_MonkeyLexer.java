/* The following code was generated by JFlex 1.4.3 on 12.09.15 3:53 */

package ee.edio.garmin;
import com.intellij.lexer.*;
import com.intellij.psi.tree.IElementType;
import static ee.edio.garmin.psi.MonkeyTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 12.09.15 3:53 from the specification file
 * <tt>C:/Users/Madis/Projects/2015/MonkeyC/src/ee/edio/garmin/_MonkeyLexer.flex</tt>
 */
public class _MonkeyLexer implements FlexLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\1\1\2\1\1\1\1\1\1\22\0\1\1\1\70\1\16"+
    "\1\0\1\5\1\71\1\65\1\20\1\56\1\57\1\4\1\66\1\60"+
    "\1\67\1\13\1\3\1\10\11\6\1\23\1\21\1\62\1\64\1\63"+
    "\1\22\1\0\1\106\1\105\1\12\1\15\1\104\1\14\1\5\1\75"+
    "\1\111\2\5\1\7\2\5\1\77\1\103\1\107\1\76\1\101\1\74"+
    "\1\102\1\110\1\100\1\11\2\5\1\54\1\17\1\55\1\72\1\5"+
    "\1\0\1\26\1\47\1\24\1\43\1\37\1\30\1\44\1\46\1\34"+
    "\1\5\1\50\1\25\1\42\1\32\1\35\2\5\1\36\1\27\1\33"+
    "\1\31\1\41\1\40\1\45\1\51\1\5\1\52\1\61\1\53\1\73"+
    "\uff81\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\1\1\2\1\3\1\4\1\5\1\6\2\7\1\10"+
    "\1\11\1\12\1\13\1\14\1\15\21\6\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27"+
    "\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37"+
    "\4\6\1\40\1\41\1\42\1\43\1\44\1\45\1\0"+
    "\1\1\1\46\1\47\1\1\1\0\1\50\3\0\1\51"+
    "\3\6\1\52\15\6\1\53\1\6\1\54\7\6\1\55"+
    "\4\6\1\56\1\57\1\60\1\61\1\62\1\63\1\64"+
    "\1\65\1\66\1\67\1\70\1\71\4\6\1\72\1\0"+
    "\4\6\1\73\5\6\1\74\3\6\1\75\1\6\1\76"+
    "\7\6\1\77\2\6\1\100\6\6\1\72\1\6\1\101"+
    "\12\6\1\102\1\103\3\6\1\104\1\105\11\6\1\106"+
    "\1\107\1\110\1\111\3\6\1\112\2\6\1\113\1\6"+
    "\1\114\3\6\1\115\3\6\1\116\1\6\1\117\1\120"+
    "\1\6\1\121\1\122\2\6\1\123\1\6\1\124\1\6"+
    "\1\125\1\6\1\126\1\127\2\6\1\130\1\6\1\131"+
    "\1\132\1\133\1\134\2\6\1\135";

  private static int [] zzUnpackAction() {
    int [] result = new int[231];
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
    "\0\0\0\112\0\224\0\336\0\u0128\0\u0172\0\u01bc\0\u0206"+
    "\0\u0250\0\u029a\0\u02e4\0\112\0\112\0\112\0\u032e\0\u0378"+
    "\0\u03c2\0\u040c\0\u0456\0\u04a0\0\u04ea\0\u0534\0\u057e\0\u05c8"+
    "\0\u0612\0\u065c\0\u06a6\0\u06f0\0\u073a\0\u0784\0\u07ce\0\112"+
    "\0\112\0\112\0\112\0\112\0\112\0\112\0\u0818\0\112"+
    "\0\112\0\u0862\0\u08ac\0\u08f6\0\u0940\0\u098a\0\u09d4\0\112"+
    "\0\112\0\u0a1e\0\u0a68\0\u0ab2\0\u0afc\0\u0b46\0\u0b90\0\112"+
    "\0\112\0\112\0\112\0\u0250\0\112\0\112\0\u0bda\0\u0c24"+
    "\0\u029a\0\112\0\u0c6e\0\u02e4\0\u0cb8\0\112\0\u0d02\0\u0d4c"+
    "\0\u0d96\0\u0172\0\u0de0\0\u0e2a\0\u0e74\0\u0ebe\0\u0f08\0\u0f52"+
    "\0\u0f9c\0\u0fe6\0\u1030\0\u107a\0\u10c4\0\u110e\0\u1158\0\u0172"+
    "\0\u11a2\0\u0172\0\u11ec\0\u1236\0\u1280\0\u12ca\0\u1314\0\u135e"+
    "\0\u13a8\0\u0172\0\u13f2\0\u143c\0\u1486\0\u14d0\0\112\0\112"+
    "\0\112\0\112\0\112\0\112\0\112\0\112\0\112\0\112"+
    "\0\112\0\112\0\u151a\0\u1564\0\u15ae\0\u15f8\0\u0b90\0\u1642"+
    "\0\u168c\0\u16d6\0\u1720\0\u176a\0\u0172\0\u17b4\0\u17fe\0\u1848"+
    "\0\u1892\0\u18dc\0\u0172\0\u1926\0\u1970\0\u19ba\0\u0172\0\u1a04"+
    "\0\u0172\0\u1a4e\0\u1a98\0\u1ae2\0\u1b2c\0\u1b76\0\u1bc0\0\u1c0a"+
    "\0\u0172\0\u1c54\0\u1c9e\0\u0172\0\u1ce8\0\u1d32\0\u1d7c\0\u1dc6"+
    "\0\u1e10\0\u1e5a\0\112\0\u1ea4\0\u0172\0\u1eee\0\u1f38\0\u1f82"+
    "\0\u1fcc\0\u2016\0\u2060\0\u20aa\0\u20f4\0\u213e\0\u2188\0\u0172"+
    "\0\u0172\0\u21d2\0\u221c\0\u2266\0\u0172\0\u0172\0\u22b0\0\u22fa"+
    "\0\u2344\0\u238e\0\u23d8\0\u2422\0\u246c\0\u24b6\0\u2500\0\u0172"+
    "\0\u0172\0\u0172\0\u0172\0\u254a\0\u2594\0\u25de\0\u0172\0\u2628"+
    "\0\u2672\0\u0172\0\u26bc\0\u0172\0\u2706\0\u2750\0\u279a\0\u0172"+
    "\0\u27e4\0\u282e\0\u2878\0\u0172\0\u28c2\0\u0172\0\u0172\0\u290c"+
    "\0\u0172\0\u0172\0\u2956\0\u29a0\0\u0172\0\u29ea\0\u0172\0\u2a34"+
    "\0\u0172\0\u2a7e\0\u0172\0\u0172\0\u2ac8\0\u2b12\0\u0172\0\u2b5c"+
    "\0\u0172\0\u0172\0\u0172\0\u0172\0\u2ba6\0\u2bf0\0\u0172";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[231];
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
    "\1\2\2\3\1\4\1\5\1\6\1\7\1\6\1\10"+
    "\2\6\1\11\2\6\1\12\1\2\1\13\1\14\1\15"+
    "\1\16\1\17\1\6\1\20\1\21\1\22\1\23\1\24"+
    "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34"+
    "\1\35\2\6\1\36\1\37\2\6\1\40\1\41\1\42"+
    "\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52"+
    "\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62"+
    "\4\6\1\63\3\6\1\64\2\6\1\65\1\6\113\0"+
    "\2\3\112\0\1\66\1\67\57\0\1\70\30\0\1\71"+
    "\60\0\1\72\32\0\6\6\1\0\2\6\6\0\26\6"+
    "\22\0\16\6\6\0\1\7\1\73\1\7\2\0\1\74"+
    "\1\75\1\76\7\0\1\73\2\0\1\75\12\0\1\76"+
    "\54\0\1\7\1\73\1\7\1\77\1\0\1\74\1\75"+
    "\1\76\7\0\1\73\2\0\1\75\12\0\1\76\1\0"+
    "\1\77\52\0\1\100\1\0\1\100\101\0\16\101\1\102"+
    "\1\103\72\101\17\104\1\105\1\106\71\104\5\0\6\6"+
    "\1\0\2\6\6\0\1\6\1\107\1\110\6\6\1\111"+
    "\14\6\22\0\16\6\5\0\6\6\1\0\2\6\6\0"+
    "\3\6\1\112\2\6\1\113\17\6\22\0\16\6\5\0"+
    "\6\6\1\0\2\6\6\0\7\6\1\114\4\6\1\115"+
    "\11\6\22\0\16\6\5\0\6\6\1\0\2\6\6\0"+
    "\2\6\1\116\2\6\1\117\2\6\1\120\1\121\14\6"+
    "\22\0\16\6\5\0\6\6\1\0\2\6\6\0\3\6"+
    "\1\122\22\6\22\0\16\6\5\0\6\6\1\0\2\6"+
    "\6\0\2\6\1\123\2\6\1\124\5\6\1\125\12\6"+
    "\22\0\16\6\5\0\6\6\1\0\2\6\6\0\12\6"+
    "\1\126\7\6\1\127\3\6\22\0\16\6\5\0\6\6"+
    "\1\0\2\6\6\0\4\6\1\130\1\6\1\131\17\6"+
    "\22\0\16\6\5\0\6\6\1\0\2\6\6\0\12\6"+
    "\1\132\13\6\22\0\16\6\5\0\6\6\1\0\2\6"+
    "\6\0\13\6\1\133\12\6\22\0\16\6\5\0\6\6"+
    "\1\0\2\6\6\0\1\6\1\134\4\6\1\135\12\6"+
    "\1\136\4\6\22\0\16\6\5\0\6\6\1\0\2\6"+
    "\6\0\22\6\1\137\3\6\22\0\16\6\5\0\6\6"+
    "\1\0\2\6\6\0\2\6\1\140\23\6\22\0\16\6"+
    "\5\0\6\6\1\0\2\6\6\0\11\6\1\141\14\6"+
    "\22\0\16\6\5\0\6\6\1\0\2\6\6\0\11\6"+
    "\1\142\1\6\1\143\12\6\22\0\16\6\5\0\6\6"+
    "\1\0\2\6\6\0\2\6\1\144\5\6\1\145\15\6"+
    "\22\0\16\6\5\0\6\6\1\0\2\6\6\0\12\6"+
    "\1\146\13\6\22\0\16\6\61\0\1\147\2\0\1\150"+
    "\110\0\1\151\1\152\111\0\1\153\1\154\110\0\1\155"+
    "\1\0\1\156\107\0\1\157\2\0\1\160\106\0\1\161"+
    "\111\0\1\162\32\0\6\6\1\0\2\6\6\0\26\6"+
    "\22\0\1\6\1\163\14\6\5\0\6\6\1\0\2\6"+
    "\6\0\26\6\22\0\6\6\1\164\7\6\5\0\6\6"+
    "\1\0\2\6\6\0\26\6\22\0\12\6\1\165\3\6"+
    "\5\0\6\6\1\0\2\6\6\0\26\6\22\0\3\6"+
    "\1\166\12\6\2\66\1\0\107\66\4\167\1\170\105\167"+
    "\6\0\1\77\1\0\1\77\1\0\1\77\1\0\2\77"+
    "\6\0\1\77\1\0\1\77\1\0\1\77\6\0\1\77"+
    "\3\0\1\77\3\0\1\77\34\0\3\77\11\0\1\100"+
    "\1\0\1\100\3\0\1\75\1\76\12\0\1\75\12\0"+
    "\1\76\46\0\2\101\1\0\107\101\2\104\1\0\107\104"+
    "\5\0\6\6\1\0\2\6\6\0\2\6\1\171\23\6"+
    "\22\0\16\6\5\0\6\6\1\0\2\6\6\0\3\6"+
    "\1\172\3\6\1\173\16\6\22\0\16\6\5\0\6\6"+
    "\1\0\2\6\6\0\6\6\1\174\17\6\22\0\16\6"+
    "\5\0\6\6\1\0\2\6\6\0\17\6\1\175\6\6"+
    "\22\0\16\6\5\0\6\6\1\0\2\6\6\0\2\6"+
    "\1\176\23\6\22\0\16\6\5\0\6\6\1\0\2\6"+
    "\6\0\10\6\1\177\15\6\22\0\16\6\5\0\6\6"+
    "\1\0\2\6\6\0\1\6\1\200\24\6\22\0\16\6"+
    "\5\0\6\6\1\0\2\6\6\0\6\6\1\201\17\6"+
    "\22\0\16\6\5\0\6\6\1\0\2\6\6\0\6\6"+
    "\1\202\17\6\22\0\16\6\5\0\6\6\1\0\2\6"+
    "\6\0\12\6\1\203\13\6\22\0\16\6\5\0\6\6"+
    "\1\0\2\6\6\0\10\6\1\204\15\6\22\0\16\6"+
    "\5\0\6\6\1\0\2\6\6\0\7\6\1\205\16\6"+
    "\22\0\16\6\5\0\6\6\1\0\2\6\6\0\1\6"+
    "\1\206\24\6\22\0\16\6\5\0\6\6\1\0\2\6"+
    "\6\0\14\6\1\207\11\6\22\0\16\6\5\0\6\6"+
    "\1\0\2\6\6\0\5\6\1\210\17\6\1\211\22\0"+
    "\16\6\5\0\6\6\1\0\2\6\6\0\12\6\1\212"+
    "\13\6\22\0\16\6\5\0\6\6\1\0\2\6\6\0"+
    "\3\6\1\213\22\6\22\0\16\6\5\0\6\6\1\0"+
    "\2\6\6\0\7\6\1\214\16\6\22\0\16\6\5\0"+
    "\6\6\1\0\2\6\6\0\3\6\1\215\22\6\22\0"+
    "\16\6\5\0\6\6\1\0\2\6\6\0\5\6\1\216"+
    "\20\6\22\0\16\6\5\0\6\6\1\0\2\6\6\0"+
    "\7\6\1\217\16\6\22\0\16\6\5\0\6\6\1\0"+
    "\2\6\6\0\10\6\1\220\15\6\22\0\16\6\5\0"+
    "\6\6\1\0\2\6\6\0\12\6\1\221\13\6\22\0"+
    "\16\6\5\0\6\6\1\0\2\6\6\0\17\6\1\222"+
    "\6\6\22\0\16\6\5\0\6\6\1\0\2\6\6\0"+
    "\4\6\1\223\21\6\22\0\16\6\5\0\6\6\1\0"+
    "\2\6\6\0\3\6\1\224\22\6\22\0\16\6\5\0"+
    "\6\6\1\0\2\6\6\0\17\6\1\225\6\6\22\0"+
    "\16\6\5\0\6\6\1\0\2\6\6\0\13\6\1\226"+
    "\12\6\22\0\16\6\5\0\6\6\1\0\2\6\6\0"+
    "\26\6\22\0\2\6\1\227\13\6\5\0\6\6\1\0"+
    "\2\6\6\0\26\6\22\0\7\6\1\230\6\6\5\0"+
    "\6\6\1\0\2\6\6\0\26\6\22\0\2\6\1\231"+
    "\13\6\5\0\6\6\1\0\2\6\6\0\26\6\22\0"+
    "\15\6\1\232\3\167\1\233\1\170\105\167\5\0\6\6"+
    "\1\0\2\6\6\0\3\6\1\234\22\6\22\0\16\6"+
    "\5\0\6\6\1\0\2\6\6\0\13\6\1\235\12\6"+
    "\22\0\16\6\5\0\6\6\1\0\2\6\6\0\1\236"+
    "\25\6\22\0\16\6\5\0\6\6\1\0\2\6\6\0"+
    "\3\6\1\237\3\6\1\240\16\6\22\0\16\6\5\0"+
    "\6\6\1\0\2\6\6\0\7\6\1\241\16\6\22\0"+
    "\16\6\5\0\6\6\1\0\2\6\6\0\7\6\1\242"+
    "\16\6\22\0\16\6\5\0\6\6\1\0\2\6\6\0"+
    "\3\6\1\243\22\6\22\0\16\6\5\0\6\6\1\0"+
    "\2\6\6\0\1\244\25\6\22\0\16\6\5\0\6\6"+
    "\1\0\2\6\6\0\2\6\1\245\23\6\22\0\16\6"+
    "\5\0\6\6\1\0\2\6\6\0\6\6\1\246\17\6"+
    "\22\0\16\6\5\0\6\6\1\0\2\6\6\0\10\6"+
    "\1\247\15\6\22\0\16\6\5\0\6\6\1\0\2\6"+
    "\6\0\1\6\1\250\24\6\22\0\16\6\5\0\6\6"+
    "\1\0\2\6\6\0\13\6\1\251\12\6\22\0\16\6"+
    "\5\0\6\6\1\0\2\6\6\0\11\6\1\252\14\6"+
    "\22\0\16\6\5\0\6\6\1\0\2\6\6\0\7\6"+
    "\1\253\16\6\22\0\16\6\5\0\6\6\1\0\2\6"+
    "\6\0\5\6\1\254\20\6\22\0\16\6\5\0\6\6"+
    "\1\0\2\6\6\0\13\6\1\255\12\6\22\0\16\6"+
    "\5\0\6\6\1\0\2\6\6\0\16\6\1\256\7\6"+
    "\22\0\16\6\5\0\6\6\1\0\2\6\6\0\13\6"+
    "\1\257\12\6\22\0\16\6\5\0\6\6\1\0\2\6"+
    "\6\0\1\6\1\260\24\6\22\0\16\6\5\0\6\6"+
    "\1\0\2\6\6\0\5\6\1\261\20\6\22\0\16\6"+
    "\5\0\6\6\1\0\2\6\6\0\2\6\1\262\23\6"+
    "\22\0\16\6\5\0\6\6\1\0\2\6\6\0\17\6"+
    "\1\263\6\6\22\0\16\6\5\0\6\6\1\0\2\6"+
    "\6\0\2\6\1\264\23\6\22\0\16\6\5\0\6\6"+
    "\1\0\2\6\6\0\26\6\22\0\3\6\1\265\12\6"+
    "\5\0\6\6\1\0\2\6\6\0\26\6\22\0\10\6"+
    "\1\266\5\6\5\0\6\6\1\0\2\6\6\0\26\6"+
    "\22\0\10\6\1\267\5\6\5\0\6\6\1\0\1\6"+
    "\1\270\6\0\26\6\22\0\16\6\5\0\6\6\1\0"+
    "\2\6\6\0\3\6\1\271\22\6\22\0\16\6\5\0"+
    "\6\6\1\0\2\6\6\0\22\6\1\272\3\6\22\0"+
    "\16\6\5\0\6\6\1\0\2\6\6\0\7\6\1\273"+
    "\16\6\22\0\16\6\5\0\6\6\1\0\2\6\6\0"+
    "\10\6\1\274\15\6\22\0\16\6\5\0\6\6\1\0"+
    "\2\6\6\0\10\6\1\275\15\6\22\0\16\6\5\0"+
    "\6\6\1\0\2\6\6\0\1\276\25\6\22\0\16\6"+
    "\5\0\6\6\1\0\2\6\6\0\13\6\1\277\12\6"+
    "\22\0\16\6\5\0\6\6\1\0\2\6\6\0\7\6"+
    "\1\300\16\6\22\0\16\6\5\0\6\6\1\0\2\6"+
    "\6\0\1\6\1\301\24\6\22\0\16\6\5\0\6\6"+
    "\1\0\2\6\6\0\20\6\1\302\5\6\22\0\16\6"+
    "\5\0\6\6\1\0\2\6\6\0\15\6\1\303\10\6"+
    "\22\0\16\6\5\0\6\6\1\0\2\6\6\0\14\6"+
    "\1\304\11\6\22\0\16\6\5\0\6\6\1\0\2\6"+
    "\6\0\2\6\1\305\23\6\22\0\16\6\5\0\6\6"+
    "\1\0\2\6\6\0\12\6\1\306\13\6\22\0\16\6"+
    "\5\0\6\6\1\0\2\6\6\0\6\6\1\307\17\6"+
    "\22\0\16\6\5\0\6\6\1\0\2\6\6\0\13\6"+
    "\1\310\12\6\22\0\16\6\5\0\6\6\1\0\2\6"+
    "\6\0\1\6\1\311\24\6\22\0\16\6\5\0\6\6"+
    "\1\0\2\6\6\0\5\6\1\312\20\6\22\0\16\6"+
    "\5\0\6\6\1\0\2\6\6\0\13\6\1\313\12\6"+
    "\22\0\16\6\5\0\6\6\1\0\2\6\6\0\24\6"+
    "\1\314\1\6\22\0\16\6\5\0\6\6\1\0\2\6"+
    "\6\0\26\6\22\0\4\6\1\315\11\6\5\0\6\6"+
    "\1\0\2\6\6\0\26\6\22\0\2\6\1\316\13\6"+
    "\5\0\6\6\1\0\2\6\6\0\26\6\22\0\13\6"+
    "\1\317\2\6\5\0\6\6\1\0\2\6\6\0\6\6"+
    "\1\320\17\6\22\0\16\6\5\0\6\6\1\0\2\6"+
    "\6\0\1\321\25\6\22\0\16\6\5\0\6\6\1\0"+
    "\2\6\6\0\22\6\1\322\3\6\22\0\16\6\5\0"+
    "\6\6\1\0\2\6\6\0\10\6\1\323\15\6\22\0"+
    "\16\6\5\0\6\6\1\0\2\6\6\0\1\6\1\324"+
    "\24\6\22\0\16\6\5\0\6\6\1\0\2\6\6\0"+
    "\13\6\1\325\12\6\22\0\16\6\5\0\6\6\1\0"+
    "\2\6\6\0\6\6\1\326\17\6\22\0\16\6\5\0"+
    "\6\6\1\0\2\6\6\0\6\6\1\327\17\6\22\0"+
    "\16\6\5\0\6\6\1\0\2\6\6\0\17\6\1\330"+
    "\6\6\22\0\16\6\5\0\6\6\1\0\2\6\6\0"+
    "\13\6\1\331\12\6\22\0\16\6\5\0\6\6\1\0"+
    "\2\6\6\0\1\6\1\332\24\6\22\0\16\6\5\0"+
    "\6\6\1\0\2\6\6\0\6\6\1\333\17\6\22\0"+
    "\16\6\5\0\6\6\1\0\2\6\6\0\26\6\22\0"+
    "\5\6\1\334\10\6\5\0\6\6\1\0\2\6\6\0"+
    "\5\6\1\335\20\6\22\0\16\6\5\0\6\6\1\0"+
    "\2\6\6\0\11\6\1\336\14\6\22\0\16\6\5\0"+
    "\6\6\1\0\2\6\6\0\25\6\1\337\22\0\16\6"+
    "\5\0\6\6\1\0\2\6\6\0\1\340\25\6\22\0"+
    "\16\6\5\0\6\6\1\0\2\6\6\0\3\6\1\341"+
    "\22\6\22\0\16\6\5\0\6\6\1\0\2\6\6\0"+
    "\7\6\1\342\16\6\22\0\16\6\5\0\6\6\1\0"+
    "\2\6\6\0\13\6\1\343\12\6\22\0\16\6\5\0"+
    "\6\6\1\0\2\6\6\0\6\6\1\344\17\6\22\0"+
    "\16\6\5\0\6\6\1\0\2\6\6\0\13\6\1\345"+
    "\12\6\22\0\16\6\5\0\6\6\1\0\2\6\6\0"+
    "\11\6\1\346\14\6\22\0\16\6\5\0\6\6\1\0"+
    "\2\6\6\0\4\6\1\347\21\6\22\0\16\6";

  private static int [] zzUnpackTrans() {
    int [] result = new int[11322];
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
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

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
    "\1\1\1\11\11\1\3\11\21\1\7\11\1\1\2\11"+
    "\6\1\2\11\6\1\4\11\1\0\2\11\2\1\1\0"+
    "\1\11\3\0\1\11\40\1\14\11\5\1\1\0\42\1"+
    "\1\11\114\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[231];
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

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

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

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /* user code: */
  public _MonkeyLexer() {
    this((java.io.Reader)null);
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _MonkeyLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 182) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
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
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
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
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
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
              zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
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
        case 6: 
          { return IDENTIFIER;
          }
        case 94: break;
        case 58: 
          { return BLOCK_COMMENT;
          }
        case 95: break;
        case 62: 
          { return TRY;
          }
        case 96: break;
        case 18: 
          { return LPAREN;
          }
        case 97: break;
        case 59: 
          { return AND;
          }
        case 98: break;
        case 77: 
          { return WHILE;
          }
        case 99: break;
        case 54: 
          { return SUBEQ;
          }
        case 100: break;
        case 73: 
          { return CONST;
          }
        case 101: break;
        case 67: 
          { return TRUE;
          }
        case 102: break;
        case 17: 
          { return RBRACKET;
          }
        case 103: break;
        case 29: 
          { return PERCENT;
          }
        case 104: break;
        case 81: 
          { return STATIC;
          }
        case 105: break;
        case 50: 
          { return AMPEQ;
          }
        case 106: break;
        case 13: 
          { return COLON;
          }
        case 107: break;
        case 10: 
          { return STRING_B;
          }
        case 108: break;
        case 25: 
          { return AMP;
          }
        case 109: break;
        case 78: 
          { return BREAK;
          }
        case 110: break;
        case 24: 
          { return EQ;
          }
        case 111: break;
        case 70: 
          { return VOID;
          }
        case 112: break;
        case 38: 
          { return DOUBLELITERAL;
          }
        case 113: break;
        case 64: 
          { return HAS;
          }
        case 114: break;
        case 21: 
          { return BAR;
          }
        case 115: break;
        case 89: 
          { return EXTENDS;
          }
        case 116: break;
        case 56: 
          { return BANGEQ;
          }
        case 117: break;
        case 53: 
          { return PLUSPLUS;
          }
        case 118: break;
        case 30: 
          { return CARET;
          }
        case 119: break;
        case 84: 
          { return RETURN;
          }
        case 120: break;
        case 79: 
          { return SUPER;
          }
        case 121: break;
        case 3: 
          { return com.intellij.psi.TokenType.WHITE_SPACE;
          }
        case 122: break;
        case 75: 
          { return USING;
          }
        case 123: break;
        case 9: 
          { return STRING_A;
          }
        case 124: break;
        case 16: 
          { return LBRACKET;
          }
        case 125: break;
        case 46: 
          { return BARBAR;
          }
        case 126: break;
        case 72: 
          { return CATCH;
          }
        case 127: break;
        case 20: 
          { return COMMA;
          }
        case 128: break;
        case 37: 
          { return LONGLITERAL;
          }
        case 129: break;
        case 85: 
          { return MODULE;
          }
        case 130: break;
        case 26: 
          { return PLUS;
          }
        case 131: break;
        case 83: 
          { return NATIVE;
          }
        case 132: break;
        case 52: 
          { return PLUSEQ;
          }
        case 133: break;
        case 49: 
          { return EQEQ;
          }
        case 134: break;
        case 66: 
          { return NULL;
          }
        case 135: break;
        case 22: 
          { return LT;
          }
        case 136: break;
        case 82: 
          { return SWITCH;
          }
        case 137: break;
        case 34: 
          { return SLASHEQ;
          }
        case 138: break;
        case 71: 
          { return CLASS;
          }
        case 139: break;
        case 69: 
          { return ENUM;
          }
        case 140: break;
        case 8: 
          { return DOT;
          }
        case 141: break;
        case 33: 
          { return MULTI_LINE_COMMENT_START;
          }
        case 142: break;
        case 90: 
          { return DEFAULT;
          }
        case 143: break;
        case 45: 
          { return DO;
          }
        case 144: break;
        case 47: 
          { return CARETEQ;
          }
        case 145: break;
        case 7: 
          { return INTLITERAL;
          }
        case 146: break;
        case 11: 
          { return SEMI;
          }
        case 147: break;
        case 74: 
          { return FALSE;
          }
        case 148: break;
        case 15: 
          { return RBRACE;
          }
        case 149: break;
        case 80: 
          { return BAREQ;
          }
        case 150: break;
        case 61: 
          { return NEW;
          }
        case 151: break;
        case 23: 
          { return GT;
          }
        case 152: break;
        case 41: 
          { return CHARLITERAL;
          }
        case 153: break;
        case 87: 
          { return THROWS;
          }
        case 154: break;
        case 51: 
          { return AMPAMP;
          }
        case 155: break;
        case 27: 
          { return SUB;
          }
        case 156: break;
        case 35: 
          { return MULTI_LINE_COMMENT_END;
          }
        case 157: break;
        case 86: 
          { return HIDDEN;
          }
        case 158: break;
        case 57: 
          { return PERCENTEQ;
          }
        case 159: break;
        case 91: 
          { return CONTINUE;
          }
        case 160: break;
        case 44: 
          { return OR;
          }
        case 161: break;
        case 14: 
          { return LBRACE;
          }
        case 162: break;
        case 31: 
          { return TILDE;
          }
        case 163: break;
        case 63: 
          { return VAR;
          }
        case 164: break;
        case 92: 
          { return FUNCTION;
          }
        case 165: break;
        case 4: 
          { return SLASH;
          }
        case 166: break;
        case 76: 
          { return THROW;
          }
        case 167: break;
        case 68: 
          { return ELSE;
          }
        case 168: break;
        case 40: 
          { return STRING;
          }
        case 169: break;
        case 43: 
          { return IF;
          }
        case 170: break;
        case 5: 
          { return STAR;
          }
        case 171: break;
        case 93: 
          { return INSTANCEOF;
          }
        case 172: break;
        case 55: 
          { return SUBSUB;
          }
        case 173: break;
        case 32: 
          { return SINGLE_LINE_COMMENT;
          }
        case 174: break;
        case 88: 
          { return FINALLY;
          }
        case 175: break;
        case 2: 
          { return com.intellij.psi.TokenType.BAD_CHARACTER;
          }
        case 176: break;
        case 1: 
          { return FLOATLITERAL;
          }
        case 177: break;
        case 60: 
          { return FOR;
          }
        case 178: break;
        case 48: 
          { return EQGT;
          }
        case 179: break;
        case 65: 
          { return CASE;
          }
        case 180: break;
        case 19: 
          { return RPAREN;
          }
        case 181: break;
        case 36: 
          { return STAREQ;
          }
        case 182: break;
        case 28: 
          { return BANG;
          }
        case 183: break;
        case 12: 
          { return QUES;
          }
        case 184: break;
        case 42: 
          { return AS;
          }
        case 185: break;
        case 39: 
          { return HEX_LITERAL;
          }
        case 186: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
