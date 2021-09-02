package sec02.example02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
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
				System.out.println("[연결 수락함] : "+inetSocketAddress.getHostName());
				
				//////////////////////////////////////////////////////
				byte[] bytes = null;
				String data = null;;
				
				// 데이터를 받기 위해서 소켓에서 입력 스트림을 얻는 코드
				InputStream inputStream = socket.getInputStream();
				bytes = new byte[1000];
				
				// 클라이언트에게 들어오는 데이터를 읽는 부분
				int readcount = inputStream.read(bytes);
				// 저장했던 바이트 배열을 디코딩하는 과정
				data = new String(bytes,0,readcount,"UTF-8");
				
				System.out.println("[데이터받기 성공] : "+data);
				
				
				
				/////////////////////////////////////////////////////////////
				// 데이터를 보내기 위해서 소켓에서 출력 스트림을 얻는 코드
				OutputStream outputStream = socket.getOutputStream();
				data = "안녕하세요 클라이언트";
				// 인코딩 코드
				bytes = data.getBytes("UTF-8");
				outputStream.write(bytes);
				outputStream.flush();
				
				System.out.println("[데이터보내기 성공]");
				
				inputStream.close();
				outputStream.close();
				socket.close();
			}
			
		} catch (IOException e) {}
		
		
		if(!serverSocket.isClosed()) {
			try {
				serverSocket.close();
				
			} catch (IOException e) {}
			
		}
	}

}
