package s14_ejercicios;

import java.util.Random;

class PriorityThread extends Thread {

	int loop;
	public PriorityThread(String name, int loop) {
		super(name);
		this.loop = loop;
	}
	
	@Override
	public void run(){
		setPriority(new Random().nextInt(9)+1);
		for (int i = loop; i >= 0; i--) {
			System.out.printf("%s indice %d con prioridad %s \n", getName(),i, getPriority());
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class Hilos30 {

	public static void main(String[] args) {
		
		PriorityThread hilo1 = new PriorityThread("Hilo 1 ", 10);
		PriorityThread hilo2 = new PriorityThread("Hilo 2 ", 10);
		PriorityThread hilo3 = new PriorityThread("Hilo 3 ", 10);
		PriorityThread hilo4 = new PriorityThread("Hilo 4 ", 10);
		PriorityThread hilo5 = new PriorityThread("Hilo 5 ", 10);
		PriorityThread hilo6 = new PriorityThread("Hilo 6 ", 10);
		PriorityThread hilo7 = new PriorityThread("Hilo 7 ", 10);
		PriorityThread hilo8 = new PriorityThread("Hilo 8 ", 10);
		PriorityThread hilo9 = new PriorityThread("Hilo 9 ", 10);
		PriorityThread hilo10 = new PriorityThread("Hilo 10 ", 10);
		PriorityThread hilo11 = new PriorityThread("Hilo 11 ", 10);
		PriorityThread hilo12 = new PriorityThread("Hilo 12 ", 10);
		PriorityThread hilo13 = new PriorityThread("Hilo 13 ", 10);
		PriorityThread hilo14 = new PriorityThread("Hilo 14 ", 10);
		PriorityThread hilo15 = new PriorityThread("Hilo 15 ", 10);
		PriorityThread hilo16 = new PriorityThread("Hilo 16 ", 10);
		PriorityThread hilo17 = new PriorityThread("Hilo 17 ", 10);
		PriorityThread hilo18 = new PriorityThread("Hilo 18 ", 10);
		PriorityThread hilo19 = new PriorityThread("Hilo 19 ", 10);
		PriorityThread hilo20 = new PriorityThread("Hilo 20 ", 10);
		PriorityThread hilo21 = new PriorityThread("Hilo 21 ", 10);
		PriorityThread hilo22 = new PriorityThread("Hilo 22 ", 10);
		PriorityThread hilo23 = new PriorityThread("Hilo 23 ", 10);
		PriorityThread hilo24 = new PriorityThread("Hilo 24 ", 10);
		PriorityThread hilo25 = new PriorityThread("Hilo 25 ", 10);
		PriorityThread hilo26 = new PriorityThread("Hilo 26 ", 10);
		PriorityThread hilo27 = new PriorityThread("Hilo 27 ", 10);
		PriorityThread hilo28 = new PriorityThread("Hilo 28 ", 10);
		PriorityThread hilo29 = new PriorityThread("Hilo 29 ", 10);
		PriorityThread hilo30 = new PriorityThread("Hilo 30 ", 10);
		
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
		hilo11.start();
		hilo12.start();
		hilo13.start();
		hilo14.start();
		hilo15.start();
		hilo16.start();
		hilo17.start();
		hilo18.start();
		hilo19.start();
		hilo20.start();
		hilo21.start();
		hilo22.start();
		hilo23.start();
		hilo24.start();
		hilo25.start();
		hilo26.start();
		hilo27.start();
		hilo28.start();
		hilo29.start();
		hilo30.start();

	}

}
