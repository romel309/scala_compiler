// Generated from Scala.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import java.util.*; 
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.text.NumberFormat;
import java.text.*; 

/**
 * This class provides an empty implementation of {@link ScalaVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */

public class ScalaCustomVisitor<T> extends AbstractParseTreeVisitor<T> implements ScalaVisitor<T> {

	HashMap<String, String> type_identifier = new HashMap<String, String>();
	ArrayList<HashMap<String, String>> symbol_table = new ArrayList<HashMap<String, String>>();
	ArrayList<HashMap<String, String>> type_table = new ArrayList<HashMap<String, String>>();

	
	@Override public T visitProg(ScalaParser.ProgContext ctx) { 
		HashMap<String, String> level = new HashMap<String, String>();
		HashMap<String, String> type_level = new HashMap<String, String>();
		symbol_table.add(level);
		type_table.add(type_level);
		return visitChildren(ctx); 
	}

	@Override public T visitObj(ScalaParser.ObjContext ctx) { 
		String id = ctx.ID().getText();
		//System.out.println(id);
		int n = symbol_table.size() - 1; 
		System.out.println(n);
		type_table.get(n).put(id,"obj");
		//type_identifier.put(id,"obj");
		return visitChildren(ctx);
	}

	@Override public T visitBody(ScalaParser.BodyContext ctx) { 
		System.out.println("chupala 3");
		return visitChildren(ctx); 
	}

	@Override public T visitDef(ScalaParser.DefContext ctx) { 
		HashMap<String, String> type_level = new HashMap<String, String>();
		HashMap<String, String> level = new HashMap<String, String>();
		System.out.println("chupala 4");
		String id = ctx.ID().getText();
		//type_identifier.put(id,"def");
		type_table.add(type_level);
		symbol_table.add(level);
		int n = symbol_table.size() - 1; 
		System.out.println(n);
		type_table.get(n).put(id,"def");
		return visitChildren(ctx); 
	}

	@Override public T visitCnt(ScalaParser.CntContext ctx) { 
		System.out.println("chupala 6");
		return visitChildren(ctx); 
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitExpr(ScalaParser.ExprContext ctx) { 
		HashMap<String, String> level = new HashMap<String, String>();
		symbol_table.add(level);
		return visitChildren(ctx); 
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitCondition(ScalaParser.ConditionContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitKeyblock(ScalaParser.KeyblockContext ctx) { 
		System.out.println("chupala 5");
		return visitChildren(ctx); 
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitTm(ScalaParser.TmContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitVariables(ScalaParser.VariablesContext ctx) { 
		System.out.println("chupala 7");
		return visitChildren(ctx); 
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitVal(ScalaParser.ValContext ctx) { 
		System.out.println("chupala 8");
		if(ctx.VAL() != null){

		}
		else{
			String id = ctx.ID().getText();
			int n = symbol_table.size() - 1; 
			System.out.println(n);
			String tipo_dato = type_table.get(n).get(id);
			int i=0,val_variable_true=0,var_variable_true=0;
			for(i=0;i<n;i++){
				if(symbol_table.get(i).containsKey("val"+id)){
					System.out.println("You cannot change a constant variable");
					i=i+n;
					val_variable_true=1;
				}
			}
			int m; 
			for(m=symbol_table.size() - 1;0<=m;m--){
				if(symbol_table.get(m).containsKey(id)){
					m=-1;
					var_variable_true=1;
				}
			}
			if(val_variable_true==0 && var_variable_true==1){
				System.out.println("Entra aqui?");
				String tipo="";
				int j=0,k;
				for(k=symbol_table.size() - 1; 0<=k;k--){
					if(type_table.get(k).containsKey(id)){
						tipo=type_table.get(k).get(id);
						j=k;
						k=-1;
					}
					//System.out.println("k es: "+k);
				}
				if(tipo=="Int"){
					//System.out.println("Entra aqui?");
					//String value = symbol_table.get(j).get(id);
					//System.out.println("valor: "+value);
					if(ctx.NEGATIVE() != null){
						String g = ctx.NUMBER().getText();
						symbol_table.get(j).put(id,"-"+g);
					}else if(ctx.NUMBER() != null){
						String g = ctx.NUMBER().getText();
						symbol_table.get(j).put(id,g);
					}
					else{
						System.out.println("The variable: "+id+" is not the same type of "+tipo+". ");	
					}

				}
				if(tipo=="String"){
					if(ctx.STRINGSTRUCT() != null){
						String g = ctx.STRINGSTRUCT().getText();
						symbol_table.get(j).put(id,g);
					}
					else{
						System.out.println("The variable: "+id+" is not the same type of "+tipo+". ");	
					}
				}
				if(tipo=="Boolean"){
					if(ctx.LOGIC() != null){
						String g = ctx.LOGIC().getText();
						symbol_table.get(j).put(id,g);
					}
					else{
						System.out.println("The variable: "+id+" is not the same type of "+tipo+". ");	
					}
				}
			}
			else{
				System.out.println("La variable"+id+"no ha sido declarada");
			}
			// Displaying the Hashtable 
			System.out.println("Type table is: " + "nivel = " +n + " "+type_table.get(n));
        	System.out.println("Symbol table is: " + "nivel = " +n + " "+symbol_table.get(n));
		}
		//String id = ctx.VAL().getText(); 
		//System.out.println(id);
		return visitChildren(ctx); 
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitVar(ScalaParser.VarContext ctx) {
		System.out.println("chupala 9");
		int n = symbol_table.size() - 1; 
		//System.out.println(n);
		if(ctx.VAR() != null){
			String id = ctx.ID().getText();
			if(symbol_table.get(n).containsKey(id)){
				System.out.println("multiply declared variable "+id);
				return null;
			}
			else{
				type_table.get(n).put("var"+id,id);
				if(ctx.INT() != null){
					type_table.get(n).put(id,"Int");
				}
				if(ctx.STRING() != null){
					type_table.get(n).put(id,"String");
				}
				if(ctx.BOOLEAN() != null){
					type_table.get(n).put(id,"Boolean");
				}
				if(ctx.NEGATIVE() != null){
					String neg = ctx.NEGATIVE().getText();
					String num = ctx.NUMBER().getText();
					symbol_table.get(n).put(id,neg+num);
				}
				else if (ctx.INT() != null){
					String num = ctx.NUMBER().getText();
					symbol_table.get(n).put(id,num);
				}
				else if (ctx.STRING() != null){
					String ss = ctx.STRINGSTRUCT().getText();
					symbol_table.get(n).put(id,ss);
				}
				else if (ctx.BOOLEAN() != null){
					String b = ctx.BOOLEAN().getText();
					symbol_table.get(n).put(id,b);
				}
				// Displaying the Hashtable 
				System.out.println("Type table is: " + "nivel = " +n + " "+type_table.get(n));
        		System.out.println("Symbol table is: " + "nivel = " +n + " "+symbol_table.get(n));
			}
		}

		return visitChildren(ctx); 
	}

	@Override public T visitComparison(ScalaParser.ComparisonContext ctx) { return visitChildren(ctx); }
}