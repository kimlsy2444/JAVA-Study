package example02;

// 자손 클래스
public class MidFielder extends Player {

	private int pass;

	public MidFielder(String name, int age, int backNumber, int speed, int pass) {
		super(name, age, backNumber, speed); // player 생성자
		this.pass = pass;
	}
	
	public int getPass() {
		return this.pass;
	}
	
	@Override
	public void info() {
	
		super.info(); // player 의 info를 호출
		System.out.println("유효 패스 : " + this.getPass()); 
	}
}
