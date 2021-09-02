package example02;

public class Member {

	int iv = 100; // 인스턴스 멤버 변수
	static int cv = 200; // satic 멤벼 변수
	
	// 인스턴스 메서드
	public void  imethod() {
		
		System.out.println("iv : "+ this.iv);
		//System.out.println("cv : "+Member.cv);
	}
	// staic 메서드
	public static void smethod() {
		// 언제 인스턴스가 만들어질지는 아무도 모르기 떄문이다.
		
		//cv 는 static 변수이기 떄문에 인스턴스 생성없이도 접근 가능해야함
		// static 메서드 내에서는 얼마든지 접근 가능하다
		//System.out.println("iv : ");
		 System.out.println("cv : "+ Member.cv);
	}
	
	
	
	
	
	
}
