package formatExample;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SlmpleDataFormatEx {

	public static void main(String[] args) {
	
		// 저장되는 한순간의 시간 
		Date date = new Date();
		
		System.out.println(date.toString());
		// 20-07-22
		
		SimpleDateFormat sFormat = new SimpleDateFormat("yy-MM-dd E 요일 a hh:mm:ss");
		System.out.println(sFormat.format(date));
		
		sFormat = new SimpleDateFormat("오늘은 E요일");
		System.out.println(sFormat.format(date));
		
		//년도기준 365
		sFormat = new SimpleDateFormat("오늘은 올해의 D째 날");
		System.out.println(sFormat.format(date));
		// 월기준 24
		sFormat = new SimpleDateFormat("오달은 d번째 날");
		System.out.println(sFormat.format(date));
		
		// 타임존 
		sFormat = new SimpleDateFormat("z");
		System.out.println(sFormat.format(date));
		
	}

}
