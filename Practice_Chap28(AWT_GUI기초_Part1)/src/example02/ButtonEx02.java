package example02;

import java.awt.Button;
import java.awt.Frame;

public class ButtonEx02 {

	public static void main(String[] args) {
		
		Frame frame = new Frame("Button");
		
		
		frame.setSize(300,200);
		frame.setLayout(null);
		
		Button b1 = new Button("결재");
		Button b2 = new Button("반려");
		
		b1.setSize(100,50);
		b1.setLocation(40,75);
		
		b2.setSize(100,50);
		b2.setLocation(160,75);
		
		frame.add(b1);
		frame.add(b2);
		
		frame.setVisible(true);
		frame.setResizable(true);
	}

}
