package example04;

public class Time {

	// 접근제어자 Access modifer 의 종류
	// private 같은 클래스 내에서만 접근 가능
	// protected 같은 패키지, 자손클래스에서만 접근 간으
	// default 같은 패키지 에서만 접근 가능함
	// public 누구나 다 접근 가능함
	
	
	// 프로그래밍을 할때,  멤버변수는 웬만하면 private접근 제어자로
	// 감싸주고 ,각  멤버변수에 해당하는 getter()를 제공해주는
	// 방법으로 클래스를 작성하는 방법이 올바르다.
	private int hour;
	private	int minute;
	private	int second;
	
	
	
	//getter() 멤버 변수의 값을 읽어가는 메서드
	//setter() 멤버 변수의 값을 수정하는 메서드
	
	public int getHour() {
		return this.hour;
	}
	public void setHour(int hour) {
		if(hour < 0 || hour >23)
			{
				System.out.println("시간 에러");
				return;
			}
		this.hour = hour;
	}
	
	
	public int getMinute() {
		return this.minute;
	}
	public void setMinute(int minute) {
		if(minute < 0 || minute >59)
		{
			System.out.println("분 에러");
			return;
		}
		this.minute = minute;
	}
	
	
	public int getSecond() {
		return this.second;
	}
	public void setSecond(int second) {
		if(second < 0 || second >59)
		{
			System.out.println("초 에러");
			return;
		}
		this.second = second;
	}
	
	
	@Override
	public String toString() {
		
		return this.getHour()+ "시 "+this.getMinute()+"분 "
				   +this.getSecond()+"초";
	}
	
	
	
	
}
