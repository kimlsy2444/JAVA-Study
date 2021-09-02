package example07;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class GraphicEx extends Frame{
	
	public GraphicEx(String title) {
		super(title);
		this.setBounds(100,100,400,300);
		this.setVisible(true);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}
	
	// paint 메서드를 호출하는 곳이 어디에도 없다.
	@Override
	public void paint(Graphics g) {
		// AWT스레드가 paint()를 호출하고 그림까지 그려주는 역할을 한다.
		Thread thread = Thread.currentThread();
		System.out.println("Paint() 움직이는 스레드 "+thread.getName());
		// 폰트설정
		g.setFont(new Font("Serif",Font.PLAIN,15));
		// 문자열 출력
		g.drawString("Graphics를 이용해서 그림을 그립니다.", 10, 50);
		
		// 타원을 그리는 부분
		g.drawOval(200, 100, 100, 50); // 그냥 속이빈원 
		
		// 파란색으로 색을 지정을 한것뿐
		g.setColor(Color.blue); // 이후 그려지는 색은 지정한 색으로
		g.fillOval(50, 100, 100, 50); // 안까지 채워진 원
		
		// 선그리기 
		g.setColor(Color.RED); 
		g.drawLine(100 , 20, 150, 150);
		
		// 둥근 사각형
		g.setColor(Color.green);
		g.fillRoundRect(150, 200, 120, 80, 30, 30);
		
		// 호 그리기
		
		g.setColor(Color.ORANGE);
		g.fillArc(250, 200, 100, 100, 0, 120);
		
	}
}
