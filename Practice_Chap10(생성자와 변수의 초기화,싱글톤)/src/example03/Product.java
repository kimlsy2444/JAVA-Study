package example03;

public class Product {

	
	static int number = 0;
	int countNo;
	//정적 초기화 블럭(1번만 실행됨)
	static {
		System.out.println("정적 초기화 블럭 호출됨 "); 
	}
	{
		System.out.println("인스턴스 초기화 블럭 호출됨");
		++number;
		this.countNo = Product.number;
	}
	
	public Product() {
		System.out.println("기본 생성자"); 
	}
	
	
	
}
