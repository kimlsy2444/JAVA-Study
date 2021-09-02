package example03;

public class Person {

	 // 불변의 정적상수
	 // 무조건 선언과 동시에 초기화가 이루어 져야한다
	 // 공용 데이터로 사용되어짐
	static final int MAX_NUMBER = 1000;
	
	
	
	// final 초기화방법
	// 1. 선언과 동시에 초기화
	// 2. 생성자에서 단한번 초기화가  가능함 
	final String nation ="KOREA";
	
	final int age;
	
	public Person(int age) {
		this.age =age;
	}
	
	@Override
	public String toString() {
	
		return "nation : "+ this.nation+", age :"+this.age;
	}
}
