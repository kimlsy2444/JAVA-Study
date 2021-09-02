package example03;

public class A {
	
	// 인스턴스 멤버 클래스
	 class B{
		 public B() {
			 System.out.println("인스턴스멤버클래스 B 생성자");
		 }
	 
	 }
	 // 정적 멤버 클래스
	 static class C{
		 public C() {
			 System.out.println("정적멤버클래스 C 생성자");
		 }
	 }
	 // 인스턴스 멤버(필드)
	 B b = new B();
	 A.C c = new C();
	 
	 
	 // 인스턴스 멤버 메서드
	 // method1() 을 사용할 떄 쯤은, 이미 외부클래스 A의 
	 // 인스턴스가 만들어진 상태일것이다.
	 public void method1() {
		 System.out.println("method1()내");
		 B b = new B();
		A.C c = new C();
	 }
	 
	 // 정적 멤버 선언
	 
	 // static B b1 = new B(); class B는 인스턴스멤버 클래스이기때문에 static를 붙일수 없다
	 static A.C c1 = new C();
	 
	 // static은 staticaks 접근하는하다
	 public static void method2() {
		 
		 System.out.println("method2()내");
		 // B b = new B(); // 인스터스 멤버 클래스가 언제 생성될지 모르는 상태이기 떄문에 사용불가
		  A.C c = new C(); // 정적메서드 이므로 정적 로컬 변수로 선언을 해도 무방하다
	 }
	 
}
/////결론/////
// 중첩클래에서의 인스턴스 필드나 메서드는 언제든지 생성 가능하지만,
// 정적필드나 정적메서드는 정적 클래스에서만 생성이 가능하다.





