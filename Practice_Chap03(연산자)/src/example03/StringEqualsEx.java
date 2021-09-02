package example03;

public class StringEqualsEx {

	public static void main(String[] args) {
		// 참조형 타입의 == != 의 이해
		
		// == 같다 != 다르다
		 
		// 리터럴인 경우 같은 값이 있는, 먼저 메모리공간(heap)에 있는지 
		// 확인을 하고 있다면 같은 주소를 공유르 하게 된다.
		// 없다면 새로운 곳에 인스턴스를 생성해준다.
		
		
		String str1  = "아이티고";
		String str2  = "아이티고";
		//new 연산자면 무조건 새로운 인스턴스가 생성됨.
		
		String str3  = new String( "아이티고");
		
		
		// 참조형 타입에서 서로 == 은 주소 비교 하고있음
		// 같은 리터럴의 경우 같은 번지 공유
		// new는 리터럴 여부와 상관없이 새로운 인스턴스를 생성한다.
		
		boolean result = (str1 == str2);
		System.out.println(result); 
		
		result = (str1 == str3 );
		System.out.println(result); 
		
		//  String 클래서의  equals()는 주소와 상관없이 값이 같다면 무조건 true 리턴한다.
		// equals 값비교   == 주소비교 
		
		result = str1.equals(str2);
		System.out.println(result);
		
		result = str1.equals(str3);
		System.out.println(result); 
	}

}
