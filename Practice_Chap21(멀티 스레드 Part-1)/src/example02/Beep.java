package example02;

import java.awt.Toolkit;

// Runnable인터페이스를 직접 구현하고 있다.
public class Beep implements Runnable{
	
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i = 0;i<5;i++) {
			
			System.out.println("비프음 실행 스레드 명 : "+
								Thread.currentThread().getName());
			toolkit.beep();
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		

		}
	}

	
}
