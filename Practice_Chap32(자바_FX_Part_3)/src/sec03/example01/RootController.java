package sec03.example01;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class RootController implements Initializable {
	
	@FXML private Label lblTime;
	@FXML private Button btnStart;
	@FXML private Button btnStop;
	
	
	private boolean stop;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		// 이벤트 처리 부분
		btnStart.setOnAction(e-> BtnStart(e));
		btnStop.setOnAction(e-> BtnStop(e));
	}
	

	public void BtnStart(ActionEvent e) { // TODO Auto-generated method stub
	
		this.stop= false;
		Thread thread = new Thread() {
			@Override
			public void run() {
				SimpleDateFormat sdf= new SimpleDateFormat("HH:mm:ss");
				while(!stop) {
					// 계속 시스템의 사간을 얻어온다
					String strTime = sdf.format(new Date());
					System.out.println("run() 실행 스레드명 : "+Thread.currentThread().getName());
					
					// 작업스레드가 직접 UI를 변경하는 코드를 넣어보면 예외가 발생한다.
					
//					lblTime.setText(strTime);
//					System.out.println("현재시간 : "+strTime);
					
					
					// 작업스레드가 계속적으로 시스템으로부터 시간을 얻어오고 그것을
					// 이벤트 큐에 저장을 해주면 JavaFX Application Thread가 그 이벤트를 가져와서
					// Platform.runLater() 를 실행을 한다.
					// 하여 UI를 변경하는데 전혀 문제가 없다.
					
					Platform.runLater( ()-> {
						System.out.println("runLater() 호출됨");
						System.out.println("runLater() 실행 스레드명 : "+Thread.currentThread().getName());
						//UI 변경코드
						lblTime.setText(strTime);
					});
					
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			};
		};
		
		thread.setDaemon(true);
		thread.start();
	}
	
	
	private void BtnStop(ActionEvent e) {
		 
		this.stop = true;
		
		
	}
	
	
	
	
	
}
