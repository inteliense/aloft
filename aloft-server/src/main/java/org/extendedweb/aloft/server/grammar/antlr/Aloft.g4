/* author: Ryan Fitzgerald */
/* First ANTLR experience (no clue if it works) */
grammar Aloft;
r : syntax+ EOF;
syntax :  loop | function  | query  |  source | component | element | model | theme | callable | routes | page | animation | module |  property | declare_variable | STATEMENT_END;
function_syntax : switch_block | if | assign_variable | constructor | function_call | return | declare_variable | STATEMENT_END ;
component : COMPONENT_KEYWORD var_name curly_block ;
element : ELEMENT_KEYWORD var_name curly_block ;
theme : THEME_KEYWORD var_name curly_block ;
model : MODEL_KEYWORD var_name curly_block ;
routes: ROUTES_KEYWORD var_name ('through' (var_name | (COMMA var_name)+)) curly_block ;
page : PAGE_KEYWORD var_name curly_block ;
animation : ANIMATION_KEYWORD var_name curly_block ;
module : MODULE_KEYWORD var_name curly_block ;
//TODO make params a rule for query and more (arg1, arg2, ...args)
query : QUERY_KEYWORD  var_name_with_params curly_block ;
source : SOURCE_KEYWORD path STATEMENT_END? ;
callable : CALLABLE_KEYWORD path curly_block ;
constructor : CONSTRUCTOR_KEYWORD var_name curly_block ;
//class : class_name_declaration var_name curly_block ;
//class_name_declaration : class_access? ('class') ;
//CLASS_ACCESS : ( 'universal ' | 'server ' | 'client ' ) ;
//class_access : CLASS_ACCESS ;
QUERY_KEYWORD : ('query')  ;
CONSTRUCTOR_KEYWORD : ('create') ;
CALLABLE_KEYWORD : ('callable') ;
SOURCE_KEYWORD : ('source') ;
MODULE_KEYWORD : ('module') ;
THEME_KEYWORD : ('theme') ;
ELEMENT_KEYWORD : ('element') ;
COMPONENT_KEYWORD : ('component') ;
ANIMATION_KEYWORD : ('animation') ;
ROUTES_KEYWORD : ('routes') ;
PAGE_KEYWORD : ('page') ;
MODEL_KEYWORD : ('model') ;
number : DIGITS ;
DECIMALS : (DIGITS '.' DIGITS) ;
DIGITS :  ([0-9]+) ;
HTML_ELEMENT :  ([#])([a-zA-Z0-9_-]+) ;
NAMED : ([a-zA-Z0-9_](([a-zA-Z0-9-_]+)[a-zA-Z0-9_])?) ;
//NAMED_WITH_EMPTY_PARAMS : NAMED WS? OPEN_PARENTHESES WS? CLOSE_PARENTHESES ;
NAMED_VAR : NAMED_OBJECT_ARRAY | NAMED_ARRAY | NAMED_OBJECT ;
path_with_var : file_name path_var ;
path_var :  (OPEN_BRACKETS) var_name (CLOSE_BRACKETS) ;
path : path_with_var | file_name ;
array: OPEN_BRACES ((property_value COMMA?)+)? CLOSE_BRACES ;
string: QUOTED_STRING ;
QUOTED_STRING : QUOTES .*? QUOTES;
ARRAY_TYPE_SUFFIX : [[][\]] ;
function : function_declaration function_curly_block ;
function_declaration : (function_types) (ARRAY_TYPE_SUFFIX? STATIC_ACCESS?)? (name_declaration var_args) ;
function_call : any_var var_args ;
function_types: ('update') | ('void') | (var_type | var_name) ;
declare_variable : ((variable var_options? (assignment (var_expression | expression))?)) (STATEMENT_END) ;
assign_variable : expression_value ;
variable : (private_named_multiple | var_access? var_names) var_type?;
var_names : (var_name ((COMMA var_name)+)?) ;
any_var : NAMED_VAR | NAMED ;
name_declaration : var_name | private_named;
private_named: OPEN_PARENTHESES NAMED CLOSE_PARENTHESES ;
private_named_multiple: var_access OPEN_PARENTHESES var_names CLOSE_PARENTHESES ;
var_name_with_params : var_name param_values ;
//PRIVATE_NAMED: ([(][ ]?[a-zA-Z0-9_](([a-zA-Z0-9-_]+)[a-zA-Z0-9_])?[ ]?[)]) ;
var_name : NAMED ;
expression: OPEN_PARENTHESES? (expression_value) | expression_value (((assignment) expression_value)+)? CLOSE_PARENTHESES?;
expression_value : (var_expression) assignment (var_expression) ;
var_expression : number | string | path | (((NOT? (var_name_with_params))) | isset | (NOT? NULL_VALUE) | any_var) ; // | BRACES ARRAY BLOCK;
assignment: OPERATORS ;
return: 'return' (WS return_value?) ;
isset : NOT? (ISSET_KEYWORD | empty_function);
ISSET_KEYWORD : ('isset') ;
empty_function : ('empty' OPEN_PARENTHESES any_var CLOSE_PARENTHESES) ;
if : IF_KEYWORD expression curly_block ((ELSE_IF (OPEN_PARENTHESES? var_expression+ CLOSE_PARENTHESES? curly_block)) | (ELSE curly_block))* ;
IF_KEYWORD : ('if') ;
OPEN_PARENTHESES : [(];
CLOSE_PARENTHESES: [)] ;
ELSE : ('else') ;
ELSE_IF : (('elseif') |  ('else if')) ;
COMMA : ([,]) ;
var_access : required_field | static_field ;
required_field : REQUIRED_FIELD;
static_field : STATIC_ACCESS ;
REQUIRED_FIELD : '*';
var_options :  VAR_MAGIC;
VAR_MAGIC : 'get' | 'set' | 'none';
var_type : ('string') | ('number') | ('bool') | ('boolean') | ('dynamic') | ('function') | ('time')  | var_name ;
param_values : EMPTY_PARENTHESIS | named_with_params_special ;
var_args : EMPTY_PARENTHESIS | named_with_params_special ;
property : var_name COLON property_value (STATEMENT_END)?;
return_value : return_property_value | OPEN_BRACES property CLOSE_BRACES ;
html_element: HTML_ELEMENT ;
component_tree : var_name OPEN_PARENTHESES (html_element COMMA)? property ((COMMA property)+)? CLOSE_PARENTHESES ;
//PROPERTY_VALUES : (number | QUOTED_STRING | path | HTML_ELEMENT | NAMED | NAMED_DOT | (NAMED_VAR | NAMED) | NULL_VALUE | '*') ; // | BRACES_ARRAY_BLOCK | NAMED_PROPERTY_OBJECT | NAMED_PROPERTY ;
property_value : var_name_with_params | path | array | expression | component_tree | (number | string | html_element | NAMED | NAMED_DOT | (NAMED_VAR | NAMED) | NULL_VALUE | '*') ;
return_property_value : var_name_with_params | path | array | expression | (number | string | html_element | NAMED | NAMED_DOT | (NAMED_VAR | NAMED) | NULL_VALUE) ;
loop : LOOP_name_declaration ;
LOOP_name_declaration :  ('repeat') ; // (((('through') NAMED  ('as') NAMED) | (('until') ([(])? var_expression+ ([)])? (('from') number)?) | (('while') ([(])? var_expression+ ([)])?))) curly_block ;
switch_block :  SWITCH_KEYWORD named_switch SWITCH_CURLY_BLOCK ;
SWITCH_KEYWORD : ('switch') ;
// CURLY BLOCK + IF_name_declaration (if)
//( ((('continue')[;] |  ('break')[;] | ((((GO_TO  | LOOP_name_declaration | number | PROPERTY | path | (NAMED_VAR | NAMED) | NULL_VALUE | CURLY_OBJECT_BLOCK | BRACES_ARRAY_BLOCK) (([,]))*)? (number | PROPERTY | path | (NAMED_VAR | NAMED) | NULL_VALUE | BRACES_ARRAY_BLOCK)))+ ))
curly_block: (OPEN_BRACKETS)  syntax+  (CLOSE_BRACKETS) ;
function_curly_block: (OPEN_BRACKETS)  function_syntax+   (CLOSE_BRACKETS) ;
// SWITCH CURLY BLOCK + IF_name_declaration (if)
SWITCH_CURLY_BLOCK : 'switch' ; // (OPEN_BRACKETS) (((('case')(([0-9]+)|(["'])([^"'])*(["'])|'null')[:]) | (('default')[:]) | ('break')[;])* | (((((GO_TO | path | LOOP_name_declaration | number | PROPERTY  | (NAMED_VAR | NAMED) | NULL_VALUE | CURLY_OBJECT_BLOCK | BRACES_ARRAY_BLOCK) ([,]))*)? (path | number | PROPERTY | (NAMED_VAR | NAMED) | NULL_VALUE | BRACES_ARRAY_BLOCK)))* (CLOSE_BRACKETS)) ;
named_with_params_special : (OPEN_PARENTHESES) ((((var_name COMMA?))+) | ((((var_name COMMA?))+))) ((COMMA ('...args'))? CLOSE_PARENTHESES) ;
//NAMED_WITH_PARAMS_VAR : (([(]) ((NAMED_VAR | NAMED) ([,])?)+ ('...' NAMED) ([)])) ;
//condtional : var_expression+ CONDITIONAL_IF var_expression* CONDITIONAL_ELSE var_expression* STATEMENT_END? ;
CONDITIONAL_IF : WS '?' WS;
CONDITIONAL_ELSE : WS ':' WS;
OPERATORS : EQUALS | ([.]) | ([&][&]) | ([|][|]) | ('==') | ([*]) | ([+]) | ([\-]) | ([\\]) | ([%]) | ([<]) | ([>]) | ([<][=]) | ([>][=]) | ([=][=][=]) | ([+][=]) | ([-][=]) | ([/][=]) | ([*][=]) | ([%][=]) ;
//BRACES_ARRAY_BLOCK : ([[]()?([)]) (((number | path | (NAMED_VAR | NAMED) | NULL_VALUE | CURLY_OBJECT_BLOCK | BRACES_ARRAY_BLOCK) (([,])))*)? (number | path | (NAMED_VAR | NAMED) | NULL_VALUE | BRACES_ARRAY_BLOCK)? (()?[\]])) ;
//CURLY_OBJECT_BLOCK : ((OPEN_BRACKETS)([)]) (((number | PROPERTY | path | (NAMED_VAR | NAMED) | NULL_VALUE | CURLY_OBJECT_BLOCK | BRACES_ARRAY_BLOCK) (([,])))*)? (number | PROPERTY | path | (NAMED_VAR | NAMED) | NULL_VALUE | BRACES_ARRAY_BLOCK)? ((CLOSE_BRACKETS))) ;
//PROPERTY : NAMED_PROPERTY PROPERTY_VALUES STATEMENT_END? ;
//NAMED_PROPERTY_OBJECT : NAMED ([(]) (((PROPERTY) (PROPERTY_VALUES)?) ([,])?)+ ([)]) ;

NULL_VALUE :  ('null') ;
EMPTY_PARENTHESIS : (OPEN_PARENTHESES CLOSE_PARENTHESES) ;
//enclosed_var : NAMED_PARENTHESIS_SPECIAL | enclosed_vars ;
//NAMED_PARENTHESIS_SPECIAL : (OPEN_PARENTHESES) (NAMED | ((COMMA) NAMED)) (CLOSE_PARENTHESES) ;
named_switch : OPEN_PARENTHESES (NAMED_VAR | NAMED) CLOSE_PARENTHESES ;
enclosed_vars : OPEN_PARENTHESES (COMMA? (NAMED_VAR | NAMED))+ CLOSE_PARENTHESES ;
NAMED_DOT : (((([+][+])|([-][-]))?)([a-zA-Z_])((([a-zA-Z0-9_-]*)([a-zA-Z_0-9]))?)[.]((([+][+])|([-][-]))?)([a-zA-Z_])((([a-zA-Z0-9_-]+)([a-zA-Z_0-9]))?))+ ;
NAMED_CLASS_ARRAY : (([a-zA-Z_])((([a-zA-Z0-9_-]*)([a-zA-Z_0-9]))?)([[][\]])?) ;
NAMED_OBJECT : (([a-zA-Z_])((([a-zA-Z0-9_-]*)([a-zA-Z_0-9]))?)([\-][>])) ;
NAMED_OBJECT_ARRAY : (((([+][+])|([-][-]))?)([a-zA-Z_])((([a-zA-Z0-9_-]*)([a-zA-Z_0-9]))?)((([+][+])|([\-][\-]))?)([[]([0-9]+)[\]][\-][>])) ;
NAMED_ARRAY : (((([+][+])|([\-][\-]))?)([a-zA-Z_])((([a-zA-Z0-9_-]*)([a-zA-Z_0-9]))?)([[]([0-9]+)[\]])((([+][+])|([\-][\-]))?)) ;
goto : GOTO_KEYWORD path STATEMENT_END? ;
GOTO_KEYWORD :  ('goto') ;
file_name : FILE_NAME ;
FILE_NAME : (PATH_START ([a-zA-Z\\/._0-9-]+)?) ;
STATIC_ACCESS : '::' ;
COLON : [:] ;
EQUALS : '=' ;
NOT : '!' ;
APPEND_ADD : '++' ;
APPEND_SUBTRACT : '--' ;
PATH_START : '^/' | '/' ;
OPEN_BRACKETS : '{' ;
CLOSE_BRACKETS : '}' ;
OPEN_BRACES: '[' ;
CLOSE_BRACES: ']' ;
END_OF_FILE : EOF;
QUOTES : (["']) ;
COMMENT_BLOCK_name_declaration : [/][*]  [^/*]*([*][/]) -> channel(HIDDEN) ;
WS : ([ \t\r]+) -> channel(HIDDEN) ;
STATEMENT_END : ([;] | [\n]+) ;
NEW_LINE : ([\n][\n]+) -> channel(HIDDEN) ;
