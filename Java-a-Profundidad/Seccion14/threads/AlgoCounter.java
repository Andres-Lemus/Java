package threads;

class Counter implements Runnable{

	private int valor;
	
	public Counter(int valor) {
		this.valor = valor;
	}
	
	@Override
	public void run() {
		System.out.printf("Estado: %s \n", Thread.currentThread().getState());
		for (int i = valor; i >= 0; i--) {
			System.out.printf("%s Valor %d \n", Thread.currentThread().getName(), i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
		}
		
	}
	
	
}

public class AlgoCounter {

	public static void main(String[] args) throws InterruptedException {
		Thread hilo1 = new Thread(new Counter(10), "Hilo1");
		hilo1.setName("Hilo");
		System.out.printf("Estado: %s \n", hilo1.getState());
		hilo1.start();
		hilo1.join();
		System.out.printf("Estado: %s \n", hilo1.getState());
		/*Thread hilo2 = new Thread(new Counter(20), "Hilo2");
		hilo2.start();
		System.out.println("Se lanzaron los hilos");
		hilo1.join();
		hilo2.join();
		System.out.println("Fin del método principal");*/
	}

}
