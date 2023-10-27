package lambdas.comparator;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class PruebaComparator {

	public static void main(String[] args) {
		Comparator<Persona> comparator = (Persona p1, Persona p2) -> p1.getApellido().compareTo(p2.getApellido());
		Comparator<Persona> comparatorPorEdad = new Comparator<Persona>() {

			@Override
			public int compare(Persona o1, Persona o2) {
				return o1.getEdad().compareTo(o2.getEdad());
			}
			
		};
		Set<Persona> personas = new TreeSet<>(comparatorPorEdad);

		personas.add(new Persona("Andres", "Lemus", 22));
		personas.add(new Persona("Juan", "Lopez", 21));
		personas.add(new Persona("Zizu", "Mendez", 24));
		personas.add(new Persona("Arturo", "Sanchez", 28));
		
		System.out.println(personas);
	}

}
