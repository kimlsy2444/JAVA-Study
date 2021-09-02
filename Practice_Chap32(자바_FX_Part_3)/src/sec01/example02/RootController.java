package sec01.example02;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Modality;
import javafx.stage.Popup;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class RootController implements Initializable{
	
	// FXML에 참조를 얻어온다
	@FXML private VBox vBox;
	
	private Stage primaryStage;
	
	public RootController() {
		System.out.println("RootController 생성자 호출");
	}
		
	 public void setPrimaryStage(Stage primaryStage) {
		this.primaryStage = primaryStage;
		System.out.println("setter호출");
	}

	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		System.out.println("initialize() 호출됨");
	}
	
	public void OpenFileChooser(ActionEvent event) {
		
		FileChooser fileChooser =  new FileChooser();
		// getExtensionFilters()는 파일확장명을 기준으로 필터링을 해주는 메서드이다.
		// 아울러 매개값으로 ExtensionFilter객체를 가진다.
		fileChooser.getExtensionFilters().addAll(
				
				new ExtensionFilter("Txt Files(*.txt)","*.txt"),
				new ExtensionFilter("Image Files(*.png,*.jpg,*gif)","*.png","*.jpg","*.gif"),
				new ExtensionFilter("Audio Files(*.mp3,*aac)","*.mp3","*.aac"),
				new ExtensionFilter("All Files(*.*)","*.*(")
				
				);
		
		// primaryStage의 참조를 얻어서 주윈도우로 설정을 해야한다.
		// File selectedFile = fileChooser.showOpenDialog(primaryStage);
		
		// 2번째 방법으로 컨테이너나 컨트롤에서 직접 primaryStage의 참조를 얻는다.
		File selectedFile = fileChooser.showOpenDialog(vBox.getScene().getWindow());
		
		
		
		if(selectedFile != null) {
			System.out.println("선택 파일 경로 :" +selectedFile.getParent());
			System.out.println("파일의 크기 : "+ selectedFile.length());
		}

		
	}
	
	// 파일 저장
	public void SaveFileChooser(ActionEvent event) {
		FileChooser fileChooser =  new FileChooser();
		
		fileChooser.getExtensionFilters().addAll
					(new ExtensionFilter("All Files(*.*)","*.*("));
		
		File selectedFile = fileChooser.showSaveDialog(vBox.getScene().getWindow());
		
		if(selectedFile != null) {
			System.out.println("저장된 파일 경로 :" +selectedFile.getParent());
			System.out.println("저장된 파일크기 : "+ selectedFile.length());
		}
		
	}
	
	// 폴더 선택
	public void OpenDirectoryFileChooser(ActionEvent event) {
		DirectoryChooser directoryChooser = new DirectoryChooser();
		File selectedFolder = directoryChooser.showDialog(primaryStage);
		if(selectedFolder!= null) {
			System.out.println("선택된 폴더 경로 :" +selectedFolder.getParent());
		
			
		}
	}
	
	// 팝업창
	public void OpenPopup(ActionEvent event) throws Exception{
		Popup popup = new Popup();
		Parent parent = FXMLLoader.load(getClass().getResource("popup.fxml"));
		
		// lookup()의 매개변수가 fxml파일의 id값이 된다.
		// id를 부여한 컨트롤을 찾는다 리턴타입이 Node이기 때문에 ImageView로 다운캐스팅을 하면 된다.
		// 궁극적으로 사용하는 이유는 자바코드에서 동적으로 이미지를 설정해주기 위한 것
		ImageView imageView = (ImageView)parent.lookup("#imgMessage");
		imageView.setImage(new Image(getClass().getResource("images/dialog-info.png").toString()));
		
		Label lblMessage =  (Label)parent.lookup("#lblMessage");
		lblMessage.setText("알림창이 떴습니다!!!");
		
		// Popup창에 fxml파일의 내용을 추가한다.
		popup.getContent().add(parent);
		// 마우스 포인터가 다른 위도우로 가져가면 팝업창이 자동으로 닫히게끔 함
		popup.setAutoHide(true);
		
		popup.show(primaryStage);
	}
	
	// 사용자 정의 다이얼로그
	public void OpenCustom(ActionEvent event) throws Exception{
		// 바탕색이 흰색이고 제목과 닫기 버튼만 존재하는 stage를 생성한다.
		Stage dialog = new Stage(StageStyle.UTILITY);
		dialog.initModality(Modality.WINDOW_MODAL);
		dialog.initOwner(primaryStage);
		dialog.setTitle("확인");
		
		Parent parent = FXMLLoader.load(getClass().getResource("custom.fxml"));
		
		// fxml파일에 있는 Label컨트롤의 참조를 얻어서 아래와 같이 동적으로 메세지 작성
	 	Label txtTitle =  (Label)parent.lookup("#txtTitle");
		txtTitle.setText("확인하셨나요?");
	 	txtTitle.setFont(new Font(30));
	 	
	 	Button btnOk= (Button)parent.lookup("#btnOK");
		btnOk.setOnAction(e-> dialog.close());
		
		Scene scene = new Scene(parent);
		
		dialog.setOnCloseRequest(e-> System.out.println("다이얼로그 종료"));

		dialog.setScene(scene);
		dialog.setResizable(false);
		dialog.show();
	}
	
	

}
