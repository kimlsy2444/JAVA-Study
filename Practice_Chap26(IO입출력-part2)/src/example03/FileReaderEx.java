package example03;

import java.io.File;
import java.io.FileReader;

public class FileReaderEx {

	public static void main(String[] args)throws Exception {


		// xxxReader, xxxWriter 붙은 클래스들은 문자특화 기반 클래스 이다.
		// 동영상,사진,오디오등 이진 파일을 읽을 수 없다
		
		File file = new File("C:\\JAVA 작업\\Practice_Chap26(IO입출력-part2)\\src\\example03\\filses\\Feel Good 가사.txt");
		FileReader fiReader = new FileReader(file);
		
		
		
		int readCharNO;
		char[] cArr = new char[1000]; // 200 바이트 할당
		int i = 0;
		
		while((readCharNO = fiReader.read(cArr))!=-1) {
			
			String str = new String (cArr,0,readCharNO);
			System.out.println(str);
			i++;
		}
		
		System.out.write(13);
		System.out.println("루핑수 : "+i);
		
		fiReader.close();
	
	}

}
