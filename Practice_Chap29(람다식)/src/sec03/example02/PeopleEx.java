package sec03.example02;

import java.util.function.BiFunction;
import java.util.function.Function;

public class PeopleEx {

	public static void main(String[] args) {
		
		
		// 람다식으로 생성자를 호출하여 인스턴스를 만들고 있다.
		Function<String,People> function1 =  (x) ->{return new People(x);}; 
		People people =  function1.apply("이준성");
		System.out.println(people);
		
		// 생성자 참조
		function1 = People :: new;
		people =  function1.apply("이준성");
		System.out.println(people);
		
		System.out.println("==============================");
		
		// 람다식으로 생성자를  호출하여 인스턴스를 만들고 있다.(2개 짜리)
		
		BiFunction<String,Integer,People> function2 = 
				(x,y)-> {return new People(x,y);};
		people =  function2.apply("이준성",24);
		System.out.println(people);
		

		
		// 생성자 참조
		function2 = People :: new;
		people =  function2.apply("이준성",24);
		System.out.println(people);
		
		
		// 결론 : 생성자 참조는 멤버변수가 보통 3개 이상 되어버리면
		// 그에 적합한 함수적 인터페이스도 고안이 되어주어야 생성자 참조도 확장이 될 것이다.
		
		
		
		
	}

}
