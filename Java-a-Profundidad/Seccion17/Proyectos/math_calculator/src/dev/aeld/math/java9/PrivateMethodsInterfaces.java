package dev.aeld.math.java9;

interface Bar{
	
	public void bar();
	
	default void foo() {
		foo2();
	}
	
	private void foo2() {
		System.out.println("Foo 2");
	}
	
	private static void foo3() {
		System.out.println("Foo 3");
	}
}

public class PrivateMethodsInterfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
