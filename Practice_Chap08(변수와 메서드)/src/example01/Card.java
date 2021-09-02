package example01;

public class Card {
	// 인스턴스 변수 -- 반드시 인스턴스를 생성해야 접근 가능
	private String color;
	private String company;
	
	// static 변수 (정적,클래스변수)-- 인스턴스 생성 없이도 클래스면.static 변수명으로 접근 가능
	static int width = 100; // 카드의 폭
	static int height = 50; // 카드의 높이
	
	
	
	// 인스턴스 메서드
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public void show() {
		// 지역변수는 반드시 초기화
		// 메서드안에 static 변수를 사용 못한다 그이유는
		// static 의 특성은 인스턴스 생성없이도 얼마든지 접근 가능한데
		// 언제 인스턴스가 생성될지 모르기 때문에 이런 코드는 올바른 방법이아니다.
		//   static int i = 1;
		
		String color = this.color;
		String company = this.company;
		System.out.println(color+" "+company);
	}
	@Override
	public String toString() {
		
		return "card1 은 색상 : "+this.getColor()+" card1의 회사 : "+
		this.getCompany()+" 크기 : "+Card.height+" 폭 : "+Card.width;
		
	}
}
