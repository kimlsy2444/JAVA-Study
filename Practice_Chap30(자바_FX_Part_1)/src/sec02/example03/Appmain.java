package sec02.example03;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Appmain extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		// 두 개의 여백을 주는 방법을 잘 이해할 필요가 있다.
		
		HBox hBox = new HBox();
		// HBox 를 기준으로 하여 ,시계방향으로 각각 안쪽 여백을 준다. (들여 쓰기 형태)
//		hBox.setPadding(new Insets(20, 20, 0, 60)); // Padding 안쪽 여백
//		
//		Button button = new Button();
//		button.setPrefSize(100, 100);
		
		// 마진 설정 
		// HBox.setMargin() 를 호출할 때 매개값으로 컨트롤을 주게 되면,
		// 컨트롤을 기준으로 마진(바깥 여백)이 설정된다
		Button button = new Button();
		button.setPrefSize(100, 100);
		HBox.setMargin(button, new Insets(20, 20, 0, 60));
		
		// 패안마바 (패딩은 안쪽여백, 마진은 바깥여백)
		
		hBox.getChildren().add(button);
		Scene scene = new Scene(hBox);
		primaryStage.setTitle("여백");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	
	
	public static void main(String[] args) {
		 Application.launch(args);
	}

}
