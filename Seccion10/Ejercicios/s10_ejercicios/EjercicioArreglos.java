package s10_ejercicios;

public class EjercicioArreglos {
	public static void main(String[] args) {
		boolean b[] = new boolean[] {true, false, false, true};
		byte by[] = new byte[5];
		short s[] = {'H', 'i', 'J', 'k'};
		int i[] = new int[] {1,2,3,4,5,6,7,8,9};
		char c[] = new char[3];
		long l[] = {1511552552l,184858582818l,1482818252l,9292225165l};
		double d[] = new double[] {9.99, 6.66,3.33,1.11};
		
		String triangulo[][] = new String[6][];
		int contador = 1, max = 5;
		
		for (int j = 0; j < 6; j++) {
			triangulo[j] = new String[contador];
			for (int k = 0; k < contador; k++) {
				triangulo[j][k] = "*";
			}
			if (contador >= 3 || j >= 3) {
				contador--;
			} else {
				contador++;
			}
		}
		for (String[] fila : triangulo) {
			for (String dato : fila) {
				System.out.print(dato + "\t");
			}
			System.out.println();
		}
		System.out.println();
		
		
	}
}
