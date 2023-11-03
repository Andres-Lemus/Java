package threads.producersconsumers;

public class AlgoTest {
	public static void main(String[] args) throws InterruptedException {
		AlgoResource resource = new AlgoResource();
		
		AlgoConsumer consumer1 = new AlgoConsumer(resource, "Consumer 1");
		AlgoProducer producer1 = new AlgoProducer(resource, "Producer 1");
		
		AlgoConsumer consumer2 = new AlgoConsumer(resource, "Consumer 2");
		AlgoProducer producer2 = new AlgoProducer(resource, "Producer 2");
		
		producer1.start();
		producer2.start();
		consumer1.start();
		consumer2.start();
	}
}
