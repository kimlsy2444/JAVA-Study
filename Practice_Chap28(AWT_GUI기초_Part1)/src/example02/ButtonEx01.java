package example02;

import java.awt.Button;
import java.awt.Frame;

public class ButtonEx01 {

	public static void main(String[] args) {
			
		Frame frame = new Frame("Button");
	
		frame.setSize(500,500);
		// 프레임은 기본적인 레이아웃 매니저 BorderLayout Manager임
		frame.setLayout(null); // 레이아웃 매니저 설정 해제함
	
		// 버튼 생성
		Button btn1 = new Button("확인");
		Button btn2 = new Button("취소");
		// 버튼 크기 설정
		 btn1.setSize(100,50);
		 btn2.setSize(100,50);
		 
		 btn1.setLocation(110, 50);
		 btn2.setLocation(220, 50);
		 
		 frame.add(btn1);
		 frame.add(btn2);
		 
		 //setResizable() 는 true로 설정을 하면 사용자가 프레임의 크기를 조절 못하게한다.
		 
		 
		 frame.setResizable(true);
		 frame.setVisible(true);
	}

}
