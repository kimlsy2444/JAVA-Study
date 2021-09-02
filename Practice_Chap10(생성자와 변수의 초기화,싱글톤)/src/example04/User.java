package example04;

public class User {
	
	// 해당 클래스 자신의 타입으로 정적 멤버 선언과 동시에 생성을 하고 있따
	private static User singleton = new User();
	
	// 해당 클래스를 외부에서 new 연산자로 인스턴스 생성 못하게 막음
	private User() {}
	
	public static void add() {
		System.out.println("add 메서드 호출");
	}
	// 해당클래스의 멤버를 자기자신의 주소를 넘겨주기(공유) 위해서 외부에서 호출 할수 있는
	// getter 메서드를 제공해주고 있따.
	public static User getInstance() {
		return User.singleton;
	}
	
	
	
}
