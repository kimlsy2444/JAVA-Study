package example03;

public class Person implements A {
	 
	@Override
	public void method() {
	System.out.println("인터페이스 A를 구현한 Person 클래스 입니다."); 
		
	}
	
	
	public void method1() {
		System.out.println("Person 클래스의 멤버 클래스의 metod1() 호출됨 ");
	}
	
	
}
