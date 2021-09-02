package example07;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetSortEx {

	public static void main(String[] args) {
	
		TreeSet<Integer> scores = new TreeSet<Integer>();
		
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(100);
		scores.add(-50);
		
		// 기본적 으로 오름차순 정렬
		System.out.println(scores); 
		System.out.println("객체 수 : "+scores.size());
		System.out.println();
		
		System.out.println("내림 차순 결과");
		NavigableSet<Integer> descendingSet = scores.descendingSet();
		System.out.println(descendingSet);
		System.out.println("객체 수 : "+descendingSet.size());
		System.out.println();
		
		System.out.println("다시 올림 차순 결과");
		NavigableSet<Integer> ascendingSet = descendingSet.descendingSet();
		System.out.println(ascendingSet);
		System.out.println("객체 수 : "+descendingSet.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
