package example09;

public class StatePrintThread extends Thread {

	// 스레드의 상태를 알아보기 위해 멤버로 선언
	private TargetThread targetThread;
	
	public StatePrintThread(TargetThread targetThread) {
		
		this.targetThread= targetThread;
	}
	
	@Override
	public void run() {
		while (true) {
			// 스레드의 상태 정보를 알아낸다.
			// Thread.State은 Thread 클래스 Enum(열거형) 타입이다.
			Thread.State state = targetThread.getState();
			System.out.println("타겟 스레드 상태 : "+ state);
			
			// 스레드가 생성되었으면 실행
			if(state == Thread.State.NEW) {
				targetThread.start();
			}
			// 스레드가 종료되었으면 무한루프 종료
			if(state == Thread.State.TERMINATED) {
				break;
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {}
		}
	}
		
	
}
