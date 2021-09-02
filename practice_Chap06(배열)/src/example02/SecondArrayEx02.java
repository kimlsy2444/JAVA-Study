package example02;

public class SecondArrayEx02 {

	public static void main(String[] args) {
		
		
		int [][] score = new int[][] 
								{//국영수
								{100,70,50},
								{70,50,30},
								{50,80,70},
								{55,85,77},
								{100,80,75},
								};
								
		//과목별 총점
		int korTotal = 0;
		int engTotal = 0;
		int mathTotal = 0;
		
		int Totalsum = 0;
		double avg =  0.0;
		
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		System.out.println("==============================================");
		
		for(int i = 0;i<score.length;i++)
		{
			System.out.print(i+1);
			
			korTotal += score[i][0];
			engTotal += score[i][1];
			mathTotal+= score[i][2];
			
			
			for(int j = 0; j<score[i].length;j++)
			{
				System.out.print("\t"+score[i][j]);
				Totalsum +=score[i][j];
				avg =(double)Totalsum/score[i].length;
			}
			
			System.out.print("\t"+Totalsum);
			Totalsum=0;
			
			System.out.printf("\t %.2f",avg);
			System.out.println();
		}
		avg=0.0;
		
		avg = (double)(korTotal+engTotal+mathTotal)/score[0].length;
		System.out.print("\t"+korTotal);
		System.out.print("\t"+engTotal);
		System.out.print("\t"+mathTotal);
		System.out.print("\t");
		System.out.printf("\t %.2f",avg);
		
		
					

	}

}
