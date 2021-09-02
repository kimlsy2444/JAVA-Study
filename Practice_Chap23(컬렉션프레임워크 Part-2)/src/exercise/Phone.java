package exercise;

public class Phone {
	
	private String name; // 이름 
	private String address; // 주소
	private String telNum; //전화번호 
	
	public Phone(String name, String address,String telNum) {
		
		this.name = name;
		this.address= address;
		this.telNum = telNum;

	}

	
	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getTelNum() {
		return telNum;
	}
	 
	@Override
	public String toString() {
	
		return     "이름 : "+this.name
			    +"\n주소 : "+this.address+
			  "\n전화번호  :"+this.telNum;
	}
	
	
	
	
}
