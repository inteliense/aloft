// Generated from C:/Users/ryanfitzgerald/Development/aloft/aloft-server/src/main/java/org/extendedweb/aloft/server/grammar/antlr/Aloft.g4 by ANTLR 4.13.2
package org.extendedweb.aloft.server.grammar.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AloftParser}.
 */
public interface AloftListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AloftParser#r}.
	 * @param ctx the parse tree
	 */
	void enterR(AloftParser.RContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#r}.
	 * @param ctx the parse tree
	 */
	void exitR(AloftParser.RContext ctx);
	/**
	 * Enter a parse tree produced by {@link AloftParser#syntax}.
	 * @param ctx the parse tree
	 */
	void enterSyntax(AloftParser.SyntaxContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#syntax}.
	 * @param ctx the parse tree
	 */
	void exitSyntax(AloftParser.SyntaxContext ctx);
	/**
	 * Enter a parse tree produced by {@link AloftParser#function_syntax}.
	 * @param ctx the parse tree
	 */
	void enterFunction_syntax(AloftParser.Function_syntaxContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#function_syntax}.
	 * @param ctx the parse tree
	 */
	void exitFunction_syntax(AloftParser.Function_syntaxContext ctx);
	/**
	 * Enter a parse tree produced by {@link AloftParser#component}.
	 * @param ctx the parse tree
	 */
	void enterComponent(AloftParser.ComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#component}.
	 * @param ctx the parse tree
	 */
	void exitComponent(AloftParser.ComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AloftParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(AloftParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(AloftParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AloftParser#theme}.
	 * @param ctx the parse tree
	 */
	void enterTheme(AloftParser.ThemeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#theme}.
	 * @param ctx the parse tree
	 */
	void exitTheme(AloftParser.ThemeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AloftParser#model}.
	 * @param ctx the parse tree
	 */
	void enterModel(AloftParser.ModelContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#model}.
	 * @param ctx the parse tree
	 */
	void exitModel(AloftParser.ModelContext ctx);
	/**
	 * Enter a parse tree produced by {@link AloftParser#routes}.
	 * @param ctx the parse tree
	 */
	void enterRoutes(AloftParser.RoutesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#routes}.
	 * @param ctx the parse tree
	 */
	void exitRoutes(AloftParser.RoutesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AloftParser#routes_through}.
	 * @param ctx the parse tree
	 */
	void enterRoutes_through(AloftParser.Routes_throughContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#routes_through}.
	 * @param ctx the parse tree
	 */
	void exitRoutes_through(AloftParser.Routes_throughContext ctx);
	/**
	 * Enter a parse tree produced by {@link AloftParser#project}.
	 * @param ctx the parse tree
	 */
	void enterProject(AloftParser.ProjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#project}.
	 * @param ctx the parse tree
	 */
	void exitProject(AloftParser.ProjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link AloftParser#page}.
	 * @param ctx the parse tree
	 */
	void enterPage(AloftParser.PageContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#page}.
	 * @param ctx the parse tree
	 */
	void exitPage(AloftParser.PageContext ctx);
	/**
	 * Enter a parse tree produced by {@link AloftParser#animation}.
	 * @param ctx the parse tree
	 */
	void enterAnimation(AloftParser.AnimationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#animation}.
	 * @param ctx the parse tree
	 */
	void exitAnimation(AloftParser.AnimationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AloftParser#module}.
	 * @param ctx the parse tree
	 */
	void enterModule(AloftParser.ModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#module}.
	 * @param ctx the parse tree
	 */
	void exitModule(AloftParser.ModuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link AloftParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(AloftParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(AloftParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link AloftParser#source}.
	 * @param ctx the parse tree
	 */
	void enterSource(AloftParser.SourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#source}.
	 * @param ctx the parse tree
	 */
	void exitSource(AloftParser.SourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link AloftParser#callable}.
	 * @param ctx the parse tree
	 */
	void enterCallable(AloftParser.CallableContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#callable}.
	 * @param ctx the parse tree
	 */
	void exitCallable(AloftParser.CallableContext ctx);
	/**
	 * Enter a parse tree produced by {@link AloftParser#constructor}.
	 * @param ctx the parse tree
	 */
	void enterConstructor(AloftParser.ConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#constructor}.
	 * @param ctx the parse tree
	 */
	void exitConstructor(AloftParser.ConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AloftParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(AloftParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(AloftParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link AloftParser#path_with_var}.
	 * @param ctx the parse tree
	 */
	void enterPath_with_var(AloftParser.Path_with_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#path_with_var}.
	 * @param ctx the parse tree
	 */
	void exitPath_with_var(AloftParser.Path_with_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link AloftParser#path_var}.
	 * @param ctx the parse tree
	 */
	void enterPath_var(AloftParser.Path_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#path_var}.
	 * @param ctx the parse tree
	 */
	void exitPath_var(AloftParser.Path_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link AloftParser#path}.
	 * @param ctx the parse tree
	 */
	void enterPath(AloftParser.PathContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#path}.
	 * @param ctx the parse tree
	 */
	void exitPath(AloftParser.PathContext ctx);
	/**
	 * Enter a parse tree produced by {@link AloftParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(AloftParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(AloftParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link AloftParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(AloftParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(AloftParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link AloftParser#param_values}.
	 * @param ctx the parse tree
	 */
	void enterParam_values(AloftParser.Param_valuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#param_values}.
	 * @param ctx the parse tree
	 */
	void exitParam_values(AloftParser.Param_valuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AloftParser#var_args}.
	 * @param ctx the parse tree
	 */
	void enterVar_args(AloftParser.Var_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#var_args}.
	 * @param ctx the parse tree
	 */
	void exitVar_args(AloftParser.Var_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AloftParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(AloftParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(AloftParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AloftParser#return_value}.
	 * @param ctx the parse tree
	 */
	void enterReturn_value(AloftParser.Return_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#return_value}.
	 * @param ctx the parse tree
	 */
	void exitReturn_value(AloftParser.Return_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AloftParser#html_element}.
	 * @param ctx the parse tree
	 */
	void enterHtml_element(AloftParser.Html_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#html_element}.
	 * @param ctx the parse tree
	 */
	void exitHtml_element(AloftParser.Html_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AloftParser#component_tree}.
	 * @param ctx the parse tree
	 */
	void enterComponent_tree(AloftParser.Component_treeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#component_tree}.
	 * @param ctx the parse tree
	 */
	void exitComponent_tree(AloftParser.Component_treeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AloftParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(AloftParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(AloftParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AloftParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration(AloftParser.Function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration(AloftParser.Function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AloftParser#update}.
	 * @param ctx the parse tree
	 */
	void enterUpdate(AloftParser.UpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#update}.
	 * @param ctx the parse tree
	 */
	void exitUpdate(AloftParser.UpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link AloftParser#update_declaration}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_declaration(AloftParser.Update_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#update_declaration}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_declaration(AloftParser.Update_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AloftParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(AloftParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(AloftParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link AloftParser#function_types}.
	 * @param ctx the parse tree
	 */
	void enterFunction_types(AloftParser.Function_typesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#function_types}.
	 * @param ctx the parse tree
	 */
	void exitFunction_types(AloftParser.Function_typesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AloftParser#declare_variable}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_variable(AloftParser.Declare_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#declare_variable}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_variable(AloftParser.Declare_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link AloftParser#assign_variable}.
	 * @param ctx the parse tree
	 */
	void enterAssign_variable(AloftParser.Assign_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#assign_variable}.
	 * @param ctx the parse tree
	 */
	void exitAssign_variable(AloftParser.Assign_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link AloftParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(AloftParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(AloftParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link AloftParser#var_names}.
	 * @param ctx the parse tree
	 */
	void enterVar_names(AloftParser.Var_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#var_names}.
	 * @param ctx the parse tree
	 */
	void exitVar_names(AloftParser.Var_namesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AloftParser#this}.
	 * @param ctx the parse tree
	 */
	void enterThis(AloftParser.ThisContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#this}.
	 * @param ctx the parse tree
	 */
	void exitThis(AloftParser.ThisContext ctx);
	/**
	 * Enter a parse tree produced by {@link AloftParser#any_var}.
	 * @param ctx the parse tree
	 */
	void enterAny_var(AloftParser.Any_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#any_var}.
	 * @param ctx the parse tree
	 */
	void exitAny_var(AloftParser.Any_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link AloftParser#name_declaration}.
	 * @param ctx the parse tree
	 */
	void enterName_declaration(AloftParser.Name_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#name_declaration}.
	 * @param ctx the parse tree
	 */
	void exitName_declaration(AloftParser.Name_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AloftParser#private_named}.
	 * @param ctx the parse tree
	 */
	void enterPrivate_named(AloftParser.Private_namedContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#private_named}.
	 * @param ctx the parse tree
	 */
	void exitPrivate_named(AloftParser.Private_namedContext ctx);
	/**
	 * Enter a parse tree produced by {@link AloftParser#private_named_multiple}.
	 * @param ctx the parse tree
	 */
	void enterPrivate_named_multiple(AloftParser.Private_named_multipleContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#private_named_multiple}.
	 * @param ctx the parse tree
	 */
	void exitPrivate_named_multiple(AloftParser.Private_named_multipleContext ctx);
	/**
	 * Enter a parse tree produced by {@link AloftParser#var_name_with_params}.
	 * @param ctx the parse tree
	 */
	void enterVar_name_with_params(AloftParser.Var_name_with_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#var_name_with_params}.
	 * @param ctx the parse tree
	 */
	void exitVar_name_with_params(AloftParser.Var_name_with_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AloftParser#var_name}.
	 * @param ctx the parse tree
	 */
	void enterVar_name(AloftParser.Var_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#var_name}.
	 * @param ctx the parse tree
	 */
	void exitVar_name(AloftParser.Var_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link AloftParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(AloftParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(AloftParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AloftParser#expression_value}.
	 * @param ctx the parse tree
	 */
	void enterExpression_value(AloftParser.Expression_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#expression_value}.
	 * @param ctx the parse tree
	 */
	void exitExpression_value(AloftParser.Expression_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AloftParser#var_expression}.
	 * @param ctx the parse tree
	 */
	void enterVar_expression(AloftParser.Var_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#var_expression}.
	 * @param ctx the parse tree
	 */
	void exitVar_expression(AloftParser.Var_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AloftParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(AloftParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(AloftParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AloftParser#return}.
	 * @param ctx the parse tree
	 */
	void enterReturn(AloftParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#return}.
	 * @param ctx the parse tree
	 */
	void exitReturn(AloftParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link AloftParser#isset}.
	 * @param ctx the parse tree
	 */
	void enterIsset(AloftParser.IssetContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#isset}.
	 * @param ctx the parse tree
	 */
	void exitIsset(AloftParser.IssetContext ctx);
	/**
	 * Enter a parse tree produced by {@link AloftParser#empty_function}.
	 * @param ctx the parse tree
	 */
	void enterEmpty_function(AloftParser.Empty_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#empty_function}.
	 * @param ctx the parse tree
	 */
	void exitEmpty_function(AloftParser.Empty_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AloftParser#if}.
	 * @param ctx the parse tree
	 */
	void enterIf(AloftParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#if}.
	 * @param ctx the parse tree
	 */
	void exitIf(AloftParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by {@link AloftParser#var_access}.
	 * @param ctx the parse tree
	 */
	void enterVar_access(AloftParser.Var_accessContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#var_access}.
	 * @param ctx the parse tree
	 */
	void exitVar_access(AloftParser.Var_accessContext ctx);
	/**
	 * Enter a parse tree produced by {@link AloftParser#required_field}.
	 * @param ctx the parse tree
	 */
	void enterRequired_field(AloftParser.Required_fieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#required_field}.
	 * @param ctx the parse tree
	 */
	void exitRequired_field(AloftParser.Required_fieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link AloftParser#static_field}.
	 * @param ctx the parse tree
	 */
	void enterStatic_field(AloftParser.Static_fieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#static_field}.
	 * @param ctx the parse tree
	 */
	void exitStatic_field(AloftParser.Static_fieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link AloftParser#var_options}.
	 * @param ctx the parse tree
	 */
	void enterVar_options(AloftParser.Var_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#var_options}.
	 * @param ctx the parse tree
	 */
	void exitVar_options(AloftParser.Var_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AloftParser#var_type}.
	 * @param ctx the parse tree
	 */
	void enterVar_type(AloftParser.Var_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#var_type}.
	 * @param ctx the parse tree
	 */
	void exitVar_type(AloftParser.Var_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AloftParser#property_value}.
	 * @param ctx the parse tree
	 */
	void enterProperty_value(AloftParser.Property_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#property_value}.
	 * @param ctx the parse tree
	 */
	void exitProperty_value(AloftParser.Property_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AloftParser#static_var}.
	 * @param ctx the parse tree
	 */
	void enterStatic_var(AloftParser.Static_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#static_var}.
	 * @param ctx the parse tree
	 */
	void exitStatic_var(AloftParser.Static_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link AloftParser#return_property_value}.
	 * @param ctx the parse tree
	 */
	void enterReturn_property_value(AloftParser.Return_property_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#return_property_value}.
	 * @param ctx the parse tree
	 */
	void exitReturn_property_value(AloftParser.Return_property_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AloftParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(AloftParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(AloftParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link AloftParser#switch_block}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_block(AloftParser.Switch_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#switch_block}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_block(AloftParser.Switch_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AloftParser#curly_block}.
	 * @param ctx the parse tree
	 */
	void enterCurly_block(AloftParser.Curly_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#curly_block}.
	 * @param ctx the parse tree
	 */
	void exitCurly_block(AloftParser.Curly_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AloftParser#function_curly_block}.
	 * @param ctx the parse tree
	 */
	void enterFunction_curly_block(AloftParser.Function_curly_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#function_curly_block}.
	 * @param ctx the parse tree
	 */
	void exitFunction_curly_block(AloftParser.Function_curly_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AloftParser#named_with_params_special}.
	 * @param ctx the parse tree
	 */
	void enterNamed_with_params_special(AloftParser.Named_with_params_specialContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#named_with_params_special}.
	 * @param ctx the parse tree
	 */
	void exitNamed_with_params_special(AloftParser.Named_with_params_specialContext ctx);
	/**
	 * Enter a parse tree produced by {@link AloftParser#vars_with_params_special}.
	 * @param ctx the parse tree
	 */
	void enterVars_with_params_special(AloftParser.Vars_with_params_specialContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#vars_with_params_special}.
	 * @param ctx the parse tree
	 */
	void exitVars_with_params_special(AloftParser.Vars_with_params_specialContext ctx);
	/**
	 * Enter a parse tree produced by {@link AloftParser#var_param}.
	 * @param ctx the parse tree
	 */
	void enterVar_param(AloftParser.Var_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#var_param}.
	 * @param ctx the parse tree
	 */
	void exitVar_param(AloftParser.Var_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link AloftParser#named_switch}.
	 * @param ctx the parse tree
	 */
	void enterNamed_switch(AloftParser.Named_switchContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#named_switch}.
	 * @param ctx the parse tree
	 */
	void exitNamed_switch(AloftParser.Named_switchContext ctx);
	/**
	 * Enter a parse tree produced by {@link AloftParser#enclosed_vars}.
	 * @param ctx the parse tree
	 */
	void enterEnclosed_vars(AloftParser.Enclosed_varsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#enclosed_vars}.
	 * @param ctx the parse tree
	 */
	void exitEnclosed_vars(AloftParser.Enclosed_varsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AloftParser#goto}.
	 * @param ctx the parse tree
	 */
	void enterGoto(AloftParser.GotoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#goto}.
	 * @param ctx the parse tree
	 */
	void exitGoto(AloftParser.GotoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AloftParser#file_name}.
	 * @param ctx the parse tree
	 */
	void enterFile_name(AloftParser.File_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AloftParser#file_name}.
	 * @param ctx the parse tree
	 */
	void exitFile_name(AloftParser.File_nameContext ctx);
}