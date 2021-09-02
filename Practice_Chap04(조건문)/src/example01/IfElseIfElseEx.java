package example01;

import java.util.Scanner;

public class IfElseIfElseEx {

	public static void main(String[] args) {
		//Resource 이기떄문에 닫아줘야한다. 	sc.close();
		Scanner sc= new Scanner(System.in);
		
		System.out.print("점수 임력 : ");
		int score = sc.nextInt();
		
		sc.close();
		
		
		
		//score 변수의 값에 따라 아래의 조건문에서 분기가 일어나고 있는 점이
		// 이 예제의 핵심 
		if(score >=90){
			System.out.println("90~100");
			System.out.println("A");
		}
		else if(score >= 80) {
			System.out.println("80~89");
			System.out.println("B");
		}
		else if(score >= 70) {
			System.out.println("70~79");
			System.out.println("C");
		}
		else {
			System.out.println("70미만");
			System.out.println("D");
			
		}

	}

}
