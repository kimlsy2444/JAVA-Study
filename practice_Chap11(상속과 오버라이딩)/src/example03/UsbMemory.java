package example03;

public class UsbMemory  extends HddDisk {

	int capacity;
	int rpm;
	
	public UsbMemory() {
		
	}

	public UsbMemory(int capacity, int rpm) {
		this.capacity = capacity;
		this.rpm = rpm;
	}
	// 오버로딩
	public String Status(int i) {
		
		String str = "USB 디스크 용량 : "+ i + "\n"+
					 "USB 속도 : "+ this.rpm+"(rpm)";
	
	return str;
	}
	
	
	
	// 조상클래스의 메서드를 오버라이딩 함
	@Override
	public String Status() {
	
		String str = "USB 디스크 용량 : "+ this.capacity + "\n"+
					 "USB 속도 : "+ this.rpm+"(rpm)";
	
	return str;
	}
	
	
}
