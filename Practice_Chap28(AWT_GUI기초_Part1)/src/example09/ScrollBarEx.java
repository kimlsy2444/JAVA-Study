package example09;

import java.awt.Frame;
import java.awt.Scrollbar;

public class ScrollBarEx {

	public static void main(String[] args) {
		 
		Frame frame = new Frame("스크롤바");
		
		// ScrollBar는 사용자가 정해진 범위 내에 있는 값을 쉽게 선택
		// 할 수 있도록 해주는 컴포넌트 이다.
		// 주로 볼륨설정 속도 조절 색상 선택 과 같은곳에
		// 자주 사용된다.
		
		frame.setSize(300,200);
		frame.setLayout(null);
		
		// 수평 스크롤바
		Scrollbar hor = new Scrollbar(Scrollbar.HORIZONTAL, 0, 50, 0,100);
		
		hor.setSize(100,15);
		hor.setLocation(60,100);
		
		frame.add(hor);
	
		
		// 수직 스크롤바
		Scrollbar ver = new Scrollbar(Scrollbar.VERTICAL, 50, 20, 0,100);

		ver.setSize(15,100);
		ver.setLocation(30,30);
		
		frame.add(ver);
		
		frame.setVisible(true);
		
		
	}

}
