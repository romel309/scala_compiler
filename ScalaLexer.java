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
		VAL=8, INT=9, BOOLEAN=10, STRING=11, IF=12, ELSEIF=13, ELSE=14, WHILE=15, 
		FOR=16, DO=17, RETURN=18, LOGIC=19, NEGATIVE=20, ARRAY=21, ID=22, COMMENT=23, 
		OPERATORS=24, AND=25, OR=26, LESS=27, GREATER=28, EQUAL=29, NOTEQUAL=30, 
		ASSIGN=31, LEFTKEY=32, RIGHTKEY=33, LPARENTHESIS=34, RPARENTHESIS=35, 
		LCELL=36, RCELL=37, TWODOTS=38, SCOLON=39, DOUBLECOLONS=40, COMMA=41, 
		NEWLINE=42, WHITESPACE=43;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "STRINGSTRUCT", "STRINGCONTENT", "NUMBER", "OBJECT", "DEF", "VAR", 
			"VAL", "INT", "BOOLEAN", "STRING", "IF", "ELSEIF", "ELSE", "WHILE", "FOR", 
			"DO", "RETURN", "LOGIC", "NEGATIVE", "ARRAY", "ID", "COMMENT", "OPERATORS", 
			"AND", "OR", "LESS", "GREATER", "EQUAL", "NOTEQUAL", "ASSIGN", "LEFTKEY", 
			"RIGHTKEY", "LPARENTHESIS", "RPARENTHESIS", "LCELL", "RCELL", "TWODOTS", 
			"SCOLON", "DOUBLECOLONS", "COMMA", "NEWLINE", "WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'args'", null, null, null, "'object'", "'def'", "'var'", "'val'", 
			"'Int'", "'Boolean'", "'String'", "'if'", "'else if'", "'else'", "'while'", 
			"'for'", "'do'", "'return'", null, "'-'", "'Array[String]'", null, null, 
			null, null, null, null, null, null, null, null, "'{'", "'}'", "'('", 
			"')'", "'['", "']'", "':'", "';'", "'\"'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "STRINGSTRUCT", "STRINGCONTENT", "NUMBER", "OBJECT", "DEF", 
			"VAR", "VAL", "INT", "BOOLEAN", "STRING", "IF", "ELSEIF", "ELSE", "WHILE", 
			"FOR", "DO", "RETURN", "LOGIC", "NEGATIVE", "ARRAY", "ID", "COMMENT", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2-\u0139\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4g\n\4\7\4"+
		"i\n\4\f\4\16\4l\13\4\3\5\6\5o\n\5\r\5\16\5p\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\5\24\u00c6\n\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\7\27\u00da\n\27\f\27\16\27\u00dd"+
		"\13\27\3\30\3\30\3\30\3\30\7\30\u00e3\n\30\f\30\16\30\u00e6\13\30\3\30"+
		"\5\30\u00e9\n\30\3\30\5\30\u00ec\n\30\3\30\3\30\3\30\3\30\7\30\u00f2\n"+
		"\30\f\30\16\30\u00f5\13\30\3\30\3\30\5\30\u00f9\n\30\3\30\3\30\3\31\6"+
		"\31\u00fe\n\31\r\31\16\31\u00ff\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$"+
		"\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\5+\u0129\n+\3+\3+\6+\u012d"+
		"\n+\r+\16+\u012e\3+\3+\3,\6,\u0134\n,\r,\16,\u0135\3,\3,\3\u00f3\2-\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37="+
		" ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-\3\2\t\6\2\f\f\17\17$$^^\3\2\62;\5\2C\\a"+
		"ac|\6\2\62;C\\aac|\4\2\f\f\17\17\6\2\'\',-//\61\61\4\2\13\f\"\"\2\u0148"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\3Y\3\2\2\2\5^\3\2\2\2\7a\3\2\2\2\tn\3\2\2\2\13r\3"+
		"\2\2\2\ry\3\2\2\2\17}\3\2\2\2\21\u0081\3\2\2\2\23\u0085\3\2\2\2\25\u0089"+
		"\3\2\2\2\27\u0091\3\2\2\2\31\u0098\3\2\2\2\33\u009b\3\2\2\2\35\u00a3\3"+
		"\2\2\2\37\u00a8\3\2\2\2!\u00ae\3\2\2\2#\u00b2\3\2\2\2%\u00b5\3\2\2\2\'"+
		"\u00c5\3\2\2\2)\u00c7\3\2\2\2+\u00c9\3\2\2\2-\u00d7\3\2\2\2/\u00f8\3\2"+
		"\2\2\61\u00fd\3\2\2\2\63\u0101\3\2\2\2\65\u0104\3\2\2\2\67\u0107\3\2\2"+
		"\29\u0109\3\2\2\2;\u010b\3\2\2\2=\u010e\3\2\2\2?\u0111\3\2\2\2A\u0113"+
		"\3\2\2\2C\u0115\3\2\2\2E\u0117\3\2\2\2G\u0119\3\2\2\2I\u011b\3\2\2\2K"+
		"\u011d\3\2\2\2M\u011f\3\2\2\2O\u0121\3\2\2\2Q\u0123\3\2\2\2S\u0125\3\2"+
		"\2\2U\u012c\3\2\2\2W\u0133\3\2\2\2YZ\7c\2\2Z[\7t\2\2[\\\7i\2\2\\]\7u\2"+
		"\2]\4\3\2\2\2^_\5\7\4\2_`\5Q)\2`\6\3\2\2\2aj\5Q)\2bi\n\2\2\2cf\7^\2\2"+
		"dg\13\2\2\2eg\7\2\2\3fd\3\2\2\2fe\3\2\2\2gi\3\2\2\2hb\3\2\2\2hc\3\2\2"+
		"\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\b\3\2\2\2lj\3\2\2\2mo\t\3\2\2nm\3\2"+
		"\2\2op\3\2\2\2pn\3\2\2\2pq\3\2\2\2q\n\3\2\2\2rs\7q\2\2st\7d\2\2tu\7l\2"+
		"\2uv\7g\2\2vw\7e\2\2wx\7v\2\2x\f\3\2\2\2yz\7f\2\2z{\7g\2\2{|\7h\2\2|\16"+
		"\3\2\2\2}~\7x\2\2~\177\7c\2\2\177\u0080\7t\2\2\u0080\20\3\2\2\2\u0081"+
		"\u0082\7x\2\2\u0082\u0083\7c\2\2\u0083\u0084\7n\2\2\u0084\22\3\2\2\2\u0085"+
		"\u0086\7K\2\2\u0086\u0087\7p\2\2\u0087\u0088\7v\2\2\u0088\24\3\2\2\2\u0089"+
		"\u008a\7D\2\2\u008a\u008b\7q\2\2\u008b\u008c\7q\2\2\u008c\u008d\7n\2\2"+
		"\u008d\u008e\7g\2\2\u008e\u008f\7c\2\2\u008f\u0090\7p\2\2\u0090\26\3\2"+
		"\2\2\u0091\u0092\7U\2\2\u0092\u0093\7v\2\2\u0093\u0094\7t\2\2\u0094\u0095"+
		"\7k\2\2\u0095\u0096\7p\2\2\u0096\u0097\7i\2\2\u0097\30\3\2\2\2\u0098\u0099"+
		"\7k\2\2\u0099\u009a\7h\2\2\u009a\32\3\2\2\2\u009b\u009c\7g\2\2\u009c\u009d"+
		"\7n\2\2\u009d\u009e\7u\2\2\u009e\u009f\7g\2\2\u009f\u00a0\7\"\2\2\u00a0"+
		"\u00a1\7k\2\2\u00a1\u00a2\7h\2\2\u00a2\34\3\2\2\2\u00a3\u00a4\7g\2\2\u00a4"+
		"\u00a5\7n\2\2\u00a5\u00a6\7u\2\2\u00a6\u00a7\7g\2\2\u00a7\36\3\2\2\2\u00a8"+
		"\u00a9\7y\2\2\u00a9\u00aa\7j\2\2\u00aa\u00ab\7k\2\2\u00ab\u00ac\7n\2\2"+
		"\u00ac\u00ad\7g\2\2\u00ad \3\2\2\2\u00ae\u00af\7h\2\2\u00af\u00b0\7q\2"+
		"\2\u00b0\u00b1\7t\2\2\u00b1\"\3\2\2\2\u00b2\u00b3\7f\2\2\u00b3\u00b4\7"+
		"q\2\2\u00b4$\3\2\2\2\u00b5\u00b6\7t\2\2\u00b6\u00b7\7g\2\2\u00b7\u00b8"+
		"\7v\2\2\u00b8\u00b9\7w\2\2\u00b9\u00ba\7t\2\2\u00ba\u00bb\7p\2\2\u00bb"+
		"&\3\2\2\2\u00bc\u00bd\7v\2\2\u00bd\u00be\7t\2\2\u00be\u00bf\7w\2\2\u00bf"+
		"\u00c6\7g\2\2\u00c0\u00c1\7h\2\2\u00c1\u00c2\7c\2\2\u00c2\u00c3\7n\2\2"+
		"\u00c3\u00c4\7u\2\2\u00c4\u00c6\7g\2\2\u00c5\u00bc\3\2\2\2\u00c5\u00c0"+
		"\3\2\2\2\u00c6(\3\2\2\2\u00c7\u00c8\7/\2\2\u00c8*\3\2\2\2\u00c9\u00ca"+
		"\7C\2\2\u00ca\u00cb\7t\2\2\u00cb\u00cc\7t\2\2\u00cc\u00cd\7c\2\2\u00cd"+
		"\u00ce\7{\2\2\u00ce\u00cf\7]\2\2\u00cf\u00d0\7U\2\2\u00d0\u00d1\7v\2\2"+
		"\u00d1\u00d2\7t\2\2\u00d2\u00d3\7k\2\2\u00d3\u00d4\7p\2\2\u00d4\u00d5"+
		"\7i\2\2\u00d5\u00d6\7_\2\2\u00d6,\3\2\2\2\u00d7\u00db\t\4\2\2\u00d8\u00da"+
		"\t\5\2\2\u00d9\u00d8\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db"+
		"\u00dc\3\2\2\2\u00dc.\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00df\7\61\2\2"+
		"\u00df\u00e0\7\61\2\2\u00e0\u00e4\3\2\2\2\u00e1\u00e3\n\6\2\2\u00e2\u00e1"+
		"\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e9\7\17\2\2\u00e8\u00e7\3"+
		"\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00ec\7\f\2\2\u00eb"+
		"\u00ea\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00f9\3\2\2\2\u00ed\u00ee\7\61"+
		"\2\2\u00ee\u00ef\7,\2\2\u00ef\u00f3\3\2\2\2\u00f0\u00f2\13\2\2\2\u00f1"+
		"\u00f0\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f3\u00f1\3\2"+
		"\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7\7,\2\2\u00f7"+
		"\u00f9\7\61\2\2\u00f8\u00de\3\2\2\2\u00f8\u00ed\3\2\2\2\u00f9\u00fa\3"+
		"\2\2\2\u00fa\u00fb\b\30\2\2\u00fb\60\3\2\2\2\u00fc\u00fe\t\7\2\2\u00fd"+
		"\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2"+
		"\2\2\u0100\62\3\2\2\2\u0101\u0102\7(\2\2\u0102\u0103\7(\2\2\u0103\64\3"+
		"\2\2\2\u0104\u0105\7~\2\2\u0105\u0106\7~\2\2\u0106\66\3\2\2\2\u0107\u0108"+
		"\7>\2\2\u01088\3\2\2\2\u0109\u010a\7@\2\2\u010a:\3\2\2\2\u010b\u010c\7"+
		"?\2\2\u010c\u010d\7?\2\2\u010d<\3\2\2\2\u010e\u010f\7#\2\2\u010f\u0110"+
		"\7?\2\2\u0110>\3\2\2\2\u0111\u0112\7?\2\2\u0112@\3\2\2\2\u0113\u0114\7"+
		"}\2\2\u0114B\3\2\2\2\u0115\u0116\7\177\2\2\u0116D\3\2\2\2\u0117\u0118"+
		"\7*\2\2\u0118F\3\2\2\2\u0119\u011a\7+\2\2\u011aH\3\2\2\2\u011b\u011c\7"+
		"]\2\2\u011cJ\3\2\2\2\u011d\u011e\7_\2\2\u011eL\3\2\2\2\u011f\u0120\7<"+
		"\2\2\u0120N\3\2\2\2\u0121\u0122\7=\2\2\u0122P\3\2\2\2\u0123\u0124\7$\2"+
		"\2\u0124R\3\2\2\2\u0125\u0126\7.\2\2\u0126T\3\2\2\2\u0127\u0129\7\17\2"+
		"\2\u0128\u0127\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012d"+
		"\7\f\2\2\u012b\u012d\7\17\2\2\u012c\u0128\3\2\2\2\u012c\u012b\3\2\2\2"+
		"\u012d\u012e\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130"+
		"\3\2\2\2\u0130\u0131\b+\2\2\u0131V\3\2\2\2\u0132\u0134\t\b\2\2\u0133\u0132"+
		"\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		"\u0137\3\2\2\2\u0137\u0138\b,\2\2\u0138X\3\2\2\2\23\2fhjp\u00c5\u00db"+
		"\u00e4\u00e8\u00eb\u00f3\u00f8\u00ff\u0128\u012c\u012e\u0135\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}