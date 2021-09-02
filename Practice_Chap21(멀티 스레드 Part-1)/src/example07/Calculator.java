package example07;
 // 공유 객체
public class Calculator {

	private int memory;
	int vlaue = 100;
	public int getMemory() {
		return this.memory;
	}
	// 비동기화 메서드 -> 데이터 신뢰성을 보장하기 위해서는 반드시 동기화 처리가 필수다.
	public synchronized void setMemory(int memory) {
		
		this.memory= memory;
		
		try {
			Thread.sleep(0);
		} catch (InterruptedException e) {}
		System.out.println(Thread.currentThread().getName()+" : "+this.getMemory());
	}
	
	
	public synchronized void	print() {
	//	System.out.println(Thread.currentThread().getName()+" "+"vlaue 값 : "
				//										      +this.vlaue);
		
//		for(int i = 0; i<10;i++) {
//			System.out.println(Thread.currentThread().getName()+" : "+ i);
//		}
	}
}
