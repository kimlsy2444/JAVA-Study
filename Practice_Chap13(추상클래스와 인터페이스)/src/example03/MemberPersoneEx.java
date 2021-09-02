package example03;

public class MemberPersoneEx {

	public static void main(String[] args) {
		
		Member member = new Member();
		
		member.method();
		member.method1();
		System.out.println();
		System.out.println(A.max); // XX
		System.out.println(A.max); 	 	// 상수접근시 인터페이스명. 상수명 O
		//인터페시으도 일종의 조상이다. 하여 다형성 개념이 적용된다.
		A a = new Member(); // 인터페이스 필드의 다형성
		a.method();
		System.out.println();
		// a.method1() // 근본을 벗어나지 못하므로 Member클래스의 멤버메서드는 호출 불가
		
		Person person = new Person();
		person.method();
		person.method1();
		
		System.out.println();
		a = new Person();
		a.method();
		
	}

}
