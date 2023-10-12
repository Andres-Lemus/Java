package S06_ejercicios;

public class EjercicioAnimal {

	public static void main(String[] args) {
		Oruga o = new Oruga("Gusi","De seda",0.8, 20, "Arrastrarse");
		o.comer();
		o.dormir();
		o.metamorfosis();
		Pez p = new Pez(true, 20, "Nemo", "Pez payaso", 1.5);
		p.comer();
		p.nadar();
	}

}
