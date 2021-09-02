package example02;

public class CalculatorEx {

	public static void main(String[] args) {
	
		Calculator cal = new Calculator();
		
		System.out.println(Calculator.divide(10, 1.5));
		System.out.println(cal.add(100,200));
		
		System.out.println(Calculator.multiply(20, 30));
		
		Integer.parseInt("100");
	}

}
