package modificadores;

class Prueba {
	@SuppressWarnings("unused")
	private String nombre;
	
	public Prueba() {
		
	}	
	
	@SuppressWarnings("unused")
	private void foo() {
		
	}
}

public class Private {

	public static void main(String[] args) {
		Prueba p  = new Prueba();
		//p.nombre = "Andrés";
		//p.foo();
	}

}
