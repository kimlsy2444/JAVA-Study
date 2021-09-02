package example03;

public class CarEx {

	public static void main(String[] args) {
		
		Car car = null;
		SportCar sprotCar1 = new SportCar();
		SportCar sprotCar2 = null;
		PoliceCar policeCar = new PoliceCar();

		sprotCar1.speedUp();
		sprotCar1.drive();
		
		car = (Car)sprotCar1; //업캐스팅 ( 자손 -> 조상), 조작 가능 멤버 줄어듦
		// car.speed();  // 컴파일 예외가 발생하는 이유 : car의 speed()메서드가 없기떄문
		sprotCar2 = (SportCar)car; // 다운 캐스팅 (조상 -> 자손) 조작 가능 멤버 늘어남
		sprotCar2.speedUp();
		// 서로 상속관계가 아니기 떄문에 형변환이 절대 이루어줄수 없음
		// sprotCar1 = (SprotCar) policeCar; 
	}

}
