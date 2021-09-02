package example04;

import java.util.Scanner;

public class DoWhileEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("메세지 입력");

		System.out.println("q입력 종료");
		
		String str= null;
		// do - while 문은 최소 한번 이상 무조건 수행하는 반복문
		// 이유는 조건문이 뒷부분에 존재하기 떄문이다.
		do {
		
			System.out.print(">");
			//String 클래스 next()메서드는 공백만 날떄 그 값 리턴
			//next() 한단어를 입력받을 때 좋다.
			//nextLine() 공백 포함 엔터키 입력할 떄까지 문장 리턴
			str = sc.nextLine();
			System.out.println("입력 받은 메세지 : "+str);
			
			
		}while(!str.equals("q"));
		
		System.out.println("프로그램 종료"); 
		sc.close();
	}

}
