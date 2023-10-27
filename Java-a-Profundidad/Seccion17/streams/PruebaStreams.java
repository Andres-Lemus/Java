package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Persona{
	private String nombre;
	private int edad;
	
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
}

public class PruebaStreams {
	
	public static void main(String[] args) {
		List<Persona> personas = Arrays.asList(new Persona("Juan", 10), new Persona("Pepe", 30),
				new Persona("Oscar", 32), new Persona("Maria", 18), new Persona("Pedro", 52));
		
		
		List<Persona> result = personas.stream().filter(p -> p.getEdad()>=18).
				limit(3).collect(Collectors.toList());
		/*List<Persona> result = personas.stream().filter(new Predicate<Persona>() {

			@Override
			public boolean test(Persona p) {
				return p.getEdad()>=18;
			}
			
		}).limit(3).collect(Collectors.toList());*/
		
		/*List<Persona> result = new ArrayList<>();
		int count = 0;
		for (Persona persona : personas) {
			if (persona.getEdad()>=18) {
				result.add(persona);
				count++;
			}
			if (count == 3) {
				break;
			}
		}*/
		System.out.println(result);
	}

}
