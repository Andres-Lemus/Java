package s11_ejercicios.mascota;

import java.util.ArrayList;

public class ListaMascotas {
	public static void main(String[] args) {
		ArrayList<Mascota> mascotas = new ArrayList<>();
		mascotas.add(new Labrador("Bolt","Labrador Retriever"));
		mascotas.add(new Pez("Fishy","Pez Dorado",true));
		mascotas.add(new Mascota("Espinas","Erizo"));
		
		System.out.println(mascotas);
	}
}
