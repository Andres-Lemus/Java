package S06_ejercicios;

public class Ave extends Animal {
	double altura;

	public Ave(String nombre, String especie, double peso) {
		super(nombre, especie, peso);
	}

	public Ave(String nombre, String especie, double peso, double altura) {
		super(nombre, especie, peso);
		this.altura = altura;
	}

	void elevarse() {
		System.out.println("Soy " + nombre + " " + especie +  " y me elevo hasta " + altura + " m");
	}
	
	void irse() {
		System.out.println("Soy " + nombre + " " + especie +  " y me voy volando muy lejos");
	}
}
