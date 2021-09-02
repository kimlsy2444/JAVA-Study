package example02;

public class ShapeEx {

	public static void main(String[] args) {
		
	
		
		Circle c1 =new Circle(); 
		
		c1.draw();
		
		System.out.println(); 
		
		Circle c2 = new Circle(new Point(150,150),100);
		
		c2.draw();
		
		System.out.println(); 
		
		Point p1= new Point();
		
		p1.x=10;
		
		Triangle t1 = new Triangle();
		t1.draw();
		
		
		System.out.println(); 
		
		Point[] p = new Point[] {p1,new Point(80,100),
								new Point(20,120)};
		
		Triangle t2 =new Triangle(p);
		
		t2.draw();
		
		System.out.println(); 
		
	
		Point[] p2 = new Point[3];
		
		p2[0] = new Point();
		p2[1] = new Point();
		p2[2] = new Point();
		
		p2[0].x=10;
		p2[0].y=20;
		
	
		p2[1].x=30;
		p2[1].y=30;
		
		p2[2].x=40;
		p2[2].y=40;
		
		Triangle t3 =new Triangle(p2);
		
		t3.draw();
	}

}
