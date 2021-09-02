package example01;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamReadEx01  {

	public static void main(String[] args) throws Exception {
		
		// 다형성이 적용된 코드, 일반예외가 발생하는데 
		// 그 예외를 JVM에게 던지고 있다
		InputStream iStream = new FileInputStream("C:\\test.txt");
		int  readByte; // 읽은 바이트 수를 리턴 받는 변수
	
		
		// InputStream의 read()는 더이상 읽을게 없다면, -1값을 리턴한다.
		// 기본적으로 이클립스는 한글을 2바이트로 읽어 들인다.
		
		while((readByte = iStream.read())!=-1) {	
			System.out.println("읽은 바이트 수 : "+readByte);	// 아스키코드값 출력
			System.out.println("읽은 문자 : "+(char)readByte); // 강제 타입 캐스팅후 문자를 출력

		}
		iStream.close(); //리소를 듣음
		
	}

}
