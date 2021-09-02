package example06;

public class IndirectEx {
	public static void main(String[] args) {
		
		I i = new B();
		i.method();
		System.out.println();
		
		i = new C();
		i.method();

		A a = new A();
		System.out.println();
		
		a.method(new B());
		a.method(new C());
		a.method(i);
		
	}

}
