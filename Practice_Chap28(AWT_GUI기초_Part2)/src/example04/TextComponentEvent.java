package example04;

import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class TextComponentEvent extends Frame{
	
	TextField textField;
	TextArea textArea;
	
	// ActionEvent가 발생되는 것은 4가지가있다.
	// 1. Button이 클릭되었을 때
	// 2. Menu를 클릭했을 때
	// 3. TextField에서 Enter키를 눌렀을때
	// 4. List의 item하나를 선택헤서 더블클릭을 했을 때
	
	public TextComponentEvent(String title) {
		super(title);
	}
	
	public void TextComponentShow() {
		
		this.textField = new TextField();
		this.textArea = new TextArea();
		
		// 프레임은 원래 BorderLayout이므로 아래와 같이 추가하면 된다.
		
		this.add(textArea,"Center");
		this.add(textField,"South");
		
		// TextField에 익명 구현 객체로 이벤트 정의를 하고 있다.
		
		this.textField.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TextField에서 Enter를 치면, TextArea에 입력된  
				// text를 TextArea에 추가한다.
				textArea.append(textField.getText()+"\n"); 
				// TextField의 내용을 지운다.
				textField.setText("");
				textField.requestFocus();
			}
		});
		// TextArea의 글자를 편집하지 못하게한다.
		this.textArea.setEditable(false);
		
		this.setSize(300,200);
		this.setLocation(500,300);
		this.setVisible(true);
		// Focus가 실행됨가 동시에 TextField에 위치하도록 설장
		this.textField.requestFocus();
		
		
		WindowAdapter wAdapter = new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				 System.exit(0);
			}
		};
		
		this.addWindowListener(wAdapter);
		
	}
	
	
	















}

