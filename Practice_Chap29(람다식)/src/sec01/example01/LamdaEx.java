package sec01.example01;

public class LamdaEx {

	public static void main(String[] args) {
		 
		// 람다식을 이용해서 익명구현객체를 생성하고 있는 것이다.
		// 매개변수가 없을때, ()는 생략 불가인걸 알고 있다.
		// {} 는 추상메서드인 method()의 구현부가 들어가야 하며,
		// 여기서 2줄이기 때문에 {}를 생략할수가 없다.
		
		Myinterface myinterface = () -> {
			String str = "람다식으로 만든 익명 구현 객체 입니다.";
			System.out.println(str);
		};
		myinterface.method();
		
		Myinterface myinterface2 = new Myinterface() {
			
			@Override
			public void method() {
				
				String str = "직접 익명 구현 객체 입니다.";
				System.out.println(str);
				
			}
		};
		myinterface2.method();
		
		
		myinterface = () ->{System.out.println("람다식으로 만듬1");};
		myinterface.method();
		
		System.out.println();
		
		// 실행문이 하나일 경우 {}는 생략 가능하다.
		myinterface = () ->System.out.println("람다식으로 만듬2");
		myinterface.method();
		
		System.out.println();
		
		// 결론 : 익명구현 객체를 생성시에 코드의 절감으로 람다식을 사용할 수가 있다.
		
	}
	
}
