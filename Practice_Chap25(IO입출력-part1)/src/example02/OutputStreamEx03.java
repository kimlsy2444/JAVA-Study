package example02;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamEx03 {

	public static void main(String[] args) throws Exception{

		
		OutputStream oStream = new FileOutputStream("C:/write.txt");
		byte[] data ="ABC이순신장군님".getBytes();
		
		System.out.println("data 바이트 크기 : "+data.length);
		
		oStream.write(data, 3, 12); // 시작인덱스가 3의 12개의 길이만큼 파일로 내보냄
		
		oStream.flush();
		
		System.out.println("파일 저장됨");
		
		
		oStream.close();
	}

}
