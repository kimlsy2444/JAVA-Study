package example05;

public class Thermometer {
	
	//중첩 인터페이스 선언
	interface TemperatureChanger{
		public void OnChange();
	}
	TemperatureChanger changer;
	
	
	// 매개변수 타입이 인터페이스 타빙이 들어왔다. 이것은 무엇을 의미하는건가요?
	// 즉, TmpertureChangabe인터페이스를 구현한 클래스만 이 들어올 수 있다.
	// 인터페이스 매개변수의 다형성
	
	public void setChanger(TemperatureChanger changer) {
		this.changer = changer;
	}
	public void viewTemperature() {
		this.changer.OnChange();
	}
	
	
}
