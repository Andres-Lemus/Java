package S06_ejercicios;

public class Anfibio extends Animal {
	
	public Anfibio(String nombre, String especie, double peso) {
		super(nombre, especie, peso);
	}
	
	void salir() {
		System.out.println("Soy " + nombre + " " + especie +  " y salgo del agua");
	}
	
	void entrar() {
		System.out.println("Soy " + nombre + " " + especie +  " entro al agua");
	}
}
