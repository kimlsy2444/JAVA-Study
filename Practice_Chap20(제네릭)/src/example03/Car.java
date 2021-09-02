package example03;

// 일반 클래스
public class Car {

	private String breandl;
	private int year;
	private int month;
	
	public Car() {
	
	}

	public String getBreandl() {
		return breandl;
	}

	public void setBreandl(String breandl) {
		this.breandl = breandl;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	
	
	public Car(String breandl, int year, int month) {
		
		this.breandl = breandl;
		this.year = year;
		this.month = month;
	}
	
	
}
