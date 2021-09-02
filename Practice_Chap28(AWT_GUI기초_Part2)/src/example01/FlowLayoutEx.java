package example01;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FlowLayoutEx {

	public static void main(String[] args) {
		Frame frame = new Frame("FlowLayout");
		
		frame.setSize(300,300);
		
		// 왼쪽 정렬 영역의 간격을 수직, 수평으로 10픽셀로 설정함
		frame.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
			
		frame.add(new Button("첫번째"));
		frame.add(new Button("두번째"));
		frame.add(new Button("세번째"));
		frame.add(new Button("네번째"));
		frame.add(new Button("다섯번째"));
		
	
		
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				
				System.exit(0);
			}
		});
		
		frame.setVisible(true);
	}

}
