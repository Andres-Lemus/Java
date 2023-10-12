package files;

import java.io.File;

public class EjemploFile {

	public static void main(String[] args) {
		File f = new File("D:\\Documentos\\Bootcamp Consiti\\Java\\Seccion15\\archivos");
		System.out.println("Is File: "+f.isFile());
		System.out.println("Is Directory: "+f.isDirectory());
		System.out.println("Name: "+f.getName());
		System.out.println("Can Read: "+f.canRead());
		
		File[] content = f.listFiles();
		for (File file : content) {
			System.out.println("Content - Is File: "+file.isFile());
			System.out.println("Content - Is Directory: "+file.isDirectory());
			System.out.println("Content - Name: "+file.getName());
			System.out.println("Content - Can Read: "+file.canRead());
			System.out.println();
		}
	}

}
