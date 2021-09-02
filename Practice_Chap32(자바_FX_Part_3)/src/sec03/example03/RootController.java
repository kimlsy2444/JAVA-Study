package sec03.example03;

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
	@FXML private Label lblResult;
	@FXML private Button btnStart;
	@FXML private Button btnStop;
	
	// Interger결과 값이 있는 Task를 만들기 위한 코드
	private Task<Integer> task;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		// 이벤트 등록코드
		btnStart.setOnAction(e ->BtnStart(e));
		btnStop.setOnAction(e ->BtnStop(e));
	}
	

	public void BtnStart(ActionEvent e) {
		 task = new Task<Integer>() {
	
			@Override
			protected Integer call() throws Exception {
				
				int result= 0;
				for(int i = 0;i<=100;i++){
					
					result +=i;
					this.updateProgress(i, 100);
					this.updateMessage(String.valueOf(i));
					
					try {
						Thread.sleep(100);
					}catch (InterruptedException e) {
						 this.updateMessage("인터럽트로 인한 취소됨");
						 break;
					}
					
				}
				
				return result;
			}
			
			
			// 성공했을 때 자동으로 실행되는 succeded() 재정의
			// 아래의 3개의 콜백메서드는 JavaFX Applicatrion스레드가 실행하므로 얼마든지 UI변경작성이 된다.
			
			@Override
			protected void succeeded() {
				System.out.println("succeeded()실행 스레드 : "+Thread.currentThread().getName());
				lblResult.setText(String.valueOf(task.getValue())); // 결과값을 UI 변경
			}
			
			// 취소되었을때 자동실행
			@Override
			protected void cancelled() {
				System.out.println("succeeded()실행 스레드 : "+Thread.currentThread().getName());
				lblResult.setText("취소됨"); // 결과값을 UI 변경
			
			}
			
			// 예외가 발생했을 때 자동실행
			@Override
			protected void failed() {
				System.out.println("succeeded()실행 스레드 : "+Thread.currentThread().getName());
				lblResult.setText("예외발생함"); // 결과값을 UI 변경
			}
		 };
		 
			//속성 바인딩 코드 작성
		 	progressBar.progressProperty().bind(task.progressProperty());
		 	lblWorkDone.textProperty().bind(task.messageProperty());
		 	lblResult.setText("");
		 	
		 	Thread thread = new Thread(task);
		 	thread.setDaemon(true);
		 	thread.start();
	
	}
	
	public void BtnStop(ActionEvent e) {
		 
		task.cancel();
	}

	
}
