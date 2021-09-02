package example01;

public class ArrayEx02 {

	public static void main(String[] args) {
		// 총점 구하기 평균 구하기
		
		
		int sum= 0 ;
		double avg = 0.0;
		
		int[] score = new int[] {100,90,80,50,70};
		
		System.out.println("배열의 크기 :"+score.length);
		
		for (int i = 0;i<score.length;i++)
		{
			sum+=score[i];
			System.out.println( (i+1) +"번 학생 점수 : "+score[i]);
		}
		avg= sum/score.length;
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
	}

}
