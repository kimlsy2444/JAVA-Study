package example06;

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesEx {

	public static void main(String[] args) throws Exception {
		
		// Properties 객체는 key와 value 값을 String로 제한한 Map 컬렉션
		
		Properties properties = new Properties();
		//PropertiesEx와 동일한 곳에  properties 파일이 존재하므로 아래와 같이 패스를 알아오는 것이다.
		String path = PropertiesEx.class.getResource("database.properties").getPath();
		
		// 파일 경로 출력
		//System.out.println(path);
		// 한글로 파일 경로가 출력 되도록 디코딩하기
		path = URLDecoder.decode(path,"UTF-8"); // 한글이 3바이트
		//path = URLDecoder.decode(path,"EC-KR"); // 한글이 2바이트 그래서 깨짐
		System.out.println(path);
		System.out.println("============================");
		// database.properties 을 읽어드린다.
		properties.load(new FileReader(path));
		
		// key를 주고 value 을 읽어옴
		String driver = properties.getProperty("driver");
		System.out.println("driver : "+driver);
		
		String url = properties.getProperty("url");
		System.out.println("url : "+url);
		
		String username = properties.getProperty("username");
		System.out.println("username : "+username);
		
		String password = properties.getProperty("password");
		System.out.println("password : "+password);
		
		
	}

}
