package example05;

import java.util.Scanner;

public class PowerEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = 0;
		int n= 0;
		long result = 0L;
		System.out.println("제곱 까지의 합을  계산한다");
		System.out.println("Ex) 2의 3승 : 2의 1승 + 2의2의승 +2의 3승은 14 입니다");
		
		System.out.print("제곱 하고 싶은 수 :");
		x= sc.nextInt();
		System.out.print("몇승을 더할까요 :");
		n= sc.nextInt();
		
		
		for(int i= 1;i<=n ; i++)	{
		result += power(x,i);	
		}
		System.out.printf("%d 의 %d 승의 까지의 합은 %d 입니다",x,n,result); 
		
		
		
		
		sc.close();
	}
	
	public static long power (int x,int n) {

		if(n==1){
			return x;
		}
		else {
			return x*power(x,n-1);
		}
	
	}

}
