package example08;
// 공유 객체
public class Toilet {


	// 동기화 메서드

	public synchronized void use() throws Exception {
		
		String name = Thread.currentThread().getName();
		
			
			System.out.println(name + "가/이 화장실 입장");
		
			Thread.sleep(1000);
			System.out.println(name+"ㅇㅅㅇ -b");
		
			System.out.println(name + "가/이 화장실 종료");
		
			System.out.println();

	}
	// 비동기화  메서드
	public  void noke() {
		
		System.out.println(Thread.currentThread().getName()+"똑딱");
		
		

		
		
	}
}

