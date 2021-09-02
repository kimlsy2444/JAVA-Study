package example06;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedReaderEx {

	public static void main(String[] args) throws Exception {
		
		// 주스트림 바이트 기반
		InputStream iStream = System.in;
		
		// 보조스트림 첫번째는 바이트를 문자로 바꿔주는 InputStreamReader 연결함
		Reader reader = new InputStreamReader(iStream);
		
		// 보조 스트림 두번째는 속도 및 성능 향상 해주는 BufferedReader 연결함
		BufferedReader bReader = new BufferedReader(reader);
		
		
		System.out.print("입력 : ");
		// 보통, BufferedReader 보ㅗㅈ 스트림은 readLine() 사용하기위해 많이 사용
		// readLine() 은 한줄 단위로 읽어들인다.
		
		String lineString = bReader.readLine();
	
		System.out.println("출력 : "+ lineString);
	
		
		bReader.close();
		reader.close();
		iStream.close();
	}

}
