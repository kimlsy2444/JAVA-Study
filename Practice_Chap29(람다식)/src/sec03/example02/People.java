package sec03.example02;

public class People {
	
	private String name;
	private int age;
	
	public People() {
		
		 System.out.println("기본 생성자 호출");
	}

	

	public People(String name) {
	 
		this.name = name;
		 System.out.println("People (String name) 생성자 호출");
	}
	
	public People(String name, int age) {
		 
		this.name = name;
		this.age = age;
		 System.out.println("People(String name, int age) 생성자 호출");
	}
	@Override
	public String toString() {
		 
		return this.name + " , " + this.age;
	}
	
}
