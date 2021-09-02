package example09;

public class Person implements Comparable<Person>{
	
	private String name;
	private int age;
	
	 public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}

	
//	@Override
//	public int compareTo(Person o) {
//		
//		if(this.age < o.age) {
//			return -1;
//		}
//		else if(this.age == o.age){
//			return 0;
//		}
//		
//		return 1;
//		
//		return  o.age - this.age;
//		
//		return this.age - o.age;
//
//	}

	
	// String 은 이미 Comparable을 구현했기 떄문에
	// 비교 정렬 메서드  compareTo 를 이용한다
	
	@Override
	public int compareTo(Person o) {
		
//		if(this.name.compareTo(o.name) < 1) {
//			return -1;
//		}
//		else if(this.name.compareTo(o.name) == 0) {
//			return 0;
//
//		}
//		return 1; 
		
		return this.name.compareTo(o.name) - o.name.compareTo(this.name);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
