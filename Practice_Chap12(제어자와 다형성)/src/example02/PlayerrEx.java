package example02;

public class PlayerrEx {

	public static void main(String[] args) {
		
		// 자신의 인스턴스를 만드는 클래스 다형성 미적용 코드
		Player player1 = new Player("이동국", 40, 20, 60);
		player1.info();
		
		System.out.println(); 
		
		// 다형성이 적용된 코드 (필드의 다형성)
		// 하지만 근본은 벗어나지 못한다 , Striker 클래스에 있는 getShoot() 매서드는
		// player2참조변수 접근이 안된다.
		Player player2 = new Striker("손흥민", 25, 10, 90,50);
		// 메서드에서 상속 관계에 있다면, 자손클래스 오버라딩을 하게 되면
		// 현재 참조하고있는 인스턴스의 메서드를 호출한다.
		player2.info();
		
		System.out.println();
		
		Player player3 = new MidFielder("이강인", 18, 18, 80,120);
		
		player3.info();
		
		System.out.println();
		
		Player player4 = new Defender("김영권", 28, 20, 60,60);
		
		player4.info();
	}

}
