package sec01.example02;

public class LamdaEx {

	public static void main(String[] args) {
		 
		 Myinterface myinterface = null;
		 
		 myinterface = (x) ->{
			 int result = x *10;
			 System.out.println("매개변수 x값을 가지고 람다식을 구현한 메서드의 값 : "+result);
		 };
		 // 여기서 500은 매개변수이다. 하여 람다식의 매개변수인 x에 대입이 되어진다.
		 // 
		myinterface.method(500);
		
		// 매개변수가 ()를 생략이 가능하다.
		myinterface = x ->
			
		System.out.println("매개변수 x값을 가지고 람다식을 구현한 메서드의 값 : "+ ( x*10));
		myinterface.method(500);

		
	}
	
}
