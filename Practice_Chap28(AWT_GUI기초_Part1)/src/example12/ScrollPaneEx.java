package example12;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.ScrollPane;

public class ScrollPaneEx {

	public static void main(String[] args) {
		 	
		Frame frame = new Frame("ScrollPane");
		frame.setSize(300,300);
		
		// 종속적 컨테이너로 단, 하나의 컴포넌트 만 포함 시킬수 있는
		// 컨테이너이다. 크기를 줄였다가 늘였다 하면 스크롤바가 자동으로
		// 생성되는 것을 볼수가 있다.
		ScrollPane sPane = new ScrollPane();

		Panel panel = new Panel();
		panel.setBackground(Color.MAGENTA);
		
		panel.add(new Button("첫 번째"));
		panel.add(new Button("두 번째"));
		panel.add(new Button("세 번째"));
		panel.add(new Button("네 번째"));
		
		
		
		sPane.add(panel);
		frame.add(sPane);
		
		frame.setVisible(true);
	
	
	
	
	
	}

}
