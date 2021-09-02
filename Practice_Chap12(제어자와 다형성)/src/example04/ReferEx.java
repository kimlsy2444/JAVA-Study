package example04;

public class ReferEx {

	public static void main(String[] args) {
		
		Parent parent= new Chiled();
		Chiled chiled = new Chiled();
		
		System.out.println(parent.x); 
		System.out.println(chiled.x); 
		System.out.println(); 
		
		parent.method();
		chiled.method();
		System.out.println(); 
		
		parent.type(new Parent());
		parent.type(new Chiled());
		parent.type(new Car()); // Car와 Parent 는 상속 관계가 아니다.
		

	}

}
