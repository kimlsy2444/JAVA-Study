package arraysExample;

import java.util.Arrays;

public class ArrayCopyEx {

	public static void main(String[] args) {
		
		int[] arr1 = new int [] {10,20,30,40};
		
		// 1. 배열 복사 방법 (copyOf)
		
		int[] cloned = Arrays.copyOf(arr1, arr1.length);
		System.out.println("arr1   : "+Arrays.toString(arr1));
		System.out.println("cloned : "+Arrays.toString(cloned));
		System.out.println("==========================");
		
		// 2. 배열 복사 방법 (copyOfRange)
		// 배열의 1인덱스 부터 3번째 인덱스 까지 복사 하지만 끝인덱스틑 포함하지 않음 1,2 인덱스 복사
		
		cloned = Arrays.copyOfRange(arr1, 1,3 ); 
		System.out.println("arr1   : "+Arrays.toString(arr1));
		System.out.println("cloned : "+Arrays.toString(cloned));
		System.out.println("==========================");
		
		// 3. 배열 복사 방법(System.arraycopy)
		// arr1[] 의 0번째 인덱스부터 cloned[] 2의 길이만큼 복사 
		// 왜 2개만 생성되냐~  System.arraycopy 는 이미 생성된 배열에서 할당 되므로
		// 위의 cloned 배열의 크기는 2이기 때문에 arraycopy에서 2개의 인덱스만 복사되고
		// 그상은 ArrayIndexOutOfBoundsException 에러가 발생된다 (배열 저장공간 부족에러)
		
		System.arraycopy(arr1, 0, cloned, 0,2);
		System.out.println("arr1   : "+Arrays.toString(arr1));
		System.out.println("cloned : "+Arrays.toString(cloned));
		
	}

}
