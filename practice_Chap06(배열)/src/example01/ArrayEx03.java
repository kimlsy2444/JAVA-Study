package example01;

import java.util.Arrays;

public class ArrayEx03 {

	public static void main(String[] args) {
		
		//40 바이트가 힙에 생성 되었다
		int[] arr1 = new int[10];
		// 6 바이트가 힙에 생성 되었다
		char[] ch =new char[] {'a','b','c'};
		// arr1배열에다 난수를 10개 대입
		for (int i =0;i<arr1.length;i++){
		// 1~10 까지의 난수 대입
			arr1[i] = (int)(Math.random()*10)+1;
		}
		
		for (int i =0;i<arr1.length;i++){
			if(i == (arr1.length)-1 ) {
				System.out.print(arr1[i]);
			}
			
			else {
				System.out.print(arr1[i]+",");
			}
			
		}
		System.out.println();
		// Arrays클래스는 배열을 조작하기 쉽게 만들어 놓은 유틸리티 클래스
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(ch));
		
		//주소 값 출력 
		// 출력 스트림에다가 참조 변수를 넣으면
		// 참조 변수명.tostring()호출이된다
		
		// char 타입 은 주소를 출력하려면 반듯이 toString()호출
		System.out.println(arr1);
		System.out.println(arr1.toString()); //타입@16진수
		
		
		System.out.println(ch.toString());
		System.out.println(ch);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
