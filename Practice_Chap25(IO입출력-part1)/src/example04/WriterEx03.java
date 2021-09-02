package example04;

import java.io.FileWriter;
import java.io.Writer;

public class WriterEx03 {

	public static void main(String[] args) throws Exception {

		
		Writer writer = new FileWriter("C:/test.txt");
		
		// 문자열 -> 문자 배열로 리턴
		char[] str= "신은혁이다".toCharArray();
		
		writer.write(str,1,4);
		
		writer.flush();
		System.out.println("파일 생성완료");
		writer.close();
	}

}
