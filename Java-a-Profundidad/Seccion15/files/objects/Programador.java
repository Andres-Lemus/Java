package files.objects;

import java.io.Serializable;

public class Programador implements Serializable{
	private String nombre;
	private String lenguajeFavorito;
	private double sueldo;
	
	private static final long serialVersionUID = 1778445831808205627L;
	
	public Programador() {}
	
	public Programador(String nombre, String lenguajeFavorito) {
		super();
		this.nombre = nombre;
		this.lenguajeFavorito = lenguajeFavorito;
		//this.sueldo = sueldo;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLenguajeFavorito() {
		return lenguajeFavorito;
	}

	public void setLenguajeFavorito(String lenguajeFavorito) {
		this.lenguajeFavorito = lenguajeFavorito;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
}
