package S06_ejercicios;

public class Animal {
	String nombre;
	String especie;
	double peso;
	
	
	
	public Animal(String nombre, String especie, double peso) {
		this.nombre = nombre;
		this.especie = especie;
		this.peso = peso;
	}

	void dormir() {
		System.out.println("Soy " + nombre + " " + especie + " y estoy durmiendo");
	}
	
	void respirar() {
		System.out.println("Soy " + nombre + " " + especie +  " y estoy respirando");	
	}
	
	void comer() {
		System.out.println("Soy " + nombre + " " + especie +  " y estoy comiendo");
	}
}
