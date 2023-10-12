package statics;

import java.security.Provider.Service;

class SerVivo{
	public SerVivo() {
		System.out.println("Constructor ser vivo");
	}
}


class Humano extends SerVivo{
	static int numeroDeHumanos=0;
	String nombre;
	
	public Humano() {
		super();
		System.out.println("Constructor");
	}

	public Humano(String nombre) {
		this.nombre = nombre;
		System.out.println("Constructor sobrecargado");
	}
	
	{
		System.out.println("Bloque Anónimo");
		numeroDeHumanos++;
	}
	{
		System.out.println("Bloque 2");
	}
	
}

public class EjemploStaticEnVariables {
	
	public static void main(String[] args) {
		System.out.println(Humano.numeroDeHumanos);
		new Humano();
		new Humano();
		new Humano();
		new Humano();
		System.out.println(Humano.numeroDeHumanos);
	}

}
