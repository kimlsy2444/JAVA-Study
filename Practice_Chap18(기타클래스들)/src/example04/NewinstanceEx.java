package example04;

interface  I{
	public void method();
}

class A implements I{
	@Override
	public void method() {
	System.out.println("A메서드호출");
		
	}
}

class B implements I{
	@Override
	public void method() {
		System.out.println("B메서드호출");
		
	}
}
public class NewinstanceEx {

	public static void main(String[] args) throws Exception {
		
		Class class1 = Class.forName("example04.A");
		I i1 = (I)class1.newInstance(); //동적객체 생성
		
	
		i1.method();
		
		
		Class class2 = Class.forName("example04.B");
		I i2 = (I)class2.newInstance(); //동적객체 생성
		
		i2.method();
	}

}
