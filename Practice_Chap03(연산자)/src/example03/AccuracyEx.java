package example03;

public class AccuracyEx {

	public static void main(String[] args) {
		//cpu 의 연산의 오차를 설명한다
		
		int apple = 1;
		double unit = 0.1;
		int number = 7 ;
		
		double result = apple -(number*unit);
		double result2= (number * unit);
		System.out.println(result2);
		System.out.println(result);

	}

}
