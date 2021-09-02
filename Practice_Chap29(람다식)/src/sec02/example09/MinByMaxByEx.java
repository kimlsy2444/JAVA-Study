package sec02.example09;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class MinByMaxByEx {
	
	public static void main(String[] arts) {
		
		BinaryOperator<Fruit> binaryOperator = null;
		
		Fruit fruit = null;

		
		// BinaryOperator.minBy() 정적 메서드는 두개의 객체를 가지고
		// 작은 쪽으로 객체를 리턴한다.
		// 그 기준이 되는 필드의 사용은 프로그래머의 몫이다.
		// 아울러, minBy는 Comparator<T>의 인터페이스 타입을 매개변수로 가지고 있어
		// 추상메서드인 in compare(T o1 ,T o2); 재정의 하는 람다식이 올수가 있다.
		
		binaryOperator = BinaryOperator.minBy((f1,f2) ->{
//			
//			if(f1.getPrice() < f2.getPrice()) {
//				return -1;
//			}
//			else if(f1.getPrice() == f2.getPrice()) {
//				return 0;
//			}
//			else
//				return 1;
		return	Integer.compare(f1.getPrice(),f2.getPrice());
		});
		
		fruit = binaryOperator.apply(new Fruit("황도",5000),new Fruit("복숭아",4000));	
		System.out.println(fruit.getName()); // 작은값 minBy 리턴
	
		binaryOperator = BinaryOperator.maxBy((f1,f2) ->{

		return	Integer.compare(f1.getPrice(),f2.getPrice());
		});
	

		fruit = binaryOperator.apply(new Fruit("황도",5000),new Fruit("복숭아",4000));	
		System.out.println(fruit.getName());  //큰값 maxBy 리턴
	}
	
	
}
