package example01;

public class ForEx01 {

	public static void main(String[] args) {
		//1~100 까지 합을 구하는 반복문
		// 싱글루프일떄
		// int i =1 -> 초기화 코드 (최소 1번만 실행)
		// i<=100 -> 조건식(참일때만 , 실행블럭 실행)
		// i++ -> 증감식
		int sum = 0;
		for (int i=1;i<=100;i++){
			
			sum+=i;
			
		}
		System.out.println(sum);
		

	}

}
