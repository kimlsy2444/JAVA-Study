package example01;

public class Phone {

		// 필드 (멤버변수),외부로부터 접근 못하게 막는다.
		// protected 접근 제어자 : 같은 패키지에서 다 접근 가능 , 다른 패키지 내에서는 
		// 상속 받은 클래스 내에서만 접근 가능함 
		protected String model;
		private String color;
		private String company;
		 
		public Phone() {
			// TODO Auto-generated constructor stub
		}
		public Phone(String model, String color, String company) {
			super();
			this.model = model;
			this.color = color;
			this.company = company;
		}
		//getter()제공
		
		public String getModel() {
			return model;
		}
		public String getColor() {
			return color;
		}
		public String getCompany() {
			return company;
		};
		
		@Override
		public String toString() {
		String str = "모델 : " + this.getModel() + " , 색상 : " + this.getColor()
				+ " , 제조회사 : " + this.getCompany();
		
		return str;
		}
		
		
		
}
