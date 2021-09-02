package example12;

public class WorkObject {
	
	public synchronized void methodA() {
		System.out.println("ThreadA의 methodA()실행");
		notify(); // wait() 에 의해 BLOCKED된 스레드를 실행 대기 상태로 꺠운다.
		
		try {
			wait();// 영원히 잔다. 다른스레드에서 notify()notifyAll()호출시 깨어남
			
		} catch (InterruptedException e) {}
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadB의 methodB()실행");
		notify(); // wait() 에 의해 BLOCKED된 스레드를 실행 대기 상태로 꺠운다.
		
		try {
			wait();// 영원히 잔다. 다른스레드에서 notify()notifyAll()호출시 깨어남
			
		} catch (InterruptedException e) {}
	}
}
