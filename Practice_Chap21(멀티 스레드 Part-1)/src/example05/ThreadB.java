package example05;

public class ThreadB extends Thread {

	public ThreadB() {
		this.setName("ThreadB");// 스레드의 이름을 지정하고 있다.
	}
	@Override
	public void run() {
		System.out.println("[현재 실행 중인 스레드] : "+ this.getName());
		for(int i = 0; i<5;i++) {
			System.out.println(this.getName()+"가 출력한 내용"+i);
			//  스레드의 이름을 얻는 2가지방법
			// 1 번째(정적 메서드 이용)
			// Thread.currentThread().getNmae()
			// 2번째(인스턴스 메서드 이용)
			// this.getName()
			
		}
	}
}
