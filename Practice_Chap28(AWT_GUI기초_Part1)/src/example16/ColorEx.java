package example16;

import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ColorEx {

	public static void main(String[] args) {
		 
		// GridLayout을 이용하여 14행 2열의 표와같은 형태로 레이아웃을 설정하였다.
		Frame frame = new Frame("Color");
		frame.setSize(200, 300);
		frame.setLayout(new GridLayout(6,2));
		
		Panel p1 = new Panel();
		p1.setBackground(Color.black);
		
		Panel p2 = new Panel();
		p2.setBackground(Color.blue);
		
		Panel p3 = new Panel();
		p3.setBackground(Color.CYAN);
		
		Panel p4 = new Panel();
		p4.setBackground(Color.DARK_GRAY);
		
		Panel p5 = new Panel();
		p5.setBackground(new Color(50,100,100));
		
		Panel p6 = new Panel();
		p6.setBackground(new Color(255,0,0,255));

		frame.add(new Label("Color.black"));	   frame.add(p1);
		frame.add(new Label("Color.blue")); 	   frame.add(p2);
		frame.add(new Label("Color.CYAN")); 	   frame.add(p3);
		frame.add(new Label("Color.DARK_GRAY"));   frame.add(p4);
		frame.add(new Label("Color(50,100,100"));  frame.add(p5);
		
		frame.add(new Label("Color A"));  frame.add(p6);
	
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
			
				System.exit(0);
			}
		});
		
		frame.setVisible(true);

		
	}

}
