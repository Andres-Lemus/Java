package s08_ejercicios;

public class Camioneta extends Automovil implements Llanta {
	private boolean portaequipaje;

	public Camioneta(double kilometros, String fechaCreacion, String placa, boolean portaequipaje) {
		super(kilometros, fechaCreacion, placa);
		this.portaequipaje = portaequipaje;
	}

	public boolean isPortaequipaje() {
		return portaequipaje;
	}

	public void setPortaequipaje(boolean portaequipaje) {
		this.portaequipaje = portaequipaje;
	}

	@Override
	public void cambiarLlanta() {
		// TODO Auto-generated method stub

	}

	@Override
	public void medirPresion() {
		// TODO Auto-generated method stub

	}

	@Override
	public void encender() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void apagar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void llenarCombustible() {
		// TODO Auto-generated method stub
		
	}

}
