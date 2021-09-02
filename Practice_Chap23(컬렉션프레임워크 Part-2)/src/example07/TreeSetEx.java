package example07;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		
		// TreeSet은 이진 트리를 기반으로 이루어진 컬렉션
		// Set 와  Sortset 을  인터페이스 구현한 클래스 이다 Sortedset 오름차순
		
		TreeSet<Integer> scores = new TreeSet<Integer>();
		
		// 객체 추가
		scores.add(87); // 자동 박싱
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		Integer score = null;
		System.out.println("==============");
		// 가장 낮은 정수를 구해보기 (이진트리의 가장 왼쪽의 값)
		System.out.println("가장 낮은 점수 : "+scores.first()); 
		// 가장 낮은 정수를 구해보기 (이진트리의 가장 오른쪽의 값)
		System.out.println("가장 높은 점수 : "+scores.last());
		
		System.out.println("==============");
		System.out.println();
		System.out.println("==============");
		
		// 주어진 객체의 왼쪽에 있는 정수 -- 주어진 객체는 포함하지 않는다.
		score = scores.lower(95);
		System.out.println("95 아래의 점수 : "+score);
		// 주어진 객체의 왼쪽에 있는 정수 -- 주어진 객체는 포함한다. 
		score= scores.floor(95);
		System.out.println("95 아래의 점수(95점도 포함) : "+score);
		// 객체의 참조만 할뿐 제거를 하지않음
		System.out.println("남은 객체수 : "+scores.size()); 
		
		
		System.out.println("==============");
		System.out.println();
		System.out.println("==============");
		
		
		// 주어진 객체의 오른쪽에 있는 정수 -- 주어진 객체는 포함하지 않는다.
		score = scores.higher(95);
		System.out.println("95 위 점수 : "+score);
		// 주어진 객체의 오른쪽에 있는 정수-- 주어진 객체는 포함한다. 
		score= scores.ceiling(95);
		System.out.println("95 위 점수(95점도 포함) : "+score);
		System.out.println("남은 객체수 : "+scores.size());
		
		System.out.println("==============");
		System.out.println();
		System.out.println("==============");
		
	
		
		while(!scores.isEmpty()) {
			// 맨 왼쪽 객체부터 가져온다 단, 가져온 후 treeSet에서 제거한다.
			System.out.println("pollFirst() 실행");
			score= scores.pollFirst();
			System.out.println("가져온 객체 : "+score); 
			System.out.println("남은 객체수 : "+scores.size()); 
		}
		
		scores.add(87); // 자동 박싱
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		System.out.println("==============");
		System.out.println();
		System.out.println("==============");

		while(!scores.isEmpty()) {
			System.out.println("pollLast() 실행");
			// 맨 오른쪽 객체부터 가져온다 단, 가져온 후 treeSet에서 제거한다.
			score= scores.pollLast();
			System.out.println("가져온 객체 : "+score); 
			System.out.println("남은 객체수 : "+scores.size()); 
		}
		
		System.out.println("==============");
		System.out.println();
		System.out.println("==============");
		
		scores.add(87); // 자동 박싱
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		Iterator<Integer> iterator = scores.iterator();
		
		while(iterator.hasNext()) {
			// pollFirst,pollLast메서드와 반복자의 가장 큰 차이점은
			// 객체를 제거하느냐의 차이점이 있다.
			// 반복자 에서는 명시적으로 remove() 호출해야 겍체가 제거가 된다.
			
			int value = iterator.next();
			iterator.remove();
			System.out.println(value+" 남은 객체수 : "+scores.size());
		}
		
		
		
		
		
	}

}
