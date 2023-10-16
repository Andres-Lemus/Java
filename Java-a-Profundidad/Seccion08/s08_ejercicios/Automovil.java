package s08_ejercicios;

public abstract class Automovil {
	private double kilometros;
	private String fechaCreacion;
	private String placa;
	private String modelo;
	
	public Automovil(double kilometros, String fechaCreacion, String placa) {
		this.kilometros = kilometros;
		this.fechaCreacion = fechaCreacion;
		this.placa = placa;
	}
	
	public double getKilometros() {
		return kilometros;
	}
	public void setKilometros(double kilometros) {
		this.kilometros = kilometros;
	}
	public String getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public abstract void encender();
	public abstract void apagar();
	public abstract void llenarCombustible();
	
}
