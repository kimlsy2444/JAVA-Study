package example03;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		
		
		int [] ori = new int[] {10,77,33,50};
		
		int [] target= new int[10];
		int count = 0 ;
		System.out.println("복사전");
		System.out.println(Arrays.toString(ori));
		System.out.println(Arrays.toString(target));
		
		//직접 복사 향상된 for문 사용
//		for(int i : ori )
//		{
//			target[count++] = i;
//		}
		// 직접복사 c for문 스타일
//		for(int i = 0 ; i<ori.length;i++)
//		{
//			target[i]= ori[i];
//		}
		
		// systen 클래스 를 이용한 복사 
		//System.arraycopy(ori,0,target,5,ori.length);  //++ 복사 속도가 가장 빠르다.
		// 완전히 똑같은 복사 Arrays.copyOf 길이까지 더 
		target = Arrays.copyOf(ori,ori.length);
		System.out.println(target.length);
		
		System.out.println("복사후");
		System.out.println(Arrays.toString(ori));
		System.out.println(Arrays.toString(target));
	}

}
