package s15_ejercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class CpFile {
	
	public static String readMessage() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		return br.readLine();
	}
	
	public static void main(String[] args) throws IOException {
		System.out.println("Ruta de archivo a copiar:");
		String file = readMessage();
		String fileFix = file.replace("\\","\\\\");
		//System.out.println(fileFix);
		File f = new File(fileFix);
		System.out.println("Ruta de destino del archivo a copiar:");
		String fileCopy = readMessage();
		String fileCopyFix = fileCopy.replace("\\","\\\\").concat("\\\\"+f.getName());
		//System.out.println(fileCopy);
		File fc = new File(fileCopyFix);
		//System.out.println(fc.getName());
		if (f.exists()) {
			try (FileReader fr = new FileReader(f);
					BufferedReader br = new BufferedReader(fr);
					PrintWriter pw = new PrintWriter(fc)){
				String cadena = null;
				do {
					cadena = br.readLine();
					if (cadena != null) {
						pw.println(cadena);
					}
				} while (cadena != null);
				
			}
		} else {
			System.out.println("El archivo no existe");
		}
	}
	
}
