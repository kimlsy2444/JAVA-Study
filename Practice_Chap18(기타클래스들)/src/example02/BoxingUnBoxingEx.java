package example02;

public class BoxingUnBoxingEx {

	public static void main(String[] args) {
		// 컬렉션 프레임 워크에 사용하기위해 박싱 언박싱코드를 사용한다
		// 객체만 들어가기 때문에
		
		// 박싱 코드(Boxing)--> 객체화 시킴
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("100");
		Integer obj3 = Integer.valueOf(100);
		
		// 지동 박싱
		// 컴파일 시 new Integer(100) 로 바뀐다.
		Integer obj4 = 100;
		
		System.out.println("박싱후");
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println(obj4);
		
		System.out.println();
		
		// 언박싱 코드(UnBoxing)--> 기본값으로 바꾼다.
		int value1 = obj1.intValue();
		int value2 = obj2;
		int value3 = obj3;
		int value4 = obj4;
		
		System.out.println("언박싱후");
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		
	}

}
