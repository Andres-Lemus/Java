package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaximosYMinimos {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(5,6,89,90, 88, 56, 100);
		
		int minimo = numbers.get(0);
		for (Integer number : numbers) {
			if (number<minimo) {
				minimo = number;
			}
		}
		System.out.println("El valor minimo es: " + minimo);
		
		Integer min = Arrays.asList(5,6,89,90, 88, 56, 100).stream().min(Comparator.naturalOrder()).get();
		Integer max = Arrays.asList(5,6,89,90, 88, 56, 100).stream().max(Comparator.naturalOrder()).get();
		System.out.println("El valor minimo es: " + min);
		System.out.println("El valor maximo es: " + max);
	}
	
}
