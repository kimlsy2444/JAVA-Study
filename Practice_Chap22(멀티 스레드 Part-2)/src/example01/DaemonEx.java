package example01;

public class DaemonEx {

	public static void main(String[] args) {
		
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		
		// deamon 설정(필히 ,strat() 호출 전에 설정 해야한다.)
		
		autoSaveThread.setDaemon(true);
		autoSaveThread.start();
		
		// 메인스레드가 5초 동안 정지하면 ,daemon 스레드인 autoSaveThread가
		// 실행되고 , 메인스레드가 종료되면 더 이상 autoSaveThread 실행되지 않음
		// 종속적 관계 
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {}
		
		System.out.println("메인 스레드 종료됨");
	}

}
