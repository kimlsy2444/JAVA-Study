package example03;

public class ShiftOperEx {

	public static void main(String[] args) {
		
		int a = 8;
		int b = 2;
		
		// shift 연산은 그래픽 에서 쓰신다~ 
		// 비트만 옮기기때문에 고속 처리가 용이함
		System.out.println("8 << 2 : " + (a<<b));
		System.out.println("8 << 2 : " + (a>>b));

		
		
	}

}
