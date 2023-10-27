package java9;

interface Bar{
	default void foo() {
		foo2();
	}
	
	default void foo2() {
		
	}
}

public class PrivateMethodsInterfaces {
	public static void main(String[] args) {
		
	}
}
