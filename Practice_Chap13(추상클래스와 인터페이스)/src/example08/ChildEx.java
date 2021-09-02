package example08;

public class ChildEx {

	public static void main(String[] args) {
		// 익명 자손객체(이름 X) --UI 이벤트 처리나 스레드 객체 간편생성
		Parent parent = new Parent(){
			int b = 20;
			public void method1() {
				System.out.println("익명자손 객체 메서드");
			}
			@Override
			public void method() {
				
			 int a =10;
			 System.out.println("a : "+ a);
			 System.out.println(this.b);
			 this.method1();
			}
			
		};
	
		parent.method();
	
	
	}
	
	
}
