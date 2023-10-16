package innerclasses;

class ExternaStatic {
	public void foo() {
		System.out.println("Foo");
	}
	
	static class InternaStatic {
		void bar() {
			System.out.println("Bar");
		}
	}
}

public class ClasesInternasStatic {

	public static void main(String[] args) {
		ExternaStatic.InternaStatic obj = new ExternaStatic.InternaStatic();
		obj.bar();

	}

}
