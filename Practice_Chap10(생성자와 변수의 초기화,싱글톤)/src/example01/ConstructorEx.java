package example01;

//하나의 자바 파일에서 public 을 붙일수있는 클래스는 단한개~
// A클래스는 기본생성자를 만들지않고 자동으로 생성해준다.
class A{
	int vale;
}
class B{
	int vale;
	public B() {
	}
	public B (int vale){
		this.vale = vale;
	}
}

public class ConstructorEx {

	A a = new A();
	// 컴파일 예외를 잡는 방법 
	// 1. B클래스에 기본생성자를 추가
	// 2. B클래스 생성자 호출시 매개변수 값으로 int 값을 지정 해준다.
	B b = new B(4);
	
	
	public static void main(String[] args) {
		

	}

}
