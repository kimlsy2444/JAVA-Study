package sec02.example01;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		 	
		ServerSocket serverSocket =  null;
		
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("localhost",7777));
			
			// 서버는 항상 클라이언트의 요청을 기다려야 하기 때문에
			// 무한 루프를 돌리도록 한다.
			while(true) {
				System.out.println("[연결 대기중]");
				
				// accept() 는 클라이언트의 연결 요청을 해오기 전까지는 대기
				// 즉 블로킹 상태로 된다 클라이언트의 요청이 들어오면 
				// 비로소  통신용 Socket만들어서 리턴한다.
				Socket socket =	serverSocket.accept();
			
				// 클라이언트를 IP주소를 얻는 코드
				// 타입변환을 하는 이유는 getRemoteSocketAddress()는 
				// SocketAddress클래스를 리턴
				// 자손인 InetSocketAddress 로 다운캐스팅을 하는 것이다
				InetSocketAddress inetSocketAddress =  (InetSocketAddress)socket.getRemoteSocketAddress();
				System.out.println("[연결 수락함] : "+inetSocketAddress.toString());
			}
			
		} catch (IOException e) {}
		
		// 자원을 다 사용하고 나면 반드시 close()를 호출하자
		// 지금은 이코드가 별 의미가 없다. ui 적 세부 내용이없기 때문에
		
		if(!serverSocket.isClosed()) {
			try {
				serverSocket.close();
				
			} catch (IOException e) {}
			
		}
	}

}
