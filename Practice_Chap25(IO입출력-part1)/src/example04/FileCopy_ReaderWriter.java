package example04;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class FileCopy_ReaderWriter {

	public static void main(String[] args) throws Exception{
		
		Reader reader = new FileReader("C:/write.txt");
		
		Writer writer = new FileWriter("C:/write_복사본.txt");
		
		
		String str = "";
		int readBytes;
		char[] cArr = new char[1000];

		while((readBytes = reader.read(cArr))!=-1) {
		
			String str1 = new String(cArr);
			str += str1;
		
		}
		writer.write(str);
		
		writer.flush();
		
		System.out.println("파일 복사 완료 ");
		
		writer.close();
		reader.close();
	}

}
