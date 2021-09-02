package example01;

public class ForEx02 {

	public static void main(String[] args) {
	
		int sum = 0;
		int temp = 0;
		// 디버깅 : debug 창으로 의도치 않게 넘어갔다면 ,
		// 프로그램에 문제 발생
		// 에러를 잡아 나가느 과정을 디버깅이라고 한다
		// breakPoint 중단점 설중후 실행 시키면 중단점 앞에서 멈춘다
		// f8 누르면서 한단계식 진행시켜나가면서 값을 살펴나가면 에러를 쉽게 잡을수 있다.
		//
		
		//  누적합계가 2000 이상 i의 값을 출력
		for (int i=1;i<=100;i++){
			sum+=i;
			
			if(sum>=2000){	
				
				temp= i;
				break;		
			}
		}
		
		System.out.println(temp);
		System.out.println(sum);
	}
		
}
