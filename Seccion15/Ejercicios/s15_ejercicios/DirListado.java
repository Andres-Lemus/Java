package s15_ejercicios;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class DirListado {
	
	private static void dir(File[] files) {
		DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		if (files != null) {
			for (File file : files) {	
				float size = (float) file.length() / 1024;
				if (file.isFile()) {
					System.out.printf("%s %f %s \n", sdf.format(file.lastModified()), size, file.getName());
				} else {
					System.out.printf("%s <DIR> %s \n", sdf.format(file.lastModified()), file.getName());
				}
			}
		}
	}

	public static void main(String[] args) {
		File f = new File("D:\\Documentos\\Bootcamp Consiti");
		System.out.println(f.getName());
		dir(f.listFiles());

	}

}
