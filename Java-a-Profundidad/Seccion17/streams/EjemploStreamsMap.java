package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Alumno {
	private String nombre;

	public Alumno(String nombre) {
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
		return "Alumno [nombre=" + nombre + "]";
	}
	
	
}

public class EjemploStreamsMap {
	public static void main(String[] args) {
		List<Alumno> alumnos = Arrays.asList(new Alumno("Juan"),new Alumno("Pedro"),new Alumno("Juan"));
		List<String> nombres = alumnos.stream().map(a->a.getNombre()).collect(Collectors.toList());
		System.out.println(nombres);
		
		List<Alumno> alumnos2 = nombres.stream().map(n->new Alumno(n)).collect(Collectors.toList());
		System.out.println(alumnos2);
	}
}
