package streams;

import java.util.Iterator;
import java.util.stream.IntStream;

public class PrimiteStreams {

	public static void main(String[] args) {
		IntStream.range(0, 10).forEach(i->System.out.println(i));
	}

}
