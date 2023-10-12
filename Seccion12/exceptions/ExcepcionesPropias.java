package exceptions;

class TituloIncorrectoException extends Exception{

	private static final long serialVersionUID = 4037539706838423051L;

	public TituloIncorrectoException(String error) {
		super(error);
	}
	
}

public class ExcepcionesPropias {
	
	static void crearCurso(String titulo) throws Exception {
		if (!titulo.toUpperCase().equals(titulo)) {
			throw new TituloIncorrectoException("El título debe estar en mayúsculas");
		}
		System.out.println("Título correcto");
	}

	public static void main(String[] args) {
		try {
			crearCurso("JAVA DESDE CERO A PROFUNDIDAD");
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
