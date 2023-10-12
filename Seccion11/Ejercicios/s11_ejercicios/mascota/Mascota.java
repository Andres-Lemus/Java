package s11_ejercicios.mascota;
public class Mascota{
	String nombre;
	String especie;
	int edad;
	double peso;
	
	Mascota (String nombre, String especie){
		this.nombre = nombre;
		this.especie = especie;
	}
	
	Mascota (int edad, double peso){
		this("Nombre generico", "Especie del animal");
		this.edad = edad;
		this.peso = peso;
	}
	
	void comer() {
		System.out.println(nombre + " esta comiendo");
	}
	
	void jugar(Mascota m) {
		System.out.println(nombre + " esta jugando con " + m.nombre);
	}
	
	void dormir() {
		System.out.println(nombre + " esta dormido");
	}
	
}