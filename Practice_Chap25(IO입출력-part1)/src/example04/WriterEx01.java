package example04;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Arrays;

public class WriterEx01 {

	public static void main(String[] args) throws Exception{
		
		
		Writer writer = new FileWriter("C:/test.txt");
		
		// toCharArray()는 문자열을 char[]로 리턴해준다.
		char[] str = "홍길동".toCharArray();
	
		
		for(int i =0;i<str.length;i++) {
			//한 문자씩 보내는형태
			writer.write(str[i]);
			System.out.println("루핑수 : "+i);
		}
		System.out.println("파일 출력 완료");
		
		// 강제로 버퍼를 비워준다
		writer.flush();
		
		writer.close();
	}

}
