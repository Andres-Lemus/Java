package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LecturaDeArchivo {

	public static void main(String[] args) throws IOException {
		File f = new File("D:\\\\Documentos\\\\Bootcamp Consiti\\\\Java\\\\Seccion15\\\\archivos\\\\texto.txt");
		if (f.exists()) {
			try (FileReader fr = new FileReader(f);
					BufferedReader br = new BufferedReader(fr);){
				String cadena = null;
				do {
					cadena = br.readLine();
					System.out.println(cadena);
				} while (cadena != null);
				
			}
		} else {
			System.out.println("El archivo no existe");
		}
	}

}
