package example05;

public class Bus implements Vehicalble{
	
	private int speed;
	@Override
	public void run() {
		System.out.println("버스 가 " + this.speed+"Km 달립니다");
	
	}
	@Override
	public void stop() {
		System.out.println("버스가  멈춤니다.");
	
		
	}
	@Override
	public void setSpeed(int speed) {
		
		if(speed< 0 ) {
			System.out.println("잘못 된 숫자입력");
			return;
		}
		this.speed = speed;
	}
	

}
