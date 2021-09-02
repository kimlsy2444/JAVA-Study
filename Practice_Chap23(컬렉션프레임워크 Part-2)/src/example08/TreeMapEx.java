package example08;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		
		
		TreeMap<Integer,String> scores = new TreeMap<Integer, String>();
		
		scores.put(87, "홍길동");
		scores.put(98, "신은혁");
		scores.put(75, "김연아");
		scores.put(95, "손연재");
		scores.put(80, "김삼순");
		
		Map.Entry<Integer, String> entry = null;
		
		entry = scores.firstEntry();
		System.out.println("가장 낮은 점수 : "+entry.getKey()+" - "+entry.getValue());
	
		
		entry = scores.lastEntry();
		System.out.println("가장 높은 점수 : "+entry.getKey()+" - "+entry.getValue());
		
		System.out.println("===============================");
		
		entry = scores.lowerEntry(95);
		System.out.println("(95미포함 )95점 바로 아래의 점수  : "+entry.getKey()+" - "+entry.getValue());
		
		entry = scores.higherEntry(95);
		System.out.println("(95미포함 )95점 바로 위의 점수  : "+entry.getKey()+" - "+entry.getValue());
		
		System.out.println("===============================");
		
		entry = scores.floorEntry(95);
		System.out.println("(95포함 )95점 바로 아래 점수  : "+entry.getKey()+" - "+entry.getValue());
		
		entry = scores.ceilingEntry(95);
		System.out.println("(95포함 )95점 바로 위 점수  : "+entry.getKey()+" - "+entry.getValue());
		
		System.out.println("===============================");
		
		while(!scores.isEmpty()) {
			
			entry = scores.pollFirstEntry();
			int value = entry.getKey();
			String str = entry.getValue();
			
			System.out.println("Key : "+value+" Value : "+str);
			System.out.println("남은 객체 : "+scores.size());
		}
		
		System.out.println("===============================");
		
		scores.put(87, "홍길동");
		scores.put(98, "신은혁");
		scores.put(75, "김연아");
		scores.put(95, "손연재");
		scores.put(80, "김삼순");
		
		while(!scores.isEmpty()) {
			
			entry = scores.pollLastEntry();
			int value = entry.getKey();
			String str = entry.getValue();
			
			System.out.println("Key : "+value+" Value : "+str);
			System.out.println("남은 객체 : "+scores.size());
		}
		
		System.out.println("===============================");
		
		scores.put(87, "홍길동");
		scores.put(98, "신은혁");
		scores.put(75, "김연아");
		scores.put(95, "손연재");
		scores.put(80, "김삼순");
		
		Set<Map.Entry<Integer,String>> entrySet = scores.entrySet();
		
		Iterator<Map.Entry<Integer, String>> iterator =	entrySet.iterator();
		
		while(iterator.hasNext()) {
			
			Entry<Integer, String> mapentry = iterator.next();
			
			int value = mapentry.getKey();
			String str = mapentry.getValue();
			
			//iterator.remove();
			
			System.out.println("Key : "+value+" Value : "+str);
			System.out.println("남은 객체 : "+scores.size());
			
			
		}
		//KeySet() 이용해서 출력하기
		System.out.print("===============================");
		
		
		
		
		
		
	}

}
