package example01;

import java.io.FileInputStream;
import java.io.InputStream;

public class inputStreamReadEx03 {

	public static void main(String[] args) throws Exception {
	
		InputStream iStream = new FileInputStream("C:/test.txt");
		
		int count;
		
		byte[] readBytes = new byte[8];
		
		// 시작 인덱스가 2 이고 3개만 읽어서 저장하는 코그 작성
		
		count =iStream.read(readBytes,2,4);
		System.out.println("읽은 바이트 수 : "+count);
		System.out.println();
		
		for(byte b : readBytes) {
			System.out.println("읽은 바이트 : "+(char)b);
		}
		
		iStream.close();

	}

}
