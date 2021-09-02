package example03;

public class WorkThread extends Thread {

	public WorkThread(ThreadGroup threadGroup,String threadName) {
		super(threadGroup,threadName); // 조상 클래스의 매개변수기 있는 생성자 호출 
	}
	
	@Override
	public void run() {
	// 현재 실행되고 있는 스레드 그룹을 얻음
		
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		
		String str = mainGroup.getName();
		
		System.out.println("스레드 그룹 이름 : "+ str);
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			System.out.println(this.getName()+"인터럽트 호출됨");
			break;
			}
			
		}
		System.out.println(this.getName()+"종료됨");
		
	}
}
