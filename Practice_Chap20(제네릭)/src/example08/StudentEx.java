package example08;

public class StudentEx {

	public static void main(String[] args) {
		
		// 필드의 다형성
		Person<String, String> person = new Student<String, String, Integer>();
		
		person.setKind("황인");
		person.setMode("전투 태세");
		
		System.out.println(person.getKind());
		System.out.println(person.getMode());
		
		System.out.println();
		
		Student<String, String,Integer> personStudent = new Student<>();
		
		personStudent.setKind("흑인");
		personStudent.setMode("방어 태세");
		personStudent.setC(100);

		System.out.println(personStudent.getKind());
		System.out.println(personStudent.getMode());
		System.out.println(personStudent.getC());
		
	}

}
