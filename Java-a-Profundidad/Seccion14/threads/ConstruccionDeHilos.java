package threads;

class AlgoThread extends Thread {

	public AlgoThread(String name) {
		super(name);
	}
	
	@Override
	public void run(){
		for (int i = 0; i < 100; i++) {
			System.out.printf("Hilo %s indice %d \n", getName(),i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ConstruccionDeHilos {

	public static void main(String[] args) {
		AlgoThread hilo1 = new AlgoThread("Hilo 1 ");
		AlgoThread hilo2 = new AlgoThread("Hilo 2 ");
		
		hilo1.start();
		hilo2.start();
	}

}
