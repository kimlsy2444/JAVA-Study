package example10;

public class YieldEx {

	public static void main(String[] args) throws Exception{
		
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		
		threadA.start();
		threadB.start();
		//2초동안은 ThreadA ThreadB 번갈아 가면서 잡업을 한다.
		Thread.sleep(3000);
		
		threadA.work = true;
		threadB.work = false;
		
		Thread.sleep(3000);
		threadA.stop = true;
		threadB.stop = true;
		
	}

}
