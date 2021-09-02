package example02;

public class Calculator {

	// 인스턴스 메서드
	// 인스턴스 메서드 특징 : new 연산자로 인스턴스를 생성해야지만
	// 참조변수명.인스턴스메스드명으로 접근
	public int add(int x ,int y) 
	{
		System.out.println(Calculator.divide(10.5,11));
		return x+y;
	}
	
	public int substract(int x, int y) {return x-y;}
	
	//static(정적 메서드)
	// static 특성 : 인스턴스 생성없이 클래스명.정적 메스드 명으로 바로접근
	public static long multiply(long x,long y)
	{	// static 메서는 이미 메모리 상단에 올라가있고 인스턴스 생성없이 접근이 가능해야하되는데,
		// 아래코드는 인스턴스가 생성되어야지만 상용가능한 add()가 왔기 때문에 예외가 발생하는 것이다.
		// 인스턴스가 언제 생성될지 아무도 모르기 때문에 static 메서드 안에는 인스턴스 메서드가 절때로 오면 안된다.
		
		// this.add(); 
		return x*y;
	}
	
	public static double divide(double x, double y)
	{
		return x/y;
	}
	
	
}
