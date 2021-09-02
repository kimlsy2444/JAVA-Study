package example05;

public class ThermometerEx {

	public static void main(String[] args) {
	
		Thermometer thermometer = new Thermometer();
		
		//AnalogThemometer A = new AnalogThemometer();
	
		//thermometer.setChanger(A);
		
		thermometer.setChanger(new AnalogThemometer());
		thermometer.viewTemperature();
		System.out.println();
		thermometer = new Thermometer();
		thermometer.setChanger(new DigitalThermometer());
		thermometer.viewTemperature();

	
	
	 // 중첩 인터페이스 이므로 익명 구현 객체를 얻는 것은 안된다
//		Thermometer.TemperatureChanger thermometer2 = new Thermometer.TemperatureChanger() {
//			
//			@Override
//			public void OnChange() {
//			
//				System.out.println(" 익명 구현객체");
//			}
//		};
		
		
		
	
	
	
	}
	

}
