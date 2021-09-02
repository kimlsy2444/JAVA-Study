package dateExample;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		
		// Date 클래스는 TimeStamp 기능으로 많이 사용 된다.
		// 근태, 카드 사용 내역 ,로그 정보
		
		 Date today = new Date();
		 
		 // Date 클래스는 toString() 호출하면 세계표준 협정시 (UTC) 
		 // 형태로 출력이 됨
		 System.out.println(today); 
		 
		 // 사용자 지정으로 변경해줄려면 SimpleDateFormat 클래스 사용
		 SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 a hh :mm:ss");
		 
		 System.out.println(sDateFormat.format(today));
		
	}

}
