package example01;

import java.util.Arrays;
import java.util.List;

public class ArrayListEx03 {

	public static void main(String[] args) {
		
		// Arrays.asList()는 컬렉션이 아니라 ,배열형식으로 된 컬랙션을 리턴한다
		List<String> list = Arrays.asList("장규리","이채영","백지헌");
		
		// 아래와 같이 객체 추가, 삭제를 하면 UnsupportedOperationException 발생
		// 이유는 asList() 배열형식의 컬렉션을 리턴하기 때문이다.
		//list.add("ddd");
		//list.remove(0);
		System.out.println(list.toString());
		
		List<Integer> list2= Arrays.asList(100,200,300);
		
		// List 컬렉션을 가지고 배열을 직접 만들고 있다.
		Integer[] arr = (Integer[])list2.toArray();
		
		int [] arr1 = new int[3];
		
		for(int i=0;i<arr.length;i++) {
		
				arr1[i]= arr[i];
			}
			
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr1[0]==100) {
				arr[0] = null;
			}
			System.out.println(arr[i]);

		}

	}
}
