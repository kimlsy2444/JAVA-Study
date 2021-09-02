package example03;

public class MonitorEx {

	public static void main(String[] args) {
		
		
		// 참조변수는 리모컨과 같은 것이라고 생각하자
		Monitor monitor = new Monitor();
		System.out.println(monitor.toString()); 
		monitor.channel = 5;
		monitor.power();
		monitor.channelUp();
		monitor.channelUp();
		monitor.channelDown();
		
		System.out.println(monitor.toString()); 
		monitor.power();
		
		
		
	
		
		
	}	

}
