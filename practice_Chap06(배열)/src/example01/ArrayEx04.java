package example01;

import java.util.Arrays;

public class ArrayEx04 {

	public static void main(String[] args) {
		// 무작위 숫자 10 개 오름 차순 정렬 버블정렬
		
		int[] arr= new int [5];
		
		System.out.println("정렬전");
		for (int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*20)+1;
		}

		System.out.println(Arrays.toString(arr));
		
//	for (int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr.length-1;j++) { 
//				if(arr[j]<arr[j+1]) {
//					int temp = arr[j];
//					 arr[j] = arr[j+1];
//					 arr[j+1] = temp;
//				}
//				
//			}
//		
//		}
	
		Arrays.sort(arr);
		System.out.println("정렬후");
		System.out.println(Arrays.toString(arr));
//	for (int i=0;i<arr.length;i++) {
//		System.out.println(arr[i]);
//	}
	
	}

}
