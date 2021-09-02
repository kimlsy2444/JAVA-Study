package example01;

public class StudentEx {

	public static void main(String[] args) {
		
		
		Student student1 = new Student();
		
		Student student2 = new Student("이준성",24);
		
		Student student3 = new Student("이준성");
		
		Student student4 = new Student(24);
		
		System.out.println(student1); 
		System.out.println();
		
		System.out.println(student2);
		System.out.println();
		
		System.out.println(student3);
		System.out.println();
		
		System.out.println(student4); 
		
		
		
		
	}

}
