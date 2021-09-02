package example04;

// 사용자 정의 예외 클래스
public class BalanceException extends Exception {

	public BalanceException() {
	
	}
	
	public BalanceException(String message) {
		super(message); // 조상클래스의 생성자 호출
	}
}
