package s14_ejercicios.transaccion;

public class CuentaResource {
	private TransaccionBancaria cuenta;
	
	public CuentaResource(TransaccionBancaria cuenta) {
		super();
		this.cuenta = cuenta;
	}

	public synchronized float consume() {
		return cuenta.getSaldo();
	}
	
	public synchronized void produce(float value) {
		cuenta.retiro(value);
		notifyAll();
	}
}
