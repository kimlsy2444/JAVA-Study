package sec01.example01;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAdrressEx {

	public static void main(String[] args) {
	 
		try {
			// 자신의 PC의 IP를 알기 위해서 아래와 같이 코드를 작성해본다.
			InetAddress iAddress = InetAddress.getLocalHost();
			String ip = iAddress.getHostAddress();
			System.out.println("내컴퓨터 IP주소 : "+ip);
			
			// 도메인 네임을 이용해서 IP주소를 알아내기 위한 코드를 작성해본다
			// 보통 큰 서버를 가지고 있는 회사들의 IP는 통상 2개 이상이다된다.
			
			InetAddress[] iAddresses = InetAddress.getAllByName("www.naver.com");
			
			for(InetAddress inetAddress : iAddresses) {
				ip = inetAddress.getHostAddress();
				System.out.println("네이버의 IP 주소 : " + ip);
			}
			
			InetAddress[] iAddresses2 = InetAddress.getAllByName("www.samsung.com");
			
			for(InetAddress inetAddress : iAddresses2) {
				ip = inetAddress.getHostAddress();
				System.out.println("samsung IP 주소 : " + ip);
			}
			
			
		} catch (UnknownHostException e) {
			 
		 
		}

	}

}
