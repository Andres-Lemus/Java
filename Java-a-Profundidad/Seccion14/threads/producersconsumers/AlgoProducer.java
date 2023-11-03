package threads.producersconsumers;

import java.util.Random;

public class AlgoProducer extends Thread{
	private AlgoResource resource;

	public AlgoProducer(AlgoResource resource, String name) {
		super(name);
		this.resource = resource;
	}

	@Override
	public void run() {
		while(true) {
			try {
				int value = new Random().nextInt(1000);
				System.out.printf("%s produced %d \n", getName(),value);
				resource.produce(value);
				Thread.sleep(new Random().nextInt(300));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}
