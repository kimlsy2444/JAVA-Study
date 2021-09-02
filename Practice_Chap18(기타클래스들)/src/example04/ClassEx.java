package example04;

public class ClassEx {

	public static void main(String[] args) {
	
		
		// 객체로부터 클래스 정보를 얻는 방법 (getClass()- Object클래스)
		Person person = new Person();
		
		Class class1 = person.getClass();
		// 패키지명을 포함한 클래스 명을 리턴함
		System.out.println(class1.getName());
		// 클래스명만 리턴함
		System.out.println(class1.getSimpleName());

		System.out.println();
		
		// 문자열로 부터 객체의 정보를 얻는 방법(Class.forName())
		
	
		try {
			Class class2 = Class.forName("example04.Person");
			System.out.println(class2.getName());
			System.out.println(class2.getSimpleName());
		} catch (ClassNotFoundException e) {e.printStackTrace();}
		
		
	}

}
