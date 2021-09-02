package example03;

// A인터페이스를 구현한 클래스
public class Member implements A{
	
	@Override
	public void method() {
	System.out.println("인터페이스를 A를 구현한  Memver의 metod() 호출됨");
	}
	
	public void method1() {
		System.out.println("Member 클래스의 있는 method1()호출됨");
	}
	
	
}
