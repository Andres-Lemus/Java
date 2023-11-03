package herencia;

public class Estudiante extends Persona {
	int numeroDeCuenta;
	
	Estudiante(int numeroDeCuenta, String nombre, String fechaDeNacimiento){
		super(nombre, fechaDeNacimiento);
		this.numeroDeCuenta = numeroDeCuenta;
	}
	
	@Override
	void dormir() {
		super.dormir();
		System.out.println("Soy " + nombre + ", soy estudiante, yo no duermo");
	}
	
	void aprobar() {
		System.out.println("Soy " + nombre + " y aprobé mi examen");
	}
	void reprobar() {
		System.out.println("Soy " + nombre + " y reprobé mi examen");
	}
}
