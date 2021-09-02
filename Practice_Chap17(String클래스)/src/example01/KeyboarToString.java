package example01;

import java.io.IOException;

public class KeyboarToString {

	public static void main(String[] args) {
		
		byte[] bytes = new byte[100];
		
		System.out.print("입력 : ");
		// 키보드로 입력을 받는 메서드
		
		int readBytesNo = 0;
		
		
		try {
			// 키보드(표준입력) 으로부터 입력을 받고 그 내용을 bytes에 저장을 하고 
			// 입력받은 바이트 수를 리턴함.
			readBytesNo = System.in.read(bytes);
			// 문자셋 EUC-KR 디코딩 

			String str = new String(bytes,0,readBytesNo-2,"EUC-KR");
			//String str = new String(bytes,0,readBytesNo-2,"UTF-8");
			System.out.println(str);
			// abc 가나 했을때 9바이트가 나오는 이유 엔터키 가 2바이트를 차지하기 
			// 때문에 readBytesNo + 2바이트가 더 저장된다.
			System.out.println("입력 받은 바이트 수 : "+ readBytesNo);
			
			// 자바 문자의 기본형은 EUC 임
			//EUC-KR : 한글 2 byte 영어 1byte
			//UTF-8  : 한글 3 byte 영어 1byte
			
			//해당값은 순수하게 byte에 저장된 값만 출력
			byte[] b = str.getBytes("EUC-KR");
			System.out.println(b.length);
			
			
			
			// 인코딩과 디코딩의 과정에서 반드시 문자셋은 동일하게 가져가야
			// 글자가 깨지는 오류를 방지할 수 있다.
			
			byte [] b2 ="안녕하세요".getBytes("UTF-8");
			//String str1 = new String(b2,0,b2.length,"EUC-KR");
			String str1 = new String(b2,0,b2.length,"UTF-8");
			System.out.println(str1);
			
			System.out.println(b2.length);
			
		} catch (IOException e) {
			
		}

	}

}
