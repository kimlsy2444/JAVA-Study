package example04;

public class Outside {

	//필드선언
	String str = "Outstide-field";
	
	// 멤버 메서드
	public void method() {
		System.out.println("Outstide-method()호출");
	}
	class Inner{
		
		// 필드 선언
		String str = "Inner-field";
		// 멤버 메서드
		public void method() {
			System.out.println("Inner-method()호출");
		}
		// 여기에서의 this는 Inner클래스의 this 이다.
		public void showInfo() {
			//외부 클래스의 접근방법
			// 외부클래스명.this.외부클래스 멤버 이름 
			// 외부클래스명. 멤버이름은 정적 멤버 호출방법이다.
			
			System.out.println(this.str);
			this.method();
			
			// 외부 클래스의 접근하는 방법
			
			System.out.println(Outside.this.str);
			Outside.this.method();
		}
	}
	
	public void show() {
		
		System.out.println("=========================");
		// 외부클래스 영역의 this 는 당연히 Outside클래스를 말한다.
		
		System.out.println(this.str);
		this.method();
		// 외부 클래스에서 내부클래스로 접근할려면 보이지 않는다
		// 아래와 같이 인스턴스를 하나 생성해서 중첩클래스의  멤버들에게 접근을 하면된다.
		Inner in = new Inner();
		in.showInfo();
		
	}
}

