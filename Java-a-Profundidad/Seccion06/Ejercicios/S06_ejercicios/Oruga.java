package S06_ejercicios;

public class Oruga extends Animal{
	int tiempoMetamorfosis;
	String desplazamiento;

	public Oruga(String nombre, String especie, double peso) {
		super(nombre, especie, peso);
	}

	public Oruga(String nombre, String especie, double peso, int tiempoMetamorfosis, String desplazamiento) {
		super(nombre, especie, peso);
		this.tiempoMetamorfosis = tiempoMetamorfosis;
		this.desplazamiento = desplazamiento;
	}

	@Override
	void comer() {
		System.out.println("Soy " + nombre + " " + especie +  " y estoy comiendo unas hojas");
	}
	
	
	void metamorfosis() {
		System.out.println("Soy " + nombre + " " + especie +  " y termino mi metamorfosis en " + tiempoMetamorfosis +  " días");
	}
	
}
