package colecciones;

import java.util.HashSet;

public class EjemploHashSet {

	public static void main(String[] args) {
		HashSet<String> nombres = new HashSet<>();
		System.out.println(nombres.add("String"));
		System.out.println(nombres.add("String"));
		nombres.add("Hola");
		nombres.add(null);
		System.out.println(nombres);

	}

}
