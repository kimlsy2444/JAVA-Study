package sec01.example03;

@FunctionalInterface
public interface Myinterface {
	
	// 2개의 매개변수와 리턴값이 존재하는 추상 매서
	int method(int x ,int y);
	
	
	//@FunctionalInterface
	// void method1(); 
	//추상메서드가 2개이상이되면 
	//함수적 인터페이스가 아니기 때문에 오류
}
