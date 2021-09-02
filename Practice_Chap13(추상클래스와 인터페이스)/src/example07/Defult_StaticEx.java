package example07;

public class Defult_StaticEx {

	public static void main(String[] args) {
		
		MyInterface mInterface = new Person();
		mInterface.dmethod();
		mInterface.method();

		//인터페이스의 정적메서드도 호출하는 방법이 인터페이스명.정적메서드 명 호출
		//단지 타입이 클래스타입이아닌 인터페이스 타입이다.
		MyInterface.smethod();
	}

}
