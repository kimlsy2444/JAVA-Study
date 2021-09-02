package sec03.example01;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPClitent {
	
	private String str;
	private static int SERVERPORT = 7777;
	private Scanner scanner = new Scanner(System.in);
	
	// 생성자
	public UDPClitent(String ip, int port) {
		
		try {
			InetAddress inetAddress = InetAddress.getByName(ip);
			DatagramSocket datagramSocket = new DatagramSocket(port);
			System.out.print("서버에 보낼 내용 : ");
			str = scanner.nextLine();
			
			// 인코딩
			byte[] bytes = str.getBytes("UTF-8");
			DatagramPacket datagramPacket = 
			new DatagramPacket(bytes,bytes.length,inetAddress,SERVERPORT );
			// 보낼내용을 DatagramPacket으로 만든다.
			// DatagramSocket을 이용하여 데이터를 보낸다.
			datagramSocket.send(datagramPacket);
			datagramSocket.close();
			
			
		}catch (Exception e) {
			System.out.println("데이터 보내기 실패");
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
	 
		new UDPClitent("localhost", 9999);
	}

}
