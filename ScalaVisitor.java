// Generated from Scala.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ScalaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ScalaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ScalaParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(ScalaParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScalaParser#obj}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObj(ScalaParser.ObjContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScalaParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(ScalaParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScalaParser#def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef(ScalaParser.DefContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScalaParser#cnt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCnt(ScalaParser.CntContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScalaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(ScalaParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScalaParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(ScalaParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScalaParser#keyblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyblock(ScalaParser.KeyblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScalaParser#tm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTm(ScalaParser.TmContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScalaParser#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariables(ScalaParser.VariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScalaParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVal(ScalaParser.ValContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScalaParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(ScalaParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScalaParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(ScalaParser.ComparisonContext ctx);
}