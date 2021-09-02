package ex;

public class ex {

	public static void main(String[] args) {
		
		A a = new A();
		
		B b = new B();
		
		
		C c = null;
		
	
		b.a = 2;
		b.b = 3;
		
		
		
		// 업 캐스팅    자손에서 조상 // 조작 맴버 갯수 줄어듬; 근본이 조상 타입이니까 조상으로 올라간 격이니까 뭐가? A클래스 타입의 a이기 때문에~
	
		// 다운 캐스팅 조상에서 자손 // 조작 맴버 갯수 늘어남; 근본이 자손타입이니까~ 조상의 객체를 받았다한들 조상자체 

	
//		
//		c.a = 5;
		
	
	
		
		System.out.println(a.a); 
		System.out.println(b.a);
	//	System.out.println(c.a);
	
		
		
		// 다운 캐스팅 
	
		
		//전혀 관계가 없으므로 형변환이 아예 이루어 지지 않는다.
		//b1 = (B)c;
		//업 캐스팅
		
		
	
	
		
	}

}
