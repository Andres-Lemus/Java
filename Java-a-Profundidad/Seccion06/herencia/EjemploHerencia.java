package herencia;
class Animal{
	String nombre;
	public void respirar() {
		System.out.println("Soy un animal y estoy respirando");
	}
}

class Perro extends Animal{
	
}

class Gato extends Animal{
	 
}


public class EjemploHerencia {
	public static void main(String args[]) {
		Animal a  = new Animal();
		Perro p  = new Perro();
		p.nombre = "Rocky";
		p.respirar();
		Gato g = new Gato();
		g.respirar();
		
		System.out.println(a instanceof Animal);
		System.out.println(a instanceof Object);
		
		System.out.println(p instanceof Animal);
		System.out.println(p instanceof Object);
		System.out.println(p instanceof Perro);
	}
}
