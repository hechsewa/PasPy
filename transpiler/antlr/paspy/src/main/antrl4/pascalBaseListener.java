// Generated from pascal.g4 by ANTLR 4.7.2

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.stream.IntStream;

/**
 * This class provides an empty implementation of {@link pascalListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class pascalBaseListener implements pascalListener {

	private BufferedWriter bufferedWriter;

	//objects to handle python whitespaces
	private PyHandler whitespacePrev;
	private PyHandler whitespace;


	public pascalBaseListener(BufferedWriter bufferedWriter) {
		this.bufferedWriter = bufferedWriter;
		this.whitespace = new PyHandler(0,0,0);
		this.whitespacePrev = new PyHandler(0,0,0);
	}

	private void writeString(String s) {
			//ident tab
			IntStream.range(0, whitespace.getTabs()).forEach(i -> {
				try {
					bufferedWriter.write("\t");
				} catch (IOException e) {
					e.printStackTrace();
				}
			});

			//ident whitespace
			IntStream.range(0, whitespace.getSpaces()).forEach(i -> {
				try {
					bufferedWriter.write(" ");
				} catch (IOException e) {
						e.printStackTrace();
					}
			});

			//ident new lines
			IntStream.range(0, whitespace.getLines()).forEach(i -> {
				try {
					bufferedWriter.write("\n");
				} catch (IOException e) {
					e.printStackTrace();
				}
			});

		try {
			bufferedWriter.write(s);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private PyHandler setWhitespace(int tabs, int lines, int spaces) {
		PyHandler ws = new PyHandler(whitespace.getTabs(), whitespace.getLines(), whitespace.getSpaces());
		whitespace.setTabs(tabs);
		whitespace.setLines(lines);
		whitespace.setSpaces(tabs);
		return ws;
	}

	private void resetWhitespace(PyHandler ws){
		whitespace.setTabs(ws.getTabs());
		whitespace.setLines(ws.getLines());
		whitespace.setSpaces(ws.getSpaces());
	}

	//transpiling
	@Override public void enterProgram(pascal.ProgramContext ctx) {
		// PreviousState previousState = setState(tabs, 0, 0);
	}

	@Override public void exitProgram(pascal.ProgramContext ctx) {
		PyHandler ws = setWhitespace(0, 1,0);
		writeString("if __name__ == \"__main__\":\n");
		resetWhitespace(ws);
		ws = setWhitespace(1, 0, 0);

		writeString(ctx.programHeading().identifier().IDENT().getSymbol().getText()+"(");
		if(ctx.programHeading().identifierList() != null) {
			//tu lista parametrow
		}
		resetWhitespace(ws);
		ws = setWhitespace(0,0,0);
		writeString(")");
		resetWhitespace(ws);
	}

	@Override public void enterProgramHeading(pascal.ProgramHeadingContext ctx) {
		PyHandler ws = setWhitespace(whitespace.getTabs(), 0,0);
		writeString("def " + ctx.identifier().IDENT().getSymbol().getText()+"(");
		resetWhitespace(ws);
		if (ctx.identifierList() != null) {
			//tu wypisz liste identyfikatorow
		}
		ws = setWhitespace(0,0,0);
		writeString("):");
		resetWhitespace(ws);
	}

	@Override public void exitProgramHeading(pascal.ProgramHeadingContext ctx) { }

	@Override public void enterIdentifier(pascal.IdentifierContext ctx) {
		//writeString(ctx.IDENT().getSymbol().getText());

	}

	@Override public void exitIdentifier(pascal.IdentifierContext ctx) { }

	@Override public void enterBlock(pascal.BlockContext ctx) { }

	@Override public void exitBlock(pascal.BlockContext ctx) { }

	@Override public void enterConstantDefinitionPart(pascal.ConstantDefinitionPartContext ctx) { }

	@Override public void exitConstantDefinitionPart(pascal.ConstantDefinitionPartContext ctx) { }

	@Override public void enterConstantDefinition(pascal.ConstantDefinitionContext ctx) { }

	@Override public void exitConstantDefinition(pascal.ConstantDefinitionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterConstant(pascal.ConstantContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitConstant(pascal.ConstantContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterUnsignedNumber(pascal.UnsignedNumberContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitUnsignedNumber(pascal.UnsignedNumberContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterUnsignedInteger(pascal.UnsignedIntegerContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitUnsignedInteger(pascal.UnsignedIntegerContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterUnsignedReal(pascal.UnsignedRealContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitUnsignedReal(pascal.UnsignedRealContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterSign(pascal.SignContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitSign(pascal.SignContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterBool(pascal.BoolContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBool(pascal.BoolContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterString(pascal.StringContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitString(pascal.StringContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterType(pascal.TypeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitType(pascal.TypeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterScalarType(pascal.ScalarTypeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitScalarType(pascal.ScalarTypeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterTypeIdentifier(pascal.TypeIdentifierContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTypeIdentifier(pascal.TypeIdentifierContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterStringtype(pascal.StringtypeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitStringtype(pascal.StringtypeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterArrayType(pascal.ArrayTypeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitArrayType(pascal.ArrayTypeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterTypeList(pascal.TypeListContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTypeList(pascal.TypeListContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterVariableDeclarationPart(pascal.VariableDeclarationPartContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitVariableDeclarationPart(pascal.VariableDeclarationPartContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterVariableDeclaration(pascal.VariableDeclarationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitVariableDeclaration(pascal.VariableDeclarationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterProcedureAndFunctionDeclarationPart(pascal.ProcedureAndFunctionDeclarationPartContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitProcedureAndFunctionDeclarationPart(pascal.ProcedureAndFunctionDeclarationPartContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterProcedureOrFunctionDeclaration(pascal.ProcedureOrFunctionDeclarationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitProcedureOrFunctionDeclaration(pascal.ProcedureOrFunctionDeclarationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterProcedureDeclaration(pascal.ProcedureDeclarationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitProcedureDeclaration(pascal.ProcedureDeclarationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFormalParameterList(pascal.FormalParameterListContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFormalParameterList(pascal.FormalParameterListContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFormalParameterSection(pascal.FormalParameterSectionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFormalParameterSection(pascal.FormalParameterSectionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterParameterGroup(pascal.ParameterGroupContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitParameterGroup(pascal.ParameterGroupContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterIdentifierList(pascal.IdentifierListContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitIdentifierList(pascal.IdentifierListContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFunctionDeclaration(pascal.FunctionDeclarationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFunctionDeclaration(pascal.FunctionDeclarationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterResultType(pascal.ResultTypeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitResultType(pascal.ResultTypeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterStatement(pascal.StatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitStatement(pascal.StatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterSimpleStatement(pascal.SimpleStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitSimpleStatement(pascal.SimpleStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAssignmentStatement(pascal.AssignmentStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAssignmentStatement(pascal.AssignmentStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterVariable(pascal.VariableContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitVariable(pascal.VariableContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterExpression(pascal.ExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitExpression(pascal.ExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterRelationaloperator(pascal.RelationaloperatorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitRelationaloperator(pascal.RelationaloperatorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterSimpleExpression(pascal.SimpleExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitSimpleExpression(pascal.SimpleExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAdditiveoperator(pascal.AdditiveoperatorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAdditiveoperator(pascal.AdditiveoperatorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterTerm(pascal.TermContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTerm(pascal.TermContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterMultiplicativeoperator(pascal.MultiplicativeoperatorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitMultiplicativeoperator(pascal.MultiplicativeoperatorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterSignedFactor(pascal.SignedFactorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitSignedFactor(pascal.SignedFactorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFactor(pascal.FactorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFactor(pascal.FactorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterUnsignedConstant(pascal.UnsignedConstantContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitUnsignedConstant(pascal.UnsignedConstantContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFunctionDesignator(pascal.FunctionDesignatorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFunctionDesignator(pascal.FunctionDesignatorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterParameterList(pascal.ParameterListContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitParameterList(pascal.ParameterListContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterProcedureStatement(pascal.ProcedureStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitProcedureStatement(pascal.ProcedureStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterActualParameter(pascal.ActualParameterContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitActualParameter(pascal.ActualParameterContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterParameterwidth(pascal.ParameterwidthContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitParameterwidth(pascal.ParameterwidthContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEmptyStatement(pascal.EmptyStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEmptyStatement(pascal.EmptyStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEmpty(pascal.EmptyContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEmpty(pascal.EmptyContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterStructuredStatement(pascal.StructuredStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitStructuredStatement(pascal.StructuredStatementContext ctx) { }

	@Override public void enterCompoundStatement(pascal.CompoundStatementContext ctx) { }

	@Override public void exitCompoundStatement(pascal.CompoundStatementContext ctx) { }

	@Override public void enterStatements(pascal.StatementsContext ctx) { }

	@Override public void exitStatements(pascal.StatementsContext ctx) { }

	@Override public void enterIfStatement(pascal.IfStatementContext ctx) { }

	@Override public void exitIfStatement(pascal.IfStatementContext ctx) { }

	@Override public void enterRepetetiveStatement(pascal.RepetetiveStatementContext ctx) { }

	@Override public void exitRepetetiveStatement(pascal.RepetetiveStatementContext ctx) { }

	@Override public void enterWhileStatement(pascal.WhileStatementContext ctx) { }

	@Override public void exitWhileStatement(pascal.WhileStatementContext ctx) { }

	@Override public void enterForStatement(pascal.ForStatementContext ctx) { }

	@Override public void exitForStatement(pascal.ForStatementContext ctx) { }

	@Override public void enterForList(pascal.ForListContext ctx) { }

	@Override public void exitForList(pascal.ForListContext ctx) { }

	@Override public void enterInitialValue(pascal.InitialValueContext ctx) { }

	@Override public void exitInitialValue(pascal.InitialValueContext ctx) { }

	@Override public void enterFinalValue(pascal.FinalValueContext ctx) { }

	@Override public void exitFinalValue(pascal.FinalValueContext ctx) { }

	@Override public void enterEveryRule(ParserRuleContext ctx) { }

	@Override public void exitEveryRule(ParserRuleContext ctx) { }

	@Override public void visitTerminal(TerminalNode node) { }

	@Override public void visitErrorNode(ErrorNode node) { }
}