package S06_ejercicios;

public class Hamster extends Animal{

	public Hamster(String nombre, String especie, double peso) {
		super(nombre, especie, peso);
	}

	void rueda() {
		System.out.println("Soy " + nombre + " " + especie +  " y voy girando en mi rueda");
	}
}
