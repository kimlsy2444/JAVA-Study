package sec01.example03;

public class LamdaEx {

	public static void main(String[] args) {
		 
		 Myinterface myinterface = null;
		 
		 myinterface = (x,y) ->{
			 int result = x+y;
			 return result;
		 };

		int result = myinterface.method(100,200);
		System.out.println("매개변수 2개와 리턴값이 있는 람다식 값 : "+result);

		myinterface = (x,y) ->  {return x+y;};
		
		result = myinterface.method(200,200);
		System.out.println("매개변수 2개와 리턴값이 있는 람다식 값 : "+result);
	
		// return 이 하나라면 생략 가능하다
		myinterface = (x,y) -> x+y;
		
		result = myinterface.method(1000,200);
		System.out.println("매개변수 2개와 리턴값이 있는 람다식 값 : "+result);
	
		// 메서드 호출시 매개값으로  x,y 넘어간다.
		myinterface = (x,y) -> add(x,y);
		
		result = myinterface.method(700,200);
		System.out.println("add메서드 호출후 람다식 값 : "+result);

	}
  

	public static int add(int x,int y) {
	return x+y;
	}
	
}
