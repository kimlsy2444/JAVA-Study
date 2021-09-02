package example02;

public class A {
	A.B b = new A.B();
	A.C c = new A.C();

	public A(){
		System.out.println("==============================");
		System.out.println("외부 클래스 A의 생성자 호출");
		
		B b = new B(); // 가능한 이유 : 인스턴스 멤버클래스는 외부 클래스 A의 멤버 이다.
		System.out.println(b.a);
		b.method1();
		
		C c =  new C();
		System.out.println(c.a);
		System.out.println(C.c);
		
		c.method1();
		C.method2();
		// D d= new D(); // 메서드 내부에 선언 되어 있기 때문에 
		this.method();
		System.out.println("==============================");
		
	}
	
	
	
	// 인스턴스 멤버 클래스
	
	class B{
	
		int a = 10;
		public B(){
			
		System.out.println("중첩 클래스 B의 생성자 호출");
		
		} 
			
		 public void method1() {
			 
		 System.out.println("B클래스의 멤버 메서드 호출");
		 
		}  
		 
	}
	static class C{
		int a = 20;
		static int c= 30;
				public C(){
					System.out.println("정적 멤버클래서 C의 생성자 호출"); 
				}
		public void method1() {
			System.out.println("정적멤버클래스 C의 메서드 1 호출");
		}
		public static void method2() {
			System.out.println("정적멤버클래스 C의 메서드 2 호출");
		}
	}
	
	public void method() {
		// 메서드에 접근 하기위해서는 인스턴스가 필요한데 static은 바로 접근해야하기 때문에
		// 로컬클래스 안에는 절대로 static멤버가 못온다.
		class D{
			int a = 100;
			public D() {
				System.out.println("로컬클래스 D의 생성자 호출"); 

			}
			public void lmetgod() {
				System.out.println(this.a); 
				System.out.println("로컬클래스 D의 멤버 메서드 호출");
			}
		}
		D d = new D();
		d.lmetgod();
	}
	//로컬클래스는 메서드 내부에서만 생성 및 사용이 가능하다.
	
	
	
}
