package example02;

public class TryCathfinallyEx {

	public static void main(String[] args) {
		
		
		// Class클래스는 문자열을 가지고 클래스로 만들어서 반환을 해준다.(동적 객체 )
		// 인스턴스에 정보만 알뿐이지 멤버를 사용하는 것은 안된다.
		
		try {
			Class class1 = Class.forName("java.lang.String");
			// Class class2 = Class.forName("java.lang.String2"); 예외발생
			System.out.println("클래스를 찾았습니다.");
			System.out.println(class1.getName()); // 패키지 + 클래스명 출력
			System.out.println(class1.getSimpleName());//클래스명 출력
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 없습니다.");
		} finally { // 옵션 (항상 실행)
			System.out.println("프로그램을 안전하게 종료합니다.");
		}

	}

}
