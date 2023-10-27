package java9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

interface Foo<T>{
	
}

public class OperadorDiamante {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		lista.add("algo");
		System.out.println(lista);
		
		Map<String,Map<String,List<String>>> collection = new HashMap<>();
		
		//Foo<Integer> foo = new Foo<>() {};
	}

}
