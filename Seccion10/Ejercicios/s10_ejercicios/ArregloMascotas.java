package s10_ejercicios;

public class ArregloMascotas {
	public static void main(String[] args) {
		Mascota misMascotas[] = new Mascota[] {
			new Pez("Nemo","Payaso",true),
			new Labrador("Bolt","Labrador Retriever"),
			new Hamster("Bola","Doméstico",3.55f),
			new Mascota("Gusi","Gusano de Jardín")
		};
		
		for (Mascota mascota : misMascotas) {
			System.out.println("Nombre: " + mascota.nombre);
			System.out.println("Especie: " + mascota.especie);
		}
	}
}
