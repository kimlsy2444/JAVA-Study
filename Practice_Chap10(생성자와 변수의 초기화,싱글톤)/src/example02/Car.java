package example02;

public class Car {
	
	
	String color;
	String gearType;
	int door;
	
	
	public Car(){
		this("노랑","수동",4);
	}
	 
	public Car(String color) {
		this.color=color;
	}
	
	public Car(int door) {
		this.door=door;
	}
	
	public Car(String color,String gearType) {
		this.color= color;
		this.gearType= gearType;
	}
	
	public Car(String color,int door) {
		this.color= color;
		this.door = door;
	}

	public Car(String color,String gerType,int door) {
	//	color= color; // 변수의 모호성일 일어나서 초기화가 안이루어짐
		
	// this : 참조변수와 같은 역할, 매개변수와 멤버변수를 구분짓는데 사용
	// 반드시  this 와 써서 명확하게 프로그램이 되도록한다.
		
		
		this.color= color;
		this.gearType= gerType;
		this.door= door;
	}
	
	public Car(Car c) {
		
		this.color = c.color ;
	   	this.gearType= c.gearType;
		this.door= c.door;
		
	}
	
	@Override
	public String toString() {
		
		return this.color +" "+this.gearType+" "+this.door;
	}
	

}
