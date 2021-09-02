package example04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListLinkedListEx {

	public static void main(String[] args) {
		
		
		ArrayList<String> arrayList = new ArrayList<String>();
		
		LinkedList<String> linkedList = new LinkedList<String>();
		
		System.out.println("=== 순차적으로 데이터 추가 하기 ===");
		System.out.println("ArrayList : "+add1(arrayList));
		System.out.println("LinkedList : "+add1(linkedList));
		System.out.println();
		
		System.out.println("=== 비순차적으로 데이터 추가 하기 ===");
		System.out.println("ArrayList(배열복사) : "+add2(arrayList));
		System.out.println("LinkedList(노드값 변경) : "+add2(linkedList));
		System.out.println();
		
		System.out.println("=== 비순차적으로 데이터 삭제 하기 ===");
		System.out.println("ArrayList(배열복사) : "+remove2(arrayList));
		System.out.println("LinkedList(노드값 변경) : "+remove2(linkedList));
		System.out.println();
		
		System.out.println("=== 순차적으로 데이터 삭제 하기 ===");
		System.out.println("ArrayList : "+remove1(arrayList));
		System.out.println("LinkedList : "+remove1(linkedList));
		
		
		
	}
	// 순차적 데이터 추가
	public static long add1(List<String> list) {
		long start= System.currentTimeMillis();
		for(int i=0;i<100000;i++) {
			list.add(i+"");
		}
		long end = System.currentTimeMillis();
		return  end - start;
	}
	// 비순차적 데이터 추가
	public static long add2(List<String>list ) {
		long start= System.currentTimeMillis();
		for(int i=0;i<100000;i++) {
			list.add(500,"X");
		}
		long end = System.currentTimeMillis();
		return  end - start;
	}
	// 순차적 데이터 삭제
	public static long remove1(List<String> list) {
		long start= System.currentTimeMillis();
		for(int i=list.size()-1;i>=0;i--) {
			list.remove(i);
		}
		long end = System.currentTimeMillis();
		return  end - start;
	}

	// 비순차적 데이터 삭제
		public static long remove2(List<String> list) {
			long start= System.currentTimeMillis();
			for(int i=0;i<50000;i++) {
				list.remove(i);
			}
			long end = System.currentTimeMillis();
			return  end - start;
		}
}
