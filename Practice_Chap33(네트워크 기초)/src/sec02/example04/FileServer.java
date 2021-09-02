package sec02.example04;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class FileServer {
	
	public static void main(String[] args) {
		
		ServerSocket serverSocket =null;
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("localhost",7777));
			System.out.println("[서버 시작]");
		} catch (IOException e) {}
		
		// 서버는 지속적으로 무한루프
		while(true) {
			try {
				
			Socket socket =	serverSocket.accept();
			InputStream inputStream = socket.getInputStream();
			int readCount = -1;
			byte[] byteArr = new byte[100];
			// 파일 이름 읽기
			inputStream.read(byteArr,0,100);
			String fileName = new String(byteArr,0,100,"UTF-8");
			// 파일 이름 앞뒤 공백 제거
			fileName= fileName.trim();
			
			System.out.println("[파일 받기 시작]" +fileName);
			// 파일을 받기 시작을 하게 되면, 저장경로를 얻어서 파일의 내용을 저장하면된다.
			FileOutputStream fileOutputStream =new FileOutputStream("C:/Test/"+fileName);
			
			while( (readCount = inputStream.read(byteArr)) != -1) {
				fileOutputStream .write(byteArr,0,readCount);
			}
			fileOutputStream.flush();
			System.out.println("[파일 받기 완료]");
			
			fileOutputStream.close();
			inputStream.close();
			socket.close();
			
			}catch (Exception e) {
				System.out.println("파일 받기 예외 발생");
				break;
				
			}
		}
		try {
			serverSocket.close();
			System.out.println("[서버가 종료되었습니다.]");
		} catch (IOException e) {}
	}
}
