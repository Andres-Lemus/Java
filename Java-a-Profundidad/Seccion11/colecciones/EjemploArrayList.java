package colecciones;

import java.util.ArrayList;

public class EjemploArrayList {

	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<>();
		array.add("String");
		array.add("hola");
		array.add("String");
		array.add("hola");
		array.add("String");
		array.add("hola");
		array.add(5, "Andres");
		
		System.out.println(array);

	}

}
