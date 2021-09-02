package example04;

public class PersonEx {

	public static void main(String[] args) {
		
	Person<Integer> p1 = Util.<Integer>changing(new Integer(100));
		

		int value = p1.getT();
		System.out.println("Person 객체가 가지고 있는 값 : "+value);
		
		Person<String> p2 = Util.changing("홍길동");
		
		String str = p2.getT();
		System.out.println("Person 객체가 가지고 있는 값 : "+str);
	}

}
