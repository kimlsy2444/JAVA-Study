package example07;

import java.util.Arrays;

public class WildCardEx {
	//? 는 어떠한 객체도 다 받겠다.
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName()+"수강생 : "
						+ Arrays.toString(course.getStudents()));
	}
	// Student 이거나 Student 를 상속받는 클래스(상위 타입 제한)
	public static void registerCourseStudnet(Course<? extends Student> course) {
		System.out.println(course.getName()+"수강생 : "
						+ Arrays.toString(course.getStudents()));
	}
	
	// Worker 클래스 이거나 상위 클래스들만 들어 올수 있다.(관계있는 하위 타입 제한 )
	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName()+"수강생 : "
						+ Arrays.toString(course.getStudents()));
	}
	public static void main(String[] args) {
	

		
		// 직접 Course 생성을 해서 확인하는 과정
		
		Course<Person> perCourse = new Course<Person>("일반인 과정",3);
		
		perCourse.add(new Person("일반인1"));
		perCourse.add(new Person("킹반인2"));
		perCourse.add(new Person("킹받네3"));
		
		registerCourse(perCourse);
		//registerCourseStudnet(perCourse); // 조상 상위 클레스
		registerCourseWorker(perCourse);
		System.out.println();
		
		Course<Worker> WCourse = new Course<Worker>("작장인 과정",3);
		WCourse.add(new Worker("김대리"));
		WCourse.add(new Worker("이과장"));
		WCourse.add(new Worker("김차장"));
	
		registerCourse(WCourse);
		//registerCourseStudnet(WCourse); // 관계가 없는 클래스
		registerCourseWorker(WCourse);
		System.out.println();
		
		Course<Student> sCourse = new Course<Student>("학생 과정",3);
		sCourse.add(new Student("이채영"));
		sCourse.add(new Student("장규리"));
		sCourse.add(new Student("송하영"));
		
		registerCourse(sCourse);
		registerCourseStudnet(sCourse); 
		//registerCourseWorker(WCourse); // 관계없는 클래스
	
		
	}

}
