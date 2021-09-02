package example01;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String str = sc.nextLine();
		
		System.out.println(str);
		
		 byte [] b1 = str.getBytes();
		// char [] ch =  str.toCharArray();
		System.out.println(Arrays.toString(b1));
		
		// 영어를 제외한 한글을 입력할경우
		// byte의 오버플러우 현상발생하여 이상한 값이 저장된다.
//		System.out.println(ch.length);
//		for(int i = 0 ; i<ch.length;i++) {
//			System.out.println(ch[i]);
//		}
		
		sc.close();

	}

}
