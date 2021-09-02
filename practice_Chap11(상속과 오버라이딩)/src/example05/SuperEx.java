package example05;

public class SuperEx {

	public static void main(String[] args) {
	
		// 자손클래스의 인스턴스를 생성하면, 조상클래스의 인스턴스 생성이 제일
		// 먼저 이루어지고, 자손클래스의 인스턴스가 생성되어 합쳐진 상태로 
		// 힙에 할당된다.
		
		Child child = new Child();
		
//		Parent parent = new Parent(1000);
//		
//		parent.show();
		
		child.show();
		
		
	}

}
