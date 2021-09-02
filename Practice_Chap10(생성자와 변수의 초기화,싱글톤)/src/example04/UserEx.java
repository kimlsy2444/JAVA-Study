package example04;



import java.util.Calendar;

import javax.xml.crypto.Data;

public class UserEx {

	public static void main(String[] args) {
	
		User user1 = User.getInstance();
		User user2 = User.getInstance();
		
		Calendar cal = Calendar.getInstance();
		
		System.out.println(cal.getTime());
		
		
		
		
		System.out.println(user1);
		System.out.println(user2);
		
		//Object 클래스의 equals()주소 비교 
		// 객체의 == 연산은 주소 값 비교연사 user1==user
		
		if(user1.equals(user2)) {
			
			System.out.println("같은 객체 임"); 
		}
		else {
			System.out.println("다른 객체임"); 
		}
	
		
		//싱글톤 패턴을 사용하는 이유
		// 단, 하나의 인스턴스를 생성해서 서로 공유하고자 원하고자 할때 사용
		// ex) 사용자 환경 설정 , 커넨셕풀, 스레드풀 OS의 시간 이나 날짜 등
	}
	

}
