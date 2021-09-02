package example01;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GridLayoutEx {

	public static void main(String[] args) {
		 	
		
		Frame frame = new Frame("GridLayout");
		
		frame.setSize(300,300);
		
		//  3행 2열의 테이블 표 형태를 만든다.
		frame.setLayout(new GridLayout(3,2));
			
		frame.add(new Button("1"));
		frame.add(new Button("2"));
		frame.add(new Button("3"));
		frame.add(new Button("4"));
		frame.add(new Button("5"));
		frame.add(new Button("6"));
	
		
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				
				System.exit(0);
			}
		});
		
		frame.setVisible(true);			
		
		
		
		
	}
}


