package example06;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedOutStreamEx {

	public static void main(String[] args)throws Exception {

		File file = new File("C:\\JAVA 작업\\Practice_Chap26(IO입출력-part2)\\src\\example06\\돈이 하게 했어.mp3");
		
		
		System.out.println(file.length()/1024 +"Kbyte");
		
		// 주 스트림 
		FileInputStream fInputStream = null;
		FileOutputStream fOutputStream = null;
		// 보조 스트림
		BufferedInputStream bInputStream = null;
		BufferedOutputStream bOutputStream = null;
		
		int dataCount = 0;
		long start = 0;
		long end = 0;
		byte[] bArr = new byte[10000];
		
		
		// 주 스트림에 보조스트림 연결(입력)
		fInputStream = new FileInputStream(file);
		bInputStream = new BufferedInputStream(fInputStream);
		
		// 주 스트림에 보조스트림 연결(출력)
		fOutputStream = new FileOutputStream("C:/Test/돈이 하게 했어.mp3");
		bOutputStream = new BufferedOutputStream(fOutputStream);
		
		// 읽고 저장하기 전 시간 저장
		start = System.currentTimeMillis();
		
		//1바이트씩 읽고 1바이트씩 저장 ㅈㄴ 오래걸림
//		while((dataCount = bInputStream.read(bArr))!=-1) {
//			
//			fOutputStream.write(bArr,0,dataCount);
//		}
		
		fOutputStream.flush();
		end = System.currentTimeMillis();
		
		System.out.println("버퍼 안쓰고 소요 시간 : " + (end - start)+"ms");
		
		System.out.println();
		// 읽고 저장하기 전 시간 저장
		start = System.currentTimeMillis();
				
		// BufferedOutputStream 사용시
		while((dataCount = bInputStream.read(bArr))!=-1) {
					
			bOutputStream.write(bArr,0,dataCount);
		}
				
		bOutputStream.flush();
		end = System.currentTimeMillis();
				
		System.out.println("버퍼 쓰고 소요 시간 : " + (end - start)+"ms");	
		
		
		
		
		// 자원 해제
		bOutputStream.close();
		bInputStream.close();
		fOutputStream.close();
		fInputStream.close();
		
		// 결론 : 배열을 사용해서 적절하게 저장공간을 주고 BufferedInputStream
		// BufferedOutputStream을 보조 스트림으로 연결하여 사용하면
		// 성능이 매우 향상된다.
	}

}
