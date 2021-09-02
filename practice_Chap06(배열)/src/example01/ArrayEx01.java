package example01;

public class ArrayEx01 {

	public static void main(String[] args) {
	
		// score 참조 변수 이다. int[]이다.
		int [] score= null;
		//score 는 5 개의 방을 힙에다가 생성하고있다 20바이트
		score = new int[5];
		//배열명이 곧 주소다
		System.out.println(score);
		for(int i=0;i<score.length;i++){   
			System.out.println("score["+ i+ "] = "+ score[i]);
		}
		System.out.println();
		//score[0]는 변수와 동일하다고 보면 된다.
		//score는 주소다 .[] 안에 들어가는 숫자를 인데스 라고 한다.
			score[0]=100;
			System.out.println(score[0]);
			
			System.out.println();
			
			for(int i=0;i<score.length;i++){   
				 score[i] = i+1;
				 System.out.println("score["+ i+ "] = "+ score[i]);
			}
			
	}

}
