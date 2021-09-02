package example03;

public class InstanceOf {
	
	public static void main(String[] args) {
		// Ctrl + T 는 상속계층도를 볼 수 있는 단축키이다.
		SportCar sportCar = new SportCar();
		
		if(sportCar instanceof SportCar) {
			System.out.println("SportCar로 타입변환 가능 "); 
		}
		if(sportCar instanceof Car) {
			System.out.println("Car로 타입변환 가능 "); 
		}
		if(sportCar instanceof Object) {
			System.out.println("Object로 타입변환 가능 "); 
		}
		
		// instanceof 연산자긩 결과가 true 라는 것은 실제 형변환이 가능하다라는것을 의미하며
		// 아월러 상속관계에 있는 것이다.
	
	
	
	
	
	
	
	
	
	}
}
