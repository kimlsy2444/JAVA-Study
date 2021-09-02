package example02;

import java.awt.Toolkit;

public class BeepPrintEx {
	
	// main() 는 JVM이 실행한다.
	public static void main(String[] args) {
		
		// 직접 생성하는 멀티스레드 방법 3가지
		// 방법 1 --> 구현 객체 대입
		Runnable runnable = new Beep(); // 구현객체 대입
		Thread thread = new Thread(runnable);
		thread.start();
		// 스레드는 한번 start() 를 다실행하고 나면 ,재실행이 안된다.
		// 재실행을 하고자한다면 아래와 같이 인스턴스를 한개 더 만들어야한다.(중요)
//		thread = new Thread(runnable);
//		thread.start();
		
		//방법 2 --> 익명 구현 객체
		
//		Thread thread = new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//			
//				Toolkit toolkit = Toolkit.getDefaultToolkit();
//				
//				for(int i = 0;i<5;i++) {
//					
//					System.out.println("비프음 실행 스레드 명 : "+
//										Thread.currentThread().getName());
//					toolkit.beep();
//					
//					try {
//						Thread.sleep(500);
//					} catch (InterruptedException e) {}
//				
//
//				}
//			}
//		});
//		thread.start();
		
		
		
		// 방법3 --> 람다식(함수적 인터페이스 (인터페이스 함수가 단1개)) JDK1.8 코드절약 가독성 b
//			Thread thread = new Thread( ()-> {
//				
//				Toolkit toolkit = Toolkit.getDefaultToolkit();
//				
//				for(int i = 0;i<5;i++) {
//					
//					System.out.println("비프음 실행 스레드 명 : "+
//										Thread.currentThread().getName());
//					toolkit.beep();
//					
//					try {
//						Thread.sleep(500);
//					} catch (InterruptedException e) {}
//				
//
//				}
//			});
//			thread.start();
		
		 for(int i = 0; i<5;i++) {
			 System.out.println("for문을 실행하는 스레드 이름 : "+
			 			Thread.currentThread().getName());
			System.out.println("삐융~");
			 try {
				 Thread.sleep(500);
			} catch (InterruptedException e) {e.printStackTrace();}
		 }
	
		 // 싱글스레드를 멀티스레드로 바꿔서 프로그램으로 만드는것이 우리가 할일
		 
		 
		 
		 
		 
		 
	}

}
