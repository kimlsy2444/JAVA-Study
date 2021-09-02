package example06;

public class CompareEx {

	public static void main(String[] args) {
		
	int result = Compare.compare(200, 200);
	System.out.println(result);
	
	// String클래스는 Number 클래스 하고는 아무런 관계가 없다.
	//Compare.compare("이준성", 100);
	
	// Number 클래스는 Objcet클래스의 자손이기 때문에 매개변수 타입으로 적합하지 않다.
	//Compare.compare(new Object(),new Object());
	
	 result = Compare.compare(new Integer(100), new Double(75.11));
	 System.out.println(result);
	 
	 // Number 는 추상클래스 이므로 인스턴스를 생성하지 못한다.
	 //result = Compare.compare(new Number(), new Number());
	 System.out.println(result);
	}

}
