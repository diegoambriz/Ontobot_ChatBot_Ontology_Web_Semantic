// Generated from src/lenguajenatural/MyGrammar.g by ANTLR 4.5.3
package lenguajenatural;
import java.util.HashMap;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyGrammarParser}.
 */
public interface MyGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(MyGrammarParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(MyGrammarParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(MyGrammarParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(MyGrammarParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(MyGrammarParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(MyGrammarParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#multExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultExpr(MyGrammarParser.MultExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#multExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultExpr(MyGrammarParser.MultExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(MyGrammarParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(MyGrammarParser.AtomContext ctx);
}