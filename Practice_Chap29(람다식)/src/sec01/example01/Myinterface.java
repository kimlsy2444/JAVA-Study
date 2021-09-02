package sec01.example01;

@FunctionalInterface
public interface Myinterface {
	
	void method();
	
	
	//@FunctionalInterface
	// void method1(); 
	//추상메서드가 2개이상이되면 
	//함수적 인터페이스가 아니기 때문에 오류
}
