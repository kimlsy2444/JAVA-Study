package sec02.example08;

import java.util.function.IntPredicate;

public class PredicateAndOrNegateEx {

	public static void main(String[] args) {
		
		IntPredicate predicateA = x -> 
			{return (x%2) == 0; }; //2 의 배수 구해서 확인 람다식
		IntPredicate predicateB = x -> 
			{return (x%3) == 0; }; //3 의 배수 구해서 확인 람다식
	
			System.out.println("15 는 2의 배수 ? >>"+predicateA.test(15));
			System.out.println("15 는 3의 배수 ? >>"+predicateB.test(15));
			
			// and() 는 둘다 참일시 참을 리턴
			IntPredicate predicateAB = predicateA.and(predicateB);
			System.out.println("6 는 2와3의 공배수 ? >>"+predicateAB.test(6));
	
			// or() 는 하나라도 참이면 참을 리턴
			predicateAB = predicateA.and(predicateB);
			System.out.println("7 는 2나3의 배수 ? >>"+predicateAB.test(7));
			System.out.println("8 는 2나3의 배수 ? >>"+predicateAB.test(8));
			
			// negate() 는 true 이면 false를 리턴 , false면 true 를 리턴
			
			predicateAB = predicateA.negate();
			 
			System.out.println("8 는 짝수 ? >>"+predicateAB.test(8));
					
	}

}
