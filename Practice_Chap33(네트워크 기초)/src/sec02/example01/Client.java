package sec02.example01;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		 
		Socket socket = null;
		
		
		
		try {
			socket = new Socket();
			System.out.println("[연결 요청]");

			// 서버에 접속하는 코드		
			socket.connect(new InetSocketAddress("localhost",7777));
	
			System.out.println("[연결 성공]");
		} catch (IOException e) {}
		
		// 연결을 끊기 위한 코드
		if (!socket.isClosed()) {
			
			try {
				socket.close();
				System.out.println("클라이언트의 socket이 닫혔습니다.");
			} catch (IOException e) {}
			
		}
	}

}
