/* The following code was generated by JFlex 1.4.3 on 10.08.15 1:43 */

package ee.edio.garmin;
import com.intellij.lexer.*;
import com.intellij.psi.tree.IElementType;
import static ee.edio.garmin.psi.MonkeyCTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 10.08.15 1:43 from the specification file
 * <tt>C:/Users/Madis/Projects/2015/MonkeyC/src/ee/edio/garmin/_MonkeyCLexer.flex</tt>
 */
public class _MonkeyCLexer implements FlexLexer {
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
    "\11\0\1\1\1\2\1\1\1\1\1\1\22\0\1\1\1\62\1\10"+
    "\1\0\1\5\1\63\1\56\1\12\1\50\1\51\1\4\1\57\1\52"+
    "\1\60\1\7\1\3\12\6\1\15\1\13\1\54\1\61\1\55\1\14"+
    "\1\0\1\77\1\74\1\101\1\106\1\76\1\105\1\104\1\67\1\103"+
    "\2\5\1\75\1\112\1\100\1\71\1\110\1\111\1\70\1\73\1\66"+
    "\1\107\1\113\1\72\1\5\1\102\1\5\1\46\1\11\1\47\1\64"+
    "\1\5\1\0\1\20\1\41\1\16\1\35\1\31\1\22\1\36\1\40"+
    "\1\26\1\5\1\42\1\17\1\34\1\24\1\27\2\5\1\30\1\21"+
    "\1\25\1\23\1\33\1\32\1\37\1\43\1\5\1\44\1\53\1\45"+
    "\1\65\uff81\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\1\1\2\1\3\1\4\1\5\2\1\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\21\1\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\2"+
    "\1\26\1\27\1\30\1\31\1\32\1\33\1\34\12\1"+
    "\1\35\1\36\1\37\1\40\1\41\1\42\1\0\1\43"+
    "\3\0\1\44\3\1\1\45\15\1\1\46\1\1\1\47"+
    "\7\1\1\50\4\1\1\51\1\52\1\53\1\54\1\55"+
    "\1\56\1\57\1\60\1\61\1\62\1\63\15\1\1\64"+
    "\1\0\4\1\1\65\5\1\1\66\3\1\1\67\1\1"+
    "\1\70\7\1\1\71\2\1\1\72\11\1\1\73\1\1"+
    "\1\74\3\1\1\64\1\1\1\75\12\1\1\76\1\77"+
    "\3\1\1\100\1\101\13\1\1\102\1\103\1\104\2\1"+
    "\1\105\1\106\1\107\1\110\3\1\1\111\2\1\1\112"+
    "\1\1\1\113\3\1\1\114\3\1\1\115\1\1\1\116"+
    "\1\117\1\1\1\120\1\121\2\1\1\122\1\123\2\1"+
    "\1\124\1\1\1\125\1\1\1\126\1\1\1\127\1\130"+
    "\1\1\1\131\2\1\1\132\1\1\1\133\1\134\1\135"+
    "\1\136\1\137\2\1\1\140";

