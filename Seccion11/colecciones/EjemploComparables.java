package colecciones;

import java.util.TreeSet;

class Perro implements Comparable<Perro>{
	String nombre;

	public Perro(String nombre) {
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
		return "Perro [nombre=" + nombre + "]";
	}

	@Override
	public int compareTo(Perro p) {
		//return nombre.compareTo(p.getNombre());
		return p.getNombre().compareTo(nombre);
	}
	
	
	
}

public class EjemploComparables {

	public static void main(String[] args) {
		TreeSet<Perro> set = new TreeSet<>();
		set.add(new Perro("Bolt"));
		set.add(new Perro("Zolt"));
		set.add(new Perro("Rocky"));
		
		System.out.println(set);
	}

}
