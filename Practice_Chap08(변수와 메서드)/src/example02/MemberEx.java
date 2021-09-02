package example02;

public class MemberEx {

	 public static void study() {
		 System.out.println("Java");
	 }
	public static void main(String[] args) {
		
		
		// 아래는 static 멤버들이므로 인스턴스 애성없이 , 얼마든지 클래스명 .정적멤버 명으로
		// 접근이 가능하다라는 것을 보여주고 있다.
		// static은 staic만 호출이 가능하다
		Member.smethod();
		Member.cv = 500;
		Member.smethod();
		
		
				
		
		study();
		
		// 인스턴스 멤버들을 사용하기 위해서는 반드시 new 라는 연산자가 힙에다가
		// 인스턴스를 만들어야 사용이 가능하다.
		
		Member m = new Member();
		m.imethod();
		m.iv = 999;
		m.imethod();
		
		
		
	}

}
