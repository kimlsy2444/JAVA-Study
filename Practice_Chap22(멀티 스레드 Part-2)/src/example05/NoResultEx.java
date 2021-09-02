package example05;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class NoResultEx {

	public static void main(String[] args) {
	
		// 내  PC CUP의 코어수를 최대 스레드 수로 준다.(Ex 듀얼 코어2개 쿼드코어 4개)	
		ExecutorService executorService = Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors());
				System.out.println("코어 수 :  "+Runtime.getRuntime().availableProcessors());
	//Runnable 익명 구현 객체 생성(작업 객체)--> 리턴값이 없다.
				System.out.println("[작업 처리 요청]");
				Runnable runnable = new Runnable() {
					
					@Override
					public void run() {
						int sum = 0;
						for(int i=1;i<=10;i++) {
							sum += i ;
							//리턴값이 없기떄문에 run()안에서 값출력
						}
						System.out.println("[작업 처리 결과] : "+sum);
						
					}
				};
				// 작업큐에 작업 (runnable객체)을 넣는다
				// 작업이 완료될 때까지 블로킹 즉 기다린다. Future는 지연 완료 객체 이다.
				
			Future<?>	future = executorService.submit(runnable);
			
			try {
				//get()는 작업 객체가 작업을 완료할 떄까지 기다린다.(블로킹)
				Object obj = future.get();
				String str= (String)obj;
				System.out.println("[작업처리 완료]");
				System.out.println("Future의 get()가 리턴한 값 : "+str);
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
				
		executorService.shutdown();
	}

}
