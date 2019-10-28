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
		VAL=8, INT=9, UNIT=10, BOOLEAN=11, STRING=12, IF=13, ELSEIF=14, ELSE=15, 
		WHILE=16, FOR=17, DO=18, RETURN=19, LOGIC=20, NEGATIVE=21, ARRAY=22, ID=23, 
		COMMENT=24, OPERATORS=25, AND=26, OR=27, LESS=28, GREATER=29, EQUAL=30, 
		NOTEQUAL=31, ASSIGN=32, LEFTKEY=33, RIGHTKEY=34, LPARENTHESIS=35, RPARENTHESIS=36, 
		LCELL=37, RCELL=38, TWODOTS=39, SCOLON=40, DOUBLECOLONS=41, COMMA=42, 
		NEWLINE=43, WHITESPACE=44;
	public static final int
		RULE_prog = 0, RULE_obj = 1, RULE_body = 2, RULE_def = 3, RULE_cnt = 4, 
		RULE_definition = 5, RULE_expr = 6, RULE_condition = 7, RULE_keyblock = 8, 
		RULE_tm = 9, RULE_variables = 10, RULE_val = 11, RULE_var = 12, RULE_comparison = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "obj", "body", "def", "cnt", "definition", "expr", "condition", 
			"keyblock", "tm", "variables", "val", "var", "comparison"
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
			setState(28);
			obj();
			setState(29);
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
			setState(31);
			match(OBJECT);
			setState(32);
			match(ID);
			setState(33);
			match(LEFTKEY);
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OBJECT || _la==DEF) {
				{
				{
				setState(34);
				body();
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40);
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
			setState(44);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEF:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				def();
				}
				break;
			case OBJECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
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
		public TerminalNode RPARENTHESIS() { return getToken(ScalaParser.RPARENTHESIS, 0); }
		public TerminalNode TWODOTS() { return getToken(ScalaParser.TWODOTS, 0); }
		public TerminalNode UNIT() { return getToken(ScalaParser.UNIT, 0); }
		public TerminalNode ASSIGN() { return getToken(ScalaParser.ASSIGN, 0); }
		public KeyblockContext keyblock() {
			return getRuleContext(KeyblockContext.class,0);
		}
		public TerminalNode ARRAY() { return getToken(ScalaParser.ARRAY, 0); }
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
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				match(DEF);
				setState(47);
				match(ID);
				setState(48);
				match(LPARENTHESIS);
				setState(49);
				match(RPARENTHESIS);
				setState(50);
				match(TWODOTS);
				setState(51);
				match(UNIT);
				setState(52);
				match(ASSIGN);
				setState(53);
				keyblock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				match(DEF);
				setState(55);
				match(ID);
				setState(56);
				match(LPARENTHESIS);
				setState(57);
				match(T__0);
				setState(58);
				match(TWODOTS);
				setState(59);
				match(ARRAY);
				setState(60);
				match(RPARENTHESIS);
				setState(61);
				keyblock();
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
		public DefinitionContext definition() {
			return getRuleContext(DefinitionContext.class,0);
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
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << VAL) | (1L << ID))) != 0)) {
					{
					{
					setState(64);
					variables();
					}
					}
					setState(69);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(70);
				match(SCOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				definition();
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

	public static class DefinitionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ScalaParser.ID, 0); }
		public TerminalNode LPARENTHESIS() { return getToken(ScalaParser.LPARENTHESIS, 0); }
		public TerminalNode RPARENTHESIS() { return getToken(ScalaParser.RPARENTHESIS, 0); }
		public TerminalNode SCOLON() { return getToken(ScalaParser.SCOLON, 0); }
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScalaVisitor ) return ((ScalaVisitor<? extends T>)visitor).visitDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(ID);
			setState(76);
			match(LPARENTHESIS);
			setState(77);
			match(RPARENTHESIS);
			setState(78);
			match(SCOLON);
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
		public TerminalNode IF() { return getToken(ScalaParser.IF, 0); }
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
		public List<TerminalNode> ELSEIF() { return getTokens(ScalaParser.ELSEIF); }
		public TerminalNode ELSEIF(int i) {
			return getToken(ScalaParser.ELSEIF, i);
		}
		public TerminalNode ELSE() { return getToken(ScalaParser.ELSE, 0); }
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
		enterRule(_localctx, 12, RULE_expr);
		int _la;
		try {
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				match(IF);
				setState(81);
				condition();
				setState(82);
				keyblock();
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ELSEIF) {
					{
					{
					setState(83);
					match(ELSEIF);
					setState(84);
					condition();
					setState(85);
					keyblock();
					}
					}
					setState(91);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(92);
					match(ELSE);
					setState(93);
					keyblock();
					}
				}

				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				match(WHILE);
				setState(97);
				condition();
				setState(98);
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
		enterRule(_localctx, 14, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(LPARENTHESIS);
			setState(104); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(103);
				tm();
				}
				}
				setState(106); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER || _la==ID );
			setState(108);
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
		enterRule(_localctx, 16, RULE_keyblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(LEFTKEY);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << VAL) | (1L << IF) | (1L << WHILE) | (1L << ID) | (1L << SCOLON))) != 0)) {
				{
				{
				setState(111);
				cnt();
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117);
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
		enterRule(_localctx, 18, RULE_tm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(120);
			comparison();
			setState(121);
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
		enterRule(_localctx, 20, RULE_variables);
		try {
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				val();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
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
		enterRule(_localctx, 22, RULE_val);
		int _la;
		try {
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAL) {
					{
					setState(127);
					match(VAL);
					}
				}

				setState(130);
				match(ID);
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TWODOTS) {
					{
					setState(131);
					match(TWODOTS);
					setState(132);
					match(INT);
					}
				}

				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(135);
					match(ASSIGN);
					setState(137);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NEGATIVE) {
						{
						setState(136);
						match(NEGATIVE);
						}
					}

					setState(139);
					match(NUMBER);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAL) {
					{
					setState(142);
					match(VAL);
					}
				}

				setState(145);
				match(ID);
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TWODOTS) {
					{
					setState(146);
					match(TWODOTS);
					setState(147);
					match(STRING);
					}
				}

				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(150);
					match(ASSIGN);
					setState(151);
					match(STRINGSTRUCT);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAL) {
					{
					setState(154);
					match(VAL);
					}
				}

				setState(157);
				match(ID);
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TWODOTS) {
					{
					setState(158);
					match(TWODOTS);
					setState(159);
					match(BOOLEAN);
					}
				}

				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(162);
					match(ASSIGN);
					setState(163);
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
		enterRule(_localctx, 24, RULE_var);
		int _la;
		try {
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(168);
					match(VAR);
					}
				}

				setState(171);
				match(ID);
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TWODOTS) {
					{
					setState(172);
					match(TWODOTS);
					setState(173);
					match(INT);
					}
				}

				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(176);
					match(ASSIGN);
					setState(178);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NEGATIVE) {
						{
						setState(177);
						match(NEGATIVE);
						}
					}

					setState(180);
					match(NUMBER);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(183);
					match(VAR);
					}
				}

				setState(186);
				match(ID);
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TWODOTS) {
					{
					setState(187);
					match(TWODOTS);
					setState(188);
					match(STRING);
					}
				}

				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(191);
					match(ASSIGN);
					setState(192);
					match(STRINGSTRUCT);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(195);
					match(VAR);
					}
				}

				setState(198);
				match(ID);
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TWODOTS) {
					{
					setState(199);
					match(TWODOTS);
					setState(200);
					match(BOOLEAN);
					}
				}

				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(203);
					match(ASSIGN);
					setState(204);
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
		enterRule(_localctx, 26, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u00d6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7"+
		"\3&\n\3\f\3\16\3)\13\3\3\3\3\3\3\4\3\4\5\4/\n\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5A\n\5\3\6\7\6D\n\6\f\6\16"+
		"\6G\13\6\3\6\3\6\3\6\5\6L\n\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\7\bZ\n\b\f\b\16\b]\13\b\3\b\3\b\5\ba\n\b\3\b\3\b\3\b\3\b\5\b"+
		"g\n\b\3\t\3\t\6\tk\n\t\r\t\16\tl\3\t\3\t\3\n\3\n\7\ns\n\n\f\n\16\nv\13"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\5\f\u0080\n\f\3\r\5\r\u0083\n\r"+
		"\3\r\3\r\3\r\5\r\u0088\n\r\3\r\3\r\5\r\u008c\n\r\3\r\5\r\u008f\n\r\3\r"+
		"\5\r\u0092\n\r\3\r\3\r\3\r\5\r\u0097\n\r\3\r\3\r\5\r\u009b\n\r\3\r\5\r"+
		"\u009e\n\r\3\r\3\r\3\r\5\r\u00a3\n\r\3\r\3\r\5\r\u00a7\n\r\5\r\u00a9\n"+
		"\r\3\16\5\16\u00ac\n\16\3\16\3\16\3\16\5\16\u00b1\n\16\3\16\3\16\5\16"+
		"\u00b5\n\16\3\16\5\16\u00b8\n\16\3\16\5\16\u00bb\n\16\3\16\3\16\3\16\5"+
		"\16\u00c0\n\16\3\16\3\16\5\16\u00c4\n\16\3\16\5\16\u00c7\n\16\3\16\3\16"+
		"\3\16\5\16\u00cc\n\16\3\16\3\16\5\16\u00d0\n\16\5\16\u00d2\n\16\3\17\3"+
		"\17\3\17\2\2\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\4\4\2\6\6\31\31"+
		"\3\2\36!\2\u00eb\2\36\3\2\2\2\4!\3\2\2\2\6.\3\2\2\2\b@\3\2\2\2\nK\3\2"+
		"\2\2\fM\3\2\2\2\16f\3\2\2\2\20h\3\2\2\2\22p\3\2\2\2\24y\3\2\2\2\26\177"+
		"\3\2\2\2\30\u00a8\3\2\2\2\32\u00d1\3\2\2\2\34\u00d3\3\2\2\2\36\37\5\4"+
		"\3\2\37 \7\2\2\3 \3\3\2\2\2!\"\7\7\2\2\"#\7\31\2\2#\'\7#\2\2$&\5\6\4\2"+
		"%$\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(*\3\2\2\2)\'\3\2\2\2*+\7$\2"+
		"\2+\5\3\2\2\2,/\5\b\5\2-/\5\4\3\2.,\3\2\2\2.-\3\2\2\2/\7\3\2\2\2\60\61"+
		"\7\b\2\2\61\62\7\31\2\2\62\63\7%\2\2\63\64\7&\2\2\64\65\7)\2\2\65\66\7"+
		"\f\2\2\66\67\7\"\2\2\67A\5\22\n\289\7\b\2\29:\7\31\2\2:;\7%\2\2;<\7\3"+
		"\2\2<=\7)\2\2=>\7\30\2\2>?\7&\2\2?A\5\22\n\2@\60\3\2\2\2@8\3\2\2\2A\t"+
		"\3\2\2\2BD\5\26\f\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2"+
		"GE\3\2\2\2HL\7*\2\2IL\5\16\b\2JL\5\f\7\2KE\3\2\2\2KI\3\2\2\2KJ\3\2\2\2"+
		"L\13\3\2\2\2MN\7\31\2\2NO\7%\2\2OP\7&\2\2PQ\7*\2\2Q\r\3\2\2\2RS\7\17\2"+
		"\2ST\5\20\t\2T[\5\22\n\2UV\7\20\2\2VW\5\20\t\2WX\5\22\n\2XZ\3\2\2\2YU"+
		"\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\`\3\2\2\2][\3\2\2\2^_\7\21\2"+
		"\2_a\5\22\n\2`^\3\2\2\2`a\3\2\2\2ag\3\2\2\2bc\7\22\2\2cd\5\20\t\2de\5"+
		"\22\n\2eg\3\2\2\2fR\3\2\2\2fb\3\2\2\2g\17\3\2\2\2hj\7%\2\2ik\5\24\13\2"+
		"ji\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2\2mn\3\2\2\2no\7&\2\2o\21\3\2\2"+
		"\2pt\7#\2\2qs\5\n\6\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2uw\3\2\2"+
		"\2vt\3\2\2\2wx\7$\2\2x\23\3\2\2\2yz\t\2\2\2z{\5\34\17\2{|\t\2\2\2|\25"+
		"\3\2\2\2}\u0080\5\30\r\2~\u0080\5\32\16\2\177}\3\2\2\2\177~\3\2\2\2\u0080"+
		"\27\3\2\2\2\u0081\u0083\7\n\2\2\u0082\u0081\3\2\2\2\u0082\u0083\3\2\2"+
		"\2\u0083\u0084\3\2\2\2\u0084\u0087\7\31\2\2\u0085\u0086\7)\2\2\u0086\u0088"+
		"\7\13\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008e\3\2\2\2"+
		"\u0089\u008b\7\"\2\2\u008a\u008c\7\27\2\2\u008b\u008a\3\2\2\2\u008b\u008c"+
		"\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\7\6\2\2\u008e\u0089\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f\u00a9\3\2\2\2\u0090\u0092\7\n\2\2\u0091\u0090\3\2"+
		"\2\2\u0091\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0096\7\31\2\2\u0094"+
		"\u0095\7)\2\2\u0095\u0097\7\16\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2"+
		"\2\2\u0097\u009a\3\2\2\2\u0098\u0099\7\"\2\2\u0099\u009b\7\4\2\2\u009a"+
		"\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u00a9\3\2\2\2\u009c\u009e\7\n"+
		"\2\2\u009d\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\u00a2\7\31\2\2\u00a0\u00a1\7)\2\2\u00a1\u00a3\7\r\2\2\u00a2\u00a0\3\2"+
		"\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a5\7\"\2\2\u00a5"+
		"\u00a7\7\26\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9\3"+
		"\2\2\2\u00a8\u0082\3\2\2\2\u00a8\u0091\3\2\2\2\u00a8\u009d\3\2\2\2\u00a9"+
		"\31\3\2\2\2\u00aa\u00ac\7\t\2\2\u00ab\u00aa\3\2\2\2\u00ab\u00ac\3\2\2"+
		"\2\u00ac\u00ad\3\2\2\2\u00ad\u00b0\7\31\2\2\u00ae\u00af\7)\2\2\u00af\u00b1"+
		"\7\13\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b7\3\2\2\2"+
		"\u00b2\u00b4\7\"\2\2\u00b3\u00b5\7\27\2\2\u00b4\u00b3\3\2\2\2\u00b4\u00b5"+
		"\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8\7\6\2\2\u00b7\u00b2\3\2\2\2\u00b7"+
		"\u00b8\3\2\2\2\u00b8\u00d2\3\2\2\2\u00b9\u00bb\7\t\2\2\u00ba\u00b9\3\2"+
		"\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bf\7\31\2\2\u00bd"+
		"\u00be\7)\2\2\u00be\u00c0\7\16\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2"+
		"\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00c2\7\"\2\2\u00c2\u00c4\7\4\2\2\u00c3"+
		"\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00d2\3\2\2\2\u00c5\u00c7\7\t"+
		"\2\2\u00c6\u00c5\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8"+
		"\u00cb\7\31\2\2\u00c9\u00ca\7)\2\2\u00ca\u00cc\7\r\2\2\u00cb\u00c9\3\2"+
		"\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00ce\7\"\2\2\u00ce"+
		"\u00d0\7\26\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d2\3"+
		"\2\2\2\u00d1\u00ab\3\2\2\2\u00d1\u00ba\3\2\2\2\u00d1\u00c6\3\2\2\2\u00d2"+
		"\33\3\2\2\2\u00d3\u00d4\t\3\2\2\u00d4\35\3\2\2\2#\'.@EK[`flt\177\u0082"+
		"\u0087\u008b\u008e\u0091\u0096\u009a\u009d\u00a2\u00a6\u00a8\u00ab\u00b0"+
		"\u00b4\u00b7\u00ba\u00bf\u00c3\u00c6\u00cb\u00cf\u00d1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}