package colecciones;

import java.util.PriorityQueue;

public class EjemploPriorityQueue {

	public static void main(String[] args) {
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		queue.offer(1000);
		queue.offer(200);
		queue.offer(5);
		queue.offer(100);
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);

	}

}
