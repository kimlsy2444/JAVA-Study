package example01;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BorderLayoutEx {

	public static void main(String[] args) {
		 
		Frame frame = new Frame("BoderLayout");
		
		frame.setSize(300,300);
		
		// frame의 기본적 레이아웃매니저는 BorderLayout 이다
		// 각 영역의 간격을 수직, 수평으로 10픽셀로 설정함
		frame.setLayout(new BorderLayout(10,10));
		
		Button north = new Button("북쪽");
		Button east = new Button("동쪽");
		Button south = new Button("남쪽");
		Button west = new Button("서쪽");
		Button center = new Button("중앙");
		
		
		frame.add(BorderLayout.NORTH,north);
		frame.add(BorderLayout.EAST,east);
		frame.add(BorderLayout.SOUTH,south);
		frame.add(BorderLayout.WEST,west);
		frame.add(BorderLayout.CENTER,center);
		
	
		
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				
				System.exit(0);
			}
		});
		
		frame.setVisible(true);


		
	}

}
