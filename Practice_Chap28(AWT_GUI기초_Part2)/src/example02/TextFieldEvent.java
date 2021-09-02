package example02;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class TextFieldEvent extends Frame {
	
	 
			
		Label lId;
		Label lPwd;
		TextField tfid;
		TextField tfPwd;
		
		Button ok;
	
		public TextFieldEvent(String title) {
			
			super(title); // 조상클래스인 Frame(String title)을 호출함
			
		}
		public void textFieldShow() {
			this.lId = new Label("TD : ",Label.RIGHT);
			this.lPwd = new Label("PassWord : ",Label.RIGHT);
			
			this.tfid  = new TextField(10);
			this.tfPwd  = new TextField(10);
			
			this.tfPwd.setEchoChar('*'); // 비밀번호 안보이게 설정
			
			this.ok = new Button("OK");
			
			this.addWindowListener(new WindowAdapter() {
				@Override
				public void windowClosing(WindowEvent e) {
				
				System.exit(0);
				}
			});
			
			
			// 리스너 등록
			this.tfid.addActionListener(new EventHandler());
			this.tfPwd.addActionListener(new EventHandler());
			this.ok.addActionListener(new EventHandler());
			
			this.setLayout(new FlowLayout());
			
			this.add(lId);
			this.add(tfid);
			
			this.add(lPwd);
			this.add(tfPwd);
			
			this.add(ok);
			this.setSize(450,80);
			this.setLocation(500,300);
			this.setVisible(true);
			this.setResizable(false);
			
		}
		// 내부 클래스 작성
		class EventHandler implements ActionListener {
			@Override
			
			public void actionPerformed(ActionEvent e) {
				String id = tfid.getText().trim();
				String pwd = tfPwd.getText().trim();
				
						if(!id.equals("spark")) {
							System.out.println("아이디가 틀렷습니다.");
							tfid.requestFocus(); // 마우스커서(포커스)를 다시 아이디창으로 보냄
							tfid.selectAll(); // 입력한 글자를 전부 선택되게끔 함
							
							
						}
						else if(!pwd.equals("12345")) {
							System.out.println("비밀번호가 틀렷습니다.");
							tfPwd.requestFocus(); // 마우스커서(포커스)를 다시 비밀번호창으로 보냄
							tfPwd.selectAll(); // 입력한 글자를 전부 선택되게끔 함
						}
						else {
							System.out.println(id+"님 환영합니다.");
						}
			
			
			}
			
		}
		
	
 }
