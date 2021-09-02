package ex;

import example01.Phone;

public class B extends Phone {
	public B() {
		super();
		// TODO Auto-generated constructor stub
	}
	public B (String model, String color, String company) {
		super("ss","black","SAMSUNG");
	}
	// 이게 안되는 이유가
	// 다른 패키지내에 상속 안받고 사용해서임 ㅇㅇ
	Phone phone  = new Phone ("aa","black","SAMSONG"); 
	public void method() {
	System.out.println(this.model); 
	//System.out.println(phone.model); 
			
		}
	
}
