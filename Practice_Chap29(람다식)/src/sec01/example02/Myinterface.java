package sec01.example02;

@FunctionalInterface
public interface Myinterface {
	
	// 매개변수가 있다.
	void method(int x);
	
	
	//@FunctionalInterface
	// void method1(); 
	//추상메서드가 2개이상이되면 
	//함수적 인터페이스가 아니기 때문에 오류
}
