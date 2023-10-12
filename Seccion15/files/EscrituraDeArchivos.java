package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class EscrituraDeArchivos {

	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("D:\\Documentos\\Bootcamp Consiti\\Java\\Seccion15\\archivos\\texto.txt");
		try(PrintWriter pw = new PrintWriter(f)) {
			pw.println("Hola");
			pw.println("Texto de prueba para ");
			pw.println("una prueba");
		}

	}

}
