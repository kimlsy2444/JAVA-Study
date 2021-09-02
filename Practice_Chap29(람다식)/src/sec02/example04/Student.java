package sec02.example04;

public class Student {
	
	private String name;
	private String address;
	private int englishScore;
	private int mathScore;
	
	
	public Student( String name, String address,int englishScore, int mathScore) {
		this.name = name;
		this.address = address;
		this.englishScore = englishScore;
		this.mathScore = mathScore;

	}


	public String getName() {
		return name;
	}


	public int getEnglishScore() {
		return englishScore;
	}


	public int getMathScore() {
		return mathScore;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}
	

	
}
