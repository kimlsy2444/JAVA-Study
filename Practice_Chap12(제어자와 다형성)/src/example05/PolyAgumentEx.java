package example05;

public class PolyAgumentEx {

	public static void main(String[] args) {
		
		Buyer buyer = new Buyer();
		
		// 필드의 다형성
		Product p1 = new TV();
		Product p2 = new Audio();
		Product p3 = new Computer();
		
		Product[] pArray = new Product[10];
		
		buyer.buy(p1);
		buyer.buy(p2);
		buyer.buy(p3);
		
		buyer.buy(new TV());
		buyer.buy(new Audio());
		buyer.buy(new Computer());
		// buyer.buy(new Apple()); //컴파일 예외가 발생하는 이유
		// 다형성의 개념이 적용되기 위해서는 상속 관계가 되야하기 때문에 
		// 사용하려면 Aplle클래스에  Product 를 상속 해주던가 buy매서드에 오버로딩을 해야한다.
		System.out.println("남은 잔액 : " + buyer.money + "원 입니다");
		System.out.println(" 적립금 : " + buyer.bonusPoint + "원 입니다");
	}

}
