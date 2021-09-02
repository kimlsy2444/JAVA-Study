package example05;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

public class BufferedInputStreamEx {

	public static void main(String[] args) throws Exception {

		long start = 0;
		long end = 0;
		
		File file = new File("C:\\JAVA 작업\\Practice_Chap26(IO입출력-part2)\\src\\example05\\돈이 하게 했어.mp3");
		// 바이트 기반으로 속도의 차이를 보기 위한 프로그램 작성
		FileInputStream fStream1 = new FileInputStream(file);
	
		System.out.println("파일 크기 : "+file.length());
	
		System.out.println("바이트 기반 읽기 시작");
		
		start = System.currentTimeMillis();
		// 읽기만 한다.
		
		while((fStream1.read() != -1)) {}
		System.out.println("바이트 기반 읽기 종료");
	
		// 5초 소요됨
		end = System.currentTimeMillis();
		System.out.println("버퍼를 사용 하지 않았을 때 (바이트 기반 ) :  "+(end-start)+"ms");
		
		fStream1.close();
		System.out.println();
		
		// 주 입력스트림 FileInputStream 에다가 속도 및 성능 향상
		// 보조 스트림은 BufferdInputStream을 연결한다.
		// 실질적을 file을 읽어오는 스트림은 주 스트림
		// 그 데이터를 빨리 처리 해주는 역할이 바로 보조 스트림  BufferedInputStream 이다
		
		FileInputStream fStream2 = new FileInputStream(file);
		BufferedInputStream bStream = new BufferedInputStream(fStream2);
		
		start = System.currentTimeMillis();
		
		System.out.println("버퍼 기반 읽기 시작");
		
		while(bStream.read()!= -1) {}
		
		// 0.011초 소요됨 
		System.out.println("버퍼 기반 읽기 종료");
		end = System.currentTimeMillis();
		
		
		System.out.println("버퍼를 사용했을 때 (버퍼 기반 ) :  "+(end-start)+"ms");
		
		bStream.close();
		fStream2.close();
		
	}

}
