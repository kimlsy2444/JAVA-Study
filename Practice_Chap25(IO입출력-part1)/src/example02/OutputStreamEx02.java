package example02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;

public class OutputStreamEx02 {

	public static void main(String[] args) throws Exception {
		
		// 파일로부터 출력스트림을 생성해서 대입을 하고 있다.
		OutputStream oStream = new FileOutputStream("C:/write.txt");
		//ABC가나다 문자열을 통해서 바이트 배열을 얻고 있다
		byte[] data ="ABC가나다".getBytes("UTF-8");
		//UTF-8 한글 3바이트로 생성함
		
		System.out.println("data바이트 배열 크기 : "+data.length);
		
		// 바이트 배열을 한번에 스트림에 보낸다.
		// 앞서서 본 write(int b) 이 메서드에 비해서 
		// 훨씬 효율적이다.
		oStream.write(data);
		
		System.out.println("저장완료");

		oStream.flush();
		
		// 출력으로 내보낸 파일인 write.txt파일을 읽어 들인다.
		
		InputStream iStream = new FileInputStream("C:/write.txt");
		
		int count = 0;
		byte[] readByte = new byte[9];
		
		int i=0;
		
		while((count = iStream.read(readByte))!=-1) {
		
			i++;
			String str = new String(readByte,"UTF-8");// 디코딩
			
			System.out.println("읽은 바이트수  : "+count);
			System.out.println("읽은 문자 : "+ str);
			
			
		}
		System.out.println("루핑수 : "+i);
		
		
		
		iStream.close(); 
		oStream.close();
		
		
	}

}
