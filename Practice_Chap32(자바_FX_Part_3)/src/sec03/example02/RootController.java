package sec03.example02;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;




public class RootController implements Initializable {
	
	@FXML private ProgressBar progressBar;
	@FXML private Label lblWorkDone;
	@FXML private Button btnStart;
	@FXML private Button btnStop;
	
	// 결과 값이 없는 Task를 만들기 위해서 Void타입을 지정함.
	
	private Task<Void> task;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
		// 이벤트 처리 부분 등록
		btnStart.setOnAction(e-> BtnStart(e));
		btnStop.setOnAction (e-> BtnStop(e));
	}
	
 

	public void BtnStart(ActionEvent e) {
		
		 System.out.println("BtnStart()실행 스레드 명 : "+Thread.currentThread().getName());
		
		 
		 task = new Task<Void>() {
			
			@Override
			protected Void call() throws Exception {
			 
				System.out.println("Call()실행 스레드 명 : "+Thread.currentThread().getName());
				for(int i=0;i<=100;i++) {
					//취소가 되었는지 계속감시하는 코드를 아래와 같이 작성
					if(this.isCancelled()) {
						
						this.updateMessage("취소됨");
						break;
					}
					// updateProgressme ProressBar , ProgressIndiacator에만 국한되어 있다.
					this.updateProgress(i, 100); //i는 진행값, 100은 완료값
					// 작업이 완료가 되면 i값을 lblWorkDone에 뿌려준다.
					this.updateMessage(String.valueOf(i)+"%");
					
					
					// 냅적으로 cancel() 명시적으로 호출해야 내부 감시코드가 실행
					//call()에는 예외처리가 되어 있다. 하지만, 지금은 외부에서
					// interrupt()를 호출하면 task가 취소되도록직접 예외구문을 넣은코드이다.
					
					try {
						Thread.sleep(100);
					}catch (InterruptedException e) {
						if(this.isCancelled()) {
							this.updateMessage("인터럽트로 인한 취소");
							break;
						}
					}
					
				}
				return null;
			}
		};
		
		// 속성바인딩 코드 
		// ProgressBar 컨트롤의 속성과 task의 updateProgress의 progress 속성과 바인딩 처리를 한다.
		// 이렇게 해주면 비로소 ProgressBar의 진행정도가 변하게 된다.
		
		progressBar.progressProperty().bind(task.progressProperty());
		// 위와 같이 Label컨트롤의 속성과 updateMessage의 속성을 바인딩한다.
		lblWorkDone.textProperty().bind(task.messageProperty());
		
		Thread thread = new Thread(task);
		thread.setDaemon(true);
		thread.start();
	}
	
	public void BtnStop(ActionEvent e) {
		 
		System.out.println("BtnStop()실행 스레드 명 : "+Thread.currentThread().getName());
		task.cancel();
	}
	
}
