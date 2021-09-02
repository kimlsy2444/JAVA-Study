package example04;

public class CarEx {

	public static void main(String[] args) {

		Car car = new Car(80);
		
		SportCar sportCar = new SportCar(150);

		car.speedUp();
		car.speedDown();
		car.stop();
		
		sportCar.speedUp();  // 조상 클래스의 speedUP을 호출
		sportCar.speedDown();// 조상 클래스의 speedUP을 호출
		sportCar.stop();	 // 자손 클래스의 stop() 호출
	}

}
