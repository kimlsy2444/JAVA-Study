package sec02.example03;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
 

public class ClientController extends Application implements Initializable {

	//fxml참조 얻기
	 
	/////////////////////////////////
	@FXML private TextArea txtDisplay;
	@FXML private TextField txtInput;
	@FXML private Button btnConn;
	@FXML private Button btnSend;
	
	////////////////////////////////
	Socket socket;

	public static void main(String[] args) {
		launch(args);
	}
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		 
		txtDisplay.setEditable(false);
		// 텍스트 필드에 키보드로 엔터키를 입력을 했을때도 내용 전송 되도록 이벤트 처리코드 등록
		txtInput.setOnAction(e -> send(txtInput.getText()));
		btnConn.setOnAction(e->{
			
			if(btnConn.getText() .equals("start")) {
				startClient();
			}
			else if(btnConn.getText().equals("stop")) {
				stopClient();
			}
			
		});
		
		// 최초 클라이언트 창이 뜨면  send버튼을 비활성화 하는코드
		btnSend.setDisable(true);
		btnSend.setOnAction(e -> send(txtInput.getText()));
	}
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Parent root = FXMLLoader.load(getClass().getResource("client.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("클라이언트");
		primaryStage.show();		
	}
	
	
	public void displayText(String text) {
		// 대화 내용을 남기기위해서 appentText()사용
		txtDisplay.appendText(text+"\n");
	}
	
	
				
	public void startClient() {
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					socket = new Socket();
					socket.connect(new InetSocketAddress("localhost",7777));
					Platform.runLater(() ->{
						displayText("[연결 성공 : "+socket.getRemoteSocketAddress() +"]");	
						// 연결이 성공하면 start버튼을 stop으로 바꾸고 sned버튼을 활성화
						// 
						btnConn.setText("stop");
						btnSend.setDisable(false);
					});
				} catch (Exception e) {
					 Platform.runLater(() ->  displayText("[서버 통신 불가]"));
					 
						 if(!socket.isClosed()) {
							 stopClient();
						 }
					return;
				}
				// 연결에 성공을 하면 데이터 수신을 먼저 하기 위해서 receive() 를 바로 호출해주도록 한다.
				receive();
			}
		};
		thread.start();
		
	}
	
	public void stopClient() {
		try {
			Platform.runLater(() ->{
				displayText("[접속 끊음]");
				btnConn.setText("start");
				btnSend.setDisable(true);
			});
			if(socket != null && !socket.isClosed()) {
				socket.close();
			}
		}catch (Exception e) {}
	}
	
	public void receive() {
		// 데이터를 계속적으로 받기 위해서 무한루프로 작성함
		while(true) {
			try {
				byte[] byteArr = new byte[1000];
				InputStream inputStream =socket.getInputStream();
				
				// 서버가 비정상적으로 종료했을 경우 IOException을 발생시킴
				
				int readCount = inputStream.read(byteArr);
				// 서버가 정상적으로  Socket의 close() 호출했을때
				if(readCount == -1) {
					throw new IOException();
				}
				// 읽은 데이터 디코딩
				String data = new String(byteArr,0,readCount,"UTF-8");
				Platform.runLater(() -> displayText("[수신 완료] "+data));
			}catch (Exception e) {
				Platform.runLater(() -> displayText("[서버 통신 불가] "));
				stopClient();
				break;
			}
			
		}
	}
	
	
	
	//데이터를 전송하는 메서드	
		public void send(String data) {
			Thread thread = new Thread() {
				@Override
				public void run() {
					try {
						byte[] byteArr = data.getBytes("UTF-8");
						OutputStream outputStream = socket.getOutputStream();
						outputStream.write(byteArr);
						outputStream.flush();
						Platform.runLater(() -> {
							displayText("[송신 완료] " + data);
							//데이터를 보내고 나면 텍스트 필드를 내용 초기화
							txtInput.setText("");
						});					
					}catch (Exception e) {
						Platform.runLater(() -> displayText("[서버 통신 불가]"));
						stopClient();					
					}
				}			
			};
			thread.start();		
		}	
	}

