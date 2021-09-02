package example01;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamReadEx02 {

	public static void main(String[] args) throws Exception{

		
		InputStream istStream = new FileInputStream("C:/test.txt");
		
		int readBtyeNo;
		
		byte[] b = new byte[2];
		
		while( (readBtyeNo  = istStream.read(b))!=-1) {
			
			System.out.println("읽은 바이트 수 : "+readBtyeNo);
			//String클래스로 반드시 디코딩해야 한글로 표시된다.
			String str = new String(b);
			System.out.println("읽은  문자열 : "+str);
		}
		istStream.close();
	}

}
