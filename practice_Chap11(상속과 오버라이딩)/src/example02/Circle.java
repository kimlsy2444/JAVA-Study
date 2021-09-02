package example02;

public class Circle extends Shape {

	
	Point center;
	int radius;
	
	public Circle() {
		this(new Point(0,0),100);
	}
	
	
	public void draw() {
		System.out.println("색깔: " +this.Color);  
		System.out.print("원점 : "+ this.center.x+" "+this.center.y);
		System.out.println(" 반지름 :"+this.radius);
		
		
	}
	
	
	public Circle(Point center,int radius) {
		
		System.out.println("Circle클래스의 매개변수가 있는 생성자 호출"); 
		this.center = center;
		this.radius = radius;
		
	}
		
	

	

}

