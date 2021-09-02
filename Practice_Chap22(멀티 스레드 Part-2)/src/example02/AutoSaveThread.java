package example02;

public class AutoSaveThread extends Thread {

	public void save() {
		System.out.println("작업 내용 저장함");
	}
	@Override
	public void run() {
		// 1초단위로 save() 메소드 호출
		while(true){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			
			this.save();
		}
	}
	
	
	
	
}
