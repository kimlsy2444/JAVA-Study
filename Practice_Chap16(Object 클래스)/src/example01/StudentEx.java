package example01;

public class StudentEx {
	public static void main(String[] args) {
	
		Student student1 = new Student(24,"송하영",new int [] {100,90});
		Student student2 = new Student(24,"송하영",new int [] {100,90});
		
		System.out.println(student1.equals(student2));
	}
}
