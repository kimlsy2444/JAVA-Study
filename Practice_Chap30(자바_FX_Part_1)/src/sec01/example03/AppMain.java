package sec01.example03;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class AppMain extends Application{
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// VBox는 컨테이너 클래스의 한 종류 이며 ,수직으로 내용(컨트롤)들을 
		// 배치하는 컨테이너 이다.
		
		VBox root = new VBox();
		root.setPrefWidth(500); // 넓이 설정
		root.setPrefHeight(350);// 높이 설정
		root.setAlignment(Pos.CENTER);// 중앙정렬
		root.setSpacing(20);// 배치되는 컨트롤 간격을 20px 로 하겠다.
		
		Label label = new Label();
		label.setText("안녕! 자바 FX");
		label.setFont(new Font(50));
		
		Button button = new Button();
		button.setText("확인");
		// 람다식으로 버튼을 클릭시 종료되도록 간단히 이벤트 처리함
		button.setOnAction( (ActionEvent event)  -> Platform.exit());
		// 익명 구현객체를 직접 만들어서 이벤트 핸들링 
//		button.setOnAction(new EventHandler<ActionEvent>() {
//			
//			@Override
//			public void handle(ActionEvent event) {
//				 System.out.println("윈도우 종료");
//				 Platform.exit();
//			}
//		});
		
		// VBox 컨테이너에 컨트롤들을 배치함.
		ObservableList<Node> list = root.getChildren();
		list.add(new Label("HELLO!!!"));
		list.add(label);
		list.add(button); 
		
		// Scene의 생성자의 매개값은 Parent라는 추상클래스이다.
		// VBox는 Parent를 상속 받으므로 매개값으로 들어가는데 문제가 없다.
		// 통상 컨테이너가 매개값으로 들어간다.
		
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}
	
	public static void main(String[] args) {
		
		Application.launch(args);

	}
	// 1. 먼저 Stage가 무대라는 것 즉 윈도우 창에 해당한다.
	// 2. 그 Stage 가 설정되면 장면 즉 Scene을 만들어서 설정해준다.
	// 3. Scene을 설정할 때 매개값은 통상 Parent 클래스가 오는데,
	// 추상클래스 이므로 하위 컨테이너 클래스를 넘겨준다.
	// 4. Parent클래스를 상속 받는 컨테이너에 각종 컨트롤(내용)을 추가 배치한다.
}
