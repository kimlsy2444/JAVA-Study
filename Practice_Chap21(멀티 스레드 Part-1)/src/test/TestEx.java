package test;

public class TestEx {

	public static void main(String[] args) {
		
		Test test = new Test();
		
		B B = new B();
		B.setB(test);
		B.start();
		
		
		A A = new A();
		A.setA(test);
		A.start();
		
		
	
	}

}
