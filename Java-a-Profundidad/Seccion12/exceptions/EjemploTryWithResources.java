package exceptions;

class RecursoAlgo implements AutoCloseable{

	void foo() {
		System.out.println("Foo");
	}
	
	@Override
	public void close() {
		System.out.println("Liberando Recusos");
	}
	
}

public class EjemploTryWithResources {

	public static void main(String[] args) {
		
		try (RecursoAlgo recurso = new RecursoAlgo()) {
			recurso.foo();
		} 
	}

}
