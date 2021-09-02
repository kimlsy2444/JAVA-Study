package example09;
// 스레드의 상태를 알아보기 위한 클래스
public class TargetThread extends Thread{

	@Override
	public void run() {
	// 20 억번 루핑, 실행-> 실행대기(Runnable)->실행
		for(long i = 0;i<2000000000; i++) {
			
		}
		// 일시정지 (TIMED_WAITING)
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		for(long i = 0;i<2000000000; i++) {
			
		}
	}// 종료(TERMINATED)
}
