package example09;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class GraphicEx extends Frame implements MouseMotionListener{
	
	int x = 0;
	int y = 0;
	
	// 필드로 Image객체와 Graphics객체를 선언했다.
	Image img = null;
	Graphics gImg= null;
	public GraphicEx(String tiile) {
		 
		super(tiile);
		this.addMouseMotionListener(this);
	  
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		this.setBounds(100, 100, 500, 500);
		this.setVisible(true);
		
		// Image와 Image의 Graphics를 멤버 변수로  정의하고, 생성자에서 createImage()를 
		// 통해서 Frame과 같은 크기의 Image를 생성하고 ,생성된 Image에서 getGraphics()를 호출하여
		// Image에 대한 Graphics를 얻는다. 이렇게 해서 얻어진 Graphics에 drawString() 호출해서
		// 작업한 내용은 Image에 그려지게 한다.
		
		
		
		this.img = this.createImage(500,500);
		this.gImg = img.getGraphics();
		this.gImg.drawString("왼쪽 버튼을 누른채로 마우스를 움직여 보세요", 10, 50);
		repaint();
		
	}
		
	@Override
	public void paint(Graphics g) {
	  if(this.img != null) {
		  
		  // 가상화면에 그려진 그림을 frame에 복사하고  있는 내용이다.
		  // 이 부분이 Image에 그려진 내용을 계속 this(Frame)에 복사를 하고 있다
		  // 여기서 ImageObserver를 this로 설정 해주는데 ImageObserver
		  // 인터페이스는 모든 컴포넌트 클래스가 구현한 인터페이스이다.
		  // 이미지가 로딩되는데 시간이 걸리기 때문에 로딩이 진행되고 있는 상태를 
		  // 누군가에게 알려줘야 하는데 그대상이 바로 이소스 에서는 this가 된다.
		  // 로딩되는 상태에 따라 화면에 다시 그려줘야 한다.
		  
		  
		  System.out.println(Thread.currentThread().getName());
		  System.out.println("페인트");
		  
		  g.drawImage(img, 0, 0, this);
	  	}
		  
	}
	
	

	
	
	@Override
	public void mouseDragged(MouseEvent e) {
		
		if(e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK) {
			
			this.x = e.getX();
			this.y = e.getY();
			this.gImg.drawString("*",this.x, this.y);
			repaint();
		}
		
	}
	
	@Override
	public void mouseMoved(MouseEvent e) {}
	
}
