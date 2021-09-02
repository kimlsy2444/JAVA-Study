package example02;

import java.util.Scanner;

public class InputGugudan {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("구구단 출력");
		System.out.print("출력할 단 : ");
		 int start = sc.nextInt();
		 System.out.print("끝 단 : ");
		 int end = sc.nextInt();
		
		
		 for(;start<=end;start++) {
			 System.out.println("****"+start+"단****");
			 for(int j=1;j<10;j++) {
				 
				 System.out.println(start+"*"+j+" = "+start*j);
			 }
		 }
		
		
		
		
		sc.close();

	}

}
