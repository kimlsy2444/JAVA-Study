package example05;

// 중첩인터페이스를 구현한 클래스
public class DigitalThermometer implements Thermometer.TemperatureChanger {

	int temperature = 50;
	@Override
	public void OnChange() {
		System.out.println("전자 온도계 입니다.");
		System.out.println(this.temperature+"도 입니다.");
		
	}
}
