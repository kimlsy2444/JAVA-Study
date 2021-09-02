package example02;

public class SmartPhone extends Phone {

	public SmartPhone(int serial_No, String owner, String company){
		super(serial_No, owner, company);
	}

	@Override
	public void turnOn() {
		System.out.println("SmartPhone ON");
		
	}
	
	@Override
	public void turnOff() {
		System.out.println("SmartPhone OFF");
	}
	
	public void interntSearch() {
		
		System.out.println("NAVER START");
	}
}
