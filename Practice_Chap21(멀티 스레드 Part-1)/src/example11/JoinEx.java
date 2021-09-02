package example11;

public class JoinEx {

	public static void main(String[] args) {
		
		double avg = 0.0;
		long total = 0L;
		
		SumThread  sumThread = new SumThread();
		
		sumThread.start();
		
		try {
			sumThread.join(); // 메인스레드는 sumThread 가 끝날때 까지 기다린다. 
							 
		} catch (InterruptedException e) {}
		
		total =sumThread.getSum();
		avg = total / 10000.0;
		System.out.println("1~10000 += " + total);
		System.out.println("1~10000 /= " + avg);

	}

}
