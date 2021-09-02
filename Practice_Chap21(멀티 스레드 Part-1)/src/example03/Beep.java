package example03;

import java.awt.Toolkit;



// 상속을 받아서 스레드 클래스로 만듬
public class Beep extends Thread  {
	
	 @Override
	public void run() {
		 
		 Toolkit toolkit = Toolkit.getDefaultToolkit();
		 for(int i = 0; i<5; i++) {
			 System.out.println(Thread.currentThread().getName());
			 toolkit.beep();
			 try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		 }
	}
}
