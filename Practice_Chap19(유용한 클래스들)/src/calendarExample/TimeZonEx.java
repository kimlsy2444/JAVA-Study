package calendarExample;

import java.util.Calendar;
import java.util.TimeZone;

public class TimeZonEx {

	public static void main(String[] args) {
		
		String[] timezone = TimeZone.getAvailableIDs();
	
//		for(String zoneID : timezone) {
//			System.out.println("Á¸ ¿µ¿ª "+ zoneID);
//		}
//		
		TimeZone  tz = TimeZone.getTimeZone("America/Santoago");
		Calendar today = Calendar.getInstance(tz);
		

		System.out.println(tz);
		
		
		
		
		
	}
	

}
