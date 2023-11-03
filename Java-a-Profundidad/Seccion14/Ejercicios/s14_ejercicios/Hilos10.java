package s14_ejercicios;

import java.util.Random;

class HiloThread extends Thread {

	int loop;
	public HiloThread(String name, int loop) {
		super(name);
		this.loop = loop;
	}
	
	@Override
	public void run(){
		for (int i = loop; i >= 0; i--) {
			System.out.printf("Hilo %s indice %d \n", getName(),i);
		}
		try {
			int value = new Random().nextInt(3000);
			Thread.sleep(value);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class Hilos10 {

	public static void main(String[] args) {
		HiloThread hilo1 = new HiloThread("Hilo 1 ", 10);
		HiloThread hilo2 = new HiloThread("Hilo 2 ", 10);
		HiloThread hilo3 = new HiloThread("Hilo 3 ", 10);
		HiloThread hilo4 = new HiloThread("Hilo 4 ", 10);
		HiloThread hilo5 = new HiloThread("Hilo 5 ", 10);
		HiloThread hilo6 = new HiloThread("Hilo 6 ", 10);
		HiloThread hilo7 = new HiloThread("Hilo 7 ", 10);
		HiloThread hilo8 = new HiloThread("Hilo 8 ", 10);
		HiloThread hilo9 = new HiloThread("Hilo 9 ", 10);
		HiloThread hilo10 = new HiloThread("Hilo 10 ", 10);
		
		hilo1.start();
		hilo2.start();
		hilo3.start();
		hilo4.start();
		hilo5.start();
		hilo6.start();
		hilo7.start();
		hilo8.start();
		hilo9.start();
		hilo10.start();

	}

}
