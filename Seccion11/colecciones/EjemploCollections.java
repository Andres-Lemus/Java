package colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EjemploCollections {

	public static void main(String[] args) {
		List<String> nombres = new ArrayList<>();
		nombres.add("Bolt");
		nombres.add("Rocky");
		nombres.add("Andres");
		Collections.sort(nombres);
		int index = Collections.binarySearch(nombres, "Rocky");
		
		System.out.println(nombres);
		System.out.println(nombres.get(index));
	}

}
