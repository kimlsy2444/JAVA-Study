package example07;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class TextFieldEx {

	public static void main(String[] args) {
		 
		Frame frame =new Frame("TextFile");
		
		frame.setSize(400,80);
		frame.setLayout(new FlowLayout());
		
		
		Label  lid = new Label("아이디 : ",Label.RIGHT);// 오른쪽 정렬
		
		Label  lpwd = new Label("패스워드 : ",Label.RIGHT);
		
		TextField id  = new TextField(10);
		TextField pwd = new TextField(10);
		
		// 입력한 값 대신에 *가 보이도록 한다.(에코 문자 ) 비밀 번호 설정에 사용한다.
		pwd.setEchoChar('*'); 
		System.out.println("설정한 에코 문자 : "+pwd.getEchoChar());
		frame.add(lid);
		frame.add(id);
	
		
		frame.add(lpwd);
		frame.add(pwd);
		
		frame.setVisible(true);
	}

}
