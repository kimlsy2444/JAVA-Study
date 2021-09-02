package example11;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PanelEx {

	public static void main(String[] args) {
	 
		Frame frame = new Frame("Panel");
		
		frame.setBounds(500,300,500,300);
		
		frame.setLayout(null);
		
		// Panel 종속적인 컨테이너 로써 기본적으로 
		// FlowLayout() 을 사용한다.
		// 따라서 Panel 안에 들어갈 컴포넌트의 위치를 따로 지정 하지 않아도 된다.
		
		Panel panel = new Panel();
		panel.setBackground(Color.CYAN);
		panel.setBounds(50, 50, 150, 150);
		
		Button ok = new Button("ok");
		Button cancel = new Button("cancel");
		
		// 이벤트 처리에서 Button은 이벤트의 근원지이고,
		// ActionListener는 버튼을 리스너(감시자)를 등록한후
		// 버튼이 클릭 되었다면 아래의 actionPerformed()가 실행되는 
		// 핸들러이다.
		
		ok.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("OK버튼 클릭됨");
			}
		});
		
		
		cancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("cancel 버튼 클릭됨");
			}
		});
		
		// 현재 버튼들이 Panel 컨테이너에 추가가 되고 있기 때문에
		// 프레임 컨테이너에 영향을 받는것이아니라
		// Panel컨테이너 레이아웃 매니저에 영향을 받는다는
		// 사실도 반드시 인지 해야한다.
		
		
		panel.add(ok);
		panel.add(cancel);
		
		frame.add(panel);

		
		// 윈도우 이벤트를 사용하기 위해서 매개변수 값으로
		// WindowListener 인터페이스를 익명구현객체로 제공을 하게 되면
		// 아래와 같이 필요없는 메서드까지 우리가
		// 오버라이딩을 해야하는 불편함이 있다.
		// 코드량도 늘어날 뿐더러 아주 가독성이 떨어진다.
		// 하여 XXXAdapter 클래스를 사용하여 필요한 
		// 메서드만 오버라이딩을 하면 되는 것이다.
		
		
		// 윈도우 이벤트 처리 부분, 매개변수가 ,WindowAdapter클래스이다.
		// WindowAdapter 클래스는 WindowListener 인터페이스의 추상메서드
		// 들을 다 오버라이딩을 해둔 클래스이다. 단 내용은 없다
		// 하여 필요한 메서드를 꺼내서 오버라이딩 하여 사용하면 된다.
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("윈도우 이벤트 발생");
				System.exit(0);
			}
		});
		
		frame.setVisible(true);
	}

}
