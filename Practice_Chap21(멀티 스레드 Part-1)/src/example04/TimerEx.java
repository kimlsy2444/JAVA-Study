package example04;

import javax.swing.JOptionPane;

public class TimerEx {

	public static void main(String[] args) throws Exception {
		
		Thread thread = new TimerThread();
		thread.start();

		String input = JOptionPane.showInputDialog("10 초안에 값을 입력하시오 ");
		
		if(input != null) {
			System.out.println("입력 값 : "+input);
			System.exit(0);
		}
		else
		{
			Thread.sleep(10000); /// 9초대기
			System.out.println("입력 실패 펑");
			System.exit(0);
		}
		
		
		
		
		
		
		
	}

}
