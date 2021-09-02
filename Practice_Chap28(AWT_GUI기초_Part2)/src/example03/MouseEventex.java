package example03;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class MouseEventex extends Frame {
	
	
	private Label location;
	
	public MouseEventex(String title) {
		
		super(title);
		

	}
	
	public void MouseShow() {
		this.setSize(300,200);
		this.setLocation(500, 300);
		// Label 에 대한 설정
		this.location = new Label("");
		this.location.setBounds(50, 50, 200, 20);
		this.location.setBackground(Color.YELLOW);
		
		this.add(location);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {System.exit(0);}});
		// 이벤트 리스너 등록
		
		// 마우스 클릭에대한 이벤트 감지
		this.addMouseListener(new EventHandler()); 
		//  마우스 이동에 대한 이벤트 감지
		this.addMouseMotionListener(new EventHandler()); 
		
		this.setLayout(null);
		this.setVisible(true);
	}
	
	class EventHandler extends MouseAdapter{
		
		@Override
		public void mouseClicked(MouseEvent e) {
			 if(e.getModifiers() == MouseEvent.BUTTON3_MASK) {
				 // 메인 스레드가 이러한 이벤트를 처리를 해주는 것이아니라
				 // AWT 스레드가 직접 처리를 하고 있음을 확인할 수가 있다.
				 System.out.println("마우스클릭 이벤트 처리 스레드"+Thread.currentThread().getName());
				 System.out.println("X : "+e.getX()+" Y : "+e.getY());
			 }
		 
		}
		@Override
		public void mouseMoved(MouseEvent e) {
			// 콘솔에서 표시
			 System.out.println("마우스무브 이벤트 처리 스레드"+Thread.currentThread().getName());
			 //Label로 표시한다
			 location.setText("X : "+e.getX()+" Y : "+e.getY());
		
		}
		
	}
	
}
