// Generated from Aloft.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class AloftParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLASS_KEYWORD=1, COMPONENT_KEYWORD=2, ELEMENT_KEYWORD=3, THEME_KEYWORD=4, 
		MODEL_KEYWORD=5, PAGE_KEYWORD=6, ANIMATION_KEYWORD=7, MODULE_KEYWORD=8, 
		QUERY_KEYWORD=9, SOURCE_KEYWORD=10, CALLABLE_KEYWORD=11, CONSTRUCTOR_KEYWORD=12, 
		ISSET_KEYWORD=13, IF_KEYWORD=14, OPEN_PARENTHESES=15, CLOSE_PARENTHESES=16, 
		ELSE=17, ELSE_IF=18, LOOP_DECLARATION=19, SWITCH_KEYWORD=20, CURLY_BLOCK=21, 
		SWITCH_CURLY_BLOCK=22, COMMA=23, VAR_ACCESS=24, VAR_MAGIC=25, ARRAY_TYPE_SUFFIX=26, 
		FUNCTION=27, FUNCTION_TYPES=28, TYPES=29, ENCLOSED_WITH_ARGS=30, NAMED_WITH_PARAMS_SPECIAL=31, 
		CONDITIONAL_IF=32, CONDITIONAL_ELSE=33, OPERATORS=34, BRACES_ARRAY_BLOCK=35, 
		CURLY_OBJECT_BLOCK=36, PROPERTY=37, NAMED_PROPERTY=38, NAMED_PROPERTY_OBJECT=39, 
		PROPERTY_VALUES=40, DECIMALS=41, NUMBERS=42, HTML_ELEMENT=43, NULL_VALUE=44, 
		EMPTY_PARENTHESIS=45, NAMED_PARENTHESIS_SPECIAL=46, NAMED_PARENTHESIS_FUNCTIONS=47, 
		NAMED_VAR=48, NAMED=49, NAMED_DOT=50, NAMED_CLASS_ARRAY=51, NAMED_OBJECT=52, 
		NAMED_OBJECT_ARRAY=53, NAMED_ARRAY=54, GO_TO=55, GOTO_KEYWORD=56, PATH_STRING=57, 
		QUOTED_STRING=58, STATEMENT_END=59, SEPARATOR=60, NOT=61, PRIVATE_ACCESS=62, 
		APPEND_ADD=63, APPEND_SUBTRACT=64, PATH_START=65, OPEN_BRACKETS=66, CLOSE_BRACKETS=67, 
		QUOTES=68, COMMENT_BLOCK_DECLARATION=69, WS=70;
	public static final int
		RULE_r = 0, RULE_syntax = 1, RULE_class = 2, RULE_component = 3, RULE_element = 4, 
		RULE_theme = 5, RULE_model = 6, RULE_page = 7, RULE_animation = 8, RULE_module = 9, 
		RULE_query = 10, RULE_source = 11, RULE_callable = 12, RULE_constructor = 13, 
		RULE_isset = 14, RULE_if = 15, RULE_loop = 16, RULE_switch_block = 17, 
		RULE_declare_variable = 18, RULE_variable = 19, RULE_variable_options = 20, 
		RULE_var_options = 21, RULE_functions = 22, RULE_var_type = 23, RULE_condtional = 24, 
		RULE_expression = 25, RULE_enclosed_var = 26, RULE_named_switch = 27, 
		RULE_enclosed_vars = 28, RULE_path = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"r", "syntax", "class", "component", "element", "theme", "model", "page", 
			"animation", "module", "query", "source", "callable", "constructor", 
			"isset", "if", "loop", "switch_block", "declare_variable", "variable", 
			"variable_options", "var_options", "functions", "var_type", "condtional", 
			"expression", "enclosed_var", "named_switch", "enclosed_vars", "path"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "'{}'", "'switch'", 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"';'", "'='", "'!'", "'::'", "'++'", "'--'", "'^'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CLASS_KEYWORD", "COMPONENT_KEYWORD", "ELEMENT_KEYWORD", "THEME_KEYWORD", 
			"MODEL_KEYWORD", "PAGE_KEYWORD", "ANIMATION_KEYWORD", "MODULE_KEYWORD", 
			"QUERY_KEYWORD", "SOURCE_KEYWORD", "CALLABLE_KEYWORD", "CONSTRUCTOR_KEYWORD", 
			"ISSET_KEYWORD", "IF_KEYWORD", "OPEN_PARENTHESES", "CLOSE_PARENTHESES", 
			"ELSE", "ELSE_IF", "LOOP_DECLARATION", "SWITCH_KEYWORD", "CURLY_BLOCK", 
			"SWITCH_CURLY_BLOCK", "COMMA", "VAR_ACCESS", "VAR_MAGIC", "ARRAY_TYPE_SUFFIX", 
			"FUNCTION", "FUNCTION_TYPES", "TYPES", "ENCLOSED_WITH_ARGS", "NAMED_WITH_PARAMS_SPECIAL", 
			"CONDITIONAL_IF", "CONDITIONAL_ELSE", "OPERATORS", "BRACES_ARRAY_BLOCK", 
			"CURLY_OBJECT_BLOCK", "PROPERTY", "NAMED_PROPERTY", "NAMED_PROPERTY_OBJECT", 
			"PROPERTY_VALUES", "DECIMALS", "NUMBERS", "HTML_ELEMENT", "NULL_VALUE", 
			"EMPTY_PARENTHESIS", "NAMED_PARENTHESIS_SPECIAL", "NAMED_PARENTHESIS_FUNCTIONS", 
			"NAMED_VAR", "NAMED", "NAMED_DOT", "NAMED_CLASS_ARRAY", "NAMED_OBJECT", 
			"NAMED_OBJECT_ARRAY", "NAMED_ARRAY", "GO_TO", "GOTO_KEYWORD", "PATH_STRING", 
			"QUOTED_STRING", "STATEMENT_END", "SEPARATOR", "NOT", "PRIVATE_ACCESS", 
			"APPEND_ADD", "APPEND_SUBTRACT", "PATH_START", "OPEN_BRACKETS", "CLOSE_BRACKETS", 
			"QUOTES", "COMMENT_BLOCK_DECLARATION", "WS"
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
	public String getGrammarFileName() { return "Aloft.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AloftParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RContext extends ParserRuleContext {
		public TerminalNode NAMED() { return getToken(AloftParser.NAMED, 0); }
		public RContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitR(this);
		}
	}

	public final RContext r() throws RecognitionException {
		RContext _localctx = new RContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_r);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(NAMED);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SyntaxContext extends ParserRuleContext {
		public Switch_blockContext switch_block() {
			return getRuleContext(Switch_blockContext.class,0);
		}
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public FunctionsContext functions() {
			return getRuleContext(FunctionsContext.class,0);
		}
		public ClassContext class_() {
			return getRuleContext(ClassContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public SourceContext source() {
			return getRuleContext(SourceContext.class,0);
		}
		public ComponentContext component() {
			return getRuleContext(ComponentContext.class,0);
		}
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public ModelContext model() {
			return getRuleContext(ModelContext.class,0);
		}
		public ThemeContext theme() {
			return getRuleContext(ThemeContext.class,0);
		}
		public CallableContext callable() {
			return getRuleContext(CallableContext.class,0);
		}
		public PageContext page() {
			return getRuleContext(PageContext.class,0);
		}
		public AnimationContext animation() {
			return getRuleContext(AnimationContext.class,0);
		}
		public ModuleContext module() {
			return getRuleContext(ModuleContext.class,0);
		}
		public Declare_variableContext declare_variable() {
			return getRuleContext(Declare_variableContext.class,0);
		}
		public CondtionalContext condtional() {
			return getRuleContext(CondtionalContext.class,0);
		}
		public SyntaxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syntax; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterSyntax(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitSyntax(this);
		}
	}

	public final SyntaxContext syntax() throws RecognitionException {
		SyntaxContext _localctx = new SyntaxContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_syntax);
		try {
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				switch_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				if_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				loop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(65);
				functions();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(66);
				class_();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(67);
				query();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(68);
				constructor();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(69);
				source();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(70);
				component();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(71);
				element();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(72);
				model();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(73);
				theme();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(74);
				callable();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(75);
				page();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(76);
				animation();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(77);
				module();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(78);
				declare_variable();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(79);
				condtional();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassContext extends ParserRuleContext {
		public TerminalNode CLASS_KEYWORD() { return getToken(AloftParser.CLASS_KEYWORD, 0); }
		public TerminalNode NAMED() { return getToken(AloftParser.NAMED, 0); }
		public TerminalNode CURLY_BLOCK() { return getToken(AloftParser.CURLY_BLOCK, 0); }
		public ClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitClass(this);
		}
	}

	public final ClassContext class_() throws RecognitionException {
		ClassContext _localctx = new ClassContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_class);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(CLASS_KEYWORD);
			setState(83);
			match(NAMED);
			setState(84);
			match(CURLY_BLOCK);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentContext extends ParserRuleContext {
		public TerminalNode COMPONENT_KEYWORD() { return getToken(AloftParser.COMPONENT_KEYWORD, 0); }
		public TerminalNode NAMED() { return getToken(AloftParser.NAMED, 0); }
		public TerminalNode CURLY_BLOCK() { return getToken(AloftParser.CURLY_BLOCK, 0); }
		public TerminalNode STATEMENT_END() { return getToken(AloftParser.STATEMENT_END, 0); }
		public ComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitComponent(this);
		}
	}

	public final ComponentContext component() throws RecognitionException {
		ComponentContext _localctx = new ComponentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_component);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(COMPONENT_KEYWORD);
			setState(87);
			match(NAMED);
			setState(88);
			match(CURLY_BLOCK);
			setState(89);
			match(STATEMENT_END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElementContext extends ParserRuleContext {
		public TerminalNode ELEMENT_KEYWORD() { return getToken(AloftParser.ELEMENT_KEYWORD, 0); }
		public TerminalNode NAMED() { return getToken(AloftParser.NAMED, 0); }
		public TerminalNode CURLY_BLOCK() { return getToken(AloftParser.CURLY_BLOCK, 0); }
		public TerminalNode STATEMENT_END() { return getToken(AloftParser.STATEMENT_END, 0); }
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitElement(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(ELEMENT_KEYWORD);
			setState(92);
			match(NAMED);
			setState(93);
			match(CURLY_BLOCK);
			setState(94);
			match(STATEMENT_END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ThemeContext extends ParserRuleContext {
		public TerminalNode THEME_KEYWORD() { return getToken(AloftParser.THEME_KEYWORD, 0); }
		public TerminalNode NAMED() { return getToken(AloftParser.NAMED, 0); }
		public TerminalNode CURLY_BLOCK() { return getToken(AloftParser.CURLY_BLOCK, 0); }
		public TerminalNode STATEMENT_END() { return getToken(AloftParser.STATEMENT_END, 0); }
		public ThemeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_theme; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterTheme(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitTheme(this);
		}
	}

	public final ThemeContext theme() throws RecognitionException {
		ThemeContext _localctx = new ThemeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_theme);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(THEME_KEYWORD);
			setState(97);
			match(NAMED);
			setState(98);
			match(CURLY_BLOCK);
			setState(99);
			match(STATEMENT_END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ModelContext extends ParserRuleContext {
		public TerminalNode MODEL_KEYWORD() { return getToken(AloftParser.MODEL_KEYWORD, 0); }
		public TerminalNode NAMED() { return getToken(AloftParser.NAMED, 0); }
		public TerminalNode CURLY_BLOCK() { return getToken(AloftParser.CURLY_BLOCK, 0); }
		public TerminalNode STATEMENT_END() { return getToken(AloftParser.STATEMENT_END, 0); }
		public ModelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_model; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterModel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitModel(this);
		}
	}

	public final ModelContext model() throws RecognitionException {
		ModelContext _localctx = new ModelContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_model);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(MODEL_KEYWORD);
			setState(102);
			match(NAMED);
			setState(103);
			match(CURLY_BLOCK);
			setState(104);
			match(STATEMENT_END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PageContext extends ParserRuleContext {
		public TerminalNode PAGE_KEYWORD() { return getToken(AloftParser.PAGE_KEYWORD, 0); }
		public TerminalNode PATH_STRING() { return getToken(AloftParser.PATH_STRING, 0); }
		public TerminalNode CURLY_BLOCK() { return getToken(AloftParser.CURLY_BLOCK, 0); }
		public TerminalNode STATEMENT_END() { return getToken(AloftParser.STATEMENT_END, 0); }
		public PageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_page; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterPage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitPage(this);
		}
	}

	public final PageContext page() throws RecognitionException {
		PageContext _localctx = new PageContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_page);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(PAGE_KEYWORD);
			setState(107);
			match(PATH_STRING);
			setState(108);
			match(CURLY_BLOCK);
			setState(109);
			match(STATEMENT_END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AnimationContext extends ParserRuleContext {
		public TerminalNode ANIMATION_KEYWORD() { return getToken(AloftParser.ANIMATION_KEYWORD, 0); }
		public TerminalNode NAMED() { return getToken(AloftParser.NAMED, 0); }
		public TerminalNode CURLY_BLOCK() { return getToken(AloftParser.CURLY_BLOCK, 0); }
		public TerminalNode STATEMENT_END() { return getToken(AloftParser.STATEMENT_END, 0); }
		public AnimationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_animation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterAnimation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitAnimation(this);
		}
	}

	public final AnimationContext animation() throws RecognitionException {
		AnimationContext _localctx = new AnimationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_animation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(ANIMATION_KEYWORD);
			setState(112);
			match(NAMED);
			setState(113);
			match(CURLY_BLOCK);
			setState(114);
			match(STATEMENT_END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ModuleContext extends ParserRuleContext {
		public TerminalNode MODULE_KEYWORD() { return getToken(AloftParser.MODULE_KEYWORD, 0); }
		public TerminalNode NAMED() { return getToken(AloftParser.NAMED, 0); }
		public TerminalNode CURLY_BLOCK() { return getToken(AloftParser.CURLY_BLOCK, 0); }
		public TerminalNode STATEMENT_END() { return getToken(AloftParser.STATEMENT_END, 0); }
		public ModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterModule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitModule(this);
		}
	}

	public final ModuleContext module() throws RecognitionException {
		ModuleContext _localctx = new ModuleContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_module);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(MODULE_KEYWORD);
			setState(117);
			match(NAMED);
			setState(118);
			match(CURLY_BLOCK);
			setState(119);
			match(STATEMENT_END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class QueryContext extends ParserRuleContext {
		public TerminalNode QUERY_KEYWORD() { return getToken(AloftParser.QUERY_KEYWORD, 0); }
		public TerminalNode CURLY_BLOCK() { return getToken(AloftParser.CURLY_BLOCK, 0); }
		public TerminalNode STATEMENT_END() { return getToken(AloftParser.STATEMENT_END, 0); }
		public TerminalNode NAMED_WITH_PARAMS_SPECIAL() { return getToken(AloftParser.NAMED_WITH_PARAMS_SPECIAL, 0); }
		public TerminalNode EMPTY_PARENTHESIS() { return getToken(AloftParser.EMPTY_PARENTHESIS, 0); }
		public TerminalNode NAMED() { return getToken(AloftParser.NAMED, 0); }
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitQuery(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(QUERY_KEYWORD);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAMED) {
				{
				setState(122);
				match(NAMED);
				}
			}

			setState(125);
			_la = _input.LA(1);
			if ( !(_la==NAMED_WITH_PARAMS_SPECIAL || _la==EMPTY_PARENTHESIS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(126);
			match(CURLY_BLOCK);
			setState(127);
			match(STATEMENT_END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SourceContext extends ParserRuleContext {
		public TerminalNode SOURCE_KEYWORD() { return getToken(AloftParser.SOURCE_KEYWORD, 0); }
		public TerminalNode PATH_STRING() { return getToken(AloftParser.PATH_STRING, 0); }
		public TerminalNode STATEMENT_END() { return getToken(AloftParser.STATEMENT_END, 0); }
		public SourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterSource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitSource(this);
		}
	}

	public final SourceContext source() throws RecognitionException {
		SourceContext _localctx = new SourceContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_source);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(SOURCE_KEYWORD);
			setState(130);
			match(PATH_STRING);
			setState(131);
			match(STATEMENT_END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CallableContext extends ParserRuleContext {
		public TerminalNode CALLABLE_KEYWORD() { return getToken(AloftParser.CALLABLE_KEYWORD, 0); }
		public TerminalNode PATH_STRING() { return getToken(AloftParser.PATH_STRING, 0); }
		public TerminalNode CURLY_BLOCK() { return getToken(AloftParser.CURLY_BLOCK, 0); }
		public TerminalNode STATEMENT_END() { return getToken(AloftParser.STATEMENT_END, 0); }
		public CallableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterCallable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitCallable(this);
		}
	}

	public final CallableContext callable() throws RecognitionException {
		CallableContext _localctx = new CallableContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_callable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(CALLABLE_KEYWORD);
			setState(134);
			match(PATH_STRING);
			setState(135);
			match(CURLY_BLOCK);
			setState(136);
			match(STATEMENT_END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorContext extends ParserRuleContext {
		public TerminalNode CONSTRUCTOR_KEYWORD() { return getToken(AloftParser.CONSTRUCTOR_KEYWORD, 0); }
		public TerminalNode CURLY_BLOCK() { return getToken(AloftParser.CURLY_BLOCK, 0); }
		public TerminalNode STATEMENT_END() { return getToken(AloftParser.STATEMENT_END, 0); }
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitConstructor(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_constructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(CONSTRUCTOR_KEYWORD);
			setState(139);
			match(CURLY_BLOCK);
			setState(140);
			match(STATEMENT_END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IssetContext extends ParserRuleContext {
		public TerminalNode ISSET_KEYWORD() { return getToken(AloftParser.ISSET_KEYWORD, 0); }
		public TerminalNode NOT() { return getToken(AloftParser.NOT, 0); }
		public IssetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterIsset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitIsset(this);
		}
	}

	public final IssetContext isset() throws RecognitionException {
		IssetContext _localctx = new IssetContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_isset);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(142);
				match(NOT);
				}
			}

			setState(145);
			match(ISSET_KEYWORD);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfContext extends ParserRuleContext {
		public TerminalNode IF_KEYWORD() { return getToken(AloftParser.IF_KEYWORD, 0); }
		public List<TerminalNode> CURLY_BLOCK() { return getTokens(AloftParser.CURLY_BLOCK); }
		public TerminalNode CURLY_BLOCK(int i) {
			return getToken(AloftParser.CURLY_BLOCK, i);
		}
		public List<TerminalNode> OPEN_PARENTHESES() { return getTokens(AloftParser.OPEN_PARENTHESES); }
		public TerminalNode OPEN_PARENTHESES(int i) {
			return getToken(AloftParser.OPEN_PARENTHESES, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> CLOSE_PARENTHESES() { return getTokens(AloftParser.CLOSE_PARENTHESES); }
		public TerminalNode CLOSE_PARENTHESES(int i) {
			return getToken(AloftParser.CLOSE_PARENTHESES, i);
		}
		public List<TerminalNode> ELSE_IF() { return getTokens(AloftParser.ELSE_IF); }
		public TerminalNode ELSE_IF(int i) {
			return getToken(AloftParser.ELSE_IF, i);
		}
		public List<TerminalNode> ELSE() { return getTokens(AloftParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(AloftParser.ELSE, i);
		}
		public IfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitIf(this);
		}
	}

	public final IfContext if_() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(IF_KEYWORD);
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PARENTHESES) {
				{
				setState(148);
				match(OPEN_PARENTHESES);
				}
			}

			setState(152); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(151);
				expression();
				}
				}
				setState(154); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 3603183218645278720L) != 0) );
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLOSE_PARENTHESES) {
				{
				setState(156);
				match(CLOSE_PARENTHESES);
				}
			}

			setState(159);
			match(CURLY_BLOCK);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE || _la==ELSE_IF) {
				{
				setState(176);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ELSE_IF:
					{
					{
					setState(160);
					match(ELSE_IF);
					{
					setState(162);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OPEN_PARENTHESES) {
						{
						setState(161);
						match(OPEN_PARENTHESES);
						}
					}

					setState(165); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(164);
						expression();
						}
						}
						setState(167); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 3603183218645278720L) != 0) );
					setState(170);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==CLOSE_PARENTHESES) {
						{
						setState(169);
						match(CLOSE_PARENTHESES);
						}
					}

					setState(172);
					match(CURLY_BLOCK);
					}
					}
					}
					break;
				case ELSE:
					{
					{
					setState(174);
					match(ELSE);
					setState(175);
					match(CURLY_BLOCK);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LoopContext extends ParserRuleContext {
		public TerminalNode LOOP_DECLARATION() { return getToken(AloftParser.LOOP_DECLARATION, 0); }
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitLoop(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(LOOP_DECLARATION);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Switch_blockContext extends ParserRuleContext {
		public TerminalNode SWITCH_KEYWORD() { return getToken(AloftParser.SWITCH_KEYWORD, 0); }
		public Named_switchContext named_switch() {
			return getRuleContext(Named_switchContext.class,0);
		}
		public TerminalNode SWITCH_CURLY_BLOCK() { return getToken(AloftParser.SWITCH_CURLY_BLOCK, 0); }
		public Switch_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterSwitch_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitSwitch_block(this);
		}
	}

	public final Switch_blockContext switch_block() throws RecognitionException {
		Switch_blockContext _localctx = new Switch_blockContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_switch_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(SWITCH_KEYWORD);
			setState(184);
			named_switch();
			setState(185);
			match(SWITCH_CURLY_BLOCK);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Declare_variableContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode STATEMENT_END() { return getToken(AloftParser.STATEMENT_END, 0); }
		public Variable_optionsContext variable_options() {
			return getRuleContext(Variable_optionsContext.class,0);
		}
		public TerminalNode SEPARATOR() { return getToken(AloftParser.SEPARATOR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Declare_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterDeclare_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitDeclare_variable(this);
		}
	}

	public final Declare_variableContext declare_variable() throws RecognitionException {
		Declare_variableContext _localctx = new Declare_variableContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_declare_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			variable();
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR_MAGIC || _la==TYPES) {
				{
				setState(188);
				variable_options();
				}
			}

			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEPARATOR) {
				{
				setState(191);
				match(SEPARATOR);
				setState(193); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(192);
					expression();
					}
					}
					setState(195); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 3603183218645278720L) != 0) );
				}
			}

			setState(199);
			match(STATEMENT_END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends ParserRuleContext {
		public TerminalNode VAR_ACCESS() { return getToken(AloftParser.VAR_ACCESS, 0); }
		public Enclosed_varContext enclosed_var() {
			return getRuleContext(Enclosed_varContext.class,0);
		}
		public TerminalNode NAMED_VAR() { return getToken(AloftParser.NAMED_VAR, 0); }
		public TerminalNode COMMA() { return getToken(AloftParser.COMMA, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR_ACCESS) {
				{
				setState(201);
				match(VAR_ACCESS);
				}
			}

			{
			setState(206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PARENTHESES:
			case NAMED_PARENTHESIS_SPECIAL:
				{
				setState(204);
				enclosed_var();
				}
				break;
			case NAMED_VAR:
				{
				setState(205);
				match(NAMED_VAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(208);
				match(COMMA);
				}
			}

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

	@SuppressWarnings("CheckReturnValue")
	public static class Variable_optionsContext extends ParserRuleContext {
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public Var_optionsContext var_options() {
			return getRuleContext(Var_optionsContext.class,0);
		}
		public Variable_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterVariable_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitVariable_options(this);
		}
	}

	public final Variable_optionsContext variable_options() throws RecognitionException {
		Variable_optionsContext _localctx = new Variable_optionsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_variable_options);
		try {
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				var_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				var_options();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(213);
				var_type();
				setState(214);
				var_options();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Var_optionsContext extends ParserRuleContext {
		public TerminalNode VAR_MAGIC() { return getToken(AloftParser.VAR_MAGIC, 0); }
		public Var_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterVar_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitVar_options(this);
		}
	}

	public final Var_optionsContext var_options() throws RecognitionException {
		Var_optionsContext _localctx = new Var_optionsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_var_options);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(VAR_MAGIC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionsContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(AloftParser.FUNCTION, 0); }
		public TerminalNode ENCLOSED_WITH_ARGS() { return getToken(AloftParser.ENCLOSED_WITH_ARGS, 0); }
		public TerminalNode CURLY_BLOCK() { return getToken(AloftParser.CURLY_BLOCK, 0); }
		public TerminalNode STATEMENT_END() { return getToken(AloftParser.STATEMENT_END, 0); }
		public TerminalNode FUNCTION_TYPES() { return getToken(AloftParser.FUNCTION_TYPES, 0); }
		public TerminalNode NAMED_CLASS_ARRAY() { return getToken(AloftParser.NAMED_CLASS_ARRAY, 0); }
		public TerminalNode ARRAY_TYPE_SUFFIX() { return getToken(AloftParser.ARRAY_TYPE_SUFFIX, 0); }
		public FunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitFunctions(this);
		}
	}

	public final FunctionsContext functions() throws RecognitionException {
		FunctionsContext _localctx = new FunctionsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_functions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION_TYPES:
				{
				setState(220);
				match(FUNCTION_TYPES);
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ARRAY_TYPE_SUFFIX) {
					{
					setState(221);
					match(ARRAY_TYPE_SUFFIX);
					}
				}

				}
				break;
			case NAMED_CLASS_ARRAY:
				{
				setState(224);
				match(NAMED_CLASS_ARRAY);
				}
				break;
			case FUNCTION:
				break;
			default:
				break;
			}
			setState(227);
			match(FUNCTION);
			setState(228);
			match(ENCLOSED_WITH_ARGS);
			setState(229);
			match(CURLY_BLOCK);
			setState(230);
			match(STATEMENT_END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Var_typeContext extends ParserRuleContext {
		public TerminalNode TYPES() { return getToken(AloftParser.TYPES, 0); }
		public Var_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterVar_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitVar_type(this);
		}
	}

	public final Var_typeContext var_type() throws RecognitionException {
		Var_typeContext _localctx = new Var_typeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_var_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(TYPES);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CondtionalContext extends ParserRuleContext {
		public TerminalNode CONDITIONAL_IF() { return getToken(AloftParser.CONDITIONAL_IF, 0); }
		public TerminalNode CONDITIONAL_ELSE() { return getToken(AloftParser.CONDITIONAL_ELSE, 0); }
		public TerminalNode STATEMENT_END() { return getToken(AloftParser.STATEMENT_END, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CondtionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condtional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterCondtional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitCondtional(this);
		}
	}

	public final CondtionalContext condtional() throws RecognitionException {
		CondtionalContext _localctx = new CondtionalContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_condtional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(234);
				expression();
				}
				}
				setState(237); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 3603183218645278720L) != 0) );
			setState(239);
			match(CONDITIONAL_IF);
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3603183218645278720L) != 0)) {
				{
				{
				setState(240);
				expression();
				}
				}
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(246);
			match(CONDITIONAL_ELSE);
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3603183218645278720L) != 0)) {
				{
				{
				setState(247);
				expression();
				}
				}
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(253);
			match(STATEMENT_END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public IssetContext isset() {
			return getRuleContext(IssetContext.class,0);
		}
		public TerminalNode SEPARATOR() { return getToken(AloftParser.SEPARATOR, 0); }
		public TerminalNode NULL_VALUE() { return getToken(AloftParser.NULL_VALUE, 0); }
		public TerminalNode BRACES_ARRAY_BLOCK() { return getToken(AloftParser.BRACES_ARRAY_BLOCK, 0); }
		public TerminalNode NAMED_VAR() { return getToken(AloftParser.NAMED_VAR, 0); }
		public TerminalNode NOT() { return getToken(AloftParser.NOT, 0); }
		public TerminalNode PATH_STRING() { return getToken(AloftParser.PATH_STRING, 0); }
		public TerminalNode NUMBERS() { return getToken(AloftParser.NUMBERS, 0); }
		public TerminalNode OPERATORS() { return getToken(AloftParser.OPERATORS, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expression);
		int _la;
		try {
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				isset();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				match(SEPARATOR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(257);
				match(NULL_VALUE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(258);
				match(BRACES_ARRAY_BLOCK);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(259);
					match(NOT);
					}
				}

				setState(262);
				match(NAMED_VAR);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(263);
				match(PATH_STRING);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(264);
				match(NUMBERS);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(265);
				match(OPERATORS);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Enclosed_varContext extends ParserRuleContext {
		public TerminalNode NAMED_PARENTHESIS_SPECIAL() { return getToken(AloftParser.NAMED_PARENTHESIS_SPECIAL, 0); }
		public Enclosed_varsContext enclosed_vars() {
			return getRuleContext(Enclosed_varsContext.class,0);
		}
		public Enclosed_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enclosed_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterEnclosed_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitEnclosed_var(this);
		}
	}

	public final Enclosed_varContext enclosed_var() throws RecognitionException {
		Enclosed_varContext _localctx = new Enclosed_varContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_enclosed_var);
		try {
			setState(270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAMED_PARENTHESIS_SPECIAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				match(NAMED_PARENTHESIS_SPECIAL);
				}
				break;
			case OPEN_PARENTHESES:
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				enclosed_vars();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Named_switchContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENTHESES() { return getToken(AloftParser.OPEN_PARENTHESES, 0); }
		public TerminalNode NAMED_VAR() { return getToken(AloftParser.NAMED_VAR, 0); }
		public TerminalNode CLOSE_PARENTHESES() { return getToken(AloftParser.CLOSE_PARENTHESES, 0); }
		public Named_switchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_named_switch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterNamed_switch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitNamed_switch(this);
		}
	}

	public final Named_switchContext named_switch() throws RecognitionException {
		Named_switchContext _localctx = new Named_switchContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_named_switch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(OPEN_PARENTHESES);
			setState(273);
			match(NAMED_VAR);
			setState(274);
			match(CLOSE_PARENTHESES);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Enclosed_varsContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENTHESES() { return getToken(AloftParser.OPEN_PARENTHESES, 0); }
		public TerminalNode CLOSE_PARENTHESES() { return getToken(AloftParser.CLOSE_PARENTHESES, 0); }
		public List<TerminalNode> NAMED_VAR() { return getTokens(AloftParser.NAMED_VAR); }
		public TerminalNode NAMED_VAR(int i) {
			return getToken(AloftParser.NAMED_VAR, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AloftParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AloftParser.COMMA, i);
		}
		public Enclosed_varsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enclosed_vars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterEnclosed_vars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitEnclosed_vars(this);
		}
	}

	public final Enclosed_varsContext enclosed_vars() throws RecognitionException {
		Enclosed_varsContext _localctx = new Enclosed_varsContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_enclosed_vars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(OPEN_PARENTHESES);
			setState(281); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(277);
				match(NAMED_VAR);
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(278);
					match(COMMA);
					}
				}

				}
				}
				setState(283); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NAMED_VAR );
			setState(285);
			match(CLOSE_PARENTHESES);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PathContext extends ParserRuleContext {
		public TerminalNode QUOTED_STRING() { return getToken(AloftParser.QUOTED_STRING, 0); }
		public TerminalNode PATH_STRING() { return getToken(AloftParser.PATH_STRING, 0); }
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitPath(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_path);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			_la = _input.LA(1);
			if ( !(_la==PATH_STRING || _la==QUOTED_STRING) ) {
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
		"\u0004\u0001F\u0122\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001Q\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0003\n|\b\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0003\u000e\u0090\b\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u0096\b\u000f\u0001\u000f\u0004\u000f\u0099\b\u000f\u000b"+
		"\u000f\f\u000f\u009a\u0001\u000f\u0003\u000f\u009e\b\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u00a3\b\u000f\u0001\u000f\u0004\u000f"+
		"\u00a6\b\u000f\u000b\u000f\f\u000f\u00a7\u0001\u000f\u0003\u000f\u00ab"+
		"\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00b1"+
		"\b\u000f\n\u000f\f\u000f\u00b4\t\u000f\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u00be\b\u0012\u0001\u0012\u0001\u0012\u0004\u0012\u00c2\b\u0012\u000b"+
		"\u0012\f\u0012\u00c3\u0003\u0012\u00c6\b\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0003\u0013\u00cb\b\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u00cf\b\u0013\u0001\u0013\u0003\u0013\u00d2\b\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00d9\b\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0003\u0016\u00df\b\u0016\u0001"+
		"\u0016\u0003\u0016\u00e2\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0004\u0018\u00ec"+
		"\b\u0018\u000b\u0018\f\u0018\u00ed\u0001\u0018\u0001\u0018\u0005\u0018"+
		"\u00f2\b\u0018\n\u0018\f\u0018\u00f5\t\u0018\u0001\u0018\u0001\u0018\u0005"+
		"\u0018\u00f9\b\u0018\n\u0018\f\u0018\u00fc\t\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019"+
		"\u0105\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019"+
		"\u010b\b\u0019\u0001\u001a\u0001\u001a\u0003\u001a\u010f\b\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0003\u001c\u0118\b\u001c\u0004\u001c\u011a\b\u001c\u000b\u001c"+
		"\f\u001c\u011b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0000\u0000\u001e\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:\u0000\u0002\u0002\u0000"+
		"\u001f\u001f--\u0001\u00009:\u0137\u0000<\u0001\u0000\u0000\u0000\u0002"+
		"P\u0001\u0000\u0000\u0000\u0004R\u0001\u0000\u0000\u0000\u0006V\u0001"+
		"\u0000\u0000\u0000\b[\u0001\u0000\u0000\u0000\n`\u0001\u0000\u0000\u0000"+
		"\fe\u0001\u0000\u0000\u0000\u000ej\u0001\u0000\u0000\u0000\u0010o\u0001"+
		"\u0000\u0000\u0000\u0012t\u0001\u0000\u0000\u0000\u0014y\u0001\u0000\u0000"+
		"\u0000\u0016\u0081\u0001\u0000\u0000\u0000\u0018\u0085\u0001\u0000\u0000"+
		"\u0000\u001a\u008a\u0001\u0000\u0000\u0000\u001c\u008f\u0001\u0000\u0000"+
		"\u0000\u001e\u0093\u0001\u0000\u0000\u0000 \u00b5\u0001\u0000\u0000\u0000"+
		"\"\u00b7\u0001\u0000\u0000\u0000$\u00bb\u0001\u0000\u0000\u0000&\u00ca"+
		"\u0001\u0000\u0000\u0000(\u00d8\u0001\u0000\u0000\u0000*\u00da\u0001\u0000"+
		"\u0000\u0000,\u00e1\u0001\u0000\u0000\u0000.\u00e8\u0001\u0000\u0000\u0000"+
		"0\u00eb\u0001\u0000\u0000\u00002\u010a\u0001\u0000\u0000\u00004\u010e"+
		"\u0001\u0000\u0000\u00006\u0110\u0001\u0000\u0000\u00008\u0114\u0001\u0000"+
		"\u0000\u0000:\u011f\u0001\u0000\u0000\u0000<=\u00051\u0000\u0000=\u0001"+
		"\u0001\u0000\u0000\u0000>Q\u0003\"\u0011\u0000?Q\u0003\u001e\u000f\u0000"+
		"@Q\u0003 \u0010\u0000AQ\u0003,\u0016\u0000BQ\u0003\u0004\u0002\u0000C"+
		"Q\u0003\u0014\n\u0000DQ\u0003\u001a\r\u0000EQ\u0003\u0016\u000b\u0000"+
		"FQ\u0003\u0006\u0003\u0000GQ\u0003\b\u0004\u0000HQ\u0003\f\u0006\u0000"+
		"IQ\u0003\n\u0005\u0000JQ\u0003\u0018\f\u0000KQ\u0003\u000e\u0007\u0000"+
		"LQ\u0003\u0010\b\u0000MQ\u0003\u0012\t\u0000NQ\u0003$\u0012\u0000OQ\u0003"+
		"0\u0018\u0000P>\u0001\u0000\u0000\u0000P?\u0001\u0000\u0000\u0000P@\u0001"+
		"\u0000\u0000\u0000PA\u0001\u0000\u0000\u0000PB\u0001\u0000\u0000\u0000"+
		"PC\u0001\u0000\u0000\u0000PD\u0001\u0000\u0000\u0000PE\u0001\u0000\u0000"+
		"\u0000PF\u0001\u0000\u0000\u0000PG\u0001\u0000\u0000\u0000PH\u0001\u0000"+
		"\u0000\u0000PI\u0001\u0000\u0000\u0000PJ\u0001\u0000\u0000\u0000PK\u0001"+
		"\u0000\u0000\u0000PL\u0001\u0000\u0000\u0000PM\u0001\u0000\u0000\u0000"+
		"PN\u0001\u0000\u0000\u0000PO\u0001\u0000\u0000\u0000Q\u0003\u0001\u0000"+
		"\u0000\u0000RS\u0005\u0001\u0000\u0000ST\u00051\u0000\u0000TU\u0005\u0015"+
		"\u0000\u0000U\u0005\u0001\u0000\u0000\u0000VW\u0005\u0002\u0000\u0000"+
		"WX\u00051\u0000\u0000XY\u0005\u0015\u0000\u0000YZ\u0005;\u0000\u0000Z"+
		"\u0007\u0001\u0000\u0000\u0000[\\\u0005\u0003\u0000\u0000\\]\u00051\u0000"+
		"\u0000]^\u0005\u0015\u0000\u0000^_\u0005;\u0000\u0000_\t\u0001\u0000\u0000"+
		"\u0000`a\u0005\u0004\u0000\u0000ab\u00051\u0000\u0000bc\u0005\u0015\u0000"+
		"\u0000cd\u0005;\u0000\u0000d\u000b\u0001\u0000\u0000\u0000ef\u0005\u0005"+
		"\u0000\u0000fg\u00051\u0000\u0000gh\u0005\u0015\u0000\u0000hi\u0005;\u0000"+
		"\u0000i\r\u0001\u0000\u0000\u0000jk\u0005\u0006\u0000\u0000kl\u00059\u0000"+
		"\u0000lm\u0005\u0015\u0000\u0000mn\u0005;\u0000\u0000n\u000f\u0001\u0000"+
		"\u0000\u0000op\u0005\u0007\u0000\u0000pq\u00051\u0000\u0000qr\u0005\u0015"+
		"\u0000\u0000rs\u0005;\u0000\u0000s\u0011\u0001\u0000\u0000\u0000tu\u0005"+
		"\b\u0000\u0000uv\u00051\u0000\u0000vw\u0005\u0015\u0000\u0000wx\u0005"+
		";\u0000\u0000x\u0013\u0001\u0000\u0000\u0000y{\u0005\t\u0000\u0000z|\u0005"+
		"1\u0000\u0000{z\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|}\u0001"+
		"\u0000\u0000\u0000}~\u0007\u0000\u0000\u0000~\u007f\u0005\u0015\u0000"+
		"\u0000\u007f\u0080\u0005;\u0000\u0000\u0080\u0015\u0001\u0000\u0000\u0000"+
		"\u0081\u0082\u0005\n\u0000\u0000\u0082\u0083\u00059\u0000\u0000\u0083"+
		"\u0084\u0005;\u0000\u0000\u0084\u0017\u0001\u0000\u0000\u0000\u0085\u0086"+
		"\u0005\u000b\u0000\u0000\u0086\u0087\u00059\u0000\u0000\u0087\u0088\u0005"+
		"\u0015\u0000\u0000\u0088\u0089\u0005;\u0000\u0000\u0089\u0019\u0001\u0000"+
		"\u0000\u0000\u008a\u008b\u0005\f\u0000\u0000\u008b\u008c\u0005\u0015\u0000"+
		"\u0000\u008c\u008d\u0005;\u0000\u0000\u008d\u001b\u0001\u0000\u0000\u0000"+
		"\u008e\u0090\u0005=\u0000\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u008f"+
		"\u0090\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091"+
		"\u0092\u0005\r\u0000\u0000\u0092\u001d\u0001\u0000\u0000\u0000\u0093\u0095"+
		"\u0005\u000e\u0000\u0000\u0094\u0096\u0005\u000f\u0000\u0000\u0095\u0094"+
		"\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0098"+
		"\u0001\u0000\u0000\u0000\u0097\u0099\u00032\u0019\u0000\u0098\u0097\u0001"+
		"\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u0098\u0001"+
		"\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u009d\u0001"+
		"\u0000\u0000\u0000\u009c\u009e\u0005\u0010\u0000\u0000\u009d\u009c\u0001"+
		"\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u009f\u0001"+
		"\u0000\u0000\u0000\u009f\u00b2\u0005\u0015\u0000\u0000\u00a0\u00a2\u0005"+
		"\u0012\u0000\u0000\u00a1\u00a3\u0005\u000f\u0000\u0000\u00a2\u00a1\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a5\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a6\u00032\u0019\u0000\u00a5\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00aa\u0001\u0000"+
		"\u0000\u0000\u00a9\u00ab\u0005\u0010\u0000\u0000\u00aa\u00a9\u0001\u0000"+
		"\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000"+
		"\u0000\u0000\u00ac\u00ad\u0005\u0015\u0000\u0000\u00ad\u00b1\u0001\u0000"+
		"\u0000\u0000\u00ae\u00af\u0005\u0011\u0000\u0000\u00af\u00b1\u0005\u0015"+
		"\u0000\u0000\u00b0\u00a0\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000"+
		"\u0000\u0000\u00b1\u00b4\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u001f\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005\u0013"+
		"\u0000\u0000\u00b6!\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005\u0014\u0000"+
		"\u0000\u00b8\u00b9\u00036\u001b\u0000\u00b9\u00ba\u0005\u0016\u0000\u0000"+
		"\u00ba#\u0001\u0000\u0000\u0000\u00bb\u00bd\u0003&\u0013\u0000\u00bc\u00be"+
		"\u0003(\u0014\u0000\u00bd\u00bc\u0001\u0000\u0000\u0000\u00bd\u00be\u0001"+
		"\u0000\u0000\u0000\u00be\u00c5\u0001\u0000\u0000\u0000\u00bf\u00c1\u0005"+
		"<\u0000\u0000\u00c0\u00c2\u00032\u0019\u0000\u00c1\u00c0\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c6\u0001\u0000\u0000"+
		"\u0000\u00c5\u00bf\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005;\u0000\u0000"+
		"\u00c8%\u0001\u0000\u0000\u0000\u00c9\u00cb\u0005\u0018\u0000\u0000\u00ca"+
		"\u00c9\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb"+
		"\u00ce\u0001\u0000\u0000\u0000\u00cc\u00cf\u00034\u001a\u0000\u00cd\u00cf"+
		"\u00050\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00ce\u00cd\u0001"+
		"\u0000\u0000\u0000\u00cf\u00d1\u0001\u0000\u0000\u0000\u00d0\u00d2\u0005"+
		"\u0017\u0000\u0000\u00d1\u00d0\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001"+
		"\u0000\u0000\u0000\u00d2\'\u0001\u0000\u0000\u0000\u00d3\u00d9\u0003."+
		"\u0017\u0000\u00d4\u00d9\u0003*\u0015\u0000\u00d5\u00d6\u0003.\u0017\u0000"+
		"\u00d6\u00d7\u0003*\u0015\u0000\u00d7\u00d9\u0001\u0000\u0000\u0000\u00d8"+
		"\u00d3\u0001\u0000\u0000\u0000\u00d8\u00d4\u0001\u0000\u0000\u0000\u00d8"+
		"\u00d5\u0001\u0000\u0000\u0000\u00d9)\u0001\u0000\u0000\u0000\u00da\u00db"+
		"\u0005\u0019\u0000\u0000\u00db+\u0001\u0000\u0000\u0000\u00dc\u00de\u0005"+
		"\u001c\u0000\u0000\u00dd\u00df\u0005\u001a\u0000\u0000\u00de\u00dd\u0001"+
		"\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e2\u0001"+
		"\u0000\u0000\u0000\u00e0\u00e2\u00053\u0000\u0000\u00e1\u00dc\u0001\u0000"+
		"\u0000\u0000\u00e1\u00e0\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005\u001b"+
		"\u0000\u0000\u00e4\u00e5\u0005\u001e\u0000\u0000\u00e5\u00e6\u0005\u0015"+
		"\u0000\u0000\u00e6\u00e7\u0005;\u0000\u0000\u00e7-\u0001\u0000\u0000\u0000"+
		"\u00e8\u00e9\u0005\u001d\u0000\u0000\u00e9/\u0001\u0000\u0000\u0000\u00ea"+
		"\u00ec\u00032\u0019\u0000\u00eb\u00ea\u0001\u0000\u0000\u0000\u00ec\u00ed"+
		"\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ed\u00ee"+
		"\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef\u00f3"+
		"\u0005 \u0000\u0000\u00f0\u00f2\u00032\u0019\u0000\u00f1\u00f0\u0001\u0000"+
		"\u0000\u0000\u00f2\u00f5\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000"+
		"\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4\u00f6\u0001\u0000"+
		"\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f6\u00fa\u0005!\u0000"+
		"\u0000\u00f7\u00f9\u00032\u0019\u0000\u00f8\u00f7\u0001\u0000\u0000\u0000"+
		"\u00f9\u00fc\u0001\u0000\u0000\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000"+
		"\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb\u00fd\u0001\u0000\u0000\u0000"+
		"\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fd\u00fe\u0005;\u0000\u0000\u00fe"+
		"1\u0001\u0000\u0000\u0000\u00ff\u010b\u0003\u001c\u000e\u0000\u0100\u010b"+
		"\u0005<\u0000\u0000\u0101\u010b\u0005,\u0000\u0000\u0102\u010b\u0005#"+
		"\u0000\u0000\u0103\u0105\u0005=\u0000\u0000\u0104\u0103\u0001\u0000\u0000"+
		"\u0000\u0104\u0105\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000"+
		"\u0000\u0106\u010b\u00050\u0000\u0000\u0107\u010b\u00059\u0000\u0000\u0108"+
		"\u010b\u0005*\u0000\u0000\u0109\u010b\u0005\"\u0000\u0000\u010a\u00ff"+
		"\u0001\u0000\u0000\u0000\u010a\u0100\u0001\u0000\u0000\u0000\u010a\u0101"+
		"\u0001\u0000\u0000\u0000\u010a\u0102\u0001\u0000\u0000\u0000\u010a\u0104"+
		"\u0001\u0000\u0000\u0000\u010a\u0107\u0001\u0000\u0000\u0000\u010a\u0108"+
		"\u0001\u0000\u0000\u0000\u010a\u0109\u0001\u0000\u0000\u0000\u010b3\u0001"+
		"\u0000\u0000\u0000\u010c\u010f\u0005.\u0000\u0000\u010d\u010f\u00038\u001c"+
		"\u0000\u010e\u010c\u0001\u0000\u0000\u0000\u010e\u010d\u0001\u0000\u0000"+
		"\u0000\u010f5\u0001\u0000\u0000\u0000\u0110\u0111\u0005\u000f\u0000\u0000"+
		"\u0111\u0112\u00050\u0000\u0000\u0112\u0113\u0005\u0010\u0000\u0000\u0113"+
		"7\u0001\u0000\u0000\u0000\u0114\u0119\u0005\u000f\u0000\u0000\u0115\u0117"+
		"\u00050\u0000\u0000\u0116\u0118\u0005\u0017\u0000\u0000\u0117\u0116\u0001"+
		"\u0000\u0000\u0000\u0117\u0118\u0001\u0000\u0000\u0000\u0118\u011a\u0001"+
		"\u0000\u0000\u0000\u0119\u0115\u0001\u0000\u0000\u0000\u011a\u011b\u0001"+
		"\u0000\u0000\u0000\u011b\u0119\u0001\u0000\u0000\u0000\u011b\u011c\u0001"+
		"\u0000\u0000\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011d\u011e\u0005"+
		"\u0010\u0000\u0000\u011e9\u0001\u0000\u0000\u0000\u011f\u0120\u0007\u0001"+
		"\u0000\u0000\u0120;\u0001\u0000\u0000\u0000\u001cP{\u008f\u0095\u009a"+
		"\u009d\u00a2\u00a7\u00aa\u00b0\u00b2\u00bd\u00c3\u00c5\u00ca\u00ce\u00d1"+
		"\u00d8\u00de\u00e1\u00ed\u00f3\u00fa\u0104\u010a\u010e\u0117\u011b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}