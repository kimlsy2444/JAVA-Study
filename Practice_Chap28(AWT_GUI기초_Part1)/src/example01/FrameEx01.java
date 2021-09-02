package example01;

import java.awt.Frame;

public class FrameEx01 {

	public static void main(String[] args) {
		
		// 프레임은 컴포넌트이면서 컨테이너이다.
		Frame frame = new Frame("Longin");
		
		// 프레임의 크기를 가로, 세로로 설정한다.(Component클래스에 정의된 메서드)
		frame.setSize(300,500);
		// 프레임의 위치를 설정한다
		frame.setLocation(500,200);
		
		// setLocation 와 setSize 를 합쳐놓은 메서드  setBounds()
		//frame.setBounds(500, 200, 300, 500);
		
		// 생성한 프레임을 화면에 보이도록 한다.
		frame.setVisible(true);
		
		// 생성된 프레임을 닫기 위해서 닫기 버튼을 눌러서 닫기를 해야 하는데
		// 지금은 이벤트 처리가 되어 있지 않기 때문에 콘솔창에 Terminate
		// 빨간 버튼을 이용해서 닫도록 하자.
		
		
	}

}