  private static int [] zzUnpackAction() {
    int [] result = new int[262];
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
    "\0\0\0\114\0\230\0\344\0\u0130\0\u017c\0\u01c8\0\114"+
    "\0\u0214\0\u0260\0\114\0\114\0\114\0\u02ac\0\u02f8\0\u0344"+
    "\0\u0390\0\u03dc\0\u0428\0\u0474\0\u04c0\0\u050c\0\u0558\0\u05a4"+
    "\0\u05f0\0\u063c\0\u0688\0\u06d4\0\u0720\0\u076c\0\114\0\114"+
    "\0\114\0\114\0\114\0\114\0\114\0\u07b8\0\114\0\114"+
    "\0\u0804\0\u0850\0\u089c\0\u08e8\0\u0934\0\u0980\0\114\0\114"+
    "\0\u09cc\0\u0a18\0\u0a64\0\u0ab0\0\u0afc\0\u0b48\0\u0b94\0\u0be0"+
    "\0\u0c2c\0\u0c78\0\u0cc4\0\u0d10\0\114\0\114\0\114\0\u0d5c"+
    "\0\u0214\0\114\0\u0da8\0\u0260\0\u0df4\0\114\0\u0e40\0\u0e8c"+
    "\0\u0ed8\0\u017c\0\u0f24\0\u0f70\0\u0fbc\0\u1008\0\u1054\0\u10a0"+
    "\0\u10ec\0\u1138\0\u1184\0\u11d0\0\u121c\0\u1268\0\u12b4\0\u017c"+
    "\0\u1300\0\u017c\0\u134c\0\u1398\0\u13e4\0\u1430\0\u147c\0\u14c8"+
    "\0\u1514\0\u017c\0\u1560\0\u15ac\0\u15f8\0\u1644\0\114\0\114"+
    "\0\114\0\114\0\114\0\114\0\114\0\114\0\114\0\114"+
    "\0\114\0\u1690\0\u16dc\0\u1728\0\u1774\0\u17c0\0\u180c\0\u1858"+
    "\0\u18a4\0\u18f0\0\u193c\0\u1988\0\u19d4\0\u1a20\0\u0d10\0\u1a6c"+
    "\0\u1ab8\0\u1b04\0\u1b50\0\u1b9c\0\u017c\0\u1be8\0\u1c34\0\u1c80"+
    "\0\u1ccc\0\u1d18\0\u017c\0\u1d64\0\u1db0\0\u1dfc\0\u017c\0\u1e48"+
    "\0\u017c\0\u1e94\0\u1ee0\0\u1f2c\0\u1f78\0\u1fc4\0\u2010\0\u205c"+
    "\0\u017c\0\u20a8\0\u20f4\0\u017c\0\u2140\0\u218c\0\u21d8\0\u2224"+
    "\0\u2270\0\u22bc\0\u2308\0\u2354\0\u23a0\0\u017c\0\u23ec\0\u017c"+
    "\0\u2438\0\u2484\0\u24d0\0\114\0\u251c\0\u017c\0\u2568\0\u25b4"+
    "\0\u2600\0\u264c\0\u2698\0\u26e4\0\u2730\0\u277c\0\u27c8\0\u2814"+
    "\0\u017c\0\u017c\0\u2860\0\u28ac\0\u28f8\0\u017c\0\u017c\0\u2944"+
    "\0\u2990\0\u29dc\0\u2a28\0\u2a74\0\u2ac0\0\u2b0c\0\u2b58\0\u2ba4"+
    "\0\u2bf0\0\u2c3c\0\u017c\0\u017c\0\u017c\0\u2c88\0\u2cd4\0\u017c"+
    "\0\u017c\0\u017c\0\u017c\0\u2d20\0\u2d6c\0\u2db8\0\u017c\0\u2e04"+
    "\0\u2e50\0\u017c\0\u2e9c\0\u017c\0\u2ee8\0\u2f34\0\u2f80\0\u017c"+
    "\0\u2fcc\0\u3018\0\u3064\0\u017c\0\u30b0\0\u017c\0\u017c\0\u30fc"+
    "\0\u017c\0\u017c\0\u3148\0\u3194\0\u017c\0\u017c\0\u31e0\0\u322c"+
    "\0\u017c\0\u3278\0\u017c\0\u32c4\0\u017c\0\u3310\0\u017c\0\u017c"+
    "\0\u335c\0\u017c\0\u33a8\0\u33f4\0\u017c\0\u3440\0\u017c\0\u017c"+
    "\0\u017c\0\u017c\0\u017c\0\u348c\0\u34d8\0\u017c";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[262];
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
    "\1\2\2\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\2\1\12\1\13\1\14\1\15\1\16\1\6\1\17"+
    "\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27"+
    "\1\30\1\31\1\32\1\33\1\34\2\6\1\35\1\36"+
    "\2\6\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
    "\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55"+
    "\1\56\1\57\1\60\1\61\4\6\1\62\1\63\1\64"+
    "\1\6\1\65\1\6\1\66\1\6\1\67\1\6\1\70"+
    "\1\71\4\6\1\72\115\0\2\3\114\0\1\73\1\74"+
    "\54\0\1\75\35\0\1\76\55\0\1\77\37\0\2\6"+
    "\7\0\26\6\22\0\26\6\5\0\1\6\1\7\1\100"+
    "\6\0\26\6\22\0\26\6\10\101\1\102\1\103\102\101"+
    "\11\104\1\105\1\106\101\104\5\0\2\6\7\0\1\6"+
    "\1\107\1\110\6\6\1\111\14\6\22\0\26\6\5\0"+
    "\2\6\7\0\3\6\1\112\2\6\1\113\17\6\22\0"+
    "\26\6\5\0\2\6\7\0\7\6\1\114\4\6\1\115"+
    "\11\6\22\0\26\6\5\0\2\6\7\0\2\6\1\116"+
    "\2\6\1\117\2\6\1\120\1\121\14\6\22\0\26\6"+
    "\5\0\2\6\7\0\3\6\1\122\22\6\22\0\26\6"+
    "\5\0\2\6\7\0\2\6\1\123\2\6\1\124\5\6"+
    "\1\125\12\6\22\0\26\6\5\0\2\6\7\0\12\6"+
    "\1\126\7\6\1\127\3\6\22\0\26\6\5\0\2\6"+
    "\7\0\4\6\1\130\1\6\1\131\17\6\22\0\26\6"+
    "\5\0\2\6\7\0\12\6\1\132\13\6\22\0\26\6"+
    "\5\0\2\6\7\0\13\6\1\133\12\6\22\0\26\6"+
    "\5\0\2\6\7\0\1\6\1\134\4\6\1\135\12\6"+
    "\1\136\4\6\22\0\26\6\5\0\2\6\7\0\22\6"+
    "\1\137\3\6\22\0\26\6\5\0\2\6\7\0\2\6"+
    "\1\140\23\6\22\0\26\6\5\0\2\6\7\0\11\6"+
    "\1\141\14\6\22\0\26\6\5\0\2\6\7\0\11\6"+
    "\1\142\1\6\1\143\12\6\22\0\26\6\5\0\2\6"+
    "\7\0\2\6\1\144\5\6\1\145\15\6\22\0\26\6"+
    "\5\0\2\6\7\0\12\6\1\146\13\6\22\0\26\6"+
    "\53\0\1\147\5\0\1\150\110\0\1\151\2\0\1\152"+
    "\111\0\1\153\1\0\1\154\112\0\1\155\1\156\113\0"+
    "\1\157\113\0\1\160\113\0\1\161\37\0\2\6\7\0"+
    "\26\6\22\0\1\6\1\162\24\6\5\0\2\6\7\0"+
    "\26\6\22\0\1\6\1\163\17\6\1\164\4\6\5\0"+
    "\2\6\7\0\26\6\22\0\3\6\1\165\5\6\1\166"+
    "\2\6\1\167\11\6\5\0\2\6\7\0\26\6\22\0"+
    "\3\6\1\170\22\6\5\0\2\6\7\0\26\6\22\0"+
    "\24\6\1\171\1\6\5\0\2\6\7\0\26\6\22\0"+
    "\1\6\1\172\24\6\5\0\2\6\7\0\26\6\22\0"+
    "\12\6\1\173\13\6\5\0\2\6\7\0\26\6\22\0"+
    "\7\6\1\174\16\6\5\0\2\6\7\0\26\6\22\0"+
    "\3\6\1\175\22\6\5\0\2\6\7\0\26\6\22\0"+
    "\3\6\1\176\22\6\2\73\1\0\111\73\4\177\1\200"+
    "\107\177\6\0\1\100\105\0\2\101\1\0\111\101\2\104"+
    "\1\0\111\104\5\0\2\6\7\0\2\6\1\201\23\6"+
    "\22\0\26\6\5\0\2\6\7\0\3\6\1\202\3\6"+
    "\1\203\16\6\22\0\26\6\5\0\2\6\7\0\6\6"+
    "\1\204\17\6\22\0\26\6\5\0\2\6\7\0\17\6"+
    "\1\205\6\6\22\0\26\6\5\0\2\6\7\0\2\6"+
    "\1\206\23\6\22\0\26\6\5\0\2\6\7\0\10\6"+
    "\1\207\15\6\22\0\26\6\5\0\2\6\7\0\1\6"+
    "\1\210\24\6\22\0\26\6\5\0\2\6\7\0\6\6"+
    "\1\211\17\6\22\0\26\6\5\0\2\6\7\0\6\6"+
    "\1\212\17\6\22\0\26\6\5\0\2\6\7\0\12\6"+
    "\1\213\13\6\22\0\26\6\5\0\2\6\7\0\10\6"+
    "\1\214\15\6\22\0\26\6\5\0\2\6\7\0\7\6"+
    "\1\215\16\6\22\0\26\6\5\0\2\6\7\0\1\6"+
    "\1\216\24\6\22\0\26\6\5\0\2\6\7\0\14\6"+
    "\1\217\11\6\22\0\26\6\5\0\2\6\7\0\5\6"+
    "\1\220\17\6\1\221\22\0\26\6\5\0\2\6\7\0"+
    "\12\6\1\222\13\6\22\0\26\6\5\0\2\6\7\0"+
    "\3\6\1\223\22\6\22\0\26\6\5\0\2\6\7\0"+
    "\7\6\1\224\16\6\22\0\26\6\5\0\2\6\7\0"+
    "\3\6\1\225\22\6\22\0\26\6\5\0\2\6\7\0"+
    "\5\6\1\226\20\6\22\0\26\6\5\0\2\6\7\0"+
    "\7\6\1\227\16\6\22\0\26\6\5\0\2\6\7\0"+
    "\10\6\1\230\15\6\22\0\26\6\5\0\2\6\7\0"+
    "\12\6\1\231\13\6\22\0\26\6\5\0\2\6\7\0"+
    "\17\6\1\232\6\6\22\0\26\6\5\0\2\6\7\0"+
    "\4\6\1\233\21\6\22\0\26\6\5\0\2\6\7\0"+
    "\3\6\1\234\22\6\22\0\26\6\5\0\2\6\7\0"+
    "\17\6\1\235\6\6\22\0\26\6\5\0\2\6\7\0"+
    "\13\6\1\236\12\6\22\0\26\6\5\0\2\6\7\0"+
    "\26\6\22\0\2\6\1\237\23\6\5\0\2\6\7\0"+
    "\26\6\22\0\3\6\1\240\22\6\5\0\2\6\7\0"+
    "\26\6\22\0\22\6\1\241\3\6\5\0\2\6\7\0"+
    "\26\6\22\0\3\6\1\242\22\6\5\0\2\6\7\0"+
    "\26\6\22\0\2\6\1\243\23\6\5\0\2\6\7\0"+
    "\26\6\22\0\1\244\25\6\5\0\2\6\7\0\26\6"+
    "\22\0\12\6\1\245\13\6\5\0\2\6\7\0\26\6"+
    "\22\0\22\6\1\246\3\6\5\0\2\6\7\0\26\6"+
    "\22\0\11\6\1\247\14\6\5\0\2\6\7\0\26\6"+
    "\22\0\1\250\25\6\5\0\2\6\7\0\26\6\22\0"+
    "\3\6\1\251\22\6\5\0\2\6\7\0\26\6\22\0"+
    "\21\6\1\252\4\6\5\0\2\6\7\0\26\6\22\0"+
    "\15\6\1\253\10\6\3\177\1\254\1\200\107\177\5\0"+
    "\2\6\7\0\3\6\1\255\22\6\22\0\26\6\5\0"+
    "\2\6\7\0\13\6\1\256\12\6\22\0\26\6\5\0"+
    "\2\6\7\0\1\257\25\6\22\0\26\6\5\0\2\6"+
    "\7\0\3\6\1\260\3\6\1\261\16\6\22\0\26\6"+
    "\5\0\2\6\7\0\7\6\1\262\16\6\22\0\26\6"+
    "\5\0\2\6\7\0\7\6\1\263\16\6\22\0\26\6"+
    "\5\0\2\6\7\0\3\6\1\264\22\6\22\0\26\6"+
    "\5\0\2\6\7\0\1\265\25\6\22\0\26\6\5\0"+
    "\2\6\7\0\2\6\1\266\23\6\22\0\26\6\5\0"+
    "\2\6\7\0\6\6\1\267\17\6\22\0\26\6\5\0"+
    "\2\6\7\0\10\6\1\270\15\6\22\0\26\6\5\0"+
    "\2\6\7\0\1\6\1\271\24\6\22\0\26\6\5\0"+
    "\2\6\7\0\13\6\1\272\12\6\22\0\26\6\5\0"+
    "\2\6\7\0\11\6\1\273\14\6\22\0\26\6\5\0"+
    "\2\6\7\0\7\6\1\274\16\6\22\0\26\6\5\0"+
    "\2\6\7\0\5\6\1\275\20\6\22\0\26\6\5\0"+
    "\2\6\7\0\13\6\1\276\12\6\22\0\26\6\5\0"+
    "\2\6\7\0\16\6\1\277\7\6\22\0\26\6\5\0"+
    "\2\6\7\0\13\6\1\300\12\6\22\0\26\6\5\0"+
    "\2\6\7\0\1\6\1\301\24\6\22\0\26\6\5\0"+
    "\2\6\7\0\5\6\1\302\20\6\22\0\26\6\5\0"+
    "\2\6\7\0\2\6\1\303\23\6\22\0\26\6\5\0"+
    "\2\6\7\0\17\6\1\304\6\6\22\0\26\6\5\0"+
    "\2\6\7\0\2\6\1\305\23\6\22\0\26\6\5\0"+
    "\2\6\7\0\26\6\22\0\3\6\1\306\22\6\5\0"+
    "\2\6\7\0\26\6\22\0\2\6\1\307\23\6\5\0"+
    "\2\6\7\0\26\6\22\0\10\6\1\310\15\6\5\0"+
    "\2\6\7\0\26\6\22\0\7\6\1\311\16\6\5\0"+
    "\2\6\7\0\26\6\22\0\10\6\1\312\15\6\5\0"+
    "\2\6\7\0\26\6\22\0\10\6\1\313\15\6\5\0"+
    "\2\6\7\0\26\6\22\0\16\6\1\314\7\6\5\0"+
    "\2\6\7\0\26\6\22\0\2\6\1\315\23\6\5\0"+
    "\2\6\7\0\26\6\22\0\11\6\1\316\14\6\5\0"+
    "\2\6\7\0\26\6\22\0\6\6\1\317\17\6\5\0"+
    "\2\6\7\0\26\6\22\0\20\6\1\320\5\6\5\0"+
    "\2\6\7\0\3\6\1\321\22\6\22\0\26\6\5\0"+
    "\2\6\7\0\22\6\1\322\3\6\22\0\26\6\5\0"+
    "\2\6\7\0\7\6\1\323\16\6\22\0\26\6\5\0"+
    "\2\6\7\0\10\6\1\324\15\6\22\0\26\6\5\0"+
    "\2\6\7\0\10\6\1\325\15\6\22\0\26\6\5\0"+
    "\2\6\7\0\1\326\25\6\22\0\26\6\5\0\2\6"+
    "\7\0\13\6\1\327\12\6\22\0\26\6\5\0\2\6"+
    "\7\0\7\6\1\330\16\6\22\0\26\6\5\0\2\6"+
    "\7\0\1\6\1\331\24\6\22\0\26\6\5\0\2\6"+
    "\7\0\20\6\1\332\5\6\22\0\26\6\5\0\2\6"+
    "\7\0\15\6\1\333\10\6\22\0\26\6\5\0\2\6"+
    "\7\0\14\6\1\334\11\6\22\0\26\6\5\0\2\6"+
    "\7\0\2\6\1\335\23\6\22\0\26\6\5\0\2\6"+
    "\7\0\12\6\1\336\13\6\22\0\26\6\5\0\2\6"+
    "\7\0\6\6\1\337\17\6\22\0\26\6\5\0\2\6"+
    "\7\0\13\6\1\340\12\6\22\0\26\6\5\0\2\6"+
    "\7\0\1\6\1\341\24\6\22\0\26\6\5\0\2\6"+
    "\7\0\5\6\1\342\20\6\22\0\26\6\5\0\2\6"+
    "\7\0\13\6\1\343\12\6\22\0\26\6\5\0\2\6"+
    "\7\0\24\6\1\344\1\6\22\0\26\6\5\0\2\6"+
    "\7\0\26\6\22\0\4\6\1\345\21\6\5\0\2\6"+
    "\7\0\26\6\22\0\1\346\25\6\5\0\2\6\7\0"+
    "\26\6\22\0\2\6\1\347\23\6\5\0\2\6\7\0"+
    "\26\6\22\0\10\6\1\350\15\6\5\0\2\6\7\0"+
    "\26\6\22\0\23\6\1\351\2\6\5\0\2\6\7\0"+
    "\26\6\22\0\1\352\25\6\5\0\2\6\7\0\26\6"+
    "\22\0\7\6\1\353\16\6\5\0\2\6\7\0\6\6"+
    "\1\354\17\6\22\0\26\6\5\0\2\6\7\0\1\355"+
    "\25\6\22\0\26\6\5\0\2\6\7\0\22\6\1\356"+
    "\3\6\22\0\26\6\5\0\2\6\7\0\10\6\1\357"+
    "\15\6\22\0\26\6\5\0\2\6\7\0\1\6\1\360"+
    "\24\6\22\0\26\6\5\0\2\6\7\0\13\6\1\361"+
    "\12\6\22\0\26\6\5\0\2\6\7\0\6\6\1\362"+
    "\17\6\22\0\26\6\5\0\2\6\7\0\6\6\1\363"+
    "\17\6\22\0\26\6\5\0\2\6\7\0\17\6\1\364"+
    "\6\6\22\0\26\6\5\0\2\6\7\0\13\6\1\365"+
    "\12\6\22\0\26\6\5\0\2\6\7\0\1\6\1\366"+
    "\24\6\22\0\26\6\5\0\2\6\7\0\6\6\1\367"+
    "\17\6\22\0\26\6\5\0\2\6\7\0\26\6\22\0"+
    "\5\6\1\370\20\6\5\0\2\6\7\0\26\6\22\0"+
    "\11\6\1\371\14\6\5\0\2\6\7\0\26\6\22\0"+
    "\10\6\1\372\15\6\5\0\2\6\7\0\5\6\1\373"+
    "\20\6\22\0\26\6\5\0\2\6\7\0\11\6\1\374"+
    "\14\6\22\0\26\6\5\0\2\6\7\0\25\6\1\375"+
    "\22\0\26\6\5\0\2\6\7\0\1\376\25\6\22\0"+
    "\26\6\5\0\2\6\7\0\3\6\1\377\22\6\22\0"+
    "\26\6\5\0\2\6\7\0\7\6\1\u0100\16\6\22\0"+
    "\26\6\5\0\2\6\7\0\26\6\22\0\12\6\1\u0101"+
    "\13\6\5\0\2\6\7\0\13\6\1\u0102\12\6\22\0"+
    "\26\6\5\0\2\6\7\0\6\6\1\u0103\17\6\22\0"+
    "\26\6\5\0\2\6\7\0\13\6\1\u0104\12\6\22\0"+
    "\26\6\5\0\2\6\7\0\11\6\1\u0105\14\6\22\0"+
    "\26\6\5\0\2\6\7\0\4\6\1\u0106\21\6\22\0"+
    "\26\6";

  private static int [] zzUnpackTrans() {
    int [] result = new int[13604];
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
    "\1\1\1\11\5\1\1\11\2\1\3\11\21\1\7\11"+
    "\1\1\2\11\6\1\2\11\14\1\3\11\1\1\1\0"+
    "\1\11\3\0\1\11\40\1\13\11\16\1\1\0\53\1"+
    "\1\11\132\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[262];
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
  public _MonkeyCLexer() {
    this((java.io.Reader)null);
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _MonkeyCLexer(java.io.Reader in) {
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
    while (i < 184) {
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
        case 1: 
          { return IDENTIFIER;
          }
        case 97: break;
        case 52: 
          { return BLOCK_COMMENT;
          }
        case 98: break;
        case 56: 
          { return TRY;
          }
        case 99: break;
        case 16: 
          { return LPAREN;
          }
        case 100: break;
        case 53: 
          { return AND;
          }
        case 101: break;
        case 76: 
          { return WHILE;
          }
        case 102: break;
        case 48: 
          { return SUBEQ;
          }
        case 103: break;
        case 72: 
          { return CONST;
          }
        case 104: break;
        case 63: 
          { return TRUE;
          }
        case 105: break;
        case 15: 
          { return RBRACKET;
          }
        case 106: break;
        case 26: 
          { return PERCENT;
          }
        case 107: break;
        case 82: 
          { return STATIC;
          }
        case 108: break;
        case 34: 
          { return NUMBER;
          }
        case 109: break;
        case 44: 
          { return AMPEQ;
          }
        case 110: break;
        case 11: 
          { return COLON;
          }
        case 111: break;
        case 8: 
          { return STRING_B;
          }
        case 112: break;
        case 59: 
          { return AMP;
          }
        case 113: break;
        case 77: 
          { return BREAK;
          }
        case 114: break;
        case 24: 
          { return EQ;
          }
        case 115: break;
        case 69: 
          { return VOID;
          }
        case 116: break;
        case 58: 
          { return HAS;
          }
        case 117: break;
        case 19: 
          { return BAR;
          }
        case 118: break;
        case 91: 
          { return EXTENDS;
          }
        case 119: break;
        case 50: 
          { return BANGEQ;
          }
        case 120: break;
        case 45: 
          { return PLUSPLUS;
          }
        case 121: break;
        case 27: 
          { return CARET;
          }
        case 122: break;
        case 85: 
          { return RETURN;
          }
        case 123: break;
        case 79: 
          { return SUPER;
          }
        case 124: break;
        case 3: 
          { return com.intellij.psi.TokenType.WHITE_SPACE;
          }
        case 125: break;
        case 74: 
          { return USING;
          }
        case 126: break;
        case 7: 
          { return STRING_A;
          }
        case 127: break;
        case 14: 
          { return LBRACKET;
          }
        case 128: break;
        case 41: 
          { return BARBAR;
          }
        case 129: break;
        case 89: 
          { return DOUBLE;
          }
        case 130: break;
        case 71: 
          { return CATCH;
          }
        case 131: break;
        case 18: 
          { return COMMA;
          }
        case 132: break;
        case 86: 
          { return MODULE;
          }
        case 133: break;
        case 67: 
          { return LONG;
          }
        case 134: break;
        case 22: 
          { return PLUS;
          }
        case 135: break;
        case 84: 
          { return NATIVE;
          }
        case 136: break;
        case 46: 
          { return PLUSEQ;
          }
        case 137: break;
        case 49: 
          { return EQEQ;
          }
        case 138: break;
        case 62: 
          { return NULL;
          }
        case 139: break;
        case 20: 
          { return LT;
          }
        case 140: break;
        case 83: 
          { return SWITCH;
          }
        case 141: break;
        case 31: 
          { return SLASHEQ;
          }
        case 142: break;
        case 70: 
          { return CLASS;
          }
        case 143: break;
        case 65: 
          { return ENUM;
          }
        case 144: break;
        case 6: 
          { return DOT;
          }
        case 145: break;
        case 30: 
          { return MULTI_LINE_COMMENT_START;
          }
        case 146: break;
        case 92: 
          { return DEFAULT;
          }
        case 147: break;
        case 40: 
          { return DO;
          }
        case 148: break;
        case 42: 
          { return CARETEQ;
          }
        case 149: break;
        case 9: 
          { return SEMI;
          }
        case 150: break;
        case 68: 
          { return CHAR;
          }
        case 151: break;
        case 73: 
          { return FALSE;
          }
        case 152: break;
        case 13: 
          { return RBRACE;
          }
        case 153: break;
        case 80: 
          { return BAREQ;
          }
        case 154: break;
        case 55: 
          { return NEW;
          }
        case 155: break;
        case 21: 
          { return GT;
          }
        case 156: break;
        case 36: 
          { return CHARLITERAL;
          }
        case 157: break;
        case 88: 
          { return THROWS;
          }
        case 158: break;
        case 43: 
          { return AMPAMP;
          }
        case 159: break;
        case 23: 
          { return SUB;
          }
        case 160: break;
        case 32: 
          { return MULTI_LINE_COMMENT_END;
          }
        case 161: break;
        case 87: 
          { return HIDDEN;
          }
        case 162: break;
        case 35: 
          { return STRINGLITERAL;
          }
        case 163: break;
        case 51: 
          { return PERCENTEQ;
          }
        case 164: break;
        case 94: 
          { return CONTINUE;
          }
        case 165: break;
        case 60: 
          { return INT;
          }
        case 166: break;
        case 39: 
          { return OR;
          }
        case 167: break;
        case 66: 
          { return BYTE;
          }
        case 168: break;
        case 81: 
          { return FLOAT;
          }
        case 169: break;
        case 12: 
          { return LBRACE;
          }
        case 170: break;
        case 28: 
          { return TILDE;
          }
        case 171: break;
        case 57: 
          { return VAR;
          }
        case 172: break;
        case 95: 
          { return FUNCTION;
          }
        case 173: break;
        case 4: 
          { return SLASH;
          }
        case 174: break;
        case 75: 
          { return THROW;
          }
        case 175: break;
        case 64: 
          { return ELSE;
          }
        case 176: break;
        case 38: 
          { return IF;
          }
        case 177: break;
        case 5: 
          { return STAR;
          }
        case 178: break;
        case 96: 
          { return INSTANCEOF;
          }
        case 179: break;
        case 47: 
          { return SUBSUB;
          }
        case 180: break;
        case 29: 
          { return SINGLE_LINE_COMMENT;
          }
        case 181: break;
        case 90: 
          { return FINALLY;
          }
        case 182: break;
        case 2: 
          { return com.intellij.psi.TokenType.BAD_CHARACTER;
          }
        case 183: break;
        case 54: 
          { return FOR;
          }
        case 184: break;
        case 61: 
          { return CASE;
          }
        case 185: break;
        case 17: 
          { return RPAREN;
          }
        case 186: break;
        case 33: 
          { return STAREQ;
          }
        case 187: break;
        case 25: 
          { return BANG;
          }
        case 188: break;
        case 10: 
          { return QUES;
          }
        case 189: break;
        case 37: 
          { return AS;
          }
        case 190: break;
        case 78: 
          { return SHORT;
          }
        case 191: break;
        case 93: 
          { return BOOLEAN;
          }
        case 192: break;
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
