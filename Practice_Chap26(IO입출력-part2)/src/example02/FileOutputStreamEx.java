package example02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamEx {

	public static void main(String[] args)throws Exception {

		// 파일 복사를 하기위해 경로를 설정
		String oriFileName = "C:\\JAVA 작업\\Practice_Chap26(IO입출력-part2)\\src\\example02\\프로미스나인.jpeg";
		
		String tarFileName = "C:/Test/프로미스나인-송하영.jpg";
		
		File file = new File(oriFileName);
		//파일로부터 데이터를 복사 
		FileInputStream  fis = new FileInputStream(file); 
		// 복사한 파일 출력
		FileOutputStream fos = new FileOutputStream(tarFileName);
		
		int readByteCount;
		
		int i = 0;
		
		// 바이트 배열을 크게 잡을수록 복사시간이 빠라 진다는 사실을 알수 있다.
		byte[] bArr = new byte[100];
		
		// 현재 시점 저장
		long stratTime = System.currentTimeMillis(); 
		
		while((readByteCount = fis.read(bArr))!= -1) {
			
			// 읽은 바이트 수만큼 출력 스트림으로 보내는 것이다.
			fos.write(bArr, 0, readByteCount);
			i++;
		}
		fos.flush();
		// 복사 종료 시점
		long endTime = System.currentTimeMillis();
		System.out.println("총 루핑수 : "+i);
		System.out.println("복사 시간 : "+ (endTime - stratTime)+"ms");
		System.out.println("복사한 파일의 크기 : "+(file.length()/1024)+"Kbyte");
		
		
		fos.close();
		fis.close();
		System.out.println(file.getName()+"파일의 복사 완료");
	}

}
