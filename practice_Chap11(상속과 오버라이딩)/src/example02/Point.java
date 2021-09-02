package example02;

public class Point {

	int x=0;
	int y=0;
	
	// 기본생성자
	public Point() {
		this(0,0); //또 다른 생성자 호출
	}
	// 매게변수가 있는 생성자
	public Point(int x,int y) {
		System.out.println("Point 클래스의 매게변수가 있는 생성자 호출"); 
		this.x = x;
		this.y=y;
	
	}
}
