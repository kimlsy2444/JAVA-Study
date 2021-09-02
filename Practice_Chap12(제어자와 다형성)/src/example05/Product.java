package example05;

public class Product {

	int price; // 제품 가격
	int bounsPoint; // 제품 구매시 적립금
	public Product(int price) {
		
		this.price= price;
		//적림금은 제품 가격의 10%적립
		this.bounsPoint = (int)(price/10.0);
	}
	
}
