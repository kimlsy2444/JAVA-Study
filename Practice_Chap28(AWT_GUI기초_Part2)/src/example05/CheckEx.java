package example05;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class CheckEx extends Frame{
	
	CheckboxGroup group;
	Checkbox cb1;
	Checkbox cb2;
	Checkbox cb3;
	
	// 생성자에서 한번에 처리 하기
	
	public CheckEx(String title) {
		super(title);
		this.group = new CheckboxGroup();
	
		// 아래 3개의 CheckBox는 CheckboxGroup에 속하고 있으며
		// 하나밖에 선택을 하지 못한다.
		// 또한 , 매개값 중 3번째의 true는 실행시에 미리 체크를 하라고 한 것이다.
		this.cb1 = new Checkbox("red",group,true);
		this.cb2 = new Checkbox("green",group,false);
		this.cb3 = new Checkbox("blue",group,false);
		
		// CheckBox의 배경색을 CYAN으로 지정하였다.
		this.cb1.setBackground(Color.CYAN);
		this.cb2.setBackground(Color.CYAN);
		this.cb3.setBackground(Color.CYAN);
		
		this.cb1.addItemListener(new EventHadler());
		this.cb2.addItemListener(new EventHadler());
		this.cb3.addItemListener(new EventHadler());
		// CheckBox에 ItemListener를 등록하고 있다.
	

		this.setLayout(new FlowLayout());
		
		this.add(cb1);
		this.add(cb2);
		this.add(cb3);
		
		this.setBackground(Color.RED);// 시작시 프레임 색갈로 RED설정
		this.setSize(500,300);
		this.setLocation(500,300);
		this.setVisible(true);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
			System.exit(0);
			}
		});
	
	}
	// 중첩 클래스인 EventHadler클래스는  ItemListener 인터페이스를 구현하고있다.
	
	class EventHadler implements ItemListener{
	
		// CheckBox의 버튼을 클릭하게 되면 itemStateChanged()가 호출된다.
		@Override
		public void itemStateChanged(ItemEvent e) {
		 System.out.println("아이템 이벤트 발생함");
		
		// getSource()는 모든 이벤트 클래스의 조상인 
		// java.util.EventObject클래스에 있는 유일한 메서드이면서
		// 모든 이벤트 클래스에서 사용할수가 있다.
		// 리턴타입이 Objcet라서 타입변환이 필요하다.
		 
		Checkbox cb = (Checkbox)e.getSource();
		String color = cb.getLabel();
		
				if(color.equals("red")){
					CheckEx.this.setBackground(Color.red);
				}
				else if(color.equals("green")) {
					CheckEx.this.setBackground(Color.green);
				}
				else  {
					CheckEx.this.setBackground(Color.blue);
				}
			
			
			}
		
		
		}

}
