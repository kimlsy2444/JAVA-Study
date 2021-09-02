package example02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class File_CoptEx {
	
	public static void main(String[] args) throws Exception{
		
		InputStream inputStream = new FileInputStream("C:/write.txt");
		OutputStream outputStream = new FileOutputStream("C:/write_복사본.txt");
		
		byte[] data = new byte[1000];
		int count = 0;
		
		while((count = inputStream.read(data))!=-1) {
			
			outputStream.write(data);
			System.out.println("읽은 바이트수 : "+count);
		}
		
		System.out.println("데이터 복사 완료");
		outputStream.flush();
		
		inputStream.close();
		outputStream.close();

	}

}

