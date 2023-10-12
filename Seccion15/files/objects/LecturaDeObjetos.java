package files.objects;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LecturaDeObjetos {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		File file = new File("D:\\Documentos\\Bootcamp Consiti\\Java\\Seccion15\\archivos\\programadores.txt");
		try(FileInputStream fis = new FileInputStream(file);
				ObjectInputStream ois = new ObjectInputStream(fis)){
			
			while (true) {
				try {
					Programador programador = (Programador) ois.readObject();
					if (programador != null) {
						System.out.println(programador.getNombre());
						System.out.println(programador.getLenguajeFavorito());
					}else {
						System.out.println("Null");
					}
				} catch (EOFException e) {
					break;
				}
				
			}
		}
	}

}
