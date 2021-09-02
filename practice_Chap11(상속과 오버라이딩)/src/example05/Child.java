package example05;

public class Child extends Parent {

	int x = 20;
	
	public Child() {
		//super();	 
		// 조상클래스의 기본 생성자 호출 ,생략하더라도 컴파일러가 알아서 
		//기본생성자 추가 
		
		super(50);   // 조상클래스의 매개변수가 있는 생성자를 호출, 생략할 수 가없음
		System.out.println("자손클래스 생성자 호출 " );
	}
	@Override
	public void show() {
		
		System.out.println("현재 인스턴스 x : "+x );
		System.out.println("자손 클래스 x : "+this.x );
		System.out.println("조상 클래스 x : "+super.x );
		super.show();
	}
}
