package herencia;

public class EjemploPersona {
	public static void main(String[] args) {
		Estudiante e = new Estudiante(101415,"Andrés","30-04-2001");
		e.dormir();
		e.aprobar();
		e.reprobar();
		
		Empleado emp = new Empleado(800, "Carlos", "12-05-1992");
		emp.trabajar();
		emp.cobrar();
		emp.comer();
	}
}
