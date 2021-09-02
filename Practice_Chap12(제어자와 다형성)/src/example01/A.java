package example01;

public class A extends Phone  {
	public A() {
		super("bb","yellow","LG");
	}
	Phone phone = new Phone("bb","yellow","LG");
	
	
	public void method() {
	System.out.println(phone.model);  // 이게 되는 이유는 같은 패키지 내이기 때문에 
		
	}
	
	
	
	

	
	
	
}
