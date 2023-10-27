package optional;

import java.util.Iterator;
import java.util.Optional;

public class PruebaOptional {
	private static String[] nombres = {"Andres", "Metroid", "Galerias"};
	
	private static Optional<String> buscarNombrePorId(String n) {
		for (String nombre : nombres) {
			if (nombre.equals(n)) {
				return Optional.of(nombre);
			}
		}
		return Optional.empty();
	}

	public static void main(String[] args) {
		Optional<String> result = buscarNombrePorId("Pedro");
		if (result.isPresent()) {
			System.out.println(result.get().toUpperCase());
		} else {
			System.out.println("Nombre no encontrado");
		}
		String nombre = buscarNombrePorId("Pepe").orElse("Nombre Default");
		System.out.println(nombre);
		
		String value = buscarNombrePorId("Pablo").orElseThrow(()->new IllegalStateException("No se encontro el nombre"));
		System.out.println(value);
	}

}
