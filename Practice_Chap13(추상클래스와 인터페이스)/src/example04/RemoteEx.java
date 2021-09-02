package example04;

public class RemoteEx {

	public static void main(String[] args) {
		
		RemoteControl rControl = new Television();
		rControl.turnOn();
		rControl.setVolume(15);
		rControl.setVolume(-100);
		rControl.turnOff();
		
		System.out.println();
		
		rControl = new Audio();
		rControl.turnOn();
		rControl.setVolume(15);
		rControl.setVolume(-100);
		rControl.turnOff();
	}

}
