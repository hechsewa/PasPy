// Generated from pascal.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link pascal}.
 */
public interface pascalListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link pascal#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(pascal.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(pascal.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal#programHeading}.
	 * @param ctx the parse tree
	 */
	void enterProgramHeading(pascal.ProgramHeadingContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal#programHeading}.
	 * @param ctx the parse tree
	 */
	void exitProgramHeading(pascal.ProgramHeadingContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(pascal.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(pascal.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(pascal.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(pascal.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal#constantDefinitionPart}.
	 * @param ctx the parse tree
	 */
	void enterConstantDefinitionPart(pascal.ConstantDefinitionPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal#constantDefinitionPart}.
	 * @param ctx the parse tree
	 */
	void exitConstantDefinitionPart(pascal.ConstantDefinitionPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal#constantDefinition}.
	 * @param ctx the parse tree
	 */
	void enterConstantDefinition(pascal.ConstantDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal#constantDefinition}.
	 * @param ctx the parse tree
	 */
	void exitConstantDefinition(pascal.ConstantDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(pascal.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(pascal.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal#unsignedNumber}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedNumber(pascal.UnsignedNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal#unsignedNumber}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedNumber(pascal.UnsignedNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal#unsignedInteger}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedInteger(pascal.UnsignedIntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal#unsignedInteger}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedInteger(pascal.UnsignedIntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal#unsignedReal}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedReal(pascal.UnsignedRealContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal#unsignedReal}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedReal(pascal.UnsignedRealContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(pascal.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(pascal.SignContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(pascal.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(pascal.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal#string}.
	 * @param ctx the parse tree
	 */
	void enterString(pascal.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal#string}.
	 * @param ctx the parse tree
	 */
	void exitString(pascal.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal#type}.
	 * @param ctx the parse tree
	 */
	void enterType(pascal.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal#type}.
	 * @param ctx the parse tree
	 */
	void exitType(pascal.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal#scalarType}.
	 * @param ctx the parse tree
	 */
	void enterScalarType(pascal.ScalarTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal#scalarType}.
	 * @param ctx the parse tree
	 */
	void exitScalarType(pascal.ScalarTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeIdentifier(pascal.TypeIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeIdentifier(pascal.TypeIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal#stringtype}.
	 * @param ctx the parse tree
	 */
	void enterStringtype(pascal.StringtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal#stringtype}.
	 * @param ctx the parse tree
	 */
	void exitStringtype(pascal.StringtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(pascal.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(pascal.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(pascal.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(pascal.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal#variableDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationPart(pascal.VariableDeclarationPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal#variableDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationPart(pascal.VariableDeclarationPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(pascal.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(pascal.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal#procedureAndFunctionDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void enterProcedureAndFunctionDeclarationPart(pascal.ProcedureAndFunctionDeclarationPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal#procedureAndFunctionDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void exitProcedureAndFunctionDeclarationPart(pascal.ProcedureAndFunctionDeclarationPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal#procedureOrFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProcedureOrFunctionDeclaration(pascal.ProcedureOrFunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal#procedureOrFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProcedureOrFunctionDeclaration(pascal.ProcedureOrFunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal#procedureDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProcedureDeclaration(pascal.ProcedureDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal#procedureDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProcedureDeclaration(pascal.ProcedureDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(pascal.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(pascal.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal#formalParameterSection}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterSection(pascal.FormalParameterSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal#formalParameterSection}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterSection(pascal.FormalParameterSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal#parameterGroup}.
	 * @param ctx the parse tree
	 */
	void enterParameterGroup(pascal.ParameterGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal#parameterGroup}.
	 * @param ctx the parse tree
	 */
	void exitParameterGroup(pascal.ParameterGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(pascal.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(pascal.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(pascal.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(pascal.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal#resultType}.
	 * @param ctx the parse tree
	 */
	void enterResultType(pascal.ResultTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal#resultType}.
	 * @param ctx the parse tree
	 */
	void exitResultType(pascal.ResultTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(pascal.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(pascal.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStatement(pascal.SimpleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStatement(pascal.SimpleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(pascal.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(pascal.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(pascal.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(pascal.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(pascal.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(pascal.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal#relationaloperator}.
	 * @param ctx the parse tree
	 */
	void enterRelationaloperator(pascal.RelationaloperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal#relationaloperator}.
	 * @param ctx the parse tree
	 */
	void exitRelationaloperator(pascal.RelationaloperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpression(pascal.SimpleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpression(pascal.SimpleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal#additiveoperator}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveoperator(pascal.AdditiveoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal#additiveoperator}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveoperator(pascal.AdditiveoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(pascal.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(pascal.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal#multiplicativeoperator}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeoperator(pascal.MultiplicativeoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal#multiplicativeoperator}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeoperator(pascal.MultiplicativeoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal#signedFactor}.
	 * @param ctx the parse tree
	 */
	void enterSignedFactor(pascal.SignedFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal#signedFactor}.
	 * @param ctx the parse tree
	 */
	void exitSignedFactor(pascal.SignedFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(pascal.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(pascal.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal#unsignedConstant}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedConstant(pascal.UnsignedConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal#unsignedConstant}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedConstant(pascal.UnsignedConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal#functionDesignator}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDesignator(pascal.FunctionDesignatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal#functionDesignator}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDesignator(pascal.FunctionDesignatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(pascal.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(pascal.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal#procedureStatement}.
	 * @param ctx the parse tree
	 */
	void enterProcedureStatement(pascal.ProcedureStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal#procedureStatement}.
	 * @param ctx the parse tree
	 */
	void exitProcedureStatement(pascal.ProcedureStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal#actualParameter}.
	 * @param ctx the parse tree
	 */
	void enterActualParameter(pascal.ActualParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal#actualParameter}.
	 * @param ctx the parse tree
	 */
	void exitActualParameter(pascal.ActualParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal#parameterwidth}.
	 * @param ctx the parse tree
	 */
	void enterParameterwidth(pascal.ParameterwidthContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal#parameterwidth}.
	 * @param ctx the parse tree
	 */
	void exitParameterwidth(pascal.ParameterwidthContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(pascal.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(pascal.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal#empty}.
	 * @param ctx the parse tree
	 */
	void enterEmpty(pascal.EmptyContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal#empty}.
	 * @param ctx the parse tree
	 */
	void exitEmpty(pascal.EmptyContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal#structuredStatement}.
	 * @param ctx the parse tree
	 */
	void enterStructuredStatement(pascal.StructuredStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal#structuredStatement}.
	 * @param ctx the parse tree
	 */
	void exitStructuredStatement(pascal.StructuredStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(pascal.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(pascal.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(pascal.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(pascal.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(pascal.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(pascal.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal#repetetiveStatement}.
	 * @param ctx the parse tree
	 */
	void enterRepetetiveStatement(pascal.RepetetiveStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal#repetetiveStatement}.
	 * @param ctx the parse tree
	 */
	void exitRepetetiveStatement(pascal.RepetetiveStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(pascal.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(pascal.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(pascal.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(pascal.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal#forList}.
	 * @param ctx the parse tree
	 */
	void enterForList(pascal.ForListContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal#forList}.
	 * @param ctx the parse tree
	 */
	void exitForList(pascal.ForListContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal#initialValue}.
	 * @param ctx the parse tree
	 */
	void enterInitialValue(pascal.InitialValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal#initialValue}.
	 * @param ctx the parse tree
	 */
	void exitInitialValue(pascal.InitialValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascal#finalValue}.
	 * @param ctx the parse tree
	 */
	void enterFinalValue(pascal.FinalValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascal#finalValue}.
	 * @param ctx the parse tree
	 */
	void exitFinalValue(pascal.FinalValueContext ctx);
}