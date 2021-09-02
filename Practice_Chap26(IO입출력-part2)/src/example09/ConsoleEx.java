package example09;

import java.io.Console;

public class ConsoleEx {

	public static void main(String[] args) {
		 
		Console console = System.console();
		
		//Console 클래스는 실행시 이클립스의 콘솔뷰에서 하게 되면
		// null 을 리턴한다.
		// NullPointerException 이 발생한다.
		// 반드시 명령 프롬프트에서 실행해야 한다.
		System.out.print("아이디  : ");
		
		String id= console.readLine();
		// 콘솔클래스 에서는 기본타입을 받을수 있는 메서드 자체가 없다.
		
		System.out.print("패스워드 : ");
		// 콜솔창에 입력한 문자가 에코출력, 즉 보이지 않는다(보안)
		char[] password = console.readPassword();
		
		String pStr = new String(password);
		System.out.println("-----------------------");
		System.out.println("id  : "+id);
		System.out.println("pwd : "+pStr);
		
		
		
		
		
	}

}
