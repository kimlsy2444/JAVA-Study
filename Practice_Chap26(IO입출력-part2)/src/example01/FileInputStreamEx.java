package example01;

import java.io.File;
import java.io.FileInputStream;

public class FileInputStreamEx {

	public static void main(String[] args) throws Exception {
		
		
		// '\' -> 이스케이프 문자이기 때문에 아래와 같이 '\\' 하거나 
		// '/' 하나로 표식을 해도 무방하다
		File file = new File("C:\\JAVA 작업\\Practice_Chap26(IO입출력-part2)\\src\\example01\\FileInputStreamEx.java");
		
		System.out.println("파일의 경로 : "+file.getPath());// 파일 경로 얻기
		System.out.println("부모 디렉토리 : "+file.getParent());
		System.out.println("실행 가능한가 : "+file.canExecute());
		System.out.println("읽기 가능한가 : "+file.canRead());
		System.out.println("숨김 파일인가 : "+file.isHidden());
		System.out.println("쓰기나 수정이  가능한가 : "+file.canWrite());
		System.out.println("파일 이름 : "+file.getName());
		System.out.println("파일 크기 : "+file.length());
		System.out.println("URI 출력 형태 : "+file.toURI());
		
		// toURL() 는 사용금지 되었다.
		//System.out.println("URL 출력 형태 : "+file.toURL());
		
		
		
		
		
		
		// 생성자의 매개변수로 file 객체를 받고 있다
		FileInputStream fis = new FileInputStream(file);
		//FileInputStream fis = new FileInputStream("C:\\JAVA 작업\\Practice_Chap26(IO입출력-part2)\\src\\example01\\FileInputStreamEx.java");
		
		
		int data;
		int i = 0;
		byte[] bArr = new byte[1000];
		
		// 한 바이트 씩 읽기
		while((data = fis.read(bArr))!= -1) {
			
			// 아래를 실행하면 한글이 깨준다 1바이트씩 읽기 때문
			//System.out.print((char)data);
			
			// 콘솔 출력(원래 System.out.println() 사용 해도 무방하나,
			// 1바이트씩 읽다 보니 한글이 꺠지기 때문에  write()써도 괜찮다.
			// write() 도 출력 스트림 이기 때문에 가능한 것이다.
			System.out.write(bArr);
			i++;
			
		}
		// 불필요한 반복이 있기 때문에 바이트[] 로 받는게 좋다
		System.out.println("루핑수 : "+ i);
		 
		
		fis.close();
	}

}
