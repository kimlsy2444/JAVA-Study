package example05;

public class AnalogThemometer implements Thermometer.TemperatureChanger {

	int temperature = 100;
	@Override
	public void OnChange() {
		System.out.println("아날로그 온도계입니다.");  
		System.out.println(this.temperature+"도 입니다.");  
	}
}
