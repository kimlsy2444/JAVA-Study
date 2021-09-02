package sec02.example08;

import java.util.Objects;
import java.util.function.Predicate;

public class PredicateIsEqualsEx {

	public static void main(String[] args) {
		
		Predicate<String> predicate = null;
		
		boolean result = false;
		
		
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		// 번지비교
		System.out.println(Objects.equals(obj1, obj2));
		
		// Predicate.isEqual(null) 는 정적 메서드로써 ,두개의 객체의 번지 값을 비교한다.
		// 둘다, null 이면 true 가 나오는게 좀 의하하다.
		
		predicate = Predicate.isEqual(null);
		result = predicate.test(null);
		System.out.println("두 객체가 비교 (null) : "+result);
		
		predicate = Predicate.isEqual(null);
		result =predicate.test("신은혁");
		System.out.println("두 객체가 비교 (신은혁 null) : "+result);
		
		
		// 아래의 코드 두개의 객체는 값비교가 이루어진다.
		// Objects.equals("신은혁", "신은혁")
		
		predicate = Predicate.isEqual("신은혁");
		result =predicate.test("신은혁");
		System.out.println("두 객체가 비교 (신은혁 신은혁) : "+result);
		
		// 위의 코드들은 대용얄 데이터를 나중에 매핑하고 정렬하고 null값은 걸러내고
		// 함수적 인터페이스를 선언하고 사용하면 편리한점과 코드의 간결성이 좋아진다.
		
		
		
	}

}
