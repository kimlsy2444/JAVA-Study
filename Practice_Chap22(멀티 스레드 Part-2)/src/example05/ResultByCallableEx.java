package example05;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ResultByCallableEx {
	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors());
		
		//Callable 익영 구현 객체를 생성 (작업 객체)--> 리턴값이 <T>타입으로 존재하므로
		// 리턴 타입도 역시<T> 타입이여야한다.
		System.out.println("[작업 처리 요쳥]");
		Callable<Integer> callable = new Callable<Integer>() {
			
			@Override
			public Integer call() throws Exception {
				
				int sum = 0;
				for(int i=0;i<=100;i++) {
					sum += i;
				}
				return sum;
			}
		};		
		// 작업큐에 작업객체를 넣는다.
		// Future 제네릭 값도 역시 <T>타입으로 통일해줘야 한다.
		System.out.println("블로킹 시작 : "+System.currentTimeMillis());
		Future<Integer>future= executorService.submit(callable);
		
		try {
			int value = future.get();
			System.out.println("블로킹 종료 : "+System.currentTimeMillis());
			System.out.println("[작업 처리 결과] : "+value);
			System.out.println("[작업 처리 완료]");
		} catch (InterruptedException | ExecutionException e) {
		
			e.printStackTrace();
		}
		
		executorService.shutdown();
		
		
		
	}

}
