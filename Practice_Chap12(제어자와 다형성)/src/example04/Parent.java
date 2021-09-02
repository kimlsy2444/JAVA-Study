package example04;

public class Parent {
	
	int x = 100;
	
	// 매개변수의 타입이 Object라는 것은 어떠한 클래스도 다 받아주겠다는 것.
	
	
	public void type(Object obj) {
		
		if(obj instanceof Parent) {
			Parent parent = (Parent)obj;
			System.out.println("조상클래스 멤버 x : " + this.x);
		}
		else {
			System.out.println("상속 관계가 잇는 클래스가 아닙니다.");
		}
	}

	public void method() {
		
		System.out.println("조상 메서드 호출"); 
	}
}
