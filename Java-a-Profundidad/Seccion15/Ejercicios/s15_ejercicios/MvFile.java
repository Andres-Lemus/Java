package s15_ejercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class MvFile {
	
	public static String readMessage() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		return br.readLine();
	}
	
	public static void main(String[] args) throws IOException {
		System.out.println("Ruta de archivo a mover:");
		String fileOrigin = readMessage();
		//String fileOriginFix = fileOrigin.replace("\\","\\\\");
		//System.out.println(fileFix);
		File f = new File(fileOrigin);
		System.out.println("Ruta de destino del archivo:");
		String fileDestiny = readMessage();
		String fileDestinyFix = fileDestiny.replace("\\","\\\\").concat("\\\\"+f.getName());
		//System.out.println(fileCopy);
		File fm = new File(fileDestinyFix);
		//System.out.println(fc.getName());
		if (f.exists()) {
			try (FileReader fr = new FileReader(f);
					BufferedReader br = new BufferedReader(fr);
					PrintWriter pw = new PrintWriter(fm)){
				String cadena = null;
				do {
					cadena = br.readLine();
					if (cadena != null) {
						pw.println(cadena);
					}
				} while (cadena != null);
				f.deleteOnExit();
				
			}
		} else {
			System.out.println("El archivo no existe");
		}
	}
	
}
