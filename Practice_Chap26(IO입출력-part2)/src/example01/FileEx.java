package example01;

import java.io.File;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileEx {

	public static void main(String[] args) throws Exception{
		
		
		// 아래의 코드를 실행 한다고 해서 Temp/directory 폴더를 만들지 않는다.
		
		File directory = new File("C:/Test/directory");
		//File directory = new File("C:/directory");
		File file1 = new File("C:/Test/file1.txt");
		File file2 = new File("C:/Test/file2.txt");
		File file3 = new File(new URI("file:///C:/Test/file3.txt"));
	
		// URI 객체 : 문자열 전송과 조작을 위한 프로토콜
		// URL 객체 : 네트워크 전송을 위한 프로토콜 
		// 프로토콜 : 통신 규약 (TCP/IP/UDP..)
		// URI 는 통합자원 식별자는 인터넷에 있는 자원을 나타내는 유일한 주소를 의미한다.
		
		
		// URI 사용 예
//		String uriName = "http://www.gogle.co.kr";
//		URI uri = new URI(uriName);
//		System.out.println(uri);
		
		
		
		// directory폴더가 존재하느냐?
		if(directory.exists() == false) {
			// 부모 디렉토리가 없으면 자기 자신의 폴더를 만들고
			// 부모가 있다면 그안에 자신의 폴더를 만든다.
			// 단 부모 폴더가 없는데 경로를 부모를 주었다면 폴더는 만들어지지 않는다.
			//directory.mkdir();
			
			// 경로상 없는 디렉토리를 다 생성한다(권장 방법) 
			directory.mkdirs();
		}
		
		if(file1.exists() == false) {
			
			// 만약에 C://Test폴더가 없다면 IOException를 만든다.
			file1.createNewFile();
			System.out.println("file1.txt 가 생성 되었습니다.");
		}
		if(file2.exists() == false) {
			
			// 만약에 C://Test폴더가 없다면 IOException를 만든다.
			file2.createNewFile();
			System.out.println("file2.txt 가 생성 되었습니다.");
		}
		
		if(file3.exists() == false) {
			
			// 만약에 C://Test폴더가 없다면 IOException를 만든다.
			file3.createNewFile();
			System.out.println("file3.txt 가 생성 되었습니다.");
		}
		
		File tmp = new File("C:/Test");
		// tmp 서브 디렉토리 및 파일을 파일 배열로 만들어서 출력하기
		
		File[] contents = tmp.listFiles();
		SimpleDateFormat sdf  = new SimpleDateFormat("yyy-MM-dd a HH:mm");
		System.out.println("날짜 \t시간 \t\t  형태 \t 크기 \t  이름");
		System.out.println(sdf.format(new Date()));
		System.out.println("===================================");
		for(File file : contents) {
			System.out.print(sdf.format(new Date(file.lastModified())));
			// file 이 디렉토리냐?
			if(file.isDirectory()) {
				// 디렉토리 이름을 출력한다.
				System.out.println("\t <DIR>\t\t"+file.getName());
			}
			// file 이면...
			else {
				// 파일의 크기와 이름을 출력한다.
				System.out.println("\t\t "+file.length()+"\t"+file.getName());
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
