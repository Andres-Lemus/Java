package exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class EjemploThrow {
	
	static double dividir(int a, int b) throws Exception, FileNotFoundException, IOException, IllegalArgumentException {
		double resultado = 0;
		if (b != 0) {
			resultado = 0;
		} else {
			throw new Exception("No se puede dividir entre 0");
		}
		System.out.println("Fin del método");
		return resultado;
	}

	public static void main(String[] args) {
		double resultado;
		try {
			resultado = dividir(10,0);
			System.out.println("Resultado: " + resultado);
		} catch (Exception e) {
			System.out.println("Error " + e.getMessage());
		}

	}

}
