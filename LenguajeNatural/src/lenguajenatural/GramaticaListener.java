// Generated from C:\Users\diego\Desktop\Tareas Semestre 2016_2017_I\Proyecto Integrador\lenguajenatural\LenguajeNatural\src\lenguajenatural\Gramatica.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramaticaParser}.
 */
public interface GramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(GramaticaParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(GramaticaParser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#np}.
	 * @param ctx the parse tree
	 */
	void enterNp(GramaticaParser.NpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#np}.
	 * @param ctx the parse tree
	 */
	void exitNp(GramaticaParser.NpContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#vp}.
	 * @param ctx the parse tree
	 */
	void enterVp(GramaticaParser.VpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#vp}.
	 * @param ctx the parse tree
	 */
	void exitVp(GramaticaParser.VpContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#pp}.
	 * @param ctx the parse tree
	 */
	void enterPp(GramaticaParser.PpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#pp}.
	 * @param ctx the parse tree
	 */
	void exitPp(GramaticaParser.PpContext ctx);
}