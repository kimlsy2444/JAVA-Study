package example08;
// 조상이 제네릭 타입이면 자손도 제네릭 타입이어야한다.

public class Student<T,M,C> extends Person<T,M>{

	private C c;

	
	public C getC() {
		return c;
	}

	public void setC(C c) {
		this.c = c;
	}
	
}
