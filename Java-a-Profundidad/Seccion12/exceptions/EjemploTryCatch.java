package exceptions;

public class EjemploTryCatch {

	public static void main(String[] args) {
		try {
			int x = 10;
			int y = 10/x;
			System.out.println("Valor de la división " + y);
			String nombre = "";
			System.out.println(nombre.toString());
			String arr[] = {"Hola","Andres"};
			System.out.println(arr[3]);
		} catch (ArithmeticException | NullPointerException e) {
			System.err.printf("Arithmetic y NullPointer Exception %s \n", e.getMessage());
		} catch(Exception e) {
			System.err.printf("Exception %s \n", e.getMessage());
		} finally {
			System.out.println("Siempre se ejecuta");
		}

	}

}
