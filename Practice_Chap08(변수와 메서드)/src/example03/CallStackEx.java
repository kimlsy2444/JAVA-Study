package example03;

public class CallStackEx {

	public static void main(String[] args) {
		// 콜스택은 후입 선출이다.(LIFO)
		// Ex.종이컵 쌓기 <-> 큐(Quere,FIFO) 파이프 수도호스
		System.out.println("main()실행됨");
		//static은 static만 호출 가능함
		
		CallStackEx.first();
		System.out.println("main()종료됨");
	}
	 
	public static void first() {
		System.out.println("first()실행됨");
		CallStackEx.second();
		System.out.println("first()종료됨");
		
	}
	
	public static void second() {
		System.out.println("second()실행됨");
		CallStackEx.third();
		System.out.println("second()종료됨");
			
	}
	public static void third() {
		System.out.println("third()실행됨");
		
		System.out.println("third()종료됨");
		
	}
}
