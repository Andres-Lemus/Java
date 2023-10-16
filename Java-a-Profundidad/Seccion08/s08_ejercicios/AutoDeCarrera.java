package s08_ejercicios;

public class AutoDeCarrera extends Automovil implements Llanta {
	private String equipo;
	private int carrerasGanadas; 
	
	public AutoDeCarrera(double kilometros, String fechaCreacion, String placa, String equipo, int carrerasGanadas) {
		super(kilometros, fechaCreacion, placa);
		this.equipo = equipo;
		this.carrerasGanadas = carrerasGanadas;
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	public int getCarrerasGanadas() {
		return carrerasGanadas;
	}

	public void setCarrerasGanadas(int carrerasGanadas) {
		this.carrerasGanadas = carrerasGanadas;
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
