package example02;
//  추상 클래스
public abstract class Phone {

	private String company;
	private String owner;
	private int Serial_No;
	
	public Phone(int serial_No, String owner, String company) {
		super();
		Serial_No = serial_No;
		this.owner = owner;
		this.company = company;
	}
	
	
	public int getSerial_No() {
		return Serial_No;
	}
	public String getOwner() {
		return owner;
	}
	public String getCompany() {
		return company;
	}
	
	
	public abstract void turnOn();
	public abstract void turnOff();
	public void showInfo() {
		System.out.println("Serial_No : " + this.getSerial_No());
		System.out.println("company : " + this.getCompany());
		System.out.println("owner : " + this.getOwner());
		
	}
}
