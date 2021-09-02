package example02;

import java.util.Objects;

public class Member {
	
	private String name;
	private int age;
	
	public Member(String name,int age) {
		
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	// 논리적 동등 객체의 조건 
	// 1. 해쉬코드가 같아야 한다. (hashcode() 재정의 필요)
	// 2. 두 개의 객체의 멤버 변수의 값들이 같아야 한다(equlse()를 재정의 필요)
	
	
	@Override
	public int hashCode() {
		System.out.println("해쉬 코드 호출");
		return Objects.hash(this.name,this.age);
	}
	
	
	@Override
	public boolean equals(Object obj) {
		// instanceof obj 가  Member 의 조상이냐?
		if(obj instanceof Member) {
			Member member  = (Member) obj;
			return (member.name.equals(this.name))&&(member.age == this.age);
		}
		else {
			return false;
		}
	}
	
	// 하위 호환을 위한 해쉬코드 재정의 방법
//	@Override
//	public int hashCode() {
//		System.out.println("해쉬 코드 호출");
//		return this.name.hashCode()+this.age;
//	}

}
