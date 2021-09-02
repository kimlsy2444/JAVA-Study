package example01;

public class Student {

	// 인스턴스 멤버 변수를 선언함.
	private String name;
	private int age;
	
	// 클래스명과 생성자명이 반드시 같아야 한다.
	// 생성자는 리턴타입이 존재하지 않는다.(void 라는 것을 써주지 않는다)
	// 생성자가 하나도 없는 클래스는 기본적으로 컴파일시에 컴파일러가 알아서 
	// 기본 생성자를 추가해준다.
	// 그래서 모든 클래스는 기본생성자가 하나 있어야된다는 것을 지켜준다
	// 생성자가 많으면 많을수록 좋음~ 다양한 값을 실행 효율 겁
	
	public Student() {
		System.out.println("기본생성자 호출");
		return;
	}

	public Student(String name, int age) {
		System.out.println("매개변수가 있는 생성자 호출");
		this.age= age;
		this.name= name;
		//System.out.println(name+" : "+age);
		return;
	}
	
	
	public Student (String name) {
		System.out.println("name 만 있는 생성자 호출"); 
		this.name= name;
		return;
		
	}
	public Student (int age) {
		System.out.println("age 만 있는 생성자 호출"); 
		this.age= age;
		return;
	}

	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}
	
	
	public String toString() {
		return this.getName() + " : " +this.getAge();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
