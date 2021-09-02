package example06;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class CheckBoxEx {

	public static void main(String[] args) {


		Frame frame = new Frame("CheckBox");
		frame.setSize(305,250);
		
		// 프레임의 레이아웃 매니저는 BorderLayout 인데 여기서는
		// FlowLayout을 설정을함 
		// FlowLayout 방식은 배치의 한 방식으로
		// 좌측에서 우측으로 컴포넌트를 정렬시킨다.
		// 지금은 왼쪽 정렬을 선택 했다.
		frame.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		
		// Checkbox 는 개별적으로 생성을 하게 되면 다중 선택이 되어진다.(중요)
		Label q1 = new Label("1. 당신의 관심 분야는?(다중 선택 가능)");
		
		// true 매개값을 주면 선택된 상태로 보여진다.
		Checkbox news = new Checkbox("news",true);
		Checkbox sports = new Checkbox("sports");
		Checkbox movies = new Checkbox("movies");
		Checkbox music = new Checkbox("music");
		
		frame.add(q1);
		frame.add(news);
		frame.add(sports);
		frame.add(movies);
		frame.add(music);
		
		// Checkbox 를 생성하며 소속을 group1으로 만든다.
		// true는 선택된 값으로 나타난다. (라디오 버튼)
		
		Label q2 = new Label("2. 얼마나 자주 극장에 가십니까?");
		
		CheckboxGroup group1 = new CheckboxGroup();// 그룹 생성
		
		Checkbox movie1 = new Checkbox("한달에 한번",group1,false);
		Checkbox movie2 = new Checkbox("일주일에 한번",group1,false);
		Checkbox movie3 = new Checkbox("일주일에 두번",group1,false);
		
		frame.add(q2);
		frame.add(movie1);
		frame.add(movie2);
		frame.add(movie3);
		

		frame.setVisible(true);
		
	}

}
