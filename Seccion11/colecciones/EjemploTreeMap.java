package colecciones;

import java.util.TreeMap;

public class EjemploTreeMap {

	public static void main(String[] args) {
		TreeMap<String, String> map = new TreeMap<>();
		map.put("Zi zu", "Futbolista");
		map.put("Alex", "Programador leon");
		map.put("Juan", "Persona Feliz");
		
		System.out.println(map);
	}

}
