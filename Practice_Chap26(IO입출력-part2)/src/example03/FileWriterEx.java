package example03;

import java.io.File;
import java.io.FileWriter;

public class FileWriterEx  {

	public static void main(String[] args) throws Exception {

		File file = new File("C:/Test/abc.txt");
		
		// 내용이 계속 덮어 써진다.
		//FileWriter fWriter = new FileWriter(file);
		
		// 생성자에 true라는 매개변수가 붙어있기 떄문에 기존파일에
		// append가 된다.
		// 내용이 계속 이어 진다.
		FileWriter fWriter = new FileWriter(file,true);
		fWriter.write("FileWriter클래스로 보낸 내용입니다."+"\n");
		fWriter.write("FileWriter클래스로 다시 보낸 내용입니다."+"\n");
		
		System.out.println(file.getName()+"이 생성되었습니다.");
		fWriter.flush();
		fWriter.close();
	}

}
