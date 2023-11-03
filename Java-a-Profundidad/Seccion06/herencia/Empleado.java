package herencia;

public class Empleado extends Persona{
	float sueldo;
	
	public Empleado(float sueldo, String nombre, String fechaDeNacimiento) {
		super(nombre, fechaDeNacimiento);
		this.sueldo = sueldo;

	}
	
	void trabajar() {
		System.out.println("Soy " + nombre + " y trabajo");
	}
	
	void cobrar() {
		System.out.println("Soy " + nombre + " y estoy cobrando " + sueldo);
	}
}
