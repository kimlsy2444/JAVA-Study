package example02;

public class Triangle extends Shape{
	
	Point[] p;
	
	public Triangle() {
		this(new Point(),new Point(50,50),new Point(100,100));
		
	}
	
	public Triangle(Point p1,Point p2,Point p3) {
		
		this.p = new Point[]{p1,p2,p3};
	}
	
	
	public Triangle(Point[] p) {
		System.out.println("Triangle의 매개변수 p호출됨");
		this.p=p;
		
	}
	
	public void draw() {
		System.out.println("[p1] : "+this.p[0].x +" "+this.p[0].y);
		System.out.println("[p2] : "+this.p[1].x +" "+this.p[1].y);
		System.out.println("[p3] : "+this.p[2].x +" "+this.p[2].y);
		
	}
}
