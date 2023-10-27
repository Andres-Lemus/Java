package lambdas.custom;

public class PruebaCalculable {

	public static void main(String[] args) {
		Calculable cal = new Calculable() {

			@Override
			public double avg(double... numbers) {
				double sum = 0.0;
				for (int i = 0; i < numbers.length; i++) {
					sum+=numbers[i];
				}
				return sum / numbers.length;
			}
			
		};
		
		Calculable calc =(numbers)->{
			double sum = 0.0;
			for (int i = 0; i < numbers.length; i++) {
				sum+=numbers[i];
			}
			return sum / numbers.length;
		};
		System.out.println(cal.avg(10,20,30));
		System.out.println(calc.avg(10,20,30));

	}

}
