package example01;

// 상속을 하는 이유
// 1. 공통인 코드는 조상에서 관리
// 2. 개별적인 부분은 자손에서 따로 관리
// 3. 코드의  재사용성

// 상속은 직접적 관계


public class MoutianBicycle extends Bicycle {
	// 멤버 개수 5개
	String frame;
	int gear;
	int price;
	String sector;
		
	
	public void print() {
		System.out.println(this.id);
		System.out.println(this.brand);
		System.out.println(this.frame);
		System.out.println(this.gear);
		System.out.println(this.price);
		System.out.println(this.owner);
	}
	
	public static void main (String[] args) {
			MoutianBicycle moutianBicycle = new MoutianBicycle();
			moutianBicycle.id = 1111;
			moutianBicycle.brand = "LESPO";	
			moutianBicycle.frame="알류미늄";
			moutianBicycle.gear= 33;
			moutianBicycle.price=300000;
			moutianBicycle.owner = "이준성";
			
			
			moutianBicycle.print();
			
		
	}
}
