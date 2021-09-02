package example10;

public class ThreadA extends Thread {

	public boolean stop = false;
	
	public boolean work = true;
	
	@Override
	public void run() {
	
		while(!stop) {
			if(work) {
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {}
				System.out.println("ThreadA 의 작업 내용");
			}
			else {
				// 무의미한 반복을 막기위해서 다른 스레드 에게 양보하함
				Thread.yield();

			}

		}
		System.out.println("ThreadA 종료");
	}
}
