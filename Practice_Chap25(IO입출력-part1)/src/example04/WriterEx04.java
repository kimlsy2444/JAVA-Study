package example04;

import java.io.FileWriter;
import java.io.Writer;

public class WriterEx04 {

	public static void main(String[] args) throws Exception{

		Writer writer = new FileWriter("C:/test.txt");
		
		String str = "안녕하세요.지금 자바를 가르치고 있어요.";
		
		// 매개변수가 String 타입이다 .하여 String을 파일에 그대로 저장하게 된다
		//writer.write(str);
		
		writer.write(str,2,10); // 문자열 2번째 인덱스 부터 10 개의 문자를 파일로 저장
		writer.flush();
		System.out.println("파일 생성 완료");
		writer.close();
	}

}
