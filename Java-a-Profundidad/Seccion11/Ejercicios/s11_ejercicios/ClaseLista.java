package s11_ejercicios;

import java.util.ArrayList;
import java.util.List;

class Lista {
	public List<String> listado = new ArrayList<>();
	
	public Lista() {
	}

	public Lista(List<String> listado) {
		this.listado = listado;
	}
	
	void agregar(String dato) {
		boolean existe = false;
		for (String elemento : listado) {
			if (dato.equals(elemento)) {
				existe = true;
			} 
		}
		
		if (!existe) {
			listado.add(dato);
		}
	}
	
	Integer buscar(String dato) {
		int posicion = 0;
		for (String elemento : listado) {
			if (dato.equals(elemento)) {
				continue;
			} 
			posicion++;
		}
		return posicion;
	}
	
	void listar() {
		for (String valor : listado) {
			System.out.println(valor);
		}
		System.out.println();
	}
	
}

public class ClaseLista {

	public static void main(String[] args) {
		Lista l = new Lista();
		l.agregar("Andres");
		l.listar();
		l.agregar("Andres");
		l.listar();
		l.agregar("Carpeta");
		l.agregar("Parroquia");
		l.agregar("Jocote");
		l.listar();
		l.listado.remove("Andres");
		l.listar();
		Integer busqueda = l.buscar("Jocote");
		System.out.println("La posicion de " + l.listado.get(busqueda) + " es: " + busqueda);
	}

}
