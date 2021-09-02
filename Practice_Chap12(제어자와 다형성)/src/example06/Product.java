package example06;

// 조상클래스
public class Product {

	private int proudctID;
	private String description;
	private String maker;
	private int	price;
	public Product(int proudctID, String description, String maker, int price) {
		super();
		this.proudctID = proudctID;
		this.description = description;
		this.maker = maker;
		this.price = price;
	}
	
	
	public int getProudctID() {
		return proudctID;
	}
	public String getDescription() {
		return description;
	}
	public String getMaker() {
		return maker;
	}
	public int getPrice() {
		return price;
	}
	
	public void showInfo() {
		System.out.println("상품 ID >> " + (this.getProudctID() + 1));
		System.out.println("상품 설명 >> " + (this.getDescription()));
		System.out.println("생산자 >> " + (this.getMaker()));
		System.out.println("가격 >> " + (this.getPrice()));
	}
	
	
}
