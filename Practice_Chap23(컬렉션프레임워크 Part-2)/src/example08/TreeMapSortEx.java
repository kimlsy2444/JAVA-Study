package example08;

import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapSortEx {

	public static void main(String[] args) {
		
		
		TreeMap<Integer,String> scores = new TreeMap<Integer, String>();
		
		scores.put(87, "홍길동");
		scores.put(98, "신은혁");
		scores.put(75, "김연아");
		scores.put(95, "손연재");
		scores.put(80, "김삼순");
		
		// 정렬하기(key의 값으로 정렬이 되는것을 주목)
		// 내림차순
		NavigableMap<Integer, String> descendingMap = scores.descendingMap();
		// 내림차순이 된 descendingMap 을 entrySet() 을통해서 Set 으로 대입하고있다.
		// 반복자로인한 호출을 
		Set<Map.Entry<Integer, String>>  descendingentrySet =  descendingMap.entrySet();
		// 출력하기
		for(Map.Entry<Integer,String> entry : descendingentrySet) {
			
			int value = entry.getKey();
			String str= entry.getValue();
			
			System.out.println("Key : "+value+" "+"Value : "+str);
		}
		System.out.println("=====================");
		
		// 다시 오름 차순으로 정렬하기
		
		NavigableMap<Integer, String>  ascendingentryMap = descendingMap.descendingMap();
		Set<Map.Entry<Integer, String>>  ascendingentrySet =  ascendingentryMap.entrySet();
		
		
		for(Map.Entry<Integer,String> entry : ascendingentrySet) {
			
			int value = entry.getKey();
			String str= entry.getValue();
			
			System.out.println("Key : "+value+" "+"Value : "+str);
		}
		
		System.out.println("=====================");
		
		
		// 키만 가져와서 반복자로 출력
		NavigableSet<Integer> keySet = scores.descendingKeySet();
		
		Iterator<Integer> iterator = keySet.iterator();
		
		
		while(iterator.hasNext()) {
			
		
			int value= iterator.next();
			String str = scores.get(value);
			
			System.out.println("Key : "+value+" "+"Value : "+str);
			
		}
		
		
		
		
		
		

	}

}
