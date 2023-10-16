package s10_ejercicios;

public class Pez extends Mascota{
	boolean branqueas;
	
	Pez(String nombre, String especie, boolean branqueas) {
		super(nombre, especie);
		this.branqueas = branqueas;
	}

}
