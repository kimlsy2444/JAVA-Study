package example02;

// 자손 클래스
public class Defender extends Player {

	private int def;

	public Defender(String name, int age, int backNumber, int speed, int def) {
		super(name, age, backNumber, speed); // player 생성자
		this.def = def;
	}
	
	public int getDef() {
		return this.def;
	}
	
	@Override
	public void info() {
	
		super.info(); // player 의 info를 호출
		System.out.println("패스 차단 : " + this.getDef()); 
	}
}
