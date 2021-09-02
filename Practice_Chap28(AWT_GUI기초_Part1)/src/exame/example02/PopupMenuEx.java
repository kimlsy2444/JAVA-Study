package exame.example02;

import java.awt.Frame;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PopupMenuEx {

	public static void main(String[] args) {
		 
		Frame frame = new Frame("PopupMenu");
		frame.setSize(300,200);
		
		PopupMenu pMenu = new PopupMenu(); 
		
		MenuItem mCut = new MenuItem("잘라내기");
		MenuItem mCopy = new MenuItem("복사하기");
		MenuItem mPaste = new MenuItem("붙여넣기");
		
		// 팝업메뉴에 메뉴아이템 추가함
		
		pMenu.add(mCut);
		pMenu.add(mCopy);
		pMenu.add(mPaste);
		
		frame.add(pMenu);
		
		// 프레임에 이벤트 처리를 위해서 리스터 추가하였다.
		// 마우스 어탭터 클래스를 추가하여 오버라이딩을 하는 익명 자식객체를 만들고있다.
		
		frame.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mousePressed(MouseEvent e) {
				 if(e.getModifiers() == MouseEvent.BUTTON3_MASK) {
					 
					 System.out.println("마우스 포인터 X : "+e.getX());
					 System.out.println("마우스 포인터 y : "+e.getY());
					 
					 pMenu.show(frame, e.getX(), e.getY());
					 
				 }
			}
		});
		
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
			
				System.exit(0);
			}
		});
		frame.setVisible(true);
	}

}
