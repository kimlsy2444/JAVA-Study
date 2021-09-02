package example03;

public class ThrowsEx {
	
	
	// JVM 에게 예외를 던진다.
	public static void main(String[] args)  {
	
		// main() 에서 method1() 호출하고 있으니 여기서 예외처리를 해야한다.
		
		try {
			method1();
		} catch (Exception e) {
			System.out.println("0 으로 나눌수 없습니다.");
		}
		
		
	}
	// Throws 메서드 선언부 끝에 작성을 하며 ,
	// 호출한 곳으로 예외를 던지며
	// 호출한 곳에서 예외를반드시 처리해야 한다.
	public static void method1() throws Exception{
		method2();
		
	}
	
	public static void method2() throws Exception{
		System.out.println(10/0); // 산술예외
	}
}
// mina 에 throws Exception 하면
// JVM이 해당코드을 보여준다.
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//at example03.ThrowsEx.method2(ThrowsEx.java:27)
//at example03.ThrowsEx.method1(ThrowsEx.java:22)
//at example03.ThrowsEx.main(ThrowsEx.java:9)