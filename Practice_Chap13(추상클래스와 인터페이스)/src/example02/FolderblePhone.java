package example02;

public class FolderblePhone extends Phone {

	public FolderblePhone(int serial_No, String owner, String company){
		super(serial_No, owner, company);
	}

	@Override
	public void turnOn() {
		System.out.println("FolderblePhone ON");
		
	}
	
	@Override
	public void turnOff() {
		System.out.println("FolderblePhone OFF");
	}
	
	
	public void foldOn() {
		
		System.out.println("FoldOn START");
	}
	
	public void foldOff() {
		
		System.out.println("FoldOn DOWN");
	}
}
