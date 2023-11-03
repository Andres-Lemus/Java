package s14_ejercicios.transaccion;



public class MontoThreads {

	public static void main(String[] args) {
		CuentaResource resource = new CuentaResource(new TransaccionBancaria(100.0f));
		
		CuentaConsumer consumer = new CuentaConsumer(resource, "Consumer");
		CuentaProducer producer1 = new CuentaProducer(resource, "Producer 1");
		CuentaProducer producer2 = new CuentaProducer(resource, "Producer 2");
		CuentaProducer producer3 = new CuentaProducer(resource, "Producer 3");
		CuentaProducer producer4 = new CuentaProducer(resource, "Producer 4");
		CuentaProducer producer5 = new CuentaProducer(resource, "Producer 5");
		CuentaProducer producer6 = new CuentaProducer(resource, "Producer 6");
		
		producer1.start();
		producer2.start();
		producer3.start();
		producer4.start();
		producer5.start();
		producer6.start();
		consumer.start();

	}

}
