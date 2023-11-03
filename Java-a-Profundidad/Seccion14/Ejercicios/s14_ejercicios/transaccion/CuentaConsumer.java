package s14_ejercicios.transaccion;

public class CuentaConsumer extends Thread{
	private CuentaResource resource;

	public CuentaConsumer(CuentaResource resource, String name) {
		super(name);
		this.resource = resource;
	}

	@Override
	public void run() {
		float saldo = resource.consume();
	}
	
	

}
