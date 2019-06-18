// Generated from PascalGrammar.g4 by ANTLR 4.7.2
package main.antrl4;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.io.*;
import java.util.List;


public class PascalGrammarBaseListener implements PascalGrammarListener {

	private BufferedWriter bufferedWriter;
	int tabs = 0; //tab counter for python ident
	int prevTabs=0;

	public PascalGrammarBaseListener(BufferedWriter bufferedWriter) {
		this.bufferedWriter = bufferedWriter;
	}

	private void writeBuf(String s, int tabCount) {
		for(int i =0; i<tabCount; i++){
			try {
				bufferedWriter.write("\t");
			} catch(IOException e){
				e.printStackTrace();
			}
		}
		try {
			bufferedWriter.write(s);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

	@Override public void enterProgram(PascalGrammar.ProgramContext ctx) {

	}

	@Override public void exitProgram(PascalGrammar.ProgramContext ctx) {
		writeBuf("\nif __name__ == \"__main__\":\n", 0);
		writeBuf(ctx.programHeading().identifier().IDENT().getSymbol().getText()+"()", 1);
	}

	@Override public void enterProgramHeading(PascalGrammar.ProgramHeadingContext ctx) {
		writeBuf("def "+ctx.identifier().IDENT().getSymbol().getText(),0);
	}

	@Override public void exitProgramHeading(PascalGrammar.ProgramHeadingContext ctx) {
		writeBuf("():\n",0);
	}

	@Override public void enterIdentifier(PascalGrammar.IdentifierContext ctx) {
		//writeBuf(ctx.IDENT().getSymbol().getText(),0);
	}

	@Override public void exitIdentifier(PascalGrammar.IdentifierContext ctx) { }

	@Override public void enterBlock(PascalGrammar.BlockContext ctx) {
		tabs++;
	}

	@Override public void exitBlock(PascalGrammar.BlockContext ctx) {
		tabs=prevTabs;
	}

	@Override public void enterConstantDefinitionPart(PascalGrammar.ConstantDefinitionPartContext ctx) {
		tabs++;
	}

	@Override public void exitConstantDefinitionPart(PascalGrammar.ConstantDefinitionPartContext ctx) {
		tabs=prevTabs;
	}

	@Override public void enterConstantDefinition(PascalGrammar.ConstantDefinitionContext ctx) { }

	@Override public void exitConstantDefinition(PascalGrammar.ConstantDefinitionContext ctx) { }

	@Override public void enterConstant(PascalGrammar.ConstantContext ctx) { }

	@Override public void exitConstant(PascalGrammar.ConstantContext ctx) { }

	@Override public void enterUnsignedNumber(PascalGrammar.UnsignedNumberContext ctx) {
	}

	@Override public void exitUnsignedNumber(PascalGrammar.UnsignedNumberContext ctx) { }

	@Override public void enterUnsignedInteger(PascalGrammar.UnsignedIntegerContext ctx) {
		writeBuf(ctx.NUM_INT().getSymbol().getText(),0);
	}

	@Override public void exitUnsignedInteger(PascalGrammar.UnsignedIntegerContext ctx) { }

	@Override public void enterUnsignedReal(PascalGrammar.UnsignedRealContext ctx) {
	}

	@Override public void exitUnsignedReal(PascalGrammar.UnsignedRealContext ctx) { }

	@Override public void enterSign(PascalGrammar.SignContext ctx) {
	}

	@Override public void exitSign(PascalGrammar.SignContext ctx) { }

	@Override public void enterBool(PascalGrammar.BoolContext ctx) {
	}

	@Override public void exitBool(PascalGrammar.BoolContext ctx) { }

	@Override public void enterString(PascalGrammar.StringContext ctx) {
		writeBuf(ctx.STRING_LITERAL().getSymbol().getText(),0);
	}

	@Override public void exitString(PascalGrammar.StringContext ctx) { }

	@Override public void enterType(PascalGrammar.TypeContext ctx) {
	}

	@Override public void exitType(PascalGrammar.TypeContext ctx) { }

	@Override public void enterVariableDeclarationPart(PascalGrammar.VariableDeclarationPartContext ctx){
	}

	@Override public void exitVariableDeclarationPart(PascalGrammar.VariableDeclarationPartContext ctx) {
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterVariableDeclaration(PascalGrammar.VariableDeclarationContext ctx) {
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitVariableDeclaration(PascalGrammar.VariableDeclarationContext ctx) {
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterProcedureAndFunctionDeclarationPart(PascalGrammar.ProcedureAndFunctionDeclarationPartContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitProcedureAndFunctionDeclarationPart(PascalGrammar.ProcedureAndFunctionDeclarationPartContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterProcedureOrFunctionDeclaration(PascalGrammar.ProcedureOrFunctionDeclarationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitProcedureOrFunctionDeclaration(PascalGrammar.ProcedureOrFunctionDeclarationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterProcedureDeclaration(PascalGrammar.ProcedureDeclarationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitProcedureDeclaration(PascalGrammar.ProcedureDeclarationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFormalParameterList(PascalGrammar.FormalParameterListContext ctx) { }

	@Override public void exitFormalParameterList(PascalGrammar.FormalParameterListContext ctx) { }

	@Override public void enterIdentifierList(PascalGrammar.IdentifierListContext ctx) {

	}

	@Override public void exitIdentifierList(PascalGrammar.IdentifierListContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFunctionDeclaration(PascalGrammar.FunctionDeclarationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFunctionDeclaration(PascalGrammar.FunctionDeclarationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterStatement(PascalGrammar.StatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitStatement(PascalGrammar.StatementContext ctx) {
		writeBuf("\n",0);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterSimpleStatement(PascalGrammar.SimpleStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitSimpleStatement(PascalGrammar.SimpleStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAssignmentStatement(PascalGrammar.AssignmentStatementContext ctx) {
		writeBuf(ctx.variable().identifier().IDENT().getSymbol().getText(),tabs);
		writeBuf(" = ",0);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAssignmentStatement(PascalGrammar.AssignmentStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterVariable(PascalGrammar.VariableContext ctx) {
		//writeBuf(ctx.identifier().IDENT().getSymbol().getText(),tabs);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitVariable(PascalGrammar.VariableContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterExpression(PascalGrammar.ExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitExpression(PascalGrammar.ExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterRelationaloperator(PascalGrammar.RelationaloperatorContext ctx) {
		if(ctx.EQUAL() != null){
			writeBuf(" == ", 0);
		}
		if(ctx.LE() != null){
			writeBuf(" <= ", 0);
		}
		if(ctx.LT() != null){
			writeBuf(" < ", 0);
		}
		if(ctx.NOT_EQUAL() != null){
			writeBuf(" != ", 0);
		}
		if(ctx.GT() != null){
			writeBuf(" > ", 0);
		}
		if(ctx.GE() != null){
			writeBuf(" >= ", 0);
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitRelationaloperator(PascalGrammar.RelationaloperatorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterSimpleExpression(PascalGrammar.SimpleExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitSimpleExpression(PascalGrammar.SimpleExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAdditiveoperator(PascalGrammar.AdditiveoperatorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAdditiveoperator(PascalGrammar.AdditiveoperatorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterTerm(PascalGrammar.TermContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTerm(PascalGrammar.TermContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterMultiplicativeoperator(PascalGrammar.MultiplicativeoperatorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitMultiplicativeoperator(PascalGrammar.MultiplicativeoperatorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterSignedFactor(PascalGrammar.SignedFactorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitSignedFactor(PascalGrammar.SignedFactorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFactor(PascalGrammar.FactorContext ctx) {
		if(ctx.variable() != null){
			writeBuf(ctx.variable().identifier().IDENT().getSymbol().getText(),0);
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFactor(PascalGrammar.FactorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterParameterList(PascalGrammar.ParameterListContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitParameterList(PascalGrammar.ParameterListContext ctx) {
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterProcedureStatement(PascalGrammar.ProcedureStatementContext ctx) {
		if(ctx.identifier().IDENT().getSymbol().getText().equals("write") ||
				ctx.identifier().IDENT().getSymbol().getText().equals("writeln")){
			writeBuf("print(",tabs);
		} else if (ctx.identifier().IDENT().getSymbol().getText().equals("readln")) {
		}
		else {
			writeBuf(ctx.identifier().IDENT().getSymbol().getText()+"(",tabs);
		}
		prevTabs=tabs;
		tabs=0;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitProcedureStatement(PascalGrammar.ProcedureStatementContext ctx) {
		if(!ctx.identifier().IDENT().getSymbol().getText().equals("readln")) {
			writeBuf(")",0);
		}
		tabs = prevTabs;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEmptyStatement(PascalGrammar.EmptyStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEmptyStatement(PascalGrammar.EmptyStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEmpty(PascalGrammar.EmptyContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEmpty(PascalGrammar.EmptyContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterStructuredStatement(PascalGrammar.StructuredStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitStructuredStatement(PascalGrammar.StructuredStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCompoundStatement(PascalGrammar.CompoundStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCompoundStatement(PascalGrammar.CompoundStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterStatements(PascalGrammar.StatementsContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitStatements(PascalGrammar.StatementsContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterIfStatement(PascalGrammar.IfStatementContext ctx) {
		writeBuf("if ", tabs);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitIfStatement(PascalGrammar.IfStatementContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitTerminal(TerminalNode node) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitErrorNode(ErrorNode node) { }
}