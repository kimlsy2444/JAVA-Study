package example01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hashset {

	public static void main(String[] args) {
	
		Set <String> set = new HashSet<String>();
		
		System.out.println("사이즈 : "+ set.size());
		
		// Set 계열은 중복 저장이 안된다. 아울러 순서 유지를 하지도 않는다.
		// 
		set.add("Java");
		set.add("JDBC");
		set.add("JSP");
		set.add("iBATIS");
		System.out.println("======================");
		// Set 계열에는 null 값도 저장가능하지만 ,오직 한개만 가능하다.
		// set.add(null);
		
		System.out.println("사이즈 : "+ set.size());
		
		// 반복자를 set을 통해서 얻는다
		Iterator<String> iterator = set.iterator();
		// 가져올께 있냐? 있음 true, 없으면false리턴
		while(iterator.hasNext()) {
			String elemnet = iterator.next();// 객체를 가져오세요
			System.out.println(elemnet);
			// 반복자를 통해서 가져오면 Set 에서 객체들을 제거 하지 않는다.
			System.out.println("사이즈 : "+ set.size());
			
		}
		System.out.println("======================");
		set.remove("JDBC");
		set.remove("iBATIS");
		System.out.println("사이즈 : "+ set.size());
		System.out.println("======================");
	
	
		for(String str : set ) {
			System.out.println(str);
		}
		System.out.println("======================");
		
		set.clear();
		if(set.isEmpty()) {
			System.out.println("객체 없음");
		}
		else {
			System.out.println("객체 존재");
		}
		
		
		
		
		
	}

}
