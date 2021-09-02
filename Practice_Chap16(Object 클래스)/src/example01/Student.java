package example01;

import java.util.Arrays;

public class Student {

	int age;
	String name;
	int[] subject; 
	
	public Student(int age, String name, int[] subjcet) {
		this.age = age;
		this.name = name;
		this.subject = subjcet;
		
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals()");
		
		// 타입변환 가능한지 여부를 알아보기위해서 instanceof연산자를 이용 서로 상속관계 유무 확인
		if(obj instanceof Student) {
			Student student = (Student)obj;
			// 논리적 동등을 위해서 조건문 설정 , age와 name이 다 같다라는 의미
			boolean result = Arrays.equals(this.subject,student.subject);
			//System.out.println(result);
			
			if((this.age == student.age)&&(this.name.equals(student.name)) && result) {
				return true;
			}
				
		}
		return false;
	}
}
