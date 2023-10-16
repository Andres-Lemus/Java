package files.objects;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EscrituraDeObjetos {
	public static void main(String[] args) throws IOException {
		Programador programadores[] = {new Programador("Andres", "Java"),
				new Programador("Paco", "Java"),
				new Programador("Juan", "Java"), null	};
		File file = new File("D:\\Documentos\\Bootcamp Consiti\\Java\\Seccion15\\archivos\\programadores.txt");
		if (!file.exists()) {
			file.createNewFile();
		}
		try(FileOutputStream fos = new FileOutputStream(file);
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			for (Programador programador : programadores) {
				oos.writeObject(programador);
			}
		}
	}
}
