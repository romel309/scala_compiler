import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.IOException;
import static org.antlr.v4.runtime.CharStreams.fromFileName;
public class Main {
	public static void main(String[] args) throws Exception {
		String source = "caso_6.txt";
		CharStream cs = fromFileName(source);
		ScalaLexer lexer = new ScalaLexer(cs);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		ScalaParser parser = new ScalaParser(tokens);
		ParseTree tree = parser.prog(); 
		ScalaCustomVisitor grammar = new ScalaCustomVisitor();
		grammar.visit(tree);
		System.out.println("Hola!");
	}
}