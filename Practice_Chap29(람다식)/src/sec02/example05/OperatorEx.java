package sec02.example05;

import java.util.function.IntBinaryOperator;

public class OperatorEx {
	
	public static int[] scores = {15,55,10,100,92,35,87};
	
	public static void main(String[] args) {
		
		IntBinaryOperator operatorMax = (a,b)->{return Math.max(a, b);};

		int max = maxOrmin(operatorMax);
		System.out.println("최대값 : "+max);
		
		IntBinaryOperator operatorMin = (a,b)->{return Math.min(a, b);};

		int min = maxOrmin(operatorMin);
		System.out.println("최소값 : "+min);
		
		
	}
	
	
	public static int maxOrmin(IntBinaryOperator operator) {
		
		int result = scores[0];
		
		for(int score : scores) {
			// 2개의 값을 연산하여 하나의 값을 리턴하는 applyAsInt(int,int)추상메서드를
			// 호출하는데 main()에서 구현된 부분이 적용되어
			// a는 result,b는 score 이다.
			result = operator.applyAsInt(result, score);
		}
		
		return result;
		
	}
}
