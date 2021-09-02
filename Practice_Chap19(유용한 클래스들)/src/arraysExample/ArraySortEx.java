package arraysExample;

import java.util.Arrays;


// 사용자 정의 클래스는 정렬을 하기위해서는 Comparable 인터페이스를 구현해야됨// 안하면 에러발생
class Person implements Comparable<Person>{
	
	String name;
	int age;
	public Person(String name,int age) {
		this.name = name;
		this.age  = age;
		
	}
	@Override
	public int compareTo(Person o) {
		
		return this.age-o.age; // 나이순 오름차순
		//return o.age-this.age; // 나이순 내림차순
		//return this.name.compareTo(o.name); // 사전순 오름차순 정렬
		
		//return o.name.compareTo(this.name); // 사전순 내림차순 정렬
	}
	
	
	
}
public class ArraySortEx {

	public static void main(String[] args) {
		
		
		
		Person person1 =new Person("홍길동", 18);
		Person person2 =new Person("김길동", 9);
		Person person3 =new Person("서길동", 59);
		Person person4 =new Person("주길동", 38);
		Person person5 =new Person("고길동", 8);
		
		Person[] persons = {person1,person2,person3,person4,person5};
//		int index =Arrays.binarySearch(persons,person1);
//		System.out.println("person2 인스턴스가 있는 인덱스 : "+ index+" 이름: "+person1.name);
		
		Arrays.sort(persons);
		// 배열 검색 (binarySearch 반드시 sort하고 난뒤 해야된다)
		int index =Arrays.binarySearch(persons,person1);
		System.out.println("person2 인스턴스가 있는 인덱스 : "+ index+" 이름: "+person1.name);
		System.out.println();
		for(Person person : persons) {
			System.out.println("이름 : "+ person.name+", 나이 : "+person.age);
		}
		
		
		

		
		//기본형 타입가 String 클래스는 기본적으로 오름차순 정렬이 이루어진다.
		// String 는 인터페이스로 Comparable 가 자동 구현되어있음
		
		int[] arr = {55,-10,-9,0,100};
		// 오름차순 자동 정렬
		Arrays.sort(arr);
		System.out.println("기본형 타입 소팅후 : "+ Arrays.toString(arr));
		
		// 사전 가나다순 정렬
		String[] names = new String[] {"송하영","이채영","박지원","이나경"};
		Arrays.sort(names);
		System.out.println("String 타입 소팅후 : "+ Arrays.toString(names));
		
		
		
		
	}

}
