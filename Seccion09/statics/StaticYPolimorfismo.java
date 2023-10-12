package statics;

class A {
	static void foo() {
		System.out.println("Foo");
	}
}

class B extends A{
	static void foo() {
		System.out.println("Foo2");
	}
}

public class StaticYPolimorfismo {
	public static void main(String[] args) {
		A a = new B();
		a.foo();
	}
}
