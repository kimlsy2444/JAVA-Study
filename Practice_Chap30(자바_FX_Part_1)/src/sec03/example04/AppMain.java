package sec03.example04;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		 
		// 루트 컨테이너로 만들어진 fxml 파일을 로딩하고 있다.
		Parent parent = FXMLLoader.load(getClass().getResource("root.fxml"));
		Scene scene = new Scene(parent); // 장면 설정 
		primaryStage.setTitle("FlowPane");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
		 
		
		Application.launch(args);

	}

}
