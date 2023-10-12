package arreglos;

public class InicializacionDeArreglos {
	
	static void imprimirArreglo(String arreglo[]) {
		for (String valor : arreglo) {
			System.out.println(valor);
		}
	}

	public static void main(String[] args) {
		String nombres[] = new String[2];
		nombres[0] = "raidentrance";
		nombres[1] = "hola";
		imprimirArreglo(nombres);
		
		String nombres2[] = {"raidentrance", "hola"};
		imprimirArreglo(nombres2);
		
		String nombres3[] = new String[] {"raidentrance", "hola"};
		imprimirArreglo(new String[] {"raidentrance", "hola"});
	}

}
