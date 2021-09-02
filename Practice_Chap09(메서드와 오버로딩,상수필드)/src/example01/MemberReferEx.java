package example01;

public class MemberReferEx {

	int iv; // 인스턴스  멤버 변수
	static int cv; // 정적 멤버 변수
	
	// 인스턴스 메서드
	// 이유: 인스턴스 메서드가 호출될 떄는 이미 인스턴스가 생성 되어 있을 것임.
	public void instanceMethod() {
		
		System.out.println(this.iv); 		  // 인스턴스 변수 사용 가능
		System.out.println(MemberReferEx.cv); // 정적 멤버변수 사용가능
		staticMethod();
	}
	public static void staticMethod() {
		//System.out.println(this.iv); 		  // 인스턴스 변수 사용불가
		System.out.println(cv); 			  // 정적 멤버변수 사용가능
		//this.instanceMethod(); 				  // 인스턴스 멤버 매서드 사용 불가
		
	}
}
