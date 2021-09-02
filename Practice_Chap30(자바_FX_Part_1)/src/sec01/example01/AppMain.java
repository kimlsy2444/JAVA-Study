package sec01.example01;

import javafx.application.Application;
import javafx.stage.Stage;

public class AppMain extends Application{
	// Main 은 항상 javafx.application.Application (추상 클래스)을 항상 상속해야한다.
	 
	// Application클래스 start()를 반드시 오버라이딩 해야한다.
	@Override
	public void start(Stage primaryStage) throws Exception {
		String threadName = Thread.currentThread().getName();
		System.out.println("start 메서드 움직이는 스레드 : "+ threadName);
		primaryStage.show();
		
	}
	public static void main(String[] args) {
	 
		String threadName = Thread.currentThread().getName();
		System.out.println("main 메서드 움직이는 스레드 : "+ threadName);
		//launch()실행되면서 JavaFX어플리케이션 스레드가 생성되어 start()호출하여 준다.
		Application.launch(args);
	 
	}

}
