class Mascota{
	String nombre;
	String especie;
	int edad;
	double peso;
	
	Mascota (String nombre, String especie){
		this.nombre = nombre;
		this.especie = especie;
	}
	
	Mascota (int edad, double peso){
		this("Nombre generico", "Especie del animal");
		this.edad = edad;
		this.peso = peso;
	}
	
	void comer() {
		System.out.println(nombre + " esta comiendo");
	}
	
	void jugar(Mascota m) {
		System.out.println(nombre + " esta jugando con " + m.nombre);
	}
	
	void dormir() {
		System.out.println(nombre + " esta dormido");
	}
	
	public static void main(String args[]) {
		Mascota m = new Mascota("Bolt", "Perro");
		m.comer();
		Mascota m1 = new Mascota("Miau", "Gato");
		m.jugar(m1);
		m1.dormir();
	}
}