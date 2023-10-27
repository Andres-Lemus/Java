package dev.aeld.math.operations;

public class CalculatorProcessor {
	public int sum(int ...x) {
		int sum = 0;
		for (int i : x) {
			sum += i;
		}
		return sum;
	}
}
