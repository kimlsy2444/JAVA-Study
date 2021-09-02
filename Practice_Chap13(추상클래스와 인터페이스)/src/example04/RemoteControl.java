package example04;

public interface RemoteControl {

	// »ó¼ö
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume); 
}
