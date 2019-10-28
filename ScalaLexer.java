// Generated from Scala.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ScalaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, STRINGSTRUCT=2, STRINGCONTENT=3, NUMBER=4, OBJECT=5, DEF=6, VAR=7, 
		VAL=8, INT=9, UNIT=10, BOOLEAN=11, STRING=12, IF=13, ELSEIF=14, ELSE=15, 
		WHILE=16, FOR=17, DO=18, RETURN=19, LOGIC=20, NEGATIVE=21, ARRAY=22, ID=23, 
		COMMENT=24, OPERATORS=25, AND=26, OR=27, LESS=28, GREATER=29, EQUAL=30, 
		NOTEQUAL=31, ASSIGN=32, LEFTKEY=33, RIGHTKEY=34, LPARENTHESIS=35, RPARENTHESIS=36, 
		LCELL=37, RCELL=38, TWODOTS=39, SCOLON=40, DOUBLECOLONS=41, COMMA=42, 
		NEWLINE=43, WHITESPACE=44;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "STRINGSTRUCT", "STRINGCONTENT", "NUMBER", "OBJECT", "DEF", "VAR", 
			"VAL", "INT", "UNIT", "BOOLEAN", "STRING", "IF", "ELSEIF", "ELSE", "WHILE", 
			"FOR", "DO", "RETURN", "LOGIC", "NEGATIVE", "ARRAY", "ID", "COMMENT", 
			"OPERATORS", "AND", "OR", "LESS", "GREATER", "EQUAL", "NOTEQUAL", "ASSIGN", 
			"LEFTKEY", "RIGHTKEY", "LPARENTHESIS", "RPARENTHESIS", "LCELL", "RCELL", 
			"TWODOTS", "SCOLON", "DOUBLECOLONS", "COMMA", "NEWLINE", "WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'args'", null, null, null, "'object'", "'def'", "'var'", "'val'", 
			"'Int'", "'Unit'", "'Boolean'", "'String'", "'if'", "'else if'", "'else'", 
			"'while'", "'for'", "'do'", "'return'", null, "'-'", "'Array[String]'", 
			null, null, null, null, null, null, null, null, null, null, "'{'", "'}'", 
			"'('", "')'", "'['", "']'", "':'", "';'", "'\"'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "STRINGSTRUCT", "STRINGCONTENT", "NUMBER", "OBJECT", "DEF", 
			"VAR", "VAL", "INT", "UNIT", "BOOLEAN", "STRING", "IF", "ELSEIF", "ELSE", 
			"WHILE", "FOR", "DO", "RETURN", "LOGIC", "NEGATIVE", "ARRAY", "ID", "COMMENT", 
			"OPERATORS", "AND", "OR", "LESS", "GREATER", "EQUAL", "NOTEQUAL", "ASSIGN", 
			"LEFTKEY", "RIGHTKEY", "LPARENTHESIS", "RPARENTHESIS", "LCELL", "RCELL", 
			"TWODOTS", "SCOLON", "DOUBLECOLONS", "COMMA", "NEWLINE", "WHITESPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public ScalaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Scala.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2.\u0140\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4i\n"+
		"\4\7\4k\n\4\f\4\16\4n\13\4\3\5\6\5q\n\5\r\5\16\5r\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00cd\n\25\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\7\30\u00e1\n\30\f\30\16\30\u00e4\13\30\3\31\3\31\3\31\3\31\7\31\u00ea"+
		"\n\31\f\31\16\31\u00ed\13\31\3\31\5\31\u00f0\n\31\3\31\5\31\u00f3\n\31"+
		"\3\31\3\31\3\31\3\31\7\31\u00f9\n\31\f\31\16\31\u00fc\13\31\3\31\3\31"+
		"\5\31\u0100\n\31\3\31\3\31\3\32\6\32\u0105\n\32\r\32\16\32\u0106\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3 "+
		"\3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3"+
		"+\3,\5,\u0130\n,\3,\3,\6,\u0134\n,\r,\16,\u0135\3,\3,\3-\6-\u013b\n-\r"+
		"-\16-\u013c\3-\3-\3\u00fa\2.\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.\3\2\t\6"+
		"\2\f\f\17\17$$^^\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\4\2\f\f\17\17\6\2\'"+
		"\',-//\61\61\4\2\13\f\"\"\2\u014f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\3[\3"+
		"\2\2\2\5`\3\2\2\2\7c\3\2\2\2\tp\3\2\2\2\13t\3\2\2\2\r{\3\2\2\2\17\177"+
		"\3\2\2\2\21\u0083\3\2\2\2\23\u0087\3\2\2\2\25\u008b\3\2\2\2\27\u0090\3"+
		"\2\2\2\31\u0098\3\2\2\2\33\u009f\3\2\2\2\35\u00a2\3\2\2\2\37\u00aa\3\2"+
		"\2\2!\u00af\3\2\2\2#\u00b5\3\2\2\2%\u00b9\3\2\2\2\'\u00bc\3\2\2\2)\u00cc"+
		"\3\2\2\2+\u00ce\3\2\2\2-\u00d0\3\2\2\2/\u00de\3\2\2\2\61\u00ff\3\2\2\2"+
		"\63\u0104\3\2\2\2\65\u0108\3\2\2\2\67\u010b\3\2\2\29\u010e\3\2\2\2;\u0110"+
		"\3\2\2\2=\u0112\3\2\2\2?\u0115\3\2\2\2A\u0118\3\2\2\2C\u011a\3\2\2\2E"+
		"\u011c\3\2\2\2G\u011e\3\2\2\2I\u0120\3\2\2\2K\u0122\3\2\2\2M\u0124\3\2"+
		"\2\2O\u0126\3\2\2\2Q\u0128\3\2\2\2S\u012a\3\2\2\2U\u012c\3\2\2\2W\u0133"+
		"\3\2\2\2Y\u013a\3\2\2\2[\\\7c\2\2\\]\7t\2\2]^\7i\2\2^_\7u\2\2_\4\3\2\2"+
		"\2`a\5\7\4\2ab\5S*\2b\6\3\2\2\2cl\5S*\2dk\n\2\2\2eh\7^\2\2fi\13\2\2\2"+
		"gi\7\2\2\3hf\3\2\2\2hg\3\2\2\2ik\3\2\2\2jd\3\2\2\2je\3\2\2\2kn\3\2\2\2"+
		"lj\3\2\2\2lm\3\2\2\2m\b\3\2\2\2nl\3\2\2\2oq\t\3\2\2po\3\2\2\2qr\3\2\2"+
		"\2rp\3\2\2\2rs\3\2\2\2s\n\3\2\2\2tu\7q\2\2uv\7d\2\2vw\7l\2\2wx\7g\2\2"+
		"xy\7e\2\2yz\7v\2\2z\f\3\2\2\2{|\7f\2\2|}\7g\2\2}~\7h\2\2~\16\3\2\2\2\177"+
		"\u0080\7x\2\2\u0080\u0081\7c\2\2\u0081\u0082\7t\2\2\u0082\20\3\2\2\2\u0083"+
		"\u0084\7x\2\2\u0084\u0085\7c\2\2\u0085\u0086\7n\2\2\u0086\22\3\2\2\2\u0087"+
		"\u0088\7K\2\2\u0088\u0089\7p\2\2\u0089\u008a\7v\2\2\u008a\24\3\2\2\2\u008b"+
		"\u008c\7W\2\2\u008c\u008d\7p\2\2\u008d\u008e\7k\2\2\u008e\u008f\7v\2\2"+
		"\u008f\26\3\2\2\2\u0090\u0091\7D\2\2\u0091\u0092\7q\2\2\u0092\u0093\7"+
		"q\2\2\u0093\u0094\7n\2\2\u0094\u0095\7g\2\2\u0095\u0096\7c\2\2\u0096\u0097"+
		"\7p\2\2\u0097\30\3\2\2\2\u0098\u0099\7U\2\2\u0099\u009a\7v\2\2\u009a\u009b"+
		"\7t\2\2\u009b\u009c\7k\2\2\u009c\u009d\7p\2\2\u009d\u009e\7i\2\2\u009e"+
		"\32\3\2\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7h\2\2\u00a1\34\3\2\2\2\u00a2"+
		"\u00a3\7g\2\2\u00a3\u00a4\7n\2\2\u00a4\u00a5\7u\2\2\u00a5\u00a6\7g\2\2"+
		"\u00a6\u00a7\7\"\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9\7h\2\2\u00a9\36\3"+
		"\2\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7n\2\2\u00ac\u00ad\7u\2\2\u00ad"+
		"\u00ae\7g\2\2\u00ae \3\2\2\2\u00af\u00b0\7y\2\2\u00b0\u00b1\7j\2\2\u00b1"+
		"\u00b2\7k\2\2\u00b2\u00b3\7n\2\2\u00b3\u00b4\7g\2\2\u00b4\"\3\2\2\2\u00b5"+
		"\u00b6\7h\2\2\u00b6\u00b7\7q\2\2\u00b7\u00b8\7t\2\2\u00b8$\3\2\2\2\u00b9"+
		"\u00ba\7f\2\2\u00ba\u00bb\7q\2\2\u00bb&\3\2\2\2\u00bc\u00bd\7t\2\2\u00bd"+
		"\u00be\7g\2\2\u00be\u00bf\7v\2\2\u00bf\u00c0\7w\2\2\u00c0\u00c1\7t\2\2"+
		"\u00c1\u00c2\7p\2\2\u00c2(\3\2\2\2\u00c3\u00c4\7v\2\2\u00c4\u00c5\7t\2"+
		"\2\u00c5\u00c6\7w\2\2\u00c6\u00cd\7g\2\2\u00c7\u00c8\7h\2\2\u00c8\u00c9"+
		"\7c\2\2\u00c9\u00ca\7n\2\2\u00ca\u00cb\7u\2\2\u00cb\u00cd\7g\2\2\u00cc"+
		"\u00c3\3\2\2\2\u00cc\u00c7\3\2\2\2\u00cd*\3\2\2\2\u00ce\u00cf\7/\2\2\u00cf"+
		",\3\2\2\2\u00d0\u00d1\7C\2\2\u00d1\u00d2\7t\2\2\u00d2\u00d3\7t\2\2\u00d3"+
		"\u00d4\7c\2\2\u00d4\u00d5\7{\2\2\u00d5\u00d6\7]\2\2\u00d6\u00d7\7U\2\2"+
		"\u00d7\u00d8\7v\2\2\u00d8\u00d9\7t\2\2\u00d9\u00da\7k\2\2\u00da\u00db"+
		"\7p\2\2\u00db\u00dc\7i\2\2\u00dc\u00dd\7_\2\2\u00dd.\3\2\2\2\u00de\u00e2"+
		"\t\4\2\2\u00df\u00e1\t\5\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2"+
		"\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\60\3\2\2\2\u00e4\u00e2\3\2\2"+
		"\2\u00e5\u00e6\7\61\2\2\u00e6\u00e7\7\61\2\2\u00e7\u00eb\3\2\2\2\u00e8"+
		"\u00ea\n\6\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2"+
		"\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee"+
		"\u00f0\7\17\2\2\u00ef\u00ee\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2\3"+
		"\2\2\2\u00f1\u00f3\7\f\2\2\u00f2\u00f1\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3"+
		"\u0100\3\2\2\2\u00f4\u00f5\7\61\2\2\u00f5\u00f6\7,\2\2\u00f6\u00fa\3\2"+
		"\2\2\u00f7\u00f9\13\2\2\2\u00f8\u00f7\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa"+
		"\u00fb\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00fa\3\2"+
		"\2\2\u00fd\u00fe\7,\2\2\u00fe\u0100\7\61\2\2\u00ff\u00e5\3\2\2\2\u00ff"+
		"\u00f4\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\b\31\2\2\u0102\62\3\2\2"+
		"\2\u0103\u0105\t\7\2\2\u0104\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0104"+
		"\3\2\2\2\u0106\u0107\3\2\2\2\u0107\64\3\2\2\2\u0108\u0109\7(\2\2\u0109"+
		"\u010a\7(\2\2\u010a\66\3\2\2\2\u010b\u010c\7~\2\2\u010c\u010d\7~\2\2\u010d"+
		"8\3\2\2\2\u010e\u010f\7>\2\2\u010f:\3\2\2\2\u0110\u0111\7@\2\2\u0111<"+
		"\3\2\2\2\u0112\u0113\7?\2\2\u0113\u0114\7?\2\2\u0114>\3\2\2\2\u0115\u0116"+
		"\7#\2\2\u0116\u0117\7?\2\2\u0117@\3\2\2\2\u0118\u0119\7?\2\2\u0119B\3"+
		"\2\2\2\u011a\u011b\7}\2\2\u011bD\3\2\2\2\u011c\u011d\7\177\2\2\u011dF"+
		"\3\2\2\2\u011e\u011f\7*\2\2\u011fH\3\2\2\2\u0120\u0121\7+\2\2\u0121J\3"+
		"\2\2\2\u0122\u0123\7]\2\2\u0123L\3\2\2\2\u0124\u0125\7_\2\2\u0125N\3\2"+
		"\2\2\u0126\u0127\7<\2\2\u0127P\3\2\2\2\u0128\u0129\7=\2\2\u0129R\3\2\2"+
		"\2\u012a\u012b\7$\2\2\u012bT\3\2\2\2\u012c\u012d\7.\2\2\u012dV\3\2\2\2"+
		"\u012e\u0130\7\17\2\2\u012f\u012e\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0131"+
		"\3\2\2\2\u0131\u0134\7\f\2\2\u0132\u0134\7\17\2\2\u0133\u012f\3\2\2\2"+
		"\u0133\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136"+
		"\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138\b,\2\2\u0138X\3\2\2\2\u0139\u013b"+
		"\t\b\2\2\u013a\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013a\3\2\2\2\u013c"+
		"\u013d\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f\b-\2\2\u013fZ\3\2\2\2\23"+
		"\2hjlr\u00cc\u00e2\u00eb\u00ef\u00f2\u00fa\u00ff\u0106\u012f\u0133\u0135"+
		"\u013c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}