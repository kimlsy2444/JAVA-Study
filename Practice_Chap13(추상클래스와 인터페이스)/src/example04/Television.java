package example04;



public class Television implements RemoteControl {

	private int volume;
	@Override
	public void turnOn() {
		System.out.println("TV ON"); 
		
	} 
	@Override
	public void turnOff() {
		System.out.println("TV OFF");
		
	}
	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			System.out.println("TV의 볼륨 최대치는 10입니다.");
			this.volume = RemoteControl.MAX_VOLUME;
		}
		else if(volume < RemoteControl.MIN_VOLUME) {
			System.out.println("TV의 볼륨 최소치는 0입니다.");
			this.volume = RemoteControl.MIN_VOLUME;
		}
		else {this.volume = volume;}
		System.out.println("현재 TV볼륨 :" + this.volume); 
	}
	
	
}
