// Generated from Scala.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ScalaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, STRINGSTRUCT=2, STRINGCONTENT=3, NUMBER=4, OBJECT=5, DEF=6, VAR=7, 
		VAL=8, INT=9, BOOLEAN=10, STRING=11, IF=12, ELSE=13, WHILE=14, FOR=15, 
		DO=16, RETURN=17, LOGIC=18, NEGATIVE=19, ARRAY=20, ID=21, COMMENT=22, 
		OPERATORS=23, AND=24, OR=25, LESS=26, GREATER=27, EQUAL=28, NOTEQUAL=29, 
		ASSIGN=30, LEFTKEY=31, RIGHTKEY=32, LPARENTHESIS=33, RPARENTHESIS=34, 
		LCELL=35, RCELL=36, TWODOTS=37, SCOLON=38, DOUBLECOLONS=39, COMMA=40, 
		NEWLINE=41, WHITESPACE=42;
	public static final int
		RULE_prog = 0, RULE_obj = 1, RULE_body = 2, RULE_def = 3, RULE_cnt = 4, 
		RULE_expr = 5, RULE_condition = 6, RULE_keyblock = 7, RULE_tm = 8, RULE_variables = 9, 
		RULE_val = 10, RULE_var = 11, RULE_comparison = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "obj", "body", "def", "cnt", "expr", "condition", "keyblock", 
			"tm", "variables", "val", "var", "comparison"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'args'", null, null, null, "'object'", "'def'", "'var'", "'val'", 
			"'Int'", "'Boolean'", "'String'", "'if'", "'else'", "'while'", "'for'", 
			"'do'", "'return'", null, "'-'", "'Array[String]'", null, null, null, 
			null, null, null, null, null, null, null, "'{'", "'}'", "'('", "')'", 
			"'['", "']'", "':'", "';'", "'\"'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "STRINGSTRUCT", "STRINGCONTENT", "NUMBER", "OBJECT", "DEF", 
			"VAR", "VAL", "INT", "BOOLEAN", "STRING", "IF", "ELSE", "WHILE", "FOR", 
			"DO", "RETURN", "LOGIC", "NEGATIVE", "ARRAY", "ID", "COMMENT", "OPERATORS", 
			"AND", "OR", "LESS", "GREATER", "EQUAL", "NOTEQUAL", "ASSIGN", "LEFTKEY", 
			"RIGHTKEY", "LPARENTHESIS", "RPARENTHESIS", "LCELL", "RCELL", "TWODOTS", 
			"SCOLON", "DOUBLECOLONS", "COMMA", "NEWLINE", "WHITESPACE"
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

	@Override
	public String getGrammarFileName() { return "Scala.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ScalaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public ObjContext obj() {
			return getRuleContext(ObjContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ScalaParser.EOF, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			obj();
			setState(27);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjContext extends ParserRuleContext {
		public TerminalNode OBJECT() { return getToken(ScalaParser.OBJECT, 0); }
		public TerminalNode ID() { return getToken(ScalaParser.ID, 0); }
		public TerminalNode LEFTKEY() { return getToken(ScalaParser.LEFTKEY, 0); }
		public TerminalNode RIGHTKEY() { return getToken(ScalaParser.RIGHTKEY, 0); }
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public ObjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obj; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitObj(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjContext obj() throws RecognitionException {
		ObjContext _localctx = new ObjContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_obj);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(OBJECT);
			setState(30);
			match(ID);
			setState(31);
			match(LEFTKEY);
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OBJECT || _la==DEF) {
				{
				{
				setState(32);
				body();
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(38);
			match(RIGHTKEY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BodyContext extends ParserRuleContext {
		public DefContext def() {
			return getRuleContext(DefContext.class,0);
		}
		public ObjContext obj() {
			return getRuleContext(ObjContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_body);
		try {
			setState(42);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEF:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				def();
				}
				break;
			case OBJECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				obj();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(ScalaParser.DEF, 0); }
		public TerminalNode ID() { return getToken(ScalaParser.ID, 0); }
		public TerminalNode LPARENTHESIS() { return getToken(ScalaParser.LPARENTHESIS, 0); }
		public TerminalNode TWODOTS() { return getToken(ScalaParser.TWODOTS, 0); }
		public TerminalNode ARRAY() { return getToken(ScalaParser.ARRAY, 0); }
		public TerminalNode RPARENTHESIS() { return getToken(ScalaParser.RPARENTHESIS, 0); }
		public KeyblockContext keyblock() {
			return getRuleContext(KeyblockContext.class,0);
		}
		public DefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefContext def() throws RecognitionException {
		DefContext _localctx = new DefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(DEF);
			setState(45);
			match(ID);
			setState(46);
			match(LPARENTHESIS);
			setState(47);
			match(T__0);
			setState(48);
			match(TWODOTS);
			setState(49);
			match(ARRAY);
			setState(50);
			match(RPARENTHESIS);
			setState(51);
			keyblock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CntContext extends ParserRuleContext {
		public TerminalNode SCOLON() { return getToken(ScalaParser.SCOLON, 0); }
		public List<VariablesContext> variables() {
			return getRuleContexts(VariablesContext.class);
		}
		public VariablesContext variables(int i) {
			return getRuleContext(VariablesContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cnt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitCnt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CntContext cnt() throws RecognitionException {
		CntContext _localctx = new CntContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cnt);
		int _la;
		try {
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
			case VAL:
			case ID:
			case SCOLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << VAL) | (1L << ID))) != 0)) {
					{
					{
					setState(53);
					variables();
					}
					}
					setState(58);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(59);
				match(SCOLON);
				}
				break;
			case IF:
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(ScalaParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(ScalaParser.IF, i);
		}
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<KeyblockContext> keyblock() {
			return getRuleContexts(KeyblockContext.class);
		}
		public KeyblockContext keyblock(int i) {
			return getRuleContext(KeyblockContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(ScalaParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(ScalaParser.ELSE, i);
		}
		public TerminalNode WHILE() { return getToken(ScalaParser.WHILE, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expr);
		int _la;
		try {
			int _alt;
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				match(IF);
				setState(64);
				condition();
				setState(65);
				keyblock();
				setState(73);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(66);
						match(ELSE);
						setState(67);
						match(IF);
						setState(68);
						condition();
						setState(69);
						keyblock();
						}
						} 
					}
					setState(75);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(76);
					match(ELSE);
					setState(77);
					keyblock();
					}
				}

				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				match(WHILE);
				setState(81);
				condition();
				setState(82);
				keyblock();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode LPARENTHESIS() { return getToken(ScalaParser.LPARENTHESIS, 0); }
		public TerminalNode RPARENTHESIS() { return getToken(ScalaParser.RPARENTHESIS, 0); }
		public List<TmContext> tm() {
			return getRuleContexts(TmContext.class);
		}
		public TmContext tm(int i) {
			return getRuleContext(TmContext.class,i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(LPARENTHESIS);
			setState(88); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(87);
				tm();
				}
				}
				setState(90); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER || _la==ID );
			setState(92);
			match(RPARENTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeyblockContext extends ParserRuleContext {
		public TerminalNode LEFTKEY() { return getToken(ScalaParser.LEFTKEY, 0); }
		public TerminalNode RIGHTKEY() { return getToken(ScalaParser.RIGHTKEY, 0); }
		public List<CntContext> cnt() {
			return getRuleContexts(CntContext.class);
		}
		public CntContext cnt(int i) {
			return getRuleContext(CntContext.class,i);
		}
		public KeyblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyblock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitKeyblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyblockContext keyblock() throws RecognitionException {
		KeyblockContext _localctx = new KeyblockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_keyblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(LEFTKEY);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << VAL) | (1L << IF) | (1L << WHILE) | (1L << ID) | (1L << SCOLON))) != 0)) {
				{
				{
				setState(95);
				cnt();
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101);
			match(RIGHTKEY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TmContext extends ParserRuleContext {
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(ScalaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ScalaParser.ID, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(ScalaParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ScalaParser.NUMBER, i);
		}
		public TmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tm; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitTm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TmContext tm() throws RecognitionException {
		TmContext _localctx = new TmContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(104);
			comparison();
			setState(105);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariablesContext extends ParserRuleContext {
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitVariables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variables);
		try {
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				val();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				var();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ScalaParser.ID, 0); }
		public TerminalNode VAL() { return getToken(ScalaParser.VAL, 0); }
		public TerminalNode TWODOTS() { return getToken(ScalaParser.TWODOTS, 0); }
		public TerminalNode INT() { return getToken(ScalaParser.INT, 0); }
		public TerminalNode ASSIGN() { return getToken(ScalaParser.ASSIGN, 0); }
		public TerminalNode NUMBER() { return getToken(ScalaParser.NUMBER, 0); }
		public TerminalNode NEGATIVE() { return getToken(ScalaParser.NEGATIVE, 0); }
		public TerminalNode STRING() { return getToken(ScalaParser.STRING, 0); }
		public TerminalNode STRINGSTRUCT() { return getToken(ScalaParser.STRINGSTRUCT, 0); }
		public TerminalNode BOOLEAN() { return getToken(ScalaParser.BOOLEAN, 0); }
		public TerminalNode LOGIC() { return getToken(ScalaParser.LOGIC, 0); }
		public ValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValContext val() throws RecognitionException {
		ValContext _localctx = new ValContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_val);
		int _la;
		try {
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAL) {
					{
					setState(111);
					match(VAL);
					}
				}

				setState(114);
				match(ID);
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TWODOTS) {
					{
					setState(115);
					match(TWODOTS);
					setState(116);
					match(INT);
					}
				}

				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(119);
					match(ASSIGN);
					setState(121);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NEGATIVE) {
						{
						setState(120);
						match(NEGATIVE);
						}
					}

					setState(123);
					match(NUMBER);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAL) {
					{
					setState(126);
					match(VAL);
					}
				}

				setState(129);
				match(ID);
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TWODOTS) {
					{
					setState(130);
					match(TWODOTS);
					setState(131);
					match(STRING);
					}
				}

				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(134);
					match(ASSIGN);
					setState(135);
					match(STRINGSTRUCT);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAL) {
					{
					setState(138);
					match(VAL);
					}
				}

				setState(141);
				match(ID);
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TWODOTS) {
					{
					setState(142);
					match(TWODOTS);
					setState(143);
					match(BOOLEAN);
					}
				}

				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(146);
					match(ASSIGN);
					setState(147);
					match(LOGIC);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ScalaParser.ID, 0); }
		public TerminalNode VAR() { return getToken(ScalaParser.VAR, 0); }
		public TerminalNode TWODOTS() { return getToken(ScalaParser.TWODOTS, 0); }
		public TerminalNode INT() { return getToken(ScalaParser.INT, 0); }
		public TerminalNode ASSIGN() { return getToken(ScalaParser.ASSIGN, 0); }
		public TerminalNode NUMBER() { return getToken(ScalaParser.NUMBER, 0); }
		public TerminalNode NEGATIVE() { return getToken(ScalaParser.NEGATIVE, 0); }
		public TerminalNode STRING() { return getToken(ScalaParser.STRING, 0); }
		public TerminalNode STRINGSTRUCT() { return getToken(ScalaParser.STRINGSTRUCT, 0); }
		public TerminalNode BOOLEAN() { return getToken(ScalaParser.BOOLEAN, 0); }
		public TerminalNode LOGIC() { return getToken(ScalaParser.LOGIC, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_var);
		int _la;
		try {
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(152);
					match(VAR);
					}
				}

				setState(155);
				match(ID);
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TWODOTS) {
					{
					setState(156);
					match(TWODOTS);
					setState(157);
					match(INT);
					}
				}

				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(160);
					match(ASSIGN);
					setState(162);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NEGATIVE) {
						{
						setState(161);
						match(NEGATIVE);
						}
					}

					setState(164);
					match(NUMBER);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(167);
					match(VAR);
					}
				}

				setState(170);
				match(ID);
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TWODOTS) {
					{
					setState(171);
					match(TWODOTS);
					setState(172);
					match(STRING);
					}
				}

				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(175);
					match(ASSIGN);
					setState(176);
					match(STRINGSTRUCT);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(179);
					match(VAR);
					}
				}

				setState(182);
				match(ID);
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TWODOTS) {
					{
					setState(183);
					match(TWODOTS);
					setState(184);
					match(BOOLEAN);
					}
				}

				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(187);
					match(ASSIGN);
					setState(188);
					match(LOGIC);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(ScalaParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(ScalaParser.NOTEQUAL, 0); }
		public TerminalNode GREATER() { return getToken(ScalaParser.GREATER, 0); }
		public TerminalNode LESS() { return getToken(ScalaParser.LESS, 0); }
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS) | (1L << GREATER) | (1L << EQUAL) | (1L << NOTEQUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u00c6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3$\n\3\f\3"+
		"\16\3\'\13\3\3\3\3\3\3\4\3\4\5\4-\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\6\7\69\n\6\f\6\16\6<\13\6\3\6\3\6\5\6@\n\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\7\7J\n\7\f\7\16\7M\13\7\3\7\3\7\5\7Q\n\7\3\7\3\7\3\7\3\7"+
		"\5\7W\n\7\3\b\3\b\6\b[\n\b\r\b\16\b\\\3\b\3\b\3\t\3\t\7\tc\n\t\f\t\16"+
		"\tf\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\5\13p\n\13\3\f\5\fs\n\f\3\f"+
		"\3\f\3\f\5\fx\n\f\3\f\3\f\5\f|\n\f\3\f\5\f\177\n\f\3\f\5\f\u0082\n\f\3"+
		"\f\3\f\3\f\5\f\u0087\n\f\3\f\3\f\5\f\u008b\n\f\3\f\5\f\u008e\n\f\3\f\3"+
		"\f\3\f\5\f\u0093\n\f\3\f\3\f\5\f\u0097\n\f\5\f\u0099\n\f\3\r\5\r\u009c"+
		"\n\r\3\r\3\r\3\r\5\r\u00a1\n\r\3\r\3\r\5\r\u00a5\n\r\3\r\5\r\u00a8\n\r"+
		"\3\r\5\r\u00ab\n\r\3\r\3\r\3\r\5\r\u00b0\n\r\3\r\3\r\5\r\u00b4\n\r\3\r"+
		"\5\r\u00b7\n\r\3\r\3\r\3\r\5\r\u00bc\n\r\3\r\3\r\5\r\u00c0\n\r\5\r\u00c2"+
		"\n\r\3\16\3\16\3\16\2\2\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\4\4\2\6"+
		"\6\27\27\3\2\34\37\2\u00da\2\34\3\2\2\2\4\37\3\2\2\2\6,\3\2\2\2\b.\3\2"+
		"\2\2\n?\3\2\2\2\fV\3\2\2\2\16X\3\2\2\2\20`\3\2\2\2\22i\3\2\2\2\24o\3\2"+
		"\2\2\26\u0098\3\2\2\2\30\u00c1\3\2\2\2\32\u00c3\3\2\2\2\34\35\5\4\3\2"+
		"\35\36\7\2\2\3\36\3\3\2\2\2\37 \7\7\2\2 !\7\27\2\2!%\7!\2\2\"$\5\6\4\2"+
		"#\"\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&(\3\2\2\2\'%\3\2\2\2()\7\""+
		"\2\2)\5\3\2\2\2*-\5\b\5\2+-\5\4\3\2,*\3\2\2\2,+\3\2\2\2-\7\3\2\2\2./\7"+
		"\b\2\2/\60\7\27\2\2\60\61\7#\2\2\61\62\7\3\2\2\62\63\7\'\2\2\63\64\7\26"+
		"\2\2\64\65\7$\2\2\65\66\5\20\t\2\66\t\3\2\2\2\679\5\24\13\28\67\3\2\2"+
		"\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;=\3\2\2\2<:\3\2\2\2=@\7(\2\2>@\5\f\7"+
		"\2?:\3\2\2\2?>\3\2\2\2@\13\3\2\2\2AB\7\16\2\2BC\5\16\b\2CK\5\20\t\2DE"+
		"\7\17\2\2EF\7\16\2\2FG\5\16\b\2GH\5\20\t\2HJ\3\2\2\2ID\3\2\2\2JM\3\2\2"+
		"\2KI\3\2\2\2KL\3\2\2\2LP\3\2\2\2MK\3\2\2\2NO\7\17\2\2OQ\5\20\t\2PN\3\2"+
		"\2\2PQ\3\2\2\2QW\3\2\2\2RS\7\20\2\2ST\5\16\b\2TU\5\20\t\2UW\3\2\2\2VA"+
		"\3\2\2\2VR\3\2\2\2W\r\3\2\2\2XZ\7#\2\2Y[\5\22\n\2ZY\3\2\2\2[\\\3\2\2\2"+
		"\\Z\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^_\7$\2\2_\17\3\2\2\2`d\7!\2\2ac\5\n\6"+
		"\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2eg\3\2\2\2fd\3\2\2\2gh\7\"\2"+
		"\2h\21\3\2\2\2ij\t\2\2\2jk\5\32\16\2kl\t\2\2\2l\23\3\2\2\2mp\5\26\f\2"+
		"np\5\30\r\2om\3\2\2\2on\3\2\2\2p\25\3\2\2\2qs\7\n\2\2rq\3\2\2\2rs\3\2"+
		"\2\2st\3\2\2\2tw\7\27\2\2uv\7\'\2\2vx\7\13\2\2wu\3\2\2\2wx\3\2\2\2x~\3"+
		"\2\2\2y{\7 \2\2z|\7\25\2\2{z\3\2\2\2{|\3\2\2\2|}\3\2\2\2}\177\7\6\2\2"+
		"~y\3\2\2\2~\177\3\2\2\2\177\u0099\3\2\2\2\u0080\u0082\7\n\2\2\u0081\u0080"+
		"\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0086\7\27\2\2"+
		"\u0084\u0085\7\'\2\2\u0085\u0087\7\r\2\2\u0086\u0084\3\2\2\2\u0086\u0087"+
		"\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0089\7 \2\2\u0089\u008b\7\4\2\2\u008a"+
		"\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0099\3\2\2\2\u008c\u008e\7\n"+
		"\2\2\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u0092\7\27\2\2\u0090\u0091\7\'\2\2\u0091\u0093\7\f\2\2\u0092\u0090\3"+
		"\2\2\2\u0092\u0093\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0095\7 \2\2\u0095"+
		"\u0097\7\24\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\3"+
		"\2\2\2\u0098r\3\2\2\2\u0098\u0081\3\2\2\2\u0098\u008d\3\2\2\2\u0099\27"+
		"\3\2\2\2\u009a\u009c\7\t\2\2\u009b\u009a\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\u00a0\7\27\2\2\u009e\u009f\7\'\2\2\u009f\u00a1\7"+
		"\13\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a7\3\2\2\2\u00a2"+
		"\u00a4\7 \2\2\u00a3\u00a5\7\25\2\2\u00a4\u00a3\3\2\2\2\u00a4\u00a5\3\2"+
		"\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8\7\6\2\2\u00a7\u00a2\3\2\2\2\u00a7"+
		"\u00a8\3\2\2\2\u00a8\u00c2\3\2\2\2\u00a9\u00ab\7\t\2\2\u00aa\u00a9\3\2"+
		"\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00af\7\27\2\2\u00ad"+
		"\u00ae\7\'\2\2\u00ae\u00b0\7\r\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2"+
		"\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00b2\7 \2\2\u00b2\u00b4\7\4\2\2\u00b3"+
		"\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00c2\3\2\2\2\u00b5\u00b7\7\t"+
		"\2\2\u00b6\u00b5\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8"+
		"\u00bb\7\27\2\2\u00b9\u00ba\7\'\2\2\u00ba\u00bc\7\f\2\2\u00bb\u00b9\3"+
		"\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00be\7 \2\2\u00be"+
		"\u00c0\7\24\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2\3"+
		"\2\2\2\u00c1\u009b\3\2\2\2\u00c1\u00aa\3\2\2\2\u00c1\u00b6\3\2\2\2\u00c2"+
		"\31\3\2\2\2\u00c3\u00c4\t\3\2\2\u00c4\33\3\2\2\2\"%,:?KPV\\dorw{~\u0081"+
		"\u0086\u008a\u008d\u0092\u0096\u0098\u009b\u00a0\u00a4\u00a7\u00aa\u00af"+
		"\u00b3\u00b6\u00bb\u00bf\u00c1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}