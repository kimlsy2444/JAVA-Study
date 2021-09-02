package example04;

import java.io.FileWriter;
import java.io.Writer;

public class WriterEx02 {

	public static void main(String[] args) throws Exception {

		Writer writer = new FileWriter("C:/test.txt");
		char[] str = "신은혁".toCharArray();
		
		// writer() 의 메개변수 타입이 문자 배열이다
		// write(int b) 보다 훨씬 효율적이다
		writer.write(str);
		
		
		writer.flush();
		System.out.println("파일 생성 완료");
		writer.close();
	
	}

}
