package s14_ejercicios.transaccion;

public class TransaccionBancaria {
	private float saldo;
	
	public TransaccionBancaria(float saldo) {
		this.saldo = saldo;
	}

	void retiro(float monto) {
		
		if(saldo - monto < 0) {
			System.out.println("No puede retirar más dinero del que posee");
		} else {
			saldo -= monto;
			System.out.println("Retiro con éxito. Saldo en cuenta: " + saldo);
		}
		
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
}
