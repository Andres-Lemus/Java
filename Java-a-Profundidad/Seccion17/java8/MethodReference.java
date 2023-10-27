package java8;

import java.util.Arrays;
import java.util.List;

class StringUtils{
	static boolean isUpperCase(String cad) {
		return cad.toUpperCase().equals(cad);
	}
}

class Persona {
	private String nombre;

	public Persona(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + "]";
	}
	
}

public class MethodReference {

	public static void main(String[] args) {
		Arrays.asList("andres","juan","sasonador","APPLE").		
		stream().
		filter(StringUtils::isUpperCase).
		map(Persona::new).
		forEach(System.out::println);
	}

}
