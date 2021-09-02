package sec02.example02;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerEx {

	public static void main(String[] args) {
		
		// String 타입을 매개변수로 가지는 Consumer제네릭 함수적 인터페이스를 구현했다.
		// t는 무조건 String 타입이고 매개변수가 된다.
		// Consumer인터페이스류는 리턴값이 존재 하지 않는 것을 상기 하도록 하자 
		//t)->{System.out.println("ConsumerInterfacce : "+ t);};
		// ==> accept() 를 람다식으로 구현했다
		Consumer<String> consumer =  (t)->{
			
			System.out.println("ConsumerInterfacce : "+ t);
		};

		
		consumer.accept("소비자 인터페이스 자바 1.8추가");
		
		// bi()Consumer는 2개의 객체를 받아서  소비하는 인터페이스 이다.
		BiConsumer<String, String> biConsumer = (t,u)->{
			System.out.println("BiConsumerInterfacce : "+ t+","+u);
		};
		
		biConsumer.accept("자바", "C++");
		
		DoubleConsumer doubleConsumer = (d) ->{
			System.out.println("DoubleConsumer : "+ d);
		};
		
		doubleConsumer.accept(1.80);
		
		IntConsumer intConsumer = (i)->{
			System.out.println("IntConsumer : "+ i);
		};
		intConsumer.accept(10);
		
		
		// ObjIntConsumer<T> 함수적 인터페이스는 매개값으로 T와 int값(고정)을 가진다.
		ObjIntConsumer<String> objIntConsumer = (t,i)-> {
			System.out.println("ObjIntConsumer : "+ t+","+i);
		};
		objIntConsumer.accept("자바", 8);
		
	}

}
