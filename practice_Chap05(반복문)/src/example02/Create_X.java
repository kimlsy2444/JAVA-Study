package example02;

import java.util.Scanner;

public class Create_X {

	public static void main(String[] args) {
//		 *   *
//		  * *
//		   *
//		  * *
//		 *   *

		Scanner sc =new Scanner(System.in);
		
		int num =sc.nextInt();
		
		int x =  1;
		int y = num;
		
		for(int i =0;i<num;i++) {
			for(int j = 1; j<=num;j++) {
				
				if( j == x || j == y ) {
					System.out.print("*");
				}
				
				else {
					System.out.print(" ");
				}
			}
			x++;
			y--;
		System.out.println();
		}
			
		sc.close();
	}

}
