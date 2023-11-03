package threads.producersconsumers;

import java.util.Random;

public class AlgoConsumer extends Thread{
	private AlgoResource resource;

	public AlgoConsumer(AlgoResource resource, String name) {
		super(name);
		this.resource = resource;
	}

	@Override
	public void run() {
		while(true) {
			try {
				int value = resource.consume();
				System.out.printf("%s consumed %d \n",getName(), value);
				Thread.sleep(new Random().nextInt(200));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}
