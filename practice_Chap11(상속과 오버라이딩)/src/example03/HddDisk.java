package example03;
// 조상 메서드 
public class HddDisk {

	// 멤버변수
	
	int capacity; // 용량
	int rpm;   	  // 속도
	
	public HddDisk() {
		
	}
	// 매개 변수가 있는 생성자
	public HddDisk(int capacity, int rpm) {
		
		this.capacity = capacity;
		this.rpm = rpm;
	}
	
	// HddDist 의 사용자 정의 메서드
	public String Status() {
		
		String str = "하드 디스크 용량 : "+ this.capacity + "\n"+
					 "하드 디스크 속도 : "+ this.rpm+"(rpm)";
		
		return str;
		
	}
	
	
}
