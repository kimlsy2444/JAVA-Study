package example05;
//독립 클래스
public class Buyer {

	int money = 1000;	//소유금액
	int bonusPoint = 0; // 적립금
	
	
	//여기서 매개변수 Producet 타입이 왔다는것은 무엇을 의미하는가?
	// Product 와 상속관계에 있는 자손들을 사용 할 수 있게된다. (매개변수의 다형성)
	public void buy(Product p) {
		if(this.money<p.price) {
			System.out.println("잔액이 부족합니다."); 
			return;
		}
		this.money -= p.price;
		this.bonusPoint +=p.bounsPoint;
		System.out.println(p + "를 구매하셨습니다.");   
	}

	
	
	
	// 아래와 같이 프로그램을 하다보면 코드의 길이는 무한대가되면 아주 비효율적인 반복이다.
//	public void buy(TV tv) {
//		if(this.money<tv.price) {
//			System.out.println("잔액이 부족합니다."); 
//			return;
//		}
//		this.money -= tv.price;
//		this.bonusPoint +=tv.bounsPoint;
//		System.out.println(tv + "를 구매하셨습니다.");   
//	}
}
