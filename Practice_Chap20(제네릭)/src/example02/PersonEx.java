package example02;

public class PersonEx {

	public static void main(String[] args) {
		
		Person<String> person1 = new  Person<String>();
		// Person 제네릭클래스에 T를 String 만 들어오게끔 무조건 만들었다.
		
		person1.setT("홍길동"); 
		// person.setT(100); // 에러 발생 :
		
		String  str = person1.getT(); 
	
		System.out.println(str);
		
		
		// 현업에서 데이터의 통일화, 타입변환 제거 ,컴파일시 예외를 발생
		Person<Integer> person2 = new  Person<Integer>();
		
		person2.setT(100); // 자동 박싱 // Integer 자동 박싱 발생
		
		
		int value = person2.getT(); // 자동 언박싱 코드
	
		System.out.println(value);
		
		
		
		Person<Apple> person3 = new  Person<Apple>();
		
		person3.setT(new Apple()); // 자동 박싱 // Integer 자동 박싱 발생
		
		
		Apple apple = person3.getT(); // 자동 언박싱 코드
	
		System.out.println(apple);
	
		
	
	}

}
