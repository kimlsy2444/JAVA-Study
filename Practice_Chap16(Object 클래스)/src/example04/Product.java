package example04;

import java.util.Arrays;

// 클래스의 복제가 가능하게 하려면 java.lang.Cloneable 인터페이스를 구현해야한다
// 이클래스가 복제가 됨을 알려기위함
public class Product implements Cloneable{

	 private String id;
	 private String name;
	 private int price;
	 private int [] arr;
	 private Apple apple;
	 
	 
	 
	public Product(String id, String name, int price, int[] arr,Apple apple) {
		
		this.id = id;
		this.name = name;
		this.price = price;
		this.arr =arr;
		this.apple = apple;
	}



	public String getId() {
		return id;
	}



	public String getName() {
		return name;
	}



	public int getPrice() {
		return price;
	}
	
	public int[] getArr() {
		return this.arr;
	}
	
	public Apple getApple() {
		return this.apple;
	}
	
	@Override
	public String toString() {
		
		return "상품 id : " + this.getId() + "\n"+
			   "상품 이름: " + this.getName()+ "\n"+
			   "상품 가격: " +this.getPrice()+"\n"+
			   "배열 값 : "+ Arrays.toString(this.arr)+"\n"+
			   "Apple 값 : "+ this.apple.price;
				
			
	}
	

	 
	public Product getProduct() {
		
		Product cloned = null;
		
		try {
			//얕은 복제가 여기서 일어난다.(참조변수의 값들은 번지공유)
			cloned = (Product)this.clone(); // objcet 클래스
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cloned;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// 먼저 얕은 복제를 호출(기본형 타입 복제위함)
		Product cloned =(Product)super.clone(); // Objcet 클래스의 의 clone;
		// 참조타입들을 복제하는 코드
		cloned.arr = Arrays.copyOf(this.arr,this.arr.length); // 배열 복제
		cloned.apple = new Apple(this.apple.price); // 클래스 복제
		
		return cloned;
	}

}
