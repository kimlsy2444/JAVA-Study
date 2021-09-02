package example07;

public interface MyInterface {

	int MAX_NUM = 100; // static final 상수

	public void method(); //추상 메서드선언(본질)
	
	// JDK 1.8 부터 추가된 멤버
	default void dmethod() {
		System.out.println("MyInterface 의 디폴트 메서드 호출");
		
	};
	static void smethod() {
		System.out.println("MyInterface 의 정적메서드 호출");
	}
}
