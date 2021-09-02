package sec02.example01;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AppMain extends Application {
	
	 // 유지보수가 치명적
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		// 프로그램적 레이아웃 
		// 컨테이너 설정 및 각종 컨트롤들을 생성하고 배치 하는것이
		// 전부 자바 코드로 이루어짐 
	
		HBox hBox = new HBox(); // 루트 컨테이너
		hBox.setPadding(new Insets(10,10,10,10)); // 안쪽 여백 설정
		hBox.setSpacing(10); // 컨트롤의 간격 10픽셀로한다
		
		// TextField 글자 입력 받을 수 있는 컨트롤 
		TextField textField = new TextField();
		textField.setPrefWidth(200); // 폭을 설정
		
		Button button = new Button();
		button.setText("Confirm");
		// 컨테이너에 컨트롤들을 배치하기 위해서
	    ObservableList<Node> list = hBox.getChildren();
		list.add(textField);
		list.add(button);
		
		// 화면에 루트 컨테이너 (Parent)
		
		Scene scene = new Scene(hBox); 	  // 장면 설정
		primaryStage.setTitle("AppMain"); // 윈도우 타이틀
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		
		Application.launch(args);

	}

}
