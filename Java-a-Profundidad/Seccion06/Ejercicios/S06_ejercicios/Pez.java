package S06_ejercicios;

public class Pez extends Animal{
	boolean branqueas;
	double velocidad;
		
	public Pez(String nombre, String especie, double peso) {
		super(nombre, especie, peso);
	}

	public Pez(boolean branqueas, double velocidad, String nombre, String especie, double peso) {
		super(nombre, especie, peso);
		this.branqueas = branqueas;
		this.velocidad = velocidad;
	}


	void nadar() {
		System.out.println("Soy " + nombre + " " + especie +  " y estoy nadando a " + velocidad + " km/h");
	}
}
