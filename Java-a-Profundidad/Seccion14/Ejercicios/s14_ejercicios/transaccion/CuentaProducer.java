package s14_ejercicios.transaccion;

public class CuentaProducer extends Thread{
	private CuentaResource resource;
	
	public CuentaProducer(CuentaResource resource, String name) {
		super(name);
		this.resource = resource;
	}

	@Override
	public void run() {
		float monto = 25.0f;
		resource.produce(monto);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
