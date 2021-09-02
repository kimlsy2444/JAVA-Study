package example01;

import java.awt.Toolkit;

public class BeepPrintEx {
	
	// main() 는 JVM이 실행한다.
	public static void main(String[] args) {
		// 현재 실행 중인 스레드명을 출력함
		//System.out.println(Thread.currentThread().getName());
		
		
		// Tooljit은 추상 클래스인데, 그중에 GUI 관련된 메서드 들로 구성되어진
		// 인스턴스를  getDefaultToolkit() 를 통해서 Toolkit 클래스의 참조를 
		// 얻어낸다.
		 Toolkit toolkit = Toolkit.getDefaultToolkit();
		 
		 for(int i = 0; i<5;i++) {
			
			 System.out.println("for문을 실행하는 스레드 이름 : "+
					 			Thread.currentThread().getName());
			 toolkit.beep(); // 비프음 출력 
			 
			// 스레드가 너무 빨리 실행되서 비프음 테스가 안됨
			// 그래서 sleep() 메서드를 이용하여 스레드 생성을 잠시 멈춤 0.5초동안
			 try {
				Thread.sleep(500);
			} catch (InterruptedException e) {e.printStackTrace();}
		 }
		 
		 for(int i = 0; i<5;i++) {
	
			System.out.println("삐융~");
			 try {
				 Thread.sleep(500);
			} catch (InterruptedException e) {e.printStackTrace();}
		 }
	
		 // 싱글스레드를 멀티스레드로 바꿔서 프로그램으로 만드는것이 우리가 할일
		 // 비프음이 나오면서 삐융이라는 출력 구분을 같이 나타내고 싶음 

	}

}
