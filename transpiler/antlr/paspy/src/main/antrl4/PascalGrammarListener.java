// Generated from PascalGrammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PascalGrammar}.
 */
public interface PascalGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PascalGrammar#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PascalGrammar.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammar#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PascalGrammar.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammar#programHeading}.
	 * @param ctx the parse tree
	 */
	void enterProgramHeading(PascalGrammar.ProgramHeadingContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammar#programHeading}.
	 * @param ctx the parse tree
	 */
	void exitProgramHeading(PascalGrammar.ProgramHeadingContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammar#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(PascalGrammar.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammar#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(PascalGrammar.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammar#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(PascalGrammar.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammar#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(PascalGrammar.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammar#constantDefinitionPart}.
	 * @param ctx the parse tree
	 */
	void enterConstantDefinitionPart(PascalGrammar.ConstantDefinitionPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammar#constantDefinitionPart}.
	 * @param ctx the parse tree
	 */
	void exitConstantDefinitionPart(PascalGrammar.ConstantDefinitionPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammar#constantDefinition}.
	 * @param ctx the parse tree
	 */
	void enterConstantDefinition(PascalGrammar.ConstantDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammar#constantDefinition}.
	 * @param ctx the parse tree
	 */
	void exitConstantDefinition(PascalGrammar.ConstantDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammar#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(PascalGrammar.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammar#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(PascalGrammar.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammar#unsignedNumber}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedNumber(PascalGrammar.UnsignedNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammar#unsignedNumber}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedNumber(PascalGrammar.UnsignedNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammar#unsignedInteger}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedInteger(PascalGrammar.UnsignedIntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammar#unsignedInteger}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedInteger(PascalGrammar.UnsignedIntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammar#unsignedReal}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedReal(PascalGrammar.UnsignedRealContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammar#unsignedReal}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedReal(PascalGrammar.UnsignedRealContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammar#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(PascalGrammar.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammar#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(PascalGrammar.SignContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammar#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(PascalGrammar.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammar#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(PascalGrammar.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammar#string}.
	 * @param ctx the parse tree
	 */
	void enterString(PascalGrammar.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammar#string}.
	 * @param ctx the parse tree
	 */
	void exitString(PascalGrammar.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammar#type}.
	 * @param ctx the parse tree
	 */
	void enterType(PascalGrammar.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammar#type}.
	 * @param ctx the parse tree
	 */
	void exitType(PascalGrammar.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammar#variableDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationPart(PascalGrammar.VariableDeclarationPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammar#variableDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationPart(PascalGrammar.VariableDeclarationPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammar#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(PascalGrammar.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammar#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(PascalGrammar.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammar#procedureAndFunctionDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void enterProcedureAndFunctionDeclarationPart(PascalGrammar.ProcedureAndFunctionDeclarationPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammar#procedureAndFunctionDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void exitProcedureAndFunctionDeclarationPart(PascalGrammar.ProcedureAndFunctionDeclarationPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammar#procedureOrFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProcedureOrFunctionDeclaration(PascalGrammar.ProcedureOrFunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammar#procedureOrFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProcedureOrFunctionDeclaration(PascalGrammar.ProcedureOrFunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammar#procedureDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProcedureDeclaration(PascalGrammar.ProcedureDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammar#procedureDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProcedureDeclaration(PascalGrammar.ProcedureDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammar#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(PascalGrammar.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammar#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(PascalGrammar.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammar#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(PascalGrammar.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammar#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(PascalGrammar.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammar#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(PascalGrammar.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammar#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(PascalGrammar.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammar#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PascalGrammar.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammar#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PascalGrammar.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammar#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStatement(PascalGrammar.SimpleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammar#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStatement(PascalGrammar.SimpleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammar#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(PascalGrammar.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammar#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(PascalGrammar.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammar#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(PascalGrammar.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammar#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(PascalGrammar.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammar#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(PascalGrammar.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammar#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(PascalGrammar.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammar#relationaloperator}.
	 * @param ctx the parse tree
	 */
	void enterRelationaloperator(PascalGrammar.RelationaloperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammar#relationaloperator}.
	 * @param ctx the parse tree
	 */
	void exitRelationaloperator(PascalGrammar.RelationaloperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammar#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpression(PascalGrammar.SimpleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammar#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpression(PascalGrammar.SimpleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammar#additiveoperator}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveoperator(PascalGrammar.AdditiveoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammar#additiveoperator}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveoperator(PascalGrammar.AdditiveoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammar#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(PascalGrammar.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammar#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(PascalGrammar.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammar#multiplicativeoperator}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeoperator(PascalGrammar.MultiplicativeoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammar#multiplicativeoperator}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeoperator(PascalGrammar.MultiplicativeoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammar#signedFactor}.
	 * @param ctx the parse tree
	 */
	void enterSignedFactor(PascalGrammar.SignedFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammar#signedFactor}.
	 * @param ctx the parse tree
	 */
	void exitSignedFactor(PascalGrammar.SignedFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammar#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(PascalGrammar.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammar#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(PascalGrammar.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammar#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(PascalGrammar.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammar#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(PascalGrammar.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammar#procedureStatement}.
	 * @param ctx the parse tree
	 */
	void enterProcedureStatement(PascalGrammar.ProcedureStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammar#procedureStatement}.
	 * @param ctx the parse tree
	 */
	void exitProcedureStatement(PascalGrammar.ProcedureStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammar#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(PascalGrammar.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammar#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(PascalGrammar.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammar#empty}.
	 * @param ctx the parse tree
	 */
	void enterEmpty(PascalGrammar.EmptyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammar#empty}.
	 * @param ctx the parse tree
	 */
	void exitEmpty(PascalGrammar.EmptyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammar#structuredStatement}.
	 * @param ctx the parse tree
	 */
	void enterStructuredStatement(PascalGrammar.StructuredStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammar#structuredStatement}.
	 * @param ctx the parse tree
	 */
	void exitStructuredStatement(PascalGrammar.StructuredStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammar#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(PascalGrammar.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammar#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(PascalGrammar.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammar#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(PascalGrammar.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammar#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(PascalGrammar.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalGrammar#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(PascalGrammar.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalGrammar#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(PascalGrammar.IfStatementContext ctx);
}