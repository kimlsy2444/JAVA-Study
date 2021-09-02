package sec02.example04;

 
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Arrays;
 

public class FileClient {

	public static void main(String[] args) {
		
		Socket socket =null;
		try {
			socket = new Socket("localhost",7777);
			OutputStream outputStream = socket.getOutputStream();
			
			String filePath ="C:/JAVA 작업/Practice_Chap33(네트워크 기초)/src/sec02/example04/files/송하영.gif";
			//String filePath ="C:/JAVA 작업/Practice_Chap33(네트워크 기초)/src/sec02/example04/files/Freak-릴원칠.mp3";
			// 파일 객체 얻기
			File file = new File(filePath);
			
			// 파일 이름 얻기
			
			String fileName = file.getName();
			byte[] fileNameBytes = fileName.getBytes("UTF-8");
			
			fileNameBytes =	Arrays.copyOf(fileNameBytes, 100);
			// 파일 이름 보내는 부분
			outputStream.write(fileNameBytes);
			
			System.out.println("[파일 보내기 시작] : " + fileName);
			
			byte[] fileArr =  new byte[1000];
			FileInputStream fileInputStream = new FileInputStream(file);
			
			int readCount = -1;
			
			while((readCount =fileInputStream.read(fileArr)) !=-1 ) {
				outputStream.write(fileArr,0,readCount);
				
			}
			outputStream.flush();
			System.out.println("[파일 보내기 완료]");
			
			fileInputStream.close();
			outputStream.close();
			socket.close();	
			
		} catch (Exception e) {
			System.out.println("파일 보내기 예외 발생");
			e.printStackTrace();
		}
		
	}

}
