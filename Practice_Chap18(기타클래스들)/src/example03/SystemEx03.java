package example03;

import java.util.Properties;
import java.util.Set;

public class SystemEx03 {

	public static void main(String[] args) {
		
		String osName = System.getProperty("os.name");
		System.out.println("현재 운영 체제 : "+osName);
		
		String userName =	System.getProperty("user.name");
		System.out.println("사용자 이름 : "+userName);
		
		//Properties Map계열의 컬렉션이다. 그런데 String, String 갖는다
		// key도 String ,value도 String 이다
		
		Properties properties =  System.getProperties();
		
		// Map 컬렉션에서 키 값만 Set 계열로 가져오는 메서드 keySet()
		Set set =	properties.keySet();
		
		System.out.println("Key                            value");
		System.out.println("---------------------------------------");
		
		for(Object objkey : set) {
			String key = (String)objkey;
			String value = System.getProperty(key);
			System.out.println(key + "                            "+ value);
		}
	
	}

}
