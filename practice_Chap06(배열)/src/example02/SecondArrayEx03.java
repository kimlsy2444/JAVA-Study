package example02;

import java.util.Scanner;

public class SecondArrayEx03 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int[][] student;
		
		int count = 0,num = 0,sum = 0,total = 0;
		//반수 인원 합계 계
		
		double avg = 0.0;
		double avgTotal = 0.0;
		
		System.out.print("반수 입력 : " );
		count = sc.nextInt();
		student = new int [count][]; // 반의 개수를 1차원배열로 할당
//		System.out.println("2차원 배열 주소 "+ student);
//		System.out.println("1차원 배열 크기 "+ student.length);
		for(int i  = 0 ; i<student.length;i++) {
			
			System.out.printf("%d반의 인원 : ",i+1);
			num = sc.nextInt();
			student[i] = new int[num];
			
			for(int j=0;j<student[i].length;j++) {
				
			System.out.printf("%d 반의 %d번의 점수 : ",(i+1),(j+1));
				student[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		
		
//		for(int i =0; i<student.length;i++) {
//			
//			for(int j=0;j<student[i].length;j++) {
//				System.out.println(student[i][j]);
//			}
//		}
		
		
		
		
		System.out.println("반 \t합계\t평균\t");
		System.out.println("------------------------------------");
		
		for(int i = 0 ; i<student.length;i++)
		{ sum = 0;
			for(int j= 0; j <student[i].length;j++) {
				
				sum += student[i][j];
			}
			
			total +=sum;
			
			avg = (double)sum/student[i].length;
			avgTotal +=avg;
			System.out.printf("%d반\t%d\t%.1f\n",i+1,sum,avg);
		}
		avgTotal /=student.length;
		System.out.printf("계\t%d\t%.1f",total,avgTotal);
		
		
		
		sc.close();
		
		

	}

}
