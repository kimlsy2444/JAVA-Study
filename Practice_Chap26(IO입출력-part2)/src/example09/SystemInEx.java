package example09;

import java.io.InputStream;
import java.util.Arrays;

public class SystemInEx {

	public static void main(String[] args) throws Exception {
		
		// 콘솔로부터 입력을 받기 위해서 System.in 필드를 입력스트림에다가 
		// 대입을 한다.
		
		InputStream iStream = System.in;
		
		byte[] bArr = new byte[100];
		
		System.out.print("이름 : ");
		 
		// 키보드로 입려간 데이터를 bArr 배열에 저자하고
		// 읽은 바이트 수를 리턴을한다.
		int nameBytes = iStream.read(bArr);
		
		System.out.println(Arrays.toString(bArr));
		
		
		// 엔터키 (캐리지 리턴(13) , 라인피드(10)) 제외한 나머지를 문자열로 만든다.
		String name = new String(bArr,0,nameBytes-2);
		
		System.out.print("남길 말  : ");
		int comBytes = iStream.read(bArr);
		System.out.println(Arrays.toString(bArr));
		String comment = new String(bArr,0,comBytes-2);
		
		System.out.println("입력한 이름 : "+name);
		System.out.println("남길 말 : "+comment);
	}

}
