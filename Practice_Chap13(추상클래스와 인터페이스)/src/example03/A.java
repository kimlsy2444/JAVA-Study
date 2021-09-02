package example03;


// 인터페이스의 본질 추상 메서드 ,static final 은 부수적 개념
public interface A {
	int max = 10; // static final 생략 가능, 컴파일시에 컴파일러가 붙여준다
	public void method(); // public abstract 샹략가능, 컴파일시에 컴파일러가 붙여준다
	
}
