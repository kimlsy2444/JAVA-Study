package example03;

import java.awt.Choice;
import java.awt.Frame;

public class ChoiceEx {

	public static void main(String[] args) {
		 
		Frame frame = new Frame("Choice");
		frame.setSize(300, 200);
		
		frame.setLayout(null);
		// 현재는 Choice 라는 명칭은 거의 없다.
		// 다만 콤보 박스, 드랍다운 리스트
		// 라고 불리어진다.
		Choice choice = new Choice();
		// Choice 에 리스트 아이템을 추가
		
		choice.add("월요일");
		choice.add("화요일");
		choice.add("수요일");
		choice.add("목요일");
		choice.add("금요일");
		choice.add("토요일");
		choice.add("일요일");
		
		System.out.println(choice.getItem(5));
		
		choice.setBounds(100, 70, 100, 50);
		
		frame.add(choice);
		
		frame.setVisible(true);
	}

}
