import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.IOException;
import java.util.Scanner; // import the Scanner class 
import static org.antlr.v4.runtime.CharStreams.fromFileName;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner myObj = new Scanner(System.in);
		boolean b = true;
		String source = "casos_prueba/caso_1.txt";
		System.out.println("Selecciona el archivo a probar correspondiente a su numero");
		System.out.println("1. caso_1.txt");
		System.out.println("2. caso_2.txt");
		System.out.println("3. caso_3.txt");
		System.out.println("4. caso_4.txt");
		System.out.println("5. caso_5.txt");
		System.out.println("6. caso_6.txt");
		System.out.println("7. caso_7.txt");
		System.out.println("8. caso_8.txt");
		System.out.println("9. caso_9.txt");
		System.out.println("10. caso_error_1.txt");
		System.out.println("11. caso_error_2.txt");
		System.out.println("12. caso_error_3.txt");
		System.out.println("13. caso_error_4.txt");
		System.out.println("14. caso_error_5.txt");
		System.out.println("15. caso_error_6.txt");
		System.out.println("16. caso_error_7.txt");
		System.out.println("17. caso_error_8.txt");
		System.out.println("18. Terminar programa");
		while(b==true){
			System.out.println("Selecciona el archivo a probar correspondiente a su numero o presione 18 para acabar el programa");
			int eleccion;
			eleccion = myObj.nextInt();  // Read user input
			switch (eleccion) {
	        case 1:
	        	source = "casos_prueba/caso_1.txt";
	        	System.out.println("Exito");
	        break;
	        case 2:
	        	source = "casos_prueba/caso_2.txt";
	        	System.out.println("Exito");
	        break;
	        case 3:
	        	source = "casos_prueba/caso_3.txt";
	        	System.out.println("Exito");
	        break;
	        case 4:
	        	source = "casos_prueba/caso_4.txt";
	        	System.out.println("Exito");
	        break;
	        case 5:
	        	source = "casos_prueba/caso_5.txt";
	        	System.out.println("Exito");
	        break;
	        case 6:
	        	source = "casos_prueba/caso_6.txt";
	        	System.out.println("Exito");
	        break;
	        case 7:
	        	source = "casos_prueba/caso_7.txt";
	        	System.out.println("Exito");
	        break;
	        case 8:
	        	source = "casos_prueba/caso_8.txt";
	        	System.out.println("Exito");
	        break;
	        case 9:
	        	source = "casos_prueba/caso_9.txt";
	        	System.out.println("Exito");
	        break;
	        case 10:
	        	source = "casos_prueba/caso_error_1.txt";
	        break;
	        case 11:
	        	source = "casos_prueba/caso_error_2.txt";
	        break;
	        case 12:
	        	source = "casos_prueba/caso_error_3.txt";
	        break;
	        case 13:
	        	source = "casos_prueba/caso_error_4.txt";
	        break;
	        case 14:
	        	source = "casos_prueba/caso_error_5.txt";
	        break;
	        case 15:
	        	source = "casos_prueba/caso_error_6.txt";
	        break;
	        case 16:
	        	source = "casos_prueba/caso_error_7.txt";
	        break;
	        case 17:
	        	source = "casos_prueba/caso_error_8.txt";
	        break;
	        case 18:
	        	b=false;
	        break;
	        default:
	        	b=false;
	        break;
 			}
 			if(b==true){
	 			CharStream cs = fromFileName(source);
				ScalaLexer lexer = new ScalaLexer(cs);
				CommonTokenStream tokens = new CommonTokenStream(lexer);
				ScalaParser parser = new ScalaParser(tokens);
				ParseTree tree = parser.prog(); 
				ScalaCustomVisitor grammar = new ScalaCustomVisitor();
				grammar.visit(tree);
			}
		}
	}
}