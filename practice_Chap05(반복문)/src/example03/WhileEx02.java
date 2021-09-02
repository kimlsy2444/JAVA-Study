package example03;

import java.util.Scanner;

public class WhileEx02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean run =true; // flage 변수 
		
		int speed = 0;
		
		while(run){
			
			System.out.println("==================");
			System.out.println("1 증속 | 2 감속 | 3 종료");
			System.out.println("==================");
			System.out.print("입력 : ");
			int choice = sc.nextInt();
			if(choice == 1)
			{
				speed++;
				System.out.println("현재의 속도는 "+ speed+"입니다.");
			}
		
			else if(choice == 2) {
				speed--;
				System.out.println("현재의 속도는 "+ speed+"입니다.");
			}
			else if(choice == 3)
			{	
				
				 break;
				//System.exit(0); 완전히 강제적 종료 
				//run = false;
			}
			else {
				System.out.println("잘못 입력 했습니다 다시 입력하세요");
			}
			
		}
		
		System.out.println("종료됨");
		sc.close();
		

	}

}
