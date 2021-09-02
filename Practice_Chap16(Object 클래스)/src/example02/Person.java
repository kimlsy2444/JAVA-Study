package example02;

import java.util.Objects;

public class Person {

	private String name;
	private int age;
	public Person(String name,int age) {
	
		this.name= name;
		this.age = age;
		
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	// hash 시리즈들은 동등 객체를 판단하기 위해서 1차적으로 hashcade() 호출
	
	@Override
	public int hashCode() {
		System.out.println("hashcode()");
		//return this.name.hashCode() + this.age; // 하위호환
		return Objects.hash(this.name,this.age);  // 신규 개발 
	}
	// 자처즉으로 값이 또 같은 equals() 호출
	@Override
	public boolean equals(Object obj) {
	
		System.out.println("equals()");
		
		
		if(obj instanceof Person) {
			Person person = (Person)obj;
			if((this.name.equals(person.name)) && (this.age == person.age) ){
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		
		return "이름 : "+this.getName() + "\n" + "나이 : "+this.getAge();
	}
	
}
