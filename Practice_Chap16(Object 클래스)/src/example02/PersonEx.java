package example02;

import java.util.HashSet;

public class PersonEx {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 10;
		
		
		// 사용자 정의 클레스에서는 hash 시리즈들은 반드시 hashcode()와 equals() 오버라이딩을 해야
		// 중복저장이 안된다.
		HashSet hashSet = new HashSet();
		

	
		Person person1 =new Person("홍길동",50);
		Person person2 =new Person("홍길동",50);

		
		hashSet.add(person1);
		hashSet.add(person2);
		
		System.out.println("저장된 객체수 "+hashSet.size());
		
		
		
		System.out.println(person1.hashCode()); 
		System.out.println(person2.hashCode()); 
		
		
		System.out.println(person1); 
		System.out.println(person2); 
		
		
	}

}
