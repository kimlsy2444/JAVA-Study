package example03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		
		// key가 String 값이 Integer이다 .둘 다 객체 라는 것에 주목
		Map<String,Integer> map = new HashMap<String, Integer>();
		
		System.out.println("Map size : "+ map.size());
		// map은 중복된 키를 저장 하지 않는다.
		// "노지선" "이나경"은 2번씩 저장이 되었다.
		// 중복 저장이 될경우 마지막에 저장된 값으로 대체가 된다.(중요)
		map.put("신은혁",95);
		map.put("홍길동",90);
		map.put("동장군",80);
		map.put("홍길동",95);
		map.put("동장군",1000);
		System.out.println("Map size : "+ map.size());

		System.out.println("홍길동 : "+map.get("홍길동"));
		System.out.println("동장군 : "+map.get("동장군"));
		
		System.out.println("========================");
		
		// map 컬렉션에 있는 key값만 Set 계열로 바꾼다.
		
		Set<String> set = map.keySet();
		System.out.println("keySey() 아용해서 출력");
		
		Iterator<String> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			String key = iterator.next();
			// 반복자를 통해 얻은 key값을 가지고 값을 얻어온다.
			int value = map.get(key);
			System.out.println(key +" : "+value);
		}
		System.out.println("========================");
		
		//Map 컬렉션의 Map.Entry객체를 대상으로 Set 계열로 바꾼다.
		Set<Map.Entry<String, Integer>>entrySet =map.entrySet();
		
		System.out.println("entrySet() 아용해서 출력");
		
		Iterator<Map.Entry<String, Integer>>entryIterator	=entrySet.iterator();
		while(entryIterator.hasNext()) {
		Map.Entry<String, Integer> entry = entryIterator.next();
		String key = entry.getKey();  // 키값을 얻는다.
		int value = entry.getValue(); // 값을 얻는다.
		System.out.println(key+" : "+value);
	  }
		System.out.println("========================");
		
		// 전체 객체 삭제
		map.clear();
		System.out.println("MapEntry 수 : "+map.size());
		
	}

}
