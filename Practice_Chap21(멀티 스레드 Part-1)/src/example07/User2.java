package example07;

public class User2 extends Thread {

	// 공유 객체선언
	
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator ) {
		this.calculator = calculator;
		this.setName("User-2");
	}
	@Override
	public void run() {
		this.calculator.print();
		// 공유객체 필드인 memory값에 50을 변경
		this.calculator.setMemory(50);
	}
}
