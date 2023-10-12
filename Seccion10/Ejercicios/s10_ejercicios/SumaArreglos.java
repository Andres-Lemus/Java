package s10_ejercicios;

public class SumaArreglos {
	public static void main(String[] args) {
		int dimension = 3;
		int arreglo1[][] = new int[dimension][dimension]; 
		int arreglo2[][] = new int[dimension][dimension]; 
		
		for (int i = 0; i < dimension; i++) {
			for (int j = 0; j < dimension; j++) {
				double random1 = Math.random()*9, random2 = Math.random()*9;;
				arreglo1[i][j] = (int)random1;
				arreglo2[i][j] = (int)random2;
			}
		}
		System.out.println("Arreglo #1");
		for (int[] is : arreglo1) {
			for (int is2 : is) {
				System.out.print(is2 + "\t");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Arreglo #2");
		for (int[] is : arreglo2) {
			for (int is2 : is) {
				System.out.print(is2 + "\t");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Arreglo Resultante");
		int arregloSuma[][] = new int[dimension][dimension];
		for (int i = 0; i < dimension; i++) {
			for (int j = 0; j < dimension; j++) {
				arregloSuma[i][j] = arreglo1[i][j] + arreglo2[i][j];
				System.out.print(arregloSuma[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
