package java8;

import java.util.Comparator;

interface Follower{
	
	void unfollow();
	
	default void follow() {
		System.out.println("Esto es un metodo generico para seguir a alguien");
	}
	
	static void print() {
		System.out.println("Esto es un metodo static en una interfaz");
	}
}

class TwitterFollower implements Follower{

	@Override
	public void unfollow() {
		System.out.println("Unfollow en Twitter");
	}
	
	@Override
	public void follow() {
		System.out.println("Follow en Twitter");
	}
	
}

public class MetodosStaticEnInterfaces {
	public static void main(String[] args) {
		Follower.print();
		new TwitterFollower().follow();
		//Comparator<?> reverseOrder = Comparator.reverseOrder();
	}
}
