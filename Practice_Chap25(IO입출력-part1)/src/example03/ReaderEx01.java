package example03;

import java.io.FileReader;
import java.io.Reader;

public class ReaderEx01 {

	public static void main(String[] args) throws Exception {
		
		// Reader클래스는 문자특호 ㅏ클래스로 써 
		// 하위 클래스인 FileReader 를 생성해서 대입 다형성
		Reader reader = new FileReader("C:/test.txt");
		
		int readData;
		
		// readData는 int 값으로 끝 2바이트(문자 2바이트 이니깐)에 저장된다
		
		while((readData = reader.read())!=-1) {
			// 문자출력(바이트 정보를 강제로 캐스팅)
			System.out.println("읽은 문자 : "+(char)readData);
			// 영문자 아스키코드
			// 한글은 유니코드 출력
			System.out.println("읽은 문자 : "+readData);	
		}

		//		while(true){
		//			readData = reader.read();
		//			if(readData==-1) {
		//				break;
		//			}
		//			
		//			System.out.println("읽은 문자 : "+(char)readData);
		//		}
		
		
		reader.close();
	}

	
	
}
