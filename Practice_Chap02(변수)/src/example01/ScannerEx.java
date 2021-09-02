package example01;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 한자리 압력 : ");
		int num1 = sc. nextInt();
		System.out.println("입력받은것 " + num1);
	
	
		System.out.print("실수 한자리 압력 : ");
		double num2 = sc. nextDouble();
		System.out.println("입력받은것 " + num2);
		
		System.out.print("입력");
		
		int result = 100;
		
		String num = sc.nextLine();
		
		int temp = Integer.parseInt(num);
		
		int total = result+temp;
	
		System.out.println("결과 " + total);
	}

}
