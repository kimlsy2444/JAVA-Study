package example10;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;

public class CanvasEx {

	public static void main(String[] args) {
		
		Frame frame = new Frame("Canvas");
		
		frame.setSize(300,200);
		frame.setLayout(null);
		
		
		// Canvas는 현재 시점에서 많이 퇴색되어 사용되지 않는다.
		// ImageView, Label, MideaView 로 대체되어 졌다.
		
		Canvas canvas = new Canvas();
		// Canvas 의 배경색 을 파랑색으로 한다.
		canvas.setBackground(Color.blue);
		canvas.setBounds(50, 50, 150, 100);
		
		frame.add(canvas);
		frame.setVisible(true);
		
	}

}
