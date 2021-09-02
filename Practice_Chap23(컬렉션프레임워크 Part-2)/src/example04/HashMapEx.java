package example04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
	
		Map<Student,Integer> map = new HashMap<Student, Integer>();
		
		// 키 객체가 동등 객체 라면 중복 저장 하지 않는다.  map 의 특징
		map.put(new Student(1001,"홍길동"),95);
		map.put(new Student(1001,"홍길동"),90);
		map.put(new Student(2001,"신은혁"),100);
		map.put(new Student(3001,"김주성"),58);
		
		System.out.println("총 Entry : "+map.size());
		// 뒤에 저장된것으로 대체 된다. 덮어씌어진다.
		System.out.println("홍길동 : "+map.get(new Student(1001,"홍길동")));
		
		Set<Student> keyset = map.keySet();
		
		Iterator<Student> keyIterator = keyset.iterator();
		
		while(keyIterator.hasNext()) {
		Student key = keyIterator.next();		
		System.out.println("학번  : "+key.getSno()+ " "+" 이름 : "+key.getName()
							+"점수 : "+map.get(new Student(key.getSno(),key.getName()) ) );
		}
		
		
	}

}
