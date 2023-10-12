package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class AlgoEditor {
	public static final String BASE_PATH = "D:\\Documentos\\Bootcamp Consiti\\Java\\Seccion15\\archivos";
	
	public static String readMessage() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		return br.readLine();
	}

	public static void main(String[] args) throws IOException {
		System.out.println("Indica el nombre del archivo:");
		String filename = readMessage();
		File f = new File(BASE_PATH.concat(File.separator).concat(filename));
		System.out.println("Empieza a escribir y escribe salir para terminar");
		String cadena = null;
		try (PrintWriter pw = new PrintWriter(f)){
			do {
				cadena = readMessage();
				if (!"salir".equals(cadena)) {
					pw.println(cadena);
				}
				
			} while(!"salir".equals(cadena));
		}
		

	}

}
