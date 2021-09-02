package sec03.example01;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {
	
	public UDPServer(int port) {
		 
		try {
			
		
			while (true) { 
				DatagramSocket datagramSocket = new DatagramSocket(port);
				byte[] bytes = new byte[100];
				DatagramPacket datagramPacket =new DatagramPacket(bytes, bytes.length);
				System.out.println("서버 시작");
				datagramSocket.receive(datagramPacket);
				// 디코딩
				String str = new String(datagramPacket.getData(),0,datagramPacket.getLength(),"UTF-8");
				System.out.println("수신된 데이터 : "+str.trim());
			
				// 클라이언트의 정보를 출력하는 코드
				InetAddress inetAddress = datagramPacket.getAddress();
				int clientPort = datagramPacket.getPort();
				
				System.out.println("클라이언트 IP :"+inetAddress+" 클라이언트 Port :"+clientPort);
			
				datagramSocket.close();
			}
		}catch (Exception e) {
			 System.out.println("데이터 수신 예외 발생");
			 e.printStackTrace();
		}
	}
	
	
	
	public static void main(String[] args) {
		new UDPServer(7777);
		
		
		
		
	}

}
