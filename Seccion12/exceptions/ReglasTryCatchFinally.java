package exceptions;

import javax.management.RuntimeErrorException;

public class ReglasTryCatchFinally {
	
	static void test() {
		try {
			System.out.println("Bloque try");
			System.exit(0);
			return;
		} finally {
			System.out.println("Bloque Finally");
		}
	}

	public static void main(String[] args) {
		test();
		try {
			
		} catch (Exception e) {

		}
		
		try {
			
		} catch (NullPointerException e) {

		} catch (RuntimeException t) {
			
		} catch (Exception e) {

		} catch (Throwable e) {

		}
		
		
		try {
			
		} finally {
			
		}
		
		try {
			
		} catch (Exception e) {

		} finally {
			
		}

	}

}
