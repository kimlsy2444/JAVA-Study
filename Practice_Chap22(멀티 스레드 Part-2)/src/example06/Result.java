package example06;

// 공유객체
public class Result {
	private int accumValue;
	// 공유객체 이기 때문에 , 데이터의 신뢰성을 위해서  여려스레드 접근할 수 있으므로
	// 반드시 동기화가 필수적이다.
	
	public synchronized void addValue(int value) {
		this.accumValue += value;
		
	}
	public synchronized int getValue() {
		return this.accumValue;
	}
	
}
