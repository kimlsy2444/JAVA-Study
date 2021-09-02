package example08;

public class SoundEx {

	public static void main(String[] args) {
		
		// 익명 구현객체(이름 X) --UI 이벤트 처리나 스레드 객체 간편생성
		
		Soundable soundable = new Soundable() { // 타입(근본)이 인터페이스 
			// 내부적으로 클래스니깐 멤버들을 선언할 수 있다.
			// 하지만 외부에서 접근 불가 
			// 필요시 일시적으로 사용한다
			int a = 10;
			public void method(){
				System.out.println("익명구현객체 메서드");
			}
			
			@Override
			public void sound() {
				String str = "냄비";
				System.out.println("첫 번째 익명 구현객체 : " + str);
				System.out.println(str +" 에 물을 담습니다."); 
				System.out.println(str +" 소리를 냅니다."); 
				this.method();
				System.out.println(this.a);
				
			}
		};
		soundable.sound();
		
	
	
	
	
	}

}
