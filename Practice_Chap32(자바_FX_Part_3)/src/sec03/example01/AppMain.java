package sec03.example01;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class AppMain extends Application{
	
	@Override
	public void start(Stage primaryStage) throws Exception {
	
	Parent parent = FXMLLoader.load(getClass().getResource("root.fxml"));
	Scene scene = new Scene(parent);
	
	// 외부에서 작성한 CSS파일을 Scene에 적용하는 코드를 아래와 같이 작성한다.
	
	//scene.getStylesheets().add(getClass().getResource("test.css").toString());
	
	primaryStage.setTitle("스레드 동시성");
	primaryStage.setScene(scene);
	primaryStage.show();
		
	}
	
	
	public static void main(String[] args) {
		 Application.launch(args);
	 
	}
	
	

}


