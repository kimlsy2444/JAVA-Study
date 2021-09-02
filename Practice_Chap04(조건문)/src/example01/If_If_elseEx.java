package example01;

public class If_If_elseEx {

	public static void main(String[] args) {
		
		int score = 93;
		// 수십개의 if 문이 존재하더라도 cpu는 모든 if 문을참조  (비효율)
//		if(score > 90 ){
//			System.out.println("90 보다 큼");
//			System.out.println("A 등급 ");
//		}
		
		
		// if - else 구문은 50% 확률 일떄 사용하는게 바람직하다.
		// else 구문 옆에는 조건문이 절대로 오면 안된다.
		if (score > 90){
			System.out.println("90점 이상");
		}
		else  {
			System.out.println("90점 미만");
		}
	
	
	}	
}
