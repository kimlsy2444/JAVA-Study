package example04;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.List;
import java.awt.Toolkit;

public class ListEx {

	public static void main(String[] args) {
		
		Frame frame = new Frame("List");
		frame.setSize(300, 200);
		frame.setLayout(null);
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension screenSize = toolkit.getScreenSize(); // 화면 크기
		
		frame.setLocation((screenSize.width/2) -150,(screenSize.height/2) -100);
		
	
		
		List list1 = new List();
		
		list1.setBounds(20, 40, 100,120);
		// 아이템 추가
		list1.add("송하영");
		list1.add("장규리");
		list1.add("이새롬");
		list1.add("이서연");
		list1.add("이나경");
		list1.add("노지선");
		list1.add("백지헌");
		list1.add("박지원");
		
		
		// 생성자의 2번째 인자값을 true로 설정하여 
		// list목록중에서 다중 선택이 될 수 있도록 함
		
		List list2 = new List(100,true);
		list2.setBounds(150, 40, 100, 120);
		
		list2.add("송하영");
		list2.add("장규리");
		list2.add("이새롬");
		list2.add("이서연");
		list2.add("이나경");
		list2.add("노지선");
		list2.add("백지헌");
		list2.add("박지원");
		
		
		frame.add(list1);
		frame.add(list2);
		frame.setVisible(true);
		frame.setResizable(true);
	}

}
