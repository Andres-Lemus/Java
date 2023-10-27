package dev.aeld.math.calculation;

import dev.aeld.math.operations.CalculatorProcessor;

public class Calculator {
	private CalculatorProcessor calculatorProcessor = new CalculatorProcessor();
	
	public int sum(int x, int y) {
		System.out.printf("Sumando %d más %d \n",x,y);
		return calculatorProcessor.sum(x, y);
	}
}
