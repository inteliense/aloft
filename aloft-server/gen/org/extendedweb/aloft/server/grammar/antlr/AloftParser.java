// Generated from C:/Users/ryanfitzgerald/Development/aloft/aloft-server/src/main/java/org/extendedweb/aloft/server/grammar/antlr/Aloft.g4 by ANTLR 4.13.2
package org.extendedweb.aloft.server.grammar.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class AloftParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		QUERY_KEYWORD=1, AS_KEYWORD=2, CONSTRUCTOR_KEYWORD=3, CALLABLE_KEYWORD=4, 
		SOURCE_KEYWORD=5, MODULE_KEYWORD=6, THEME_KEYWORD=7, ELEMENT_KEYWORD=8, 
		COMPONENT_KEYWORD=9, ANIMATION_KEYWORD=10, ROUTES_KEYWORD=11, PAGE_KEYWORD=12, 
		MODEL_KEYWORD=13, PROJECT_KEYWORD=14, THROUGH_KEYWORD=15, DECIMALS=16, 
		DIGITS=17, HTML_ELEMENT=18, NAMED=19, NAMED_VAR=20, QUOTED_STRING=21, 
		ARRAY_TYPE_SUFFIX=22, UPDATE_TYPE=23, DOT_SEPARATOR=24, VOID_TYPE=25, 
		RETURN_KEYWORD=26, ISSET_KEYWORD=27, IF_KEYWORD=28, OPEN_PARENTHESES=29, 
		CLOSE_PARENTHESES=30, ELSE=31, ELSE_IF=32, COMMA=33, REQUIRED_FIELD=34, 
		VAR_MAGIC=35, VAR_TYPES=36, QUERY_SELECT_ALL=37, LOOP_name_declaration=38, 
		SWITCH_KEYWORD=39, SWITCH_CURLY_BLOCK=40, VARIABLE_ARGS=41, CONDITIONAL_IF=42, 
		CONDITIONAL_ELSE=43, OPERATORS=44, NULL_VALUE=45, EMPTY_PARENTHESIS=46, 
		GOTO_KEYWORD=47, THIS_KEYWORD=48, DOT=49, FILE_NAME=50, STATIC_ACCESS=51, 
		COLON=52, EQUALS=53, NOT=54, APPEND_ADD=55, APPEND_SUBTRACT=56, PATH_START=57, 
		OPEN_BRACKETS=58, CLOSE_BRACKETS=59, OPEN_BRACES=60, CLOSE_BRACES=61, 
		END_OF_FILE=62, QUOTES=63, STATEMENT_END=64, BC=65, LC=66, WS=67, NAMED_DOT=68;
	public static final int
		RULE_r = 0, RULE_syntax = 1, RULE_function_syntax = 2, RULE_component = 3, 
		RULE_element = 4, RULE_theme = 5, RULE_model = 6, RULE_routes = 7, RULE_routes_through = 8, 
		RULE_project = 9, RULE_page = 10, RULE_animation = 11, RULE_module = 12, 
		RULE_query = 13, RULE_source = 14, RULE_callable = 15, RULE_constructor = 16, 
		RULE_number = 17, RULE_path_with_var = 18, RULE_path_var = 19, RULE_path = 20, 
		RULE_array = 21, RULE_string = 22, RULE_param_values = 23, RULE_var_args = 24, 
		RULE_property = 25, RULE_return_value = 26, RULE_html_element = 27, RULE_component_tree = 28, 
		RULE_function = 29, RULE_function_declaration = 30, RULE_update = 31, 
		RULE_update_declaration = 32, RULE_function_call = 33, RULE_function_types = 34, 
		RULE_declare_variable = 35, RULE_assign_variable = 36, RULE_variable = 37, 
		RULE_var_names = 38, RULE_this = 39, RULE_any_var = 40, RULE_name_declaration = 41, 
		RULE_private_named = 42, RULE_private_named_multiple = 43, RULE_var_name_with_params = 44, 
		RULE_var_name = 45, RULE_expression = 46, RULE_expression_value = 47, 
		RULE_var_expression = 48, RULE_assignment = 49, RULE_return = 50, RULE_isset = 51, 
		RULE_empty_function = 52, RULE_if = 53, RULE_var_access = 54, RULE_required_field = 55, 
		RULE_static_field = 56, RULE_var_options = 57, RULE_var_type = 58, RULE_property_value = 59, 
		RULE_static_var = 60, RULE_return_property_value = 61, RULE_loop = 62, 
		RULE_switch_block = 63, RULE_curly_block = 64, RULE_function_curly_block = 65, 
		RULE_named_with_params_special = 66, RULE_vars_with_params_special = 67, 
		RULE_var_param = 68, RULE_named_switch = 69, RULE_enclosed_vars = 70, 
		RULE_goto = 71, RULE_file_name = 72;
	private static String[] makeRuleNames() {
		return new String[] {
			"r", "syntax", "function_syntax", "component", "element", "theme", "model", 
			"routes", "routes_through", "project", "page", "animation", "module", 
			"query", "source", "callable", "constructor", "number", "path_with_var", 
			"path_var", "path", "array", "string", "param_values", "var_args", "property", 
			"return_value", "html_element", "component_tree", "function", "function_declaration", 
			"update", "update_declaration", "function_call", "function_types", "declare_variable", 
			"assign_variable", "variable", "var_names", "this", "any_var", "name_declaration", 
			"private_named", "private_named_multiple", "var_name_with_params", "var_name", 
			"expression", "expression_value", "var_expression", "assignment", "return", 
			"isset", "empty_function", "if", "var_access", "required_field", "static_field", 
			"var_options", "var_type", "property_value", "static_var", "return_property_value", 
			"loop", "switch_block", "curly_block", "function_curly_block", "named_with_params_special", 
			"vars_with_params_special", "var_param", "named_switch", "enclosed_vars", 
			"goto", "file_name"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "'switch'", "'...'", "' ? '", "' : '", null, 
			null, null, null, null, null, null, "'::'", null, "'='", "'!'", "'++'", 
			"'--'", null, "'{'", "'}'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "QUERY_KEYWORD", "AS_KEYWORD", "CONSTRUCTOR_KEYWORD", "CALLABLE_KEYWORD", 
			"SOURCE_KEYWORD", "MODULE_KEYWORD", "THEME_KEYWORD", "ELEMENT_KEYWORD", 
			"COMPONENT_KEYWORD", "ANIMATION_KEYWORD", "ROUTES_KEYWORD", "PAGE_KEYWORD", 
			"MODEL_KEYWORD", "PROJECT_KEYWORD", "THROUGH_KEYWORD", "DECIMALS", "DIGITS", 
			"HTML_ELEMENT", "NAMED", "NAMED_VAR", "QUOTED_STRING", "ARRAY_TYPE_SUFFIX", 
			"UPDATE_TYPE", "DOT_SEPARATOR", "VOID_TYPE", "RETURN_KEYWORD", "ISSET_KEYWORD", 
			"IF_KEYWORD", "OPEN_PARENTHESES", "CLOSE_PARENTHESES", "ELSE", "ELSE_IF", 
			"COMMA", "REQUIRED_FIELD", "VAR_MAGIC", "VAR_TYPES", "QUERY_SELECT_ALL", 
			"LOOP_name_declaration", "SWITCH_KEYWORD", "SWITCH_CURLY_BLOCK", "VARIABLE_ARGS", 
			"CONDITIONAL_IF", "CONDITIONAL_ELSE", "OPERATORS", "NULL_VALUE", "EMPTY_PARENTHESIS", 
			"GOTO_KEYWORD", "THIS_KEYWORD", "DOT", "FILE_NAME", "STATIC_ACCESS", 
			"COLON", "EQUALS", "NOT", "APPEND_ADD", "APPEND_SUBTRACT", "PATH_START", 
			"OPEN_BRACKETS", "CLOSE_BRACKETS", "OPEN_BRACES", "CLOSE_BRACES", "END_OF_FILE", 
			"QUOTES", "STATEMENT_END", "BC", "LC", "WS", "NAMED_DOT"
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
		public TerminalNode EOF() { return getToken(AloftParser.EOF, 0); }
		public List<SyntaxContext> syntax() {
			return getRuleContexts(SyntaxContext.class);
		}
		public SyntaxContext syntax(int i) {
			return getRuleContext(SyntaxContext.class,i);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RContext r() throws RecognitionException {
		RContext _localctx = new RContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_r);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(146);
				syntax();
				}
				}
				setState(149); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2252160633438194L) != 0) );
			setState(151);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SyntaxContext extends ParserRuleContext {
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public UpdateContext update() {
			return getRuleContext(UpdateContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SourceContext source() {
			return getRuleContext(SourceContext.class,0);
		}
		public ComponentContext component() {
			return getRuleContext(ComponentContext.class,0);
		}
		public ProjectContext project() {
			return getRuleContext(ProjectContext.class,0);
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
		public RoutesContext routes() {
			return getRuleContext(RoutesContext.class,0);
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
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public Declare_variableContext declare_variable() {
			return getRuleContext(Declare_variableContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitSyntax(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SyntaxContext syntax() throws RecognitionException {
		SyntaxContext _localctx = new SyntaxContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_syntax);
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				loop();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				function();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(155);
				update();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(156);
				query();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(157);
				source();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(158);
				component();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(159);
				project();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(160);
				element();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(161);
				model();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(162);
				theme();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(163);
				callable();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(164);
				routes();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(165);
				page();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(166);
				animation();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(167);
				module();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(168);
				property();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(169);
				declare_variable();
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
	public static class Function_syntaxContext extends ParserRuleContext {
		public Switch_blockContext switch_block() {
			return getRuleContext(Switch_blockContext.class,0);
		}
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
		}
		public Assign_variableContext assign_variable() {
			return getRuleContext(Assign_variableContext.class,0);
		}
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public ReturnContext return_() {
			return getRuleContext(ReturnContext.class,0);
		}
		public Declare_variableContext declare_variable() {
			return getRuleContext(Declare_variableContext.class,0);
		}
		public Function_syntaxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_syntax; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterFunction_syntax(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitFunction_syntax(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitFunction_syntax(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_syntaxContext function_syntax() throws RecognitionException {
		Function_syntaxContext _localctx = new Function_syntaxContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function_syntax);
		try {
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				switch_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				if_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(174);
				assign_variable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(175);
				constructor();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(176);
				function_call();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(177);
				return_();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(178);
				declare_variable();
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
	public static class ComponentContext extends ParserRuleContext {
		public TerminalNode COMPONENT_KEYWORD() { return getToken(AloftParser.COMPONENT_KEYWORD, 0); }
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public Curly_blockContext curly_block() {
			return getRuleContext(Curly_blockContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentContext component() throws RecognitionException {
		ComponentContext _localctx = new ComponentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_component);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(COMPONENT_KEYWORD);
			setState(182);
			var_name();
			setState(183);
			curly_block();
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
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public Curly_blockContext curly_block() {
			return getRuleContext(Curly_blockContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(ELEMENT_KEYWORD);
			setState(186);
			var_name();
			setState(187);
			curly_block();
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
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public Curly_blockContext curly_block() {
			return getRuleContext(Curly_blockContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitTheme(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThemeContext theme() throws RecognitionException {
		ThemeContext _localctx = new ThemeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_theme);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(THEME_KEYWORD);
			setState(190);
			var_name();
			setState(191);
			curly_block();
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
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public Curly_blockContext curly_block() {
			return getRuleContext(Curly_blockContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitModel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModelContext model() throws RecognitionException {
		ModelContext _localctx = new ModelContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_model);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(MODEL_KEYWORD);
			setState(194);
			var_name();
			setState(195);
			curly_block();
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
	public static class RoutesContext extends ParserRuleContext {
		public TerminalNode ROUTES_KEYWORD() { return getToken(AloftParser.ROUTES_KEYWORD, 0); }
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public Curly_blockContext curly_block() {
			return getRuleContext(Curly_blockContext.class,0);
		}
		public RoutesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterRoutes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitRoutes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitRoutes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoutesContext routes() throws RecognitionException {
		RoutesContext _localctx = new RoutesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_routes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(ROUTES_KEYWORD);
			setState(198);
			var_name();
			setState(199);
			curly_block();
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
	public static class Routes_throughContext extends ParserRuleContext {
		public TerminalNode ROUTES_KEYWORD() { return getToken(AloftParser.ROUTES_KEYWORD, 0); }
		public List<Var_nameContext> var_name() {
			return getRuleContexts(Var_nameContext.class);
		}
		public Var_nameContext var_name(int i) {
			return getRuleContext(Var_nameContext.class,i);
		}
		public Curly_blockContext curly_block() {
			return getRuleContext(Curly_blockContext.class,0);
		}
		public TerminalNode THROUGH_KEYWORD() { return getToken(AloftParser.THROUGH_KEYWORD, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AloftParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AloftParser.COMMA, i);
		}
		public Routes_throughContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routes_through; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterRoutes_through(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitRoutes_through(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitRoutes_through(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Routes_throughContext routes_through() throws RecognitionException {
		Routes_throughContext _localctx = new Routes_throughContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_routes_through);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(ROUTES_KEYWORD);
			setState(202);
			var_name();
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROUGH_KEYWORD) {
				{
				setState(203);
				match(THROUGH_KEYWORD);
				{
				setState(204);
				var_name();
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(207); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(205);
						match(COMMA);
						setState(206);
						var_name();
						}
						}
						setState(209); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==COMMA );
					}
				}

				}
				}
			}

			setState(215);
			curly_block();
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
	public static class ProjectContext extends ParserRuleContext {
		public TerminalNode PROJECT_KEYWORD() { return getToken(AloftParser.PROJECT_KEYWORD, 0); }
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public Curly_blockContext curly_block() {
			return getRuleContext(Curly_blockContext.class,0);
		}
		public ProjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_project; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterProject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitProject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitProject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProjectContext project() throws RecognitionException {
		ProjectContext _localctx = new ProjectContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_project);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(PROJECT_KEYWORD);
			setState(218);
			var_name();
			setState(219);
			curly_block();
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
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public Curly_blockContext curly_block() {
			return getRuleContext(Curly_blockContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitPage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PageContext page() throws RecognitionException {
		PageContext _localctx = new PageContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_page);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(PAGE_KEYWORD);
			setState(222);
			var_name();
			setState(223);
			curly_block();
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
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public Curly_blockContext curly_block() {
			return getRuleContext(Curly_blockContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitAnimation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnimationContext animation() throws RecognitionException {
		AnimationContext _localctx = new AnimationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_animation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(ANIMATION_KEYWORD);
			setState(226);
			var_name();
			setState(227);
			curly_block();
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
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitModule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleContext module() throws RecognitionException {
		ModuleContext _localctx = new ModuleContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_module);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(MODULE_KEYWORD);
			setState(230);
			var_name();
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATEMENT_END) {
				{
				setState(231);
				match(STATEMENT_END);
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
	public static class QueryContext extends ParserRuleContext {
		public TerminalNode QUERY_KEYWORD() { return getToken(AloftParser.QUERY_KEYWORD, 0); }
		public Var_name_with_paramsContext var_name_with_params() {
			return getRuleContext(Var_name_with_paramsContext.class,0);
		}
		public Curly_blockContext curly_block() {
			return getRuleContext(Curly_blockContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(QUERY_KEYWORD);
			setState(235);
			var_name_with_params();
			setState(236);
			curly_block();
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
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitSource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceContext source() throws RecognitionException {
		SourceContext _localctx = new SourceContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_source);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(SOURCE_KEYWORD);
			setState(239);
			path();
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATEMENT_END) {
				{
				setState(240);
				match(STATEMENT_END);
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
	public static class CallableContext extends ParserRuleContext {
		public TerminalNode CALLABLE_KEYWORD() { return getToken(AloftParser.CALLABLE_KEYWORD, 0); }
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public Curly_blockContext curly_block() {
			return getRuleContext(Curly_blockContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitCallable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallableContext callable() throws RecognitionException {
		CallableContext _localctx = new CallableContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_callable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(CALLABLE_KEYWORD);
			setState(244);
			path();
			setState(245);
			curly_block();
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
		public List<Var_nameContext> var_name() {
			return getRuleContexts(Var_nameContext.class);
		}
		public Var_nameContext var_name(int i) {
			return getRuleContext(Var_nameContext.class,i);
		}
		public Var_name_with_paramsContext var_name_with_params() {
			return getRuleContext(Var_name_with_paramsContext.class,0);
		}
		public TerminalNode AS_KEYWORD() { return getToken(AloftParser.AS_KEYWORD, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(CONSTRUCTOR_KEYWORD);
			setState(248);
			var_name();
			setState(249);
			var_name_with_params();
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS_KEYWORD) {
				{
				setState(250);
				match(AS_KEYWORD);
				setState(251);
				var_name();
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
	public static class NumberContext extends ParserRuleContext {
		public TerminalNode DIGITS() { return getToken(AloftParser.DIGITS, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(DIGITS);
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
	public static class Path_with_varContext extends ParserRuleContext {
		public File_nameContext file_name() {
			return getRuleContext(File_nameContext.class,0);
		}
		public Path_varContext path_var() {
			return getRuleContext(Path_varContext.class,0);
		}
		public Path_with_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path_with_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterPath_with_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitPath_with_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitPath_with_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Path_with_varContext path_with_var() throws RecognitionException {
		Path_with_varContext _localctx = new Path_with_varContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_path_with_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			file_name();
			setState(257);
			path_var();
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
	public static class Path_varContext extends ParserRuleContext {
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public TerminalNode OPEN_BRACKETS() { return getToken(AloftParser.OPEN_BRACKETS, 0); }
		public TerminalNode CLOSE_BRACKETS() { return getToken(AloftParser.CLOSE_BRACKETS, 0); }
		public Path_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterPath_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitPath_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitPath_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Path_varContext path_var() throws RecognitionException {
		Path_varContext _localctx = new Path_varContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_path_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(259);
			match(OPEN_BRACKETS);
			}
			setState(260);
			var_name();
			{
			setState(261);
			match(CLOSE_BRACKETS);
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
	public static class PathContext extends ParserRuleContext {
		public Path_with_varContext path_with_var() {
			return getRuleContext(Path_with_varContext.class,0);
		}
		public File_nameContext file_name() {
			return getRuleContext(File_nameContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_path);
		try {
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				path_with_var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				file_name();
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
	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACES() { return getToken(AloftParser.OPEN_BRACES, 0); }
		public TerminalNode CLOSE_BRACES() { return getToken(AloftParser.CLOSE_BRACES, 0); }
		public List<Property_valueContext> property_value() {
			return getRuleContexts(Property_valueContext.class);
		}
		public Property_valueContext property_value(int i) {
			return getRuleContext(Property_valueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AloftParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AloftParser.COMMA, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(OPEN_BRACES);
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1172378600486076416L) != 0)) {
				{
				setState(272); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(268);
					property_value();
					setState(270);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(269);
						match(COMMA);
						}
					}

					}
					}
					setState(274); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1172378600486076416L) != 0) );
				}
			}

			setState(278);
			match(CLOSE_BRACES);
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
	public static class StringContext extends ParserRuleContext {
		public TerminalNode QUOTED_STRING() { return getToken(AloftParser.QUOTED_STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(QUOTED_STRING);
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
	public static class Param_valuesContext extends ParserRuleContext {
		public TerminalNode EMPTY_PARENTHESIS() { return getToken(AloftParser.EMPTY_PARENTHESIS, 0); }
		public Vars_with_params_specialContext vars_with_params_special() {
			return getRuleContext(Vars_with_params_specialContext.class,0);
		}
		public Param_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterParam_values(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitParam_values(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitParam_values(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_valuesContext param_values() throws RecognitionException {
		Param_valuesContext _localctx = new Param_valuesContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_param_values);
		try {
			setState(284);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EMPTY_PARENTHESIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				match(EMPTY_PARENTHESIS);
				}
				break;
			case OPEN_PARENTHESES:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				vars_with_params_special();
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
	public static class Var_argsContext extends ParserRuleContext {
		public TerminalNode EMPTY_PARENTHESIS() { return getToken(AloftParser.EMPTY_PARENTHESIS, 0); }
		public Named_with_params_specialContext named_with_params_special() {
			return getRuleContext(Named_with_params_specialContext.class,0);
		}
		public Var_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterVar_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitVar_args(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitVar_args(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_argsContext var_args() throws RecognitionException {
		Var_argsContext _localctx = new Var_argsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_var_args);
		try {
			setState(288);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EMPTY_PARENTHESIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				match(EMPTY_PARENTHESIS);
				}
				break;
			case OPEN_PARENTHESES:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				named_with_params_special();
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
	public static class PropertyContext extends ParserRuleContext {
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AloftParser.COLON, 0); }
		public Property_valueContext property_value() {
			return getRuleContext(Property_valueContext.class,0);
		}
		public TerminalNode STATEMENT_END() { return getToken(AloftParser.STATEMENT_END, 0); }
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_property);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			var_name();
			setState(291);
			match(COLON);
			{
			setState(292);
			property_value();
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATEMENT_END) {
				{
				setState(293);
				match(STATEMENT_END);
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
	public static class Return_valueContext extends ParserRuleContext {
		public Return_property_valueContext return_property_value() {
			return getRuleContext(Return_property_valueContext.class,0);
		}
		public TerminalNode OPEN_BRACES() { return getToken(AloftParser.OPEN_BRACES, 0); }
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public TerminalNode CLOSE_BRACES() { return getToken(AloftParser.CLOSE_BRACES, 0); }
		public Return_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterReturn_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitReturn_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitReturn_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_valueContext return_value() throws RecognitionException {
		Return_valueContext _localctx = new Return_valueContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_return_value);
		try {
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				return_property_value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
				match(OPEN_BRACES);
				setState(298);
				property();
				setState(299);
				match(CLOSE_BRACES);
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
	public static class Html_elementContext extends ParserRuleContext {
		public TerminalNode HTML_ELEMENT() { return getToken(AloftParser.HTML_ELEMENT, 0); }
		public Html_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_html_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterHtml_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitHtml_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitHtml_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Html_elementContext html_element() throws RecognitionException {
		Html_elementContext _localctx = new Html_elementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_html_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(HTML_ELEMENT);
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
	public static class Component_treeContext extends ParserRuleContext {
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public TerminalNode OPEN_PARENTHESES() { return getToken(AloftParser.OPEN_PARENTHESES, 0); }
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public TerminalNode CLOSE_PARENTHESES() { return getToken(AloftParser.CLOSE_PARENTHESES, 0); }
		public Html_elementContext html_element() {
			return getRuleContext(Html_elementContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(AloftParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AloftParser.COMMA, i);
		}
		public Component_treeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component_tree; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterComponent_tree(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitComponent_tree(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitComponent_tree(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Component_treeContext component_tree() throws RecognitionException {
		Component_treeContext _localctx = new Component_treeContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_component_tree);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			var_name();
			setState(306);
			match(OPEN_PARENTHESES);
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HTML_ELEMENT) {
				{
				setState(307);
				html_element();
				setState(308);
				match(COMMA);
				}
			}

			setState(312);
			property();
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(315); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(313);
					match(COMMA);
					setState(314);
					property();
					}
					}
					setState(317); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				}
			}

			setState(321);
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
	public static class FunctionContext extends ParserRuleContext {
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public Function_curly_blockContext function_curly_block() {
			return getRuleContext(Function_curly_blockContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			function_declaration();
			setState(324);
			function_curly_block();
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
	public static class Function_declarationContext extends ParserRuleContext {
		public Function_typesContext function_types() {
			return getRuleContext(Function_typesContext.class,0);
		}
		public Name_declarationContext name_declaration() {
			return getRuleContext(Name_declarationContext.class,0);
		}
		public Var_argsContext var_args() {
			return getRuleContext(Var_argsContext.class,0);
		}
		public TerminalNode ARRAY_TYPE_SUFFIX() { return getToken(AloftParser.ARRAY_TYPE_SUFFIX, 0); }
		public TerminalNode STATIC_ACCESS() { return getToken(AloftParser.STATIC_ACCESS, 0); }
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterFunction_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitFunction_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitFunction_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(326);
			function_types();
			}
			setState(333);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ARRAY_TYPE_SUFFIX) {
					{
					setState(327);
					match(ARRAY_TYPE_SUFFIX);
					}
				}

				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATIC_ACCESS) {
					{
					setState(330);
					match(STATIC_ACCESS);
					}
				}

				}
				break;
			}
			{
			setState(335);
			name_declaration();
			setState(336);
			var_args();
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
	public static class UpdateContext extends ParserRuleContext {
		public Update_declarationContext update_declaration() {
			return getRuleContext(Update_declarationContext.class,0);
		}
		public Function_curly_blockContext function_curly_block() {
			return getRuleContext(Function_curly_blockContext.class,0);
		}
		public UpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateContext update() throws RecognitionException {
		UpdateContext _localctx = new UpdateContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_update);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			update_declaration();
			setState(339);
			function_curly_block();
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
	public static class Update_declarationContext extends ParserRuleContext {
		public TerminalNode UPDATE_TYPE() { return getToken(AloftParser.UPDATE_TYPE, 0); }
		public Name_declarationContext name_declaration() {
			return getRuleContext(Name_declarationContext.class,0);
		}
		public Var_argsContext var_args() {
			return getRuleContext(Var_argsContext.class,0);
		}
		public Update_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterUpdate_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitUpdate_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitUpdate_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_declarationContext update_declaration() throws RecognitionException {
		Update_declarationContext _localctx = new Update_declarationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_update_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(341);
			match(UPDATE_TYPE);
			}
			{
			setState(342);
			name_declaration();
			setState(343);
			var_args();
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
	public static class Function_callContext extends ParserRuleContext {
		public Param_valuesContext param_values() {
			return getRuleContext(Param_valuesContext.class,0);
		}
		public List<Any_varContext> any_var() {
			return getRuleContexts(Any_varContext.class);
		}
		public Any_varContext any_var(int i) {
			return getRuleContext(Any_varContext.class,i);
		}
		public List<TerminalNode> DOT_SEPARATOR() { return getTokens(AloftParser.DOT_SEPARATOR); }
		public TerminalNode DOT_SEPARATOR(int i) {
			return getToken(AloftParser.DOT_SEPARATOR, i);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(345);
			any_var();
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT_SEPARATOR) {
				{
				setState(348); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					{
					setState(346);
					match(DOT_SEPARATOR);
					}
					setState(347);
					any_var();
					}
					}
					setState(350); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DOT_SEPARATOR );
				}
			}

			}
			setState(354);
			param_values();
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
	public static class Function_typesContext extends ParserRuleContext {
		public TerminalNode VOID_TYPE() { return getToken(AloftParser.VOID_TYPE, 0); }
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public Function_typesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterFunction_types(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitFunction_types(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitFunction_types(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_typesContext function_types() throws RecognitionException {
		Function_typesContext _localctx = new Function_typesContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_function_types);
		try {
			setState(358);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(356);
				match(VOID_TYPE);
				}
				break;
			case NAMED:
			case VAR_TYPES:
				enterOuterAlt(_localctx, 2);
				{
				setState(357);
				var_type();
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
	public static class Declare_variableContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode STATEMENT_END() { return getToken(AloftParser.STATEMENT_END, 0); }
		public Var_optionsContext var_options() {
			return getRuleContext(Var_optionsContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Var_expressionContext var_expression() {
			return getRuleContext(Var_expressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitDeclare_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_variableContext declare_variable() throws RecognitionException {
		Declare_variableContext _localctx = new Declare_variableContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_declare_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			{
			setState(360);
			variable();
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR_MAGIC) {
				{
				setState(361);
				var_options();
				}
			}

			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPERATORS) {
				{
				setState(364);
				assignment();
				setState(367);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(365);
					var_expression();
					}
					break;
				case 2:
					{
					setState(366);
					expression();
					}
					break;
				}
				}
			}

			}
			}
			{
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATEMENT_END) {
				{
				setState(371);
				match(STATEMENT_END);
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
	public static class Assign_variableContext extends ParserRuleContext {
		public Expression_valueContext expression_value() {
			return getRuleContext(Expression_valueContext.class,0);
		}
		public Assign_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterAssign_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitAssign_variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitAssign_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_variableContext assign_variable() throws RecognitionException {
		Assign_variableContext _localctx = new Assign_variableContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_assign_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			expression_value();
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
		public Private_named_multipleContext private_named_multiple() {
			return getRuleContext(Private_named_multipleContext.class,0);
		}
		public Var_namesContext var_names() {
			return getRuleContext(Var_namesContext.class,0);
		}
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public Var_accessContext var_access() {
			return getRuleContext(Var_accessContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(376);
				private_named_multiple();
				}
				break;
			case 2:
				{
				setState(378);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==REQUIRED_FIELD || _la==STATIC_ACCESS) {
					{
					setState(377);
					var_access();
					}
				}

				setState(380);
				var_names();
				}
				break;
			}
			setState(384);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(383);
				var_type();
				}
				break;
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
	public static class Var_namesContext extends ParserRuleContext {
		public List<Var_nameContext> var_name() {
			return getRuleContexts(Var_nameContext.class);
		}
		public Var_nameContext var_name(int i) {
			return getRuleContext(Var_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AloftParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AloftParser.COMMA, i);
		}
		public Var_namesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_names; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterVar_names(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitVar_names(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitVar_names(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_namesContext var_names() throws RecognitionException {
		Var_namesContext _localctx = new Var_namesContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_var_names);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(386);
			var_name();
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(389); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(387);
					match(COMMA);
					setState(388);
					var_name();
					}
					}
					setState(391); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
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
	public static class ThisContext extends ParserRuleContext {
		public TerminalNode THIS_KEYWORD() { return getToken(AloftParser.THIS_KEYWORD, 0); }
		public ThisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_this; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterThis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitThis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitThis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThisContext this_() throws RecognitionException {
		ThisContext _localctx = new ThisContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_this);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			match(THIS_KEYWORD);
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
	public static class Any_varContext extends ParserRuleContext {
		public TerminalNode NAMED_VAR() { return getToken(AloftParser.NAMED_VAR, 0); }
		public TerminalNode NAMED() { return getToken(AloftParser.NAMED, 0); }
		public ThisContext this_() {
			return getRuleContext(ThisContext.class,0);
		}
		public Any_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterAny_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitAny_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitAny_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_varContext any_var() throws RecognitionException {
		Any_varContext _localctx = new Any_varContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_any_var);
		int _la;
		try {
			setState(407);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(397);
				match(NAMED_VAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(398);
				match(NAMED);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THIS_KEYWORD) {
					{
					setState(399);
					this_();
					}
				}

				setState(402);
				match(NAMED);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THIS_KEYWORD) {
					{
					setState(403);
					this_();
					}
				}

				setState(406);
				match(NAMED_VAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Name_declarationContext extends ParserRuleContext {
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public Private_namedContext private_named() {
			return getRuleContext(Private_namedContext.class,0);
		}
		public Name_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterName_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitName_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitName_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Name_declarationContext name_declaration() throws RecognitionException {
		Name_declarationContext _localctx = new Name_declarationContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_name_declaration);
		try {
			setState(411);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAMED:
				enterOuterAlt(_localctx, 1);
				{
				setState(409);
				var_name();
				}
				break;
			case OPEN_PARENTHESES:
				enterOuterAlt(_localctx, 2);
				{
				setState(410);
				private_named();
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
	public static class Private_namedContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENTHESES() { return getToken(AloftParser.OPEN_PARENTHESES, 0); }
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public TerminalNode CLOSE_PARENTHESES() { return getToken(AloftParser.CLOSE_PARENTHESES, 0); }
		public Private_namedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_private_named; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterPrivate_named(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitPrivate_named(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitPrivate_named(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Private_namedContext private_named() throws RecognitionException {
		Private_namedContext _localctx = new Private_namedContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_private_named);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			match(OPEN_PARENTHESES);
			setState(414);
			var_name();
			setState(415);
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
	public static class Private_named_multipleContext extends ParserRuleContext {
		public Var_accessContext var_access() {
			return getRuleContext(Var_accessContext.class,0);
		}
		public TerminalNode OPEN_PARENTHESES() { return getToken(AloftParser.OPEN_PARENTHESES, 0); }
		public Var_namesContext var_names() {
			return getRuleContext(Var_namesContext.class,0);
		}
		public TerminalNode CLOSE_PARENTHESES() { return getToken(AloftParser.CLOSE_PARENTHESES, 0); }
		public Private_named_multipleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_private_named_multiple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterPrivate_named_multiple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitPrivate_named_multiple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitPrivate_named_multiple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Private_named_multipleContext private_named_multiple() throws RecognitionException {
		Private_named_multipleContext _localctx = new Private_named_multipleContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_private_named_multiple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			var_access();
			setState(418);
			match(OPEN_PARENTHESES);
			setState(419);
			var_names();
			setState(420);
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
	public static class Var_name_with_paramsContext extends ParserRuleContext {
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public Param_valuesContext param_values() {
			return getRuleContext(Param_valuesContext.class,0);
		}
		public Var_name_with_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_name_with_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterVar_name_with_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitVar_name_with_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitVar_name_with_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_name_with_paramsContext var_name_with_params() throws RecognitionException {
		Var_name_with_paramsContext _localctx = new Var_name_with_paramsContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_var_name_with_params);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			var_name();
			setState(423);
			param_values();
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
	public static class Var_nameContext extends ParserRuleContext {
		public TerminalNode NAMED() { return getToken(AloftParser.NAMED, 0); }
		public Var_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterVar_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitVar_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitVar_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_nameContext var_name() throws RecognitionException {
		Var_nameContext _localctx = new Var_nameContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_var_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
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
	public static class ExpressionContext extends ParserRuleContext {
		public List<Expression_valueContext> expression_value() {
			return getRuleContexts(Expression_valueContext.class);
		}
		public Expression_valueContext expression_value(int i) {
			return getRuleContext(Expression_valueContext.class,i);
		}
		public TerminalNode OPEN_PARENTHESES() { return getToken(AloftParser.OPEN_PARENTHESES, 0); }
		public TerminalNode CLOSE_PARENTHESES() { return getToken(AloftParser.CLOSE_PARENTHESES, 0); }
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_expression);
		int _la;
		try {
			setState(444);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(428);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PARENTHESES) {
					{
					setState(427);
					match(OPEN_PARENTHESES);
					}
				}

				{
				setState(430);
				expression_value();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(431);
				expression_value();
				setState(439);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPERATORS) {
					{
					setState(435); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						{
						setState(432);
						assignment();
						}
						setState(433);
						expression_value();
						}
						}
						setState(437); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==OPERATORS );
					}
				}

				setState(442);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(441);
					match(CLOSE_PARENTHESES);
					}
					break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class Expression_valueContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public List<Var_expressionContext> var_expression() {
			return getRuleContexts(Var_expressionContext.class);
		}
		public Var_expressionContext var_expression(int i) {
			return getRuleContext(Var_expressionContext.class,i);
		}
		public Expression_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterExpression_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitExpression_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitExpression_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_valueContext expression_value() throws RecognitionException {
		Expression_valueContext _localctx = new Expression_valueContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_expression_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(446);
			var_expression();
			}
			setState(447);
			assignment();
			{
			setState(448);
			var_expression();
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
	public static class Var_expressionContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public IssetContext isset() {
			return getRuleContext(IssetContext.class,0);
		}
		public Any_varContext any_var() {
			return getRuleContext(Any_varContext.class,0);
		}
		public TerminalNode NULL_VALUE() { return getToken(AloftParser.NULL_VALUE, 0); }
		public TerminalNode NOT() { return getToken(AloftParser.NOT, 0); }
		public Var_name_with_paramsContext var_name_with_params() {
			return getRuleContext(Var_name_with_paramsContext.class,0);
		}
		public Var_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterVar_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitVar_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitVar_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_expressionContext var_expression() throws RecognitionException {
		Var_expressionContext _localctx = new Var_expressionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_var_expression);
		int _la;
		try {
			setState(465);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGITS:
				enterOuterAlt(_localctx, 1);
				{
				setState(450);
				number();
				}
				break;
			case QUOTED_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(451);
				string();
				}
				break;
			case FILE_NAME:
				enterOuterAlt(_localctx, 3);
				{
				setState(452);
				path();
				}
				break;
			case NAMED:
			case NAMED_VAR:
			case ISSET_KEYWORD:
			case NULL_VALUE:
			case THIS_KEYWORD:
			case NOT:
				enterOuterAlt(_localctx, 4);
				{
				setState(463);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					{
					{
					setState(454);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NOT) {
						{
						setState(453);
						match(NOT);
						}
					}

					{
					setState(456);
					var_name_with_params();
					}
					}
					}
					}
					break;
				case 2:
					{
					setState(457);
					isset();
					}
					break;
				case 3:
					{
					{
					setState(459);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NOT) {
						{
						setState(458);
						match(NOT);
						}
					}

					setState(461);
					match(NULL_VALUE);
					}
					}
					break;
				case 4:
					{
					setState(462);
					any_var();
					}
					break;
				}
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
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode OPERATORS() { return getToken(AloftParser.OPERATORS, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			match(OPERATORS);
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
	public static class ReturnContext extends ParserRuleContext {
		public TerminalNode RETURN_KEYWORD() { return getToken(AloftParser.RETURN_KEYWORD, 0); }
		public TerminalNode WS() { return getToken(AloftParser.WS, 0); }
		public Return_valueContext return_value() {
			return getRuleContext(Return_valueContext.class,0);
		}
		public ReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnContext return_() throws RecognitionException {
		ReturnContext _localctx = new ReturnContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			match(RETURN_KEYWORD);
			{
			setState(470);
			match(WS);
			setState(472);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(471);
				return_value();
				}
				break;
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
	public static class IssetContext extends ParserRuleContext {
		public TerminalNode ISSET_KEYWORD() { return getToken(AloftParser.ISSET_KEYWORD, 0); }
		public Empty_functionContext empty_function() {
			return getRuleContext(Empty_functionContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitIsset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IssetContext isset() throws RecognitionException {
		IssetContext _localctx = new IssetContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_isset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(474);
				match(NOT);
				}
				break;
			}
			setState(479);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(477);
				match(ISSET_KEYWORD);
				}
				break;
			case 2:
				{
				setState(478);
				empty_function();
				}
				break;
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
	public static class Empty_functionContext extends ParserRuleContext {
		public TerminalNode ISSET_KEYWORD() { return getToken(AloftParser.ISSET_KEYWORD, 0); }
		public TerminalNode OPEN_PARENTHESES() { return getToken(AloftParser.OPEN_PARENTHESES, 0); }
		public Any_varContext any_var() {
			return getRuleContext(Any_varContext.class,0);
		}
		public TerminalNode CLOSE_PARENTHESES() { return getToken(AloftParser.CLOSE_PARENTHESES, 0); }
		public TerminalNode NOT() { return getToken(AloftParser.NOT, 0); }
		public Empty_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_empty_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterEmpty_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitEmpty_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitEmpty_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Empty_functionContext empty_function() throws RecognitionException {
		Empty_functionContext _localctx = new Empty_functionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_empty_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(481);
				match(NOT);
				}
			}

			setState(484);
			match(ISSET_KEYWORD);
			{
			setState(485);
			match(OPEN_PARENTHESES);
			setState(486);
			any_var();
			setState(487);
			match(CLOSE_PARENTHESES);
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
	public static class IfContext extends ParserRuleContext {
		public TerminalNode IF_KEYWORD() { return getToken(AloftParser.IF_KEYWORD, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<Curly_blockContext> curly_block() {
			return getRuleContexts(Curly_blockContext.class);
		}
		public Curly_blockContext curly_block(int i) {
			return getRuleContext(Curly_blockContext.class,i);
		}
		public List<TerminalNode> ELSE_IF() { return getTokens(AloftParser.ELSE_IF); }
		public TerminalNode ELSE_IF(int i) {
			return getToken(AloftParser.ELSE_IF, i);
		}
		public List<TerminalNode> ELSE() { return getTokens(AloftParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(AloftParser.ELSE, i);
		}
		public List<TerminalNode> OPEN_PARENTHESES() { return getTokens(AloftParser.OPEN_PARENTHESES); }
		public TerminalNode OPEN_PARENTHESES(int i) {
			return getToken(AloftParser.OPEN_PARENTHESES, i);
		}
		public List<Var_expressionContext> var_expression() {
			return getRuleContexts(Var_expressionContext.class);
		}
		public Var_expressionContext var_expression(int i) {
			return getRuleContext(Var_expressionContext.class,i);
		}
		public List<TerminalNode> CLOSE_PARENTHESES() { return getTokens(AloftParser.CLOSE_PARENTHESES); }
		public TerminalNode CLOSE_PARENTHESES(int i) {
			return getToken(AloftParser.CLOSE_PARENTHESES, i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfContext if_() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			match(IF_KEYWORD);
			setState(490);
			expression();
			setState(491);
			curly_block();
			setState(510);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE || _la==ELSE_IF) {
				{
				setState(508);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ELSE_IF:
					{
					{
					setState(492);
					match(ELSE_IF);
					{
					setState(494);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OPEN_PARENTHESES) {
						{
						setState(493);
						match(OPEN_PARENTHESES);
						}
					}

					setState(497); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(496);
						var_expression();
						}
						}
						setState(499); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 19456957903142912L) != 0) );
					setState(502);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==CLOSE_PARENTHESES) {
						{
						setState(501);
						match(CLOSE_PARENTHESES);
						}
					}

					setState(504);
					curly_block();
					}
					}
					}
					break;
				case ELSE:
					{
					{
					setState(506);
					match(ELSE);
					setState(507);
					curly_block();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(512);
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
	public static class Var_accessContext extends ParserRuleContext {
		public Required_fieldContext required_field() {
			return getRuleContext(Required_fieldContext.class,0);
		}
		public Static_fieldContext static_field() {
			return getRuleContext(Static_fieldContext.class,0);
		}
		public Var_accessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_access; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterVar_access(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitVar_access(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitVar_access(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_accessContext var_access() throws RecognitionException {
		Var_accessContext _localctx = new Var_accessContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_var_access);
		try {
			setState(515);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REQUIRED_FIELD:
				enterOuterAlt(_localctx, 1);
				{
				setState(513);
				required_field();
				}
				break;
			case STATIC_ACCESS:
				enterOuterAlt(_localctx, 2);
				{
				setState(514);
				static_field();
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
	public static class Required_fieldContext extends ParserRuleContext {
		public TerminalNode REQUIRED_FIELD() { return getToken(AloftParser.REQUIRED_FIELD, 0); }
		public Required_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_required_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterRequired_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitRequired_field(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitRequired_field(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Required_fieldContext required_field() throws RecognitionException {
		Required_fieldContext _localctx = new Required_fieldContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_required_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			match(REQUIRED_FIELD);
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
	public static class Static_fieldContext extends ParserRuleContext {
		public TerminalNode STATIC_ACCESS() { return getToken(AloftParser.STATIC_ACCESS, 0); }
		public Static_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_static_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterStatic_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitStatic_field(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitStatic_field(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Static_fieldContext static_field() throws RecognitionException {
		Static_fieldContext _localctx = new Static_fieldContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_static_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			match(STATIC_ACCESS);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitVar_options(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_optionsContext var_options() throws RecognitionException {
		Var_optionsContext _localctx = new Var_optionsContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_var_options);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
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
	public static class Var_typeContext extends ParserRuleContext {
		public TerminalNode VAR_TYPES() { return getToken(AloftParser.VAR_TYPES, 0); }
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitVar_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_typeContext var_type() throws RecognitionException {
		Var_typeContext _localctx = new Var_typeContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_var_type);
		try {
			setState(525);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR_TYPES:
				enterOuterAlt(_localctx, 1);
				{
				setState(523);
				match(VAR_TYPES);
				}
				break;
			case NAMED:
				enterOuterAlt(_localctx, 2);
				{
				setState(524);
				var_name();
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
	public static class Property_valueContext extends ParserRuleContext {
		public Component_treeContext component_tree() {
			return getRuleContext(Component_treeContext.class,0);
		}
		public Var_name_with_paramsContext var_name_with_params() {
			return getRuleContext(Var_name_with_paramsContext.class,0);
		}
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Html_elementContext html_element() {
			return getRuleContext(Html_elementContext.class,0);
		}
		public Any_varContext any_var() {
			return getRuleContext(Any_varContext.class,0);
		}
		public Static_varContext static_var() {
			return getRuleContext(Static_varContext.class,0);
		}
		public TerminalNode NULL_VALUE() { return getToken(AloftParser.NULL_VALUE, 0); }
		public TerminalNode QUERY_SELECT_ALL() { return getToken(AloftParser.QUERY_SELECT_ALL, 0); }
		public Property_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterProperty_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitProperty_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitProperty_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Property_valueContext property_value() throws RecognitionException {
		Property_valueContext _localctx = new Property_valueContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_property_value);
		try {
			setState(541);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(527);
				component_tree();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(528);
				var_name_with_params();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(529);
				path();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(530);
				array();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(531);
				expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(539);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
				case 1:
					{
					setState(532);
					number();
					}
					break;
				case 2:
					{
					setState(533);
					string();
					}
					break;
				case 3:
					{
					setState(534);
					html_element();
					}
					break;
				case 4:
					{
					setState(535);
					any_var();
					}
					break;
				case 5:
					{
					setState(536);
					static_var();
					}
					break;
				case 6:
					{
					setState(537);
					match(NULL_VALUE);
					}
					break;
				case 7:
					{
					setState(538);
					match(QUERY_SELECT_ALL);
					}
					break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class Static_varContext extends ParserRuleContext {
		public List<Var_nameContext> var_name() {
			return getRuleContexts(Var_nameContext.class);
		}
		public Var_nameContext var_name(int i) {
			return getRuleContext(Var_nameContext.class,i);
		}
		public List<TerminalNode> STATIC_ACCESS() { return getTokens(AloftParser.STATIC_ACCESS); }
		public TerminalNode STATIC_ACCESS(int i) {
			return getToken(AloftParser.STATIC_ACCESS, i);
		}
		public Static_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_static_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterStatic_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitStatic_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitStatic_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Static_varContext static_var() throws RecognitionException {
		Static_varContext _localctx = new Static_varContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_static_var);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(543);
			var_name();
			{
			setState(546); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(544);
					match(STATIC_ACCESS);
					setState(545);
					var_name();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(548); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class Return_property_valueContext extends ParserRuleContext {
		public Var_name_with_paramsContext var_name_with_params() {
			return getRuleContext(Var_name_with_paramsContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Html_elementContext html_element() {
			return getRuleContext(Html_elementContext.class,0);
		}
		public TerminalNode NAMED() { return getToken(AloftParser.NAMED, 0); }
		public TerminalNode NAMED_DOT() { return getToken(AloftParser.NAMED_DOT, 0); }
		public TerminalNode NAMED_VAR() { return getToken(AloftParser.NAMED_VAR, 0); }
		public TerminalNode NULL_VALUE() { return getToken(AloftParser.NULL_VALUE, 0); }
		public Return_property_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_property_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterReturn_property_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitReturn_property_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitReturn_property_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_property_valueContext return_property_value() throws RecognitionException {
		Return_property_valueContext _localctx = new Return_property_valueContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_return_property_value);
		int _la;
		try {
			setState(561);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(550);
				var_name_with_params();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(551);
				array();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(552);
				expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(553);
				path();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(554);
				number();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(555);
				string();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(556);
				html_element();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(557);
				match(NAMED);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(558);
				match(NAMED_DOT);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(559);
				_la = _input.LA(1);
				if ( !(_la==NAMED || _la==NAMED_VAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(560);
				match(NULL_VALUE);
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
	public static class LoopContext extends ParserRuleContext {
		public TerminalNode LOOP_name_declaration() { return getToken(AloftParser.LOOP_name_declaration, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			match(LOOP_name_declaration);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitSwitch_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_blockContext switch_block() throws RecognitionException {
		Switch_blockContext _localctx = new Switch_blockContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_switch_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			match(SWITCH_KEYWORD);
			setState(566);
			named_switch();
			setState(567);
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
	public static class Curly_blockContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKETS() { return getToken(AloftParser.OPEN_BRACKETS, 0); }
		public TerminalNode CLOSE_BRACKETS() { return getToken(AloftParser.CLOSE_BRACKETS, 0); }
		public List<SyntaxContext> syntax() {
			return getRuleContexts(SyntaxContext.class);
		}
		public SyntaxContext syntax(int i) {
			return getRuleContext(SyntaxContext.class,i);
		}
		public Curly_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_curly_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterCurly_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitCurly_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitCurly_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Curly_blockContext curly_block() throws RecognitionException {
		Curly_blockContext _localctx = new Curly_blockContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_curly_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(569);
			match(OPEN_BRACKETS);
			}
			setState(571); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(570);
				syntax();
				}
				}
				setState(573); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2252160633438194L) != 0) );
			{
			setState(575);
			match(CLOSE_BRACKETS);
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
	public static class Function_curly_blockContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKETS() { return getToken(AloftParser.OPEN_BRACKETS, 0); }
		public TerminalNode CLOSE_BRACKETS() { return getToken(AloftParser.CLOSE_BRACKETS, 0); }
		public List<Function_syntaxContext> function_syntax() {
			return getRuleContexts(Function_syntaxContext.class);
		}
		public Function_syntaxContext function_syntax(int i) {
			return getRuleContext(Function_syntaxContext.class,i);
		}
		public Function_curly_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_curly_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterFunction_curly_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitFunction_curly_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitFunction_curly_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_curly_blockContext function_curly_block() throws RecognitionException {
		Function_curly_blockContext _localctx = new Function_curly_blockContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_function_curly_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(577);
			match(OPEN_BRACKETS);
			}
			setState(579); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(578);
				function_syntax();
				}
				}
				setState(581); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 21709324988055560L) != 0) );
			{
			setState(583);
			match(CLOSE_BRACKETS);
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
	public static class Named_with_params_specialContext extends ParserRuleContext {
		public TerminalNode CLOSE_PARENTHESES() { return getToken(AloftParser.CLOSE_PARENTHESES, 0); }
		public TerminalNode OPEN_PARENTHESES() { return getToken(AloftParser.OPEN_PARENTHESES, 0); }
		public List<Var_nameContext> var_name() {
			return getRuleContexts(Var_nameContext.class);
		}
		public Var_nameContext var_name(int i) {
			return getRuleContext(Var_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AloftParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AloftParser.COMMA, i);
		}
		public TerminalNode VARIABLE_ARGS() { return getToken(AloftParser.VARIABLE_ARGS, 0); }
		public Named_with_params_specialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_named_with_params_special; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterNamed_with_params_special(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitNamed_with_params_special(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitNamed_with_params_special(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Named_with_params_specialContext named_with_params_special() throws RecognitionException {
		Named_with_params_specialContext _localctx = new Named_with_params_specialContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_named_with_params_special);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(585);
			match(OPEN_PARENTHESES);
			}
			{
			setState(590); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(586);
				var_name();
				setState(588);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(587);
					match(COMMA);
					}
					break;
				}
				}
				}
				setState(592); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NAMED );
			}
			setState(597);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				{
				setState(594);
				match(COMMA);
				setState(595);
				match(VARIABLE_ARGS);
				setState(596);
				var_name();
				}
				}
			}

			setState(599);
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
	public static class Vars_with_params_specialContext extends ParserRuleContext {
		public TerminalNode CLOSE_PARENTHESES() { return getToken(AloftParser.CLOSE_PARENTHESES, 0); }
		public TerminalNode OPEN_PARENTHESES() { return getToken(AloftParser.OPEN_PARENTHESES, 0); }
		public List<Var_paramContext> var_param() {
			return getRuleContexts(Var_paramContext.class);
		}
		public Var_paramContext var_param(int i) {
			return getRuleContext(Var_paramContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AloftParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AloftParser.COMMA, i);
		}
		public TerminalNode VARIABLE_ARGS() { return getToken(AloftParser.VARIABLE_ARGS, 0); }
		public Vars_with_params_specialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vars_with_params_special; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterVars_with_params_special(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitVars_with_params_special(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitVars_with_params_special(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Vars_with_params_specialContext vars_with_params_special() throws RecognitionException {
		Vars_with_params_specialContext _localctx = new Vars_with_params_specialContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_vars_with_params_special);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(601);
			match(OPEN_PARENTHESES);
			}
			{
			setState(606); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(602);
				var_param();
				setState(604);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
				case 1:
					{
					setState(603);
					match(COMMA);
					}
					break;
				}
				}
				}
				setState(608); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1172378463047122944L) != 0) );
			}
			setState(613);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				{
				setState(610);
				match(COMMA);
				setState(611);
				match(VARIABLE_ARGS);
				setState(612);
				var_param();
				}
				}
			}

			setState(615);
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
	public static class Var_paramContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Html_elementContext html_element() {
			return getRuleContext(Html_elementContext.class,0);
		}
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public Var_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterVar_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitVar_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitVar_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_paramContext var_param() throws RecognitionException {
		Var_paramContext _localctx = new Var_paramContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_var_param);
		try {
			setState(623);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(617);
				string();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(618);
				number();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(619);
				array();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(620);
				expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(621);
				html_element();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(622);
				var_name();
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
	public static class Named_switchContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENTHESES() { return getToken(AloftParser.OPEN_PARENTHESES, 0); }
		public TerminalNode CLOSE_PARENTHESES() { return getToken(AloftParser.CLOSE_PARENTHESES, 0); }
		public TerminalNode NAMED_VAR() { return getToken(AloftParser.NAMED_VAR, 0); }
		public TerminalNode NAMED() { return getToken(AloftParser.NAMED, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitNamed_switch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Named_switchContext named_switch() throws RecognitionException {
		Named_switchContext _localctx = new Named_switchContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_named_switch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
			match(OPEN_PARENTHESES);
			setState(626);
			_la = _input.LA(1);
			if ( !(_la==NAMED || _la==NAMED_VAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(627);
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
		public List<TerminalNode> NAMED() { return getTokens(AloftParser.NAMED); }
		public TerminalNode NAMED(int i) {
			return getToken(AloftParser.NAMED, i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitEnclosed_vars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enclosed_varsContext enclosed_vars() throws RecognitionException {
		Enclosed_varsContext _localctx = new Enclosed_varsContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_enclosed_vars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(629);
			match(OPEN_PARENTHESES);
			setState(634); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(631);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(630);
					match(COMMA);
					}
				}

				setState(633);
				_la = _input.LA(1);
				if ( !(_la==NAMED || _la==NAMED_VAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(636); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8591507456L) != 0) );
			setState(638);
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
	public static class GotoContext extends ParserRuleContext {
		public TerminalNode GOTO_KEYWORD() { return getToken(AloftParser.GOTO_KEYWORD, 0); }
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public TerminalNode STATEMENT_END() { return getToken(AloftParser.STATEMENT_END, 0); }
		public GotoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterGoto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitGoto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitGoto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GotoContext goto_() throws RecognitionException {
		GotoContext _localctx = new GotoContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_goto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			match(GOTO_KEYWORD);
			setState(641);
			path();
			setState(643);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATEMENT_END) {
				{
				setState(642);
				match(STATEMENT_END);
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
	public static class File_nameContext extends ParserRuleContext {
		public TerminalNode FILE_NAME() { return getToken(AloftParser.FILE_NAME, 0); }
		public File_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).enterFile_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AloftListener ) ((AloftListener)listener).exitFile_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AloftVisitor ) return ((AloftVisitor<? extends T>)visitor).visitFile_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final File_nameContext file_name() throws RecognitionException {
		File_nameContext _localctx = new File_nameContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_file_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			match(FILE_NAME);
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
		"\u0004\u0001D\u0288\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0001\u0000\u0004\u0000\u0094\b\u0000"+
		"\u000b\u0000\f\u0000\u0095\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u00ab\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002\u00b4\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0004\b\u00d0\b\b\u000b\b\f\b\u00d1\u0003\b"+
		"\u00d4\b\b\u0003\b\u00d6\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0003\f\u00e9\b\f\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00f2"+
		"\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00fd\b\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0003\u0014\u010a"+
		"\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u010f\b\u0015"+
		"\u0004\u0015\u0111\b\u0015\u000b\u0015\f\u0015\u0112\u0003\u0015\u0115"+
		"\b\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001"+
		"\u0017\u0003\u0017\u011d\b\u0017\u0001\u0018\u0001\u0018\u0003\u0018\u0121"+
		"\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0127"+
		"\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003"+
		"\u001a\u012e\b\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u0137\b\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0004\u001c\u013c\b\u001c\u000b\u001c\f\u001c\u013d"+
		"\u0003\u001c\u0140\b\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001e\u0001\u001e\u0003\u001e\u0149\b\u001e\u0001\u001e"+
		"\u0003\u001e\u014c\b\u001e\u0003\u001e\u014e\b\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001"+
		" \u0001 \u0001!\u0001!\u0001!\u0004!\u015d\b!\u000b!\f!\u015e\u0003!\u0161"+
		"\b!\u0001!\u0001!\u0001\"\u0001\"\u0003\"\u0167\b\"\u0001#\u0001#\u0003"+
		"#\u016b\b#\u0001#\u0001#\u0001#\u0003#\u0170\b#\u0003#\u0172\b#\u0001"+
		"#\u0003#\u0175\b#\u0001$\u0001$\u0001%\u0001%\u0003%\u017b\b%\u0001%\u0003"+
		"%\u017e\b%\u0001%\u0003%\u0181\b%\u0001&\u0001&\u0001&\u0004&\u0186\b"+
		"&\u000b&\f&\u0187\u0003&\u018a\b&\u0001\'\u0001\'\u0001(\u0001(\u0001"+
		"(\u0003(\u0191\b(\u0001(\u0001(\u0003(\u0195\b(\u0001(\u0003(\u0198\b"+
		"(\u0001)\u0001)\u0003)\u019c\b)\u0001*\u0001*\u0001*\u0001*\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001-\u0001-\u0001.\u0003"+
		".\u01ad\b.\u0001.\u0001.\u0001.\u0001.\u0001.\u0004.\u01b4\b.\u000b.\f"+
		".\u01b5\u0003.\u01b8\b.\u0001.\u0003.\u01bb\b.\u0003.\u01bd\b.\u0001/"+
		"\u0001/\u0001/\u0001/\u00010\u00010\u00010\u00010\u00030\u01c7\b0\u0001"+
		"0\u00010\u00010\u00030\u01cc\b0\u00010\u00010\u00030\u01d0\b0\u00030\u01d2"+
		"\b0\u00011\u00011\u00012\u00012\u00012\u00032\u01d9\b2\u00013\u00033\u01dc"+
		"\b3\u00013\u00013\u00033\u01e0\b3\u00014\u00034\u01e3\b4\u00014\u0001"+
		"4\u00014\u00014\u00014\u00015\u00015\u00015\u00015\u00015\u00035\u01ef"+
		"\b5\u00015\u00045\u01f2\b5\u000b5\f5\u01f3\u00015\u00035\u01f7\b5\u0001"+
		"5\u00015\u00015\u00015\u00055\u01fd\b5\n5\f5\u0200\t5\u00016\u00016\u0003"+
		"6\u0204\b6\u00017\u00017\u00018\u00018\u00019\u00019\u0001:\u0001:\u0003"+
		":\u020e\b:\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0003;\u021c\b;\u0003;\u021e\b;\u0001<\u0001<\u0001"+
		"<\u0004<\u0223\b<\u000b<\f<\u0224\u0001=\u0001=\u0001=\u0001=\u0001=\u0001"+
		"=\u0001=\u0001=\u0001=\u0001=\u0001=\u0003=\u0232\b=\u0001>\u0001>\u0001"+
		"?\u0001?\u0001?\u0001?\u0001@\u0001@\u0004@\u023c\b@\u000b@\f@\u023d\u0001"+
		"@\u0001@\u0001A\u0001A\u0004A\u0244\bA\u000bA\fA\u0245\u0001A\u0001A\u0001"+
		"B\u0001B\u0001B\u0003B\u024d\bB\u0004B\u024f\bB\u000bB\fB\u0250\u0001"+
		"B\u0001B\u0001B\u0003B\u0256\bB\u0001B\u0001B\u0001C\u0001C\u0001C\u0003"+
		"C\u025d\bC\u0004C\u025f\bC\u000bC\fC\u0260\u0001C\u0001C\u0001C\u0003"+
		"C\u0266\bC\u0001C\u0001C\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0003"+
		"D\u0270\bD\u0001E\u0001E\u0001E\u0001E\u0001F\u0001F\u0003F\u0278\bF\u0001"+
		"F\u0004F\u027b\bF\u000bF\fF\u027c\u0001F\u0001F\u0001G\u0001G\u0001G\u0003"+
		"G\u0284\bG\u0001H\u0001H\u0001H\u0000\u0000I\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02"+
		"468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\u008e\u0090\u0000\u0001\u0001\u0000\u0013\u0014\u02b9\u0000"+
		"\u0093\u0001\u0000\u0000\u0000\u0002\u00aa\u0001\u0000\u0000\u0000\u0004"+
		"\u00b3\u0001\u0000\u0000\u0000\u0006\u00b5\u0001\u0000\u0000\u0000\b\u00b9"+
		"\u0001\u0000\u0000\u0000\n\u00bd\u0001\u0000\u0000\u0000\f\u00c1\u0001"+
		"\u0000\u0000\u0000\u000e\u00c5\u0001\u0000\u0000\u0000\u0010\u00c9\u0001"+
		"\u0000\u0000\u0000\u0012\u00d9\u0001\u0000\u0000\u0000\u0014\u00dd\u0001"+
		"\u0000\u0000\u0000\u0016\u00e1\u0001\u0000\u0000\u0000\u0018\u00e5\u0001"+
		"\u0000\u0000\u0000\u001a\u00ea\u0001\u0000\u0000\u0000\u001c\u00ee\u0001"+
		"\u0000\u0000\u0000\u001e\u00f3\u0001\u0000\u0000\u0000 \u00f7\u0001\u0000"+
		"\u0000\u0000\"\u00fe\u0001\u0000\u0000\u0000$\u0100\u0001\u0000\u0000"+
		"\u0000&\u0103\u0001\u0000\u0000\u0000(\u0109\u0001\u0000\u0000\u0000*"+
		"\u010b\u0001\u0000\u0000\u0000,\u0118\u0001\u0000\u0000\u0000.\u011c\u0001"+
		"\u0000\u0000\u00000\u0120\u0001\u0000\u0000\u00002\u0122\u0001\u0000\u0000"+
		"\u00004\u012d\u0001\u0000\u0000\u00006\u012f\u0001\u0000\u0000\u00008"+
		"\u0131\u0001\u0000\u0000\u0000:\u0143\u0001\u0000\u0000\u0000<\u0146\u0001"+
		"\u0000\u0000\u0000>\u0152\u0001\u0000\u0000\u0000@\u0155\u0001\u0000\u0000"+
		"\u0000B\u0159\u0001\u0000\u0000\u0000D\u0166\u0001\u0000\u0000\u0000F"+
		"\u0168\u0001\u0000\u0000\u0000H\u0176\u0001\u0000\u0000\u0000J\u017d\u0001"+
		"\u0000\u0000\u0000L\u0182\u0001\u0000\u0000\u0000N\u018b\u0001\u0000\u0000"+
		"\u0000P\u0197\u0001\u0000\u0000\u0000R\u019b\u0001\u0000\u0000\u0000T"+
		"\u019d\u0001\u0000\u0000\u0000V\u01a1\u0001\u0000\u0000\u0000X\u01a6\u0001"+
		"\u0000\u0000\u0000Z\u01a9\u0001\u0000\u0000\u0000\\\u01bc\u0001\u0000"+
		"\u0000\u0000^\u01be\u0001\u0000\u0000\u0000`\u01d1\u0001\u0000\u0000\u0000"+
		"b\u01d3\u0001\u0000\u0000\u0000d\u01d5\u0001\u0000\u0000\u0000f\u01db"+
		"\u0001\u0000\u0000\u0000h\u01e2\u0001\u0000\u0000\u0000j\u01e9\u0001\u0000"+
		"\u0000\u0000l\u0203\u0001\u0000\u0000\u0000n\u0205\u0001\u0000\u0000\u0000"+
		"p\u0207\u0001\u0000\u0000\u0000r\u0209\u0001\u0000\u0000\u0000t\u020d"+
		"\u0001\u0000\u0000\u0000v\u021d\u0001\u0000\u0000\u0000x\u021f\u0001\u0000"+
		"\u0000\u0000z\u0231\u0001\u0000\u0000\u0000|\u0233\u0001\u0000\u0000\u0000"+
		"~\u0235\u0001\u0000\u0000\u0000\u0080\u0239\u0001\u0000\u0000\u0000\u0082"+
		"\u0241\u0001\u0000\u0000\u0000\u0084\u0249\u0001\u0000\u0000\u0000\u0086"+
		"\u0259\u0001\u0000\u0000\u0000\u0088\u026f\u0001\u0000\u0000\u0000\u008a"+
		"\u0271\u0001\u0000\u0000\u0000\u008c\u0275\u0001\u0000\u0000\u0000\u008e"+
		"\u0280\u0001\u0000\u0000\u0000\u0090\u0285\u0001\u0000\u0000\u0000\u0092"+
		"\u0094\u0003\u0002\u0001\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0094"+
		"\u0095\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0095"+
		"\u0096\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097"+
		"\u0098\u0005\u0000\u0000\u0001\u0098\u0001\u0001\u0000\u0000\u0000\u0099"+
		"\u00ab\u0003|>\u0000\u009a\u00ab\u0003:\u001d\u0000\u009b\u00ab\u0003"+
		">\u001f\u0000\u009c\u00ab\u0003\u001a\r\u0000\u009d\u00ab\u0003\u001c"+
		"\u000e\u0000\u009e\u00ab\u0003\u0006\u0003\u0000\u009f\u00ab\u0003\u0012"+
		"\t\u0000\u00a0\u00ab\u0003\b\u0004\u0000\u00a1\u00ab\u0003\f\u0006\u0000"+
		"\u00a2\u00ab\u0003\n\u0005\u0000\u00a3\u00ab\u0003\u001e\u000f\u0000\u00a4"+
		"\u00ab\u0003\u000e\u0007\u0000\u00a5\u00ab\u0003\u0014\n\u0000\u00a6\u00ab"+
		"\u0003\u0016\u000b\u0000\u00a7\u00ab\u0003\u0018\f\u0000\u00a8\u00ab\u0003"+
		"2\u0019\u0000\u00a9\u00ab\u0003F#\u0000\u00aa\u0099\u0001\u0000\u0000"+
		"\u0000\u00aa\u009a\u0001\u0000\u0000\u0000\u00aa\u009b\u0001\u0000\u0000"+
		"\u0000\u00aa\u009c\u0001\u0000\u0000\u0000\u00aa\u009d\u0001\u0000\u0000"+
		"\u0000\u00aa\u009e\u0001\u0000\u0000\u0000\u00aa\u009f\u0001\u0000\u0000"+
		"\u0000\u00aa\u00a0\u0001\u0000\u0000\u0000\u00aa\u00a1\u0001\u0000\u0000"+
		"\u0000\u00aa\u00a2\u0001\u0000\u0000\u0000\u00aa\u00a3\u0001\u0000\u0000"+
		"\u0000\u00aa\u00a4\u0001\u0000\u0000\u0000\u00aa\u00a5\u0001\u0000\u0000"+
		"\u0000\u00aa\u00a6\u0001\u0000\u0000\u0000\u00aa\u00a7\u0001\u0000\u0000"+
		"\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00aa\u00a9\u0001\u0000\u0000"+
		"\u0000\u00ab\u0003\u0001\u0000\u0000\u0000\u00ac\u00b4\u0003~?\u0000\u00ad"+
		"\u00b4\u0003j5\u0000\u00ae\u00b4\u0003H$\u0000\u00af\u00b4\u0003 \u0010"+
		"\u0000\u00b0\u00b4\u0003B!\u0000\u00b1\u00b4\u0003d2\u0000\u00b2\u00b4"+
		"\u0003F#\u0000\u00b3\u00ac\u0001\u0000\u0000\u0000\u00b3\u00ad\u0001\u0000"+
		"\u0000\u0000\u00b3\u00ae\u0001\u0000\u0000\u0000\u00b3\u00af\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b0\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b2\u0001\u0000\u0000\u0000\u00b4\u0005\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b6\u0005\t\u0000\u0000\u00b6\u00b7\u0003Z-\u0000"+
		"\u00b7\u00b8\u0003\u0080@\u0000\u00b8\u0007\u0001\u0000\u0000\u0000\u00b9"+
		"\u00ba\u0005\b\u0000\u0000\u00ba\u00bb\u0003Z-\u0000\u00bb\u00bc\u0003"+
		"\u0080@\u0000\u00bc\t\u0001\u0000\u0000\u0000\u00bd\u00be\u0005\u0007"+
		"\u0000\u0000\u00be\u00bf\u0003Z-\u0000\u00bf\u00c0\u0003\u0080@\u0000"+
		"\u00c0\u000b\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005\r\u0000\u0000\u00c2"+
		"\u00c3\u0003Z-\u0000\u00c3\u00c4\u0003\u0080@\u0000\u00c4\r\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c6\u0005\u000b\u0000\u0000\u00c6\u00c7\u0003Z-\u0000"+
		"\u00c7\u00c8\u0003\u0080@\u0000\u00c8\u000f\u0001\u0000\u0000\u0000\u00c9"+
		"\u00ca\u0005\u000b\u0000\u0000\u00ca\u00d5\u0003Z-\u0000\u00cb\u00cc\u0005"+
		"\u000f\u0000\u0000\u00cc\u00d3\u0003Z-\u0000\u00cd\u00ce\u0005!\u0000"+
		"\u0000\u00ce\u00d0\u0003Z-\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00d0"+
		"\u00d1\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d1"+
		"\u00d2\u0001\u0000\u0000\u0000\u00d2\u00d4\u0001\u0000\u0000\u0000\u00d3"+
		"\u00cf\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d6\u0001\u0000\u0000\u0000\u00d5\u00cb\u0001\u0000\u0000\u0000\u00d5"+
		"\u00d6\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7"+
		"\u00d8\u0003\u0080@\u0000\u00d8\u0011\u0001\u0000\u0000\u0000\u00d9\u00da"+
		"\u0005\u000e\u0000\u0000\u00da\u00db\u0003Z-\u0000\u00db\u00dc\u0003\u0080"+
		"@\u0000\u00dc\u0013\u0001\u0000\u0000\u0000\u00dd\u00de\u0005\f\u0000"+
		"\u0000\u00de\u00df\u0003Z-\u0000\u00df\u00e0\u0003\u0080@\u0000\u00e0"+
		"\u0015\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005\n\u0000\u0000\u00e2\u00e3"+
		"\u0003Z-\u0000\u00e3\u00e4\u0003\u0080@\u0000\u00e4\u0017\u0001\u0000"+
		"\u0000\u0000\u00e5\u00e6\u0005\u0006\u0000\u0000\u00e6\u00e8\u0003Z-\u0000"+
		"\u00e7\u00e9\u0005@\u0000\u0000\u00e8\u00e7\u0001\u0000\u0000\u0000\u00e8"+
		"\u00e9\u0001\u0000\u0000\u0000\u00e9\u0019\u0001\u0000\u0000\u0000\u00ea"+
		"\u00eb\u0005\u0001\u0000\u0000\u00eb\u00ec\u0003X,\u0000\u00ec\u00ed\u0003"+
		"\u0080@\u0000\u00ed\u001b\u0001\u0000\u0000\u0000\u00ee\u00ef\u0005\u0005"+
		"\u0000\u0000\u00ef\u00f1\u0003(\u0014\u0000\u00f0\u00f2\u0005@\u0000\u0000"+
		"\u00f1\u00f0\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000"+
		"\u00f2\u001d\u0001\u0000\u0000\u0000\u00f3\u00f4\u0005\u0004\u0000\u0000"+
		"\u00f4\u00f5\u0003(\u0014\u0000\u00f5\u00f6\u0003\u0080@\u0000\u00f6\u001f"+
		"\u0001\u0000\u0000\u0000\u00f7\u00f8\u0005\u0003\u0000\u0000\u00f8\u00f9"+
		"\u0003Z-\u0000\u00f9\u00fc\u0003X,\u0000\u00fa\u00fb\u0005\u0002\u0000"+
		"\u0000\u00fb\u00fd\u0003Z-\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fc"+
		"\u00fd\u0001\u0000\u0000\u0000\u00fd!\u0001\u0000\u0000\u0000\u00fe\u00ff"+
		"\u0005\u0011\u0000\u0000\u00ff#\u0001\u0000\u0000\u0000\u0100\u0101\u0003"+
		"\u0090H\u0000\u0101\u0102\u0003&\u0013\u0000\u0102%\u0001\u0000\u0000"+
		"\u0000\u0103\u0104\u0005:\u0000\u0000\u0104\u0105\u0003Z-\u0000\u0105"+
		"\u0106\u0005;\u0000\u0000\u0106\'\u0001\u0000\u0000\u0000\u0107\u010a"+
		"\u0003$\u0012\u0000\u0108\u010a\u0003\u0090H\u0000\u0109\u0107\u0001\u0000"+
		"\u0000\u0000\u0109\u0108\u0001\u0000\u0000\u0000\u010a)\u0001\u0000\u0000"+
		"\u0000\u010b\u0114\u0005<\u0000\u0000\u010c\u010e\u0003v;\u0000\u010d"+
		"\u010f\u0005!\u0000\u0000\u010e\u010d\u0001\u0000\u0000\u0000\u010e\u010f"+
		"\u0001\u0000\u0000\u0000\u010f\u0111\u0001\u0000\u0000\u0000\u0110\u010c"+
		"\u0001\u0000\u0000\u0000\u0111\u0112\u0001\u0000\u0000\u0000\u0112\u0110"+
		"\u0001\u0000\u0000\u0000\u0112\u0113\u0001\u0000\u0000\u0000\u0113\u0115"+
		"\u0001\u0000\u0000\u0000\u0114\u0110\u0001\u0000\u0000\u0000\u0114\u0115"+
		"\u0001\u0000\u0000\u0000\u0115\u0116\u0001\u0000\u0000\u0000\u0116\u0117"+
		"\u0005=\u0000\u0000\u0117+\u0001\u0000\u0000\u0000\u0118\u0119\u0005\u0015"+
		"\u0000\u0000\u0119-\u0001\u0000\u0000\u0000\u011a\u011d\u0005.\u0000\u0000"+
		"\u011b\u011d\u0003\u0086C\u0000\u011c\u011a\u0001\u0000\u0000\u0000\u011c"+
		"\u011b\u0001\u0000\u0000\u0000\u011d/\u0001\u0000\u0000\u0000\u011e\u0121"+
		"\u0005.\u0000\u0000\u011f\u0121\u0003\u0084B\u0000\u0120\u011e\u0001\u0000"+
		"\u0000\u0000\u0120\u011f\u0001\u0000\u0000\u0000\u01211\u0001\u0000\u0000"+
		"\u0000\u0122\u0123\u0003Z-\u0000\u0123\u0124\u00054\u0000\u0000\u0124"+
		"\u0126\u0003v;\u0000\u0125\u0127\u0005@\u0000\u0000\u0126\u0125\u0001"+
		"\u0000\u0000\u0000\u0126\u0127\u0001\u0000\u0000\u0000\u01273\u0001\u0000"+
		"\u0000\u0000\u0128\u012e\u0003z=\u0000\u0129\u012a\u0005<\u0000\u0000"+
		"\u012a\u012b\u00032\u0019\u0000\u012b\u012c\u0005=\u0000\u0000\u012c\u012e"+
		"\u0001\u0000\u0000\u0000\u012d\u0128\u0001\u0000\u0000\u0000\u012d\u0129"+
		"\u0001\u0000\u0000\u0000\u012e5\u0001\u0000\u0000\u0000\u012f\u0130\u0005"+
		"\u0012\u0000\u0000\u01307\u0001\u0000\u0000\u0000\u0131\u0132\u0003Z-"+
		"\u0000\u0132\u0136\u0005\u001d\u0000\u0000\u0133\u0134\u00036\u001b\u0000"+
		"\u0134\u0135\u0005!\u0000\u0000\u0135\u0137\u0001\u0000\u0000\u0000\u0136"+
		"\u0133\u0001\u0000\u0000\u0000\u0136\u0137\u0001\u0000\u0000\u0000\u0137"+
		"\u0138\u0001\u0000\u0000\u0000\u0138\u013f\u00032\u0019\u0000\u0139\u013a"+
		"\u0005!\u0000\u0000\u013a\u013c\u00032\u0019\u0000\u013b\u0139\u0001\u0000"+
		"\u0000\u0000\u013c\u013d\u0001\u0000\u0000\u0000\u013d\u013b\u0001\u0000"+
		"\u0000\u0000\u013d\u013e\u0001\u0000\u0000\u0000\u013e\u0140\u0001\u0000"+
		"\u0000\u0000\u013f\u013b\u0001\u0000\u0000\u0000\u013f\u0140\u0001\u0000"+
		"\u0000\u0000\u0140\u0141\u0001\u0000\u0000\u0000\u0141\u0142\u0005\u001e"+
		"\u0000\u0000\u01429\u0001\u0000\u0000\u0000\u0143\u0144\u0003<\u001e\u0000"+
		"\u0144\u0145\u0003\u0082A\u0000\u0145;\u0001\u0000\u0000\u0000\u0146\u014d"+
		"\u0003D\"\u0000\u0147\u0149\u0005\u0016\u0000\u0000\u0148\u0147\u0001"+
		"\u0000\u0000\u0000\u0148\u0149\u0001\u0000\u0000\u0000\u0149\u014b\u0001"+
		"\u0000\u0000\u0000\u014a\u014c\u00053\u0000\u0000\u014b\u014a\u0001\u0000"+
		"\u0000\u0000\u014b\u014c\u0001\u0000\u0000\u0000\u014c\u014e\u0001\u0000"+
		"\u0000\u0000\u014d\u0148\u0001\u0000\u0000\u0000\u014d\u014e\u0001\u0000"+
		"\u0000\u0000\u014e\u014f\u0001\u0000\u0000\u0000\u014f\u0150\u0003R)\u0000"+
		"\u0150\u0151\u00030\u0018\u0000\u0151=\u0001\u0000\u0000\u0000\u0152\u0153"+
		"\u0003@ \u0000\u0153\u0154\u0003\u0082A\u0000\u0154?\u0001\u0000\u0000"+
		"\u0000\u0155\u0156\u0005\u0017\u0000\u0000\u0156\u0157\u0003R)\u0000\u0157"+
		"\u0158\u00030\u0018\u0000\u0158A\u0001\u0000\u0000\u0000\u0159\u0160\u0003"+
		"P(\u0000\u015a\u015b\u0005\u0018\u0000\u0000\u015b\u015d\u0003P(\u0000"+
		"\u015c\u015a\u0001\u0000\u0000\u0000\u015d\u015e\u0001\u0000\u0000\u0000"+
		"\u015e\u015c\u0001\u0000\u0000\u0000\u015e\u015f\u0001\u0000\u0000\u0000"+
		"\u015f\u0161\u0001\u0000\u0000\u0000\u0160\u015c\u0001\u0000\u0000\u0000"+
		"\u0160\u0161\u0001\u0000\u0000\u0000\u0161\u0162\u0001\u0000\u0000\u0000"+
		"\u0162\u0163\u0003.\u0017\u0000\u0163C\u0001\u0000\u0000\u0000\u0164\u0167"+
		"\u0005\u0019\u0000\u0000\u0165\u0167\u0003t:\u0000\u0166\u0164\u0001\u0000"+
		"\u0000\u0000\u0166\u0165\u0001\u0000\u0000\u0000\u0167E\u0001\u0000\u0000"+
		"\u0000\u0168\u016a\u0003J%\u0000\u0169\u016b\u0003r9\u0000\u016a\u0169"+
		"\u0001\u0000\u0000\u0000\u016a\u016b\u0001\u0000\u0000\u0000\u016b\u0171"+
		"\u0001\u0000\u0000\u0000\u016c\u016f\u0003b1\u0000\u016d\u0170\u0003`"+
		"0\u0000\u016e\u0170\u0003\\.\u0000\u016f\u016d\u0001\u0000\u0000\u0000"+
		"\u016f\u016e\u0001\u0000\u0000\u0000\u0170\u0172\u0001\u0000\u0000\u0000"+
		"\u0171\u016c\u0001\u0000\u0000\u0000\u0171\u0172\u0001\u0000\u0000\u0000"+
		"\u0172\u0174\u0001\u0000\u0000\u0000\u0173\u0175\u0005@\u0000\u0000\u0174"+
		"\u0173\u0001\u0000\u0000\u0000\u0174\u0175\u0001\u0000\u0000\u0000\u0175"+
		"G\u0001\u0000\u0000\u0000\u0176\u0177\u0003^/\u0000\u0177I\u0001\u0000"+
		"\u0000\u0000\u0178\u017e\u0003V+\u0000\u0179\u017b\u0003l6\u0000\u017a"+
		"\u0179\u0001\u0000\u0000\u0000\u017a\u017b\u0001\u0000\u0000\u0000\u017b"+
		"\u017c\u0001\u0000\u0000\u0000\u017c\u017e\u0003L&\u0000\u017d\u0178\u0001"+
		"\u0000\u0000\u0000\u017d\u017a\u0001\u0000\u0000\u0000\u017e\u0180\u0001"+
		"\u0000\u0000\u0000\u017f\u0181\u0003t:\u0000\u0180\u017f\u0001\u0000\u0000"+
		"\u0000\u0180\u0181\u0001\u0000\u0000\u0000\u0181K\u0001\u0000\u0000\u0000"+
		"\u0182\u0189\u0003Z-\u0000\u0183\u0184\u0005!\u0000\u0000\u0184\u0186"+
		"\u0003Z-\u0000\u0185\u0183\u0001\u0000\u0000\u0000\u0186\u0187\u0001\u0000"+
		"\u0000\u0000\u0187\u0185\u0001\u0000\u0000\u0000\u0187\u0188\u0001\u0000"+
		"\u0000\u0000\u0188\u018a\u0001\u0000\u0000\u0000\u0189\u0185\u0001\u0000"+
		"\u0000\u0000\u0189\u018a\u0001\u0000\u0000\u0000\u018aM\u0001\u0000\u0000"+
		"\u0000\u018b\u018c\u00050\u0000\u0000\u018cO\u0001\u0000\u0000\u0000\u018d"+
		"\u0198\u0005\u0014\u0000\u0000\u018e\u0198\u0005\u0013\u0000\u0000\u018f"+
		"\u0191\u0003N\'\u0000\u0190\u018f\u0001\u0000\u0000\u0000\u0190\u0191"+
		"\u0001\u0000\u0000\u0000\u0191\u0192\u0001\u0000\u0000\u0000\u0192\u0198"+
		"\u0005\u0013\u0000\u0000\u0193\u0195\u0003N\'\u0000\u0194\u0193\u0001"+
		"\u0000\u0000\u0000\u0194\u0195\u0001\u0000\u0000\u0000\u0195\u0196\u0001"+
		"\u0000\u0000\u0000\u0196\u0198\u0005\u0014\u0000\u0000\u0197\u018d\u0001"+
		"\u0000\u0000\u0000\u0197\u018e\u0001\u0000\u0000\u0000\u0197\u0190\u0001"+
		"\u0000\u0000\u0000\u0197\u0194\u0001\u0000\u0000\u0000\u0198Q\u0001\u0000"+
		"\u0000\u0000\u0199\u019c\u0003Z-\u0000\u019a\u019c\u0003T*\u0000\u019b"+
		"\u0199\u0001\u0000\u0000\u0000\u019b\u019a\u0001\u0000\u0000\u0000\u019c"+
		"S\u0001\u0000\u0000\u0000\u019d\u019e\u0005\u001d\u0000\u0000\u019e\u019f"+
		"\u0003Z-\u0000\u019f\u01a0\u0005\u001e\u0000\u0000\u01a0U\u0001\u0000"+
		"\u0000\u0000\u01a1\u01a2\u0003l6\u0000\u01a2\u01a3\u0005\u001d\u0000\u0000"+
		"\u01a3\u01a4\u0003L&\u0000\u01a4\u01a5\u0005\u001e\u0000\u0000\u01a5W"+
		"\u0001\u0000\u0000\u0000\u01a6\u01a7\u0003Z-\u0000\u01a7\u01a8\u0003."+
		"\u0017\u0000\u01a8Y\u0001\u0000\u0000\u0000\u01a9\u01aa\u0005\u0013\u0000"+
		"\u0000\u01aa[\u0001\u0000\u0000\u0000\u01ab\u01ad\u0005\u001d\u0000\u0000"+
		"\u01ac\u01ab\u0001\u0000\u0000\u0000\u01ac\u01ad\u0001\u0000\u0000\u0000"+
		"\u01ad\u01ae\u0001\u0000\u0000\u0000\u01ae\u01bd\u0003^/\u0000\u01af\u01b7"+
		"\u0003^/\u0000\u01b0\u01b1\u0003b1\u0000\u01b1\u01b2\u0003^/\u0000\u01b2"+
		"\u01b4\u0001\u0000\u0000\u0000\u01b3\u01b0\u0001\u0000\u0000\u0000\u01b4"+
		"\u01b5\u0001\u0000\u0000\u0000\u01b5\u01b3\u0001\u0000\u0000\u0000\u01b5"+
		"\u01b6\u0001\u0000\u0000\u0000\u01b6\u01b8\u0001\u0000\u0000\u0000\u01b7"+
		"\u01b3\u0001\u0000\u0000\u0000\u01b7\u01b8\u0001\u0000\u0000\u0000\u01b8"+
		"\u01ba\u0001\u0000\u0000\u0000\u01b9\u01bb\u0005\u001e\u0000\u0000\u01ba"+
		"\u01b9\u0001\u0000\u0000\u0000\u01ba\u01bb\u0001\u0000\u0000\u0000\u01bb"+
		"\u01bd\u0001\u0000\u0000\u0000\u01bc\u01ac\u0001\u0000\u0000\u0000\u01bc"+
		"\u01af\u0001\u0000\u0000\u0000\u01bd]\u0001\u0000\u0000\u0000\u01be\u01bf"+
		"\u0003`0\u0000\u01bf\u01c0\u0003b1\u0000\u01c0\u01c1\u0003`0\u0000\u01c1"+
		"_\u0001\u0000\u0000\u0000\u01c2\u01d2\u0003\"\u0011\u0000\u01c3\u01d2"+
		"\u0003,\u0016\u0000\u01c4\u01d2\u0003(\u0014\u0000\u01c5\u01c7\u00056"+
		"\u0000\u0000\u01c6\u01c5\u0001\u0000\u0000\u0000\u01c6\u01c7\u0001\u0000"+
		"\u0000\u0000\u01c7\u01c8\u0001\u0000\u0000\u0000\u01c8\u01d0\u0003X,\u0000"+
		"\u01c9\u01d0\u0003f3\u0000\u01ca\u01cc\u00056\u0000\u0000\u01cb\u01ca"+
		"\u0001\u0000\u0000\u0000\u01cb\u01cc\u0001\u0000\u0000\u0000\u01cc\u01cd"+
		"\u0001\u0000\u0000\u0000\u01cd\u01d0\u0005-\u0000\u0000\u01ce\u01d0\u0003"+
		"P(\u0000\u01cf\u01c6\u0001\u0000\u0000\u0000\u01cf\u01c9\u0001\u0000\u0000"+
		"\u0000\u01cf\u01cb\u0001\u0000\u0000\u0000\u01cf\u01ce\u0001\u0000\u0000"+
		"\u0000\u01d0\u01d2\u0001\u0000\u0000\u0000\u01d1\u01c2\u0001\u0000\u0000"+
		"\u0000\u01d1\u01c3\u0001\u0000\u0000\u0000\u01d1\u01c4\u0001\u0000\u0000"+
		"\u0000\u01d1\u01cf\u0001\u0000\u0000\u0000\u01d2a\u0001\u0000\u0000\u0000"+
		"\u01d3\u01d4\u0005,\u0000\u0000\u01d4c\u0001\u0000\u0000\u0000\u01d5\u01d6"+
		"\u0005\u001a\u0000\u0000\u01d6\u01d8\u0005C\u0000\u0000\u01d7\u01d9\u0003"+
		"4\u001a\u0000\u01d8\u01d7\u0001\u0000\u0000\u0000\u01d8\u01d9\u0001\u0000"+
		"\u0000\u0000\u01d9e\u0001\u0000\u0000\u0000\u01da\u01dc\u00056\u0000\u0000"+
		"\u01db\u01da\u0001\u0000\u0000\u0000\u01db\u01dc\u0001\u0000\u0000\u0000"+
		"\u01dc\u01df\u0001\u0000\u0000\u0000\u01dd\u01e0\u0005\u001b\u0000\u0000"+
		"\u01de\u01e0\u0003h4\u0000\u01df\u01dd\u0001\u0000\u0000\u0000\u01df\u01de"+
		"\u0001\u0000\u0000\u0000\u01e0g\u0001\u0000\u0000\u0000\u01e1\u01e3\u0005"+
		"6\u0000\u0000\u01e2\u01e1\u0001\u0000\u0000\u0000\u01e2\u01e3\u0001\u0000"+
		"\u0000\u0000\u01e3\u01e4\u0001\u0000\u0000\u0000\u01e4\u01e5\u0005\u001b"+
		"\u0000\u0000\u01e5\u01e6\u0005\u001d\u0000\u0000\u01e6\u01e7\u0003P(\u0000"+
		"\u01e7\u01e8\u0005\u001e\u0000\u0000\u01e8i\u0001\u0000\u0000\u0000\u01e9"+
		"\u01ea\u0005\u001c\u0000\u0000\u01ea\u01eb\u0003\\.\u0000\u01eb\u01fe"+
		"\u0003\u0080@\u0000\u01ec\u01ee\u0005 \u0000\u0000\u01ed\u01ef\u0005\u001d"+
		"\u0000\u0000\u01ee\u01ed\u0001\u0000\u0000\u0000\u01ee\u01ef\u0001\u0000"+
		"\u0000\u0000\u01ef\u01f1\u0001\u0000\u0000\u0000\u01f0\u01f2\u0003`0\u0000"+
		"\u01f1\u01f0\u0001\u0000\u0000\u0000\u01f2\u01f3\u0001\u0000\u0000\u0000"+
		"\u01f3\u01f1\u0001\u0000\u0000\u0000\u01f3\u01f4\u0001\u0000\u0000\u0000"+
		"\u01f4\u01f6\u0001\u0000\u0000\u0000\u01f5\u01f7\u0005\u001e\u0000\u0000"+
		"\u01f6\u01f5\u0001\u0000\u0000\u0000\u01f6\u01f7\u0001\u0000\u0000\u0000"+
		"\u01f7\u01f8\u0001\u0000\u0000\u0000\u01f8\u01f9\u0003\u0080@\u0000\u01f9"+
		"\u01fd\u0001\u0000\u0000\u0000\u01fa\u01fb\u0005\u001f\u0000\u0000\u01fb"+
		"\u01fd\u0003\u0080@\u0000\u01fc\u01ec\u0001\u0000\u0000\u0000\u01fc\u01fa"+
		"\u0001\u0000\u0000\u0000\u01fd\u0200\u0001\u0000\u0000\u0000\u01fe\u01fc"+
		"\u0001\u0000\u0000\u0000\u01fe\u01ff\u0001\u0000\u0000\u0000\u01ffk\u0001"+
		"\u0000\u0000\u0000\u0200\u01fe\u0001\u0000\u0000\u0000\u0201\u0204\u0003"+
		"n7\u0000\u0202\u0204\u0003p8\u0000\u0203\u0201\u0001\u0000\u0000\u0000"+
		"\u0203\u0202\u0001\u0000\u0000\u0000\u0204m\u0001\u0000\u0000\u0000\u0205"+
		"\u0206\u0005\"\u0000\u0000\u0206o\u0001\u0000\u0000\u0000\u0207\u0208"+
		"\u00053\u0000\u0000\u0208q\u0001\u0000\u0000\u0000\u0209\u020a\u0005#"+
		"\u0000\u0000\u020as\u0001\u0000\u0000\u0000\u020b\u020e\u0005$\u0000\u0000"+
		"\u020c\u020e\u0003Z-\u0000\u020d\u020b\u0001\u0000\u0000\u0000\u020d\u020c"+
		"\u0001\u0000\u0000\u0000\u020eu\u0001\u0000\u0000\u0000\u020f\u021e\u0003"+
		"8\u001c\u0000\u0210\u021e\u0003X,\u0000\u0211\u021e\u0003(\u0014\u0000"+
		"\u0212\u021e\u0003*\u0015\u0000\u0213\u021e\u0003\\.\u0000\u0214\u021c"+
		"\u0003\"\u0011\u0000\u0215\u021c\u0003,\u0016\u0000\u0216\u021c\u0003"+
		"6\u001b\u0000\u0217\u021c\u0003P(\u0000\u0218\u021c\u0003x<\u0000\u0219"+
		"\u021c\u0005-\u0000\u0000\u021a\u021c\u0005%\u0000\u0000\u021b\u0214\u0001"+
		"\u0000\u0000\u0000\u021b\u0215\u0001\u0000\u0000\u0000\u021b\u0216\u0001"+
		"\u0000\u0000\u0000\u021b\u0217\u0001\u0000\u0000\u0000\u021b\u0218\u0001"+
		"\u0000\u0000\u0000\u021b\u0219\u0001\u0000\u0000\u0000\u021b\u021a\u0001"+
		"\u0000\u0000\u0000\u021c\u021e\u0001\u0000\u0000\u0000\u021d\u020f\u0001"+
		"\u0000\u0000\u0000\u021d\u0210\u0001\u0000\u0000\u0000\u021d\u0211\u0001"+
		"\u0000\u0000\u0000\u021d\u0212\u0001\u0000\u0000\u0000\u021d\u0213\u0001"+
		"\u0000\u0000\u0000\u021d\u021b\u0001\u0000\u0000\u0000\u021ew\u0001\u0000"+
		"\u0000\u0000\u021f\u0222\u0003Z-\u0000\u0220\u0221\u00053\u0000\u0000"+
		"\u0221\u0223\u0003Z-\u0000\u0222\u0220\u0001\u0000\u0000\u0000\u0223\u0224"+
		"\u0001\u0000\u0000\u0000\u0224\u0222\u0001\u0000\u0000\u0000\u0224\u0225"+
		"\u0001\u0000\u0000\u0000\u0225y\u0001\u0000\u0000\u0000\u0226\u0232\u0003"+
		"X,\u0000\u0227\u0232\u0003*\u0015\u0000\u0228\u0232\u0003\\.\u0000\u0229"+
		"\u0232\u0003(\u0014\u0000\u022a\u0232\u0003\"\u0011\u0000\u022b\u0232"+
		"\u0003,\u0016\u0000\u022c\u0232\u00036\u001b\u0000\u022d\u0232\u0005\u0013"+
		"\u0000\u0000\u022e\u0232\u0005D\u0000\u0000\u022f\u0232\u0007\u0000\u0000"+
		"\u0000\u0230\u0232\u0005-\u0000\u0000\u0231\u0226\u0001\u0000\u0000\u0000"+
		"\u0231\u0227\u0001\u0000\u0000\u0000\u0231\u0228\u0001\u0000\u0000\u0000"+
		"\u0231\u0229\u0001\u0000\u0000\u0000\u0231\u022a\u0001\u0000\u0000\u0000"+
		"\u0231\u022b\u0001\u0000\u0000\u0000\u0231\u022c\u0001\u0000\u0000\u0000"+
		"\u0231\u022d\u0001\u0000\u0000\u0000\u0231\u022e\u0001\u0000\u0000\u0000"+
		"\u0231\u022f\u0001\u0000\u0000\u0000\u0231\u0230\u0001\u0000\u0000\u0000"+
		"\u0232{\u0001\u0000\u0000\u0000\u0233\u0234\u0005&\u0000\u0000\u0234}"+
		"\u0001\u0000\u0000\u0000\u0235\u0236\u0005\'\u0000\u0000\u0236\u0237\u0003"+
		"\u008aE\u0000\u0237\u0238\u0005(\u0000\u0000\u0238\u007f\u0001\u0000\u0000"+
		"\u0000\u0239\u023b\u0005:\u0000\u0000\u023a\u023c\u0003\u0002\u0001\u0000"+
		"\u023b\u023a\u0001\u0000\u0000\u0000\u023c\u023d\u0001\u0000\u0000\u0000"+
		"\u023d\u023b\u0001\u0000\u0000\u0000\u023d\u023e\u0001\u0000\u0000\u0000"+
		"\u023e\u023f\u0001\u0000\u0000\u0000\u023f\u0240\u0005;\u0000\u0000\u0240"+
		"\u0081\u0001\u0000\u0000\u0000\u0241\u0243\u0005:\u0000\u0000\u0242\u0244"+
		"\u0003\u0004\u0002\u0000\u0243\u0242\u0001\u0000\u0000\u0000\u0244\u0245"+
		"\u0001\u0000\u0000\u0000\u0245\u0243\u0001\u0000\u0000\u0000\u0245\u0246"+
		"\u0001\u0000\u0000\u0000\u0246\u0247\u0001\u0000\u0000\u0000\u0247\u0248"+
		"\u0005;\u0000\u0000\u0248\u0083\u0001\u0000\u0000\u0000\u0249\u024e\u0005"+
		"\u001d\u0000\u0000\u024a\u024c\u0003Z-\u0000\u024b\u024d\u0005!\u0000"+
		"\u0000\u024c\u024b\u0001\u0000\u0000\u0000\u024c\u024d\u0001\u0000\u0000"+
		"\u0000\u024d\u024f\u0001\u0000\u0000\u0000\u024e\u024a\u0001\u0000\u0000"+
		"\u0000\u024f\u0250\u0001\u0000\u0000\u0000\u0250\u024e\u0001\u0000\u0000"+
		"\u0000\u0250\u0251\u0001\u0000\u0000\u0000\u0251\u0255\u0001\u0000\u0000"+
		"\u0000\u0252\u0253\u0005!\u0000\u0000\u0253\u0254\u0005)\u0000\u0000\u0254"+
		"\u0256\u0003Z-\u0000\u0255\u0252\u0001\u0000\u0000\u0000\u0255\u0256\u0001"+
		"\u0000\u0000\u0000\u0256\u0257\u0001\u0000\u0000\u0000\u0257\u0258\u0005"+
		"\u001e\u0000\u0000\u0258\u0085\u0001\u0000\u0000\u0000\u0259\u025e\u0005"+
		"\u001d\u0000\u0000\u025a\u025c\u0003\u0088D\u0000\u025b\u025d\u0005!\u0000"+
		"\u0000\u025c\u025b\u0001\u0000\u0000\u0000\u025c\u025d\u0001\u0000\u0000"+
		"\u0000\u025d\u025f\u0001\u0000\u0000\u0000\u025e\u025a\u0001\u0000\u0000"+
		"\u0000\u025f\u0260\u0001\u0000\u0000\u0000\u0260\u025e\u0001\u0000\u0000"+
		"\u0000\u0260\u0261\u0001\u0000\u0000\u0000\u0261\u0265\u0001\u0000\u0000"+
		"\u0000\u0262\u0263\u0005!\u0000\u0000\u0263\u0264\u0005)\u0000\u0000\u0264"+
		"\u0266\u0003\u0088D\u0000\u0265\u0262\u0001\u0000\u0000\u0000\u0265\u0266"+
		"\u0001\u0000\u0000\u0000\u0266\u0267\u0001\u0000\u0000\u0000\u0267\u0268"+
		"\u0005\u001e\u0000\u0000\u0268\u0087\u0001\u0000\u0000\u0000\u0269\u0270"+
		"\u0003,\u0016\u0000\u026a\u0270\u0003\"\u0011\u0000\u026b\u0270\u0003"+
		"*\u0015\u0000\u026c\u0270\u0003\\.\u0000\u026d\u0270\u00036\u001b\u0000"+
		"\u026e\u0270\u0003Z-\u0000\u026f\u0269\u0001\u0000\u0000\u0000\u026f\u026a"+
		"\u0001\u0000\u0000\u0000\u026f\u026b\u0001\u0000\u0000\u0000\u026f\u026c"+
		"\u0001\u0000\u0000\u0000\u026f\u026d\u0001\u0000\u0000\u0000\u026f\u026e"+
		"\u0001\u0000\u0000\u0000\u0270\u0089\u0001\u0000\u0000\u0000\u0271\u0272"+
		"\u0005\u001d\u0000\u0000\u0272\u0273\u0007\u0000\u0000\u0000\u0273\u0274"+
		"\u0005\u001e\u0000\u0000\u0274\u008b\u0001\u0000\u0000\u0000\u0275\u027a"+
		"\u0005\u001d\u0000\u0000\u0276\u0278\u0005!\u0000\u0000\u0277\u0276\u0001"+
		"\u0000\u0000\u0000\u0277\u0278\u0001\u0000\u0000\u0000\u0278\u0279\u0001"+
		"\u0000\u0000\u0000\u0279\u027b\u0007\u0000\u0000\u0000\u027a\u0277\u0001"+
		"\u0000\u0000\u0000\u027b\u027c\u0001\u0000\u0000\u0000\u027c\u027a\u0001"+
		"\u0000\u0000\u0000\u027c\u027d\u0001\u0000\u0000\u0000\u027d\u027e\u0001"+
		"\u0000\u0000\u0000\u027e\u027f\u0005\u001e\u0000\u0000\u027f\u008d\u0001"+
		"\u0000\u0000\u0000\u0280\u0281\u0005/\u0000\u0000\u0281\u0283\u0003(\u0014"+
		"\u0000\u0282\u0284\u0005@\u0000\u0000\u0283\u0282\u0001\u0000\u0000\u0000"+
		"\u0283\u0284\u0001\u0000\u0000\u0000\u0284\u008f\u0001\u0000\u0000\u0000"+
		"\u0285\u0286\u00052\u0000\u0000\u0286\u0091\u0001\u0000\u0000\u0000K\u0095"+
		"\u00aa\u00b3\u00d1\u00d3\u00d5\u00e8\u00f1\u00fc\u0109\u010e\u0112\u0114"+
		"\u011c\u0120\u0126\u012d\u0136\u013d\u013f\u0148\u014b\u014d\u015e\u0160"+
		"\u0166\u016a\u016f\u0171\u0174\u017a\u017d\u0180\u0187\u0189\u0190\u0194"+
		"\u0197\u019b\u01ac\u01b5\u01b7\u01ba\u01bc\u01c6\u01cb\u01cf\u01d1\u01d8"+
		"\u01db\u01df\u01e2\u01ee\u01f3\u01f6\u01fc\u01fe\u0203\u020d\u021b\u021d"+
		"\u0224\u0231\u023d\u0245\u024c\u0250\u0255\u025c\u0260\u0265\u026f\u0277"+
		"\u027c\u0283";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}