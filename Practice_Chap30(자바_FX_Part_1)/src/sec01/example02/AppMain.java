package sec01.example02;

import javafx.application.Application;
import javafx.stage.Stage;

public class AppMain extends Application{
	
	// 실행스레드 : JavaFX Application Thread
	public AppMain() {
		System.out.println("생성자 호출");
		System.out.println("생성자 스레드 명 : "+Thread.currentThread().getName());
	}
	// 실행 스레드 : JavaFX-Launcher
	@Override
	public void init() throws Exception {
	 
		System.out.println("init()실행");
		System.out.println("init() 스레드 명 : "+Thread.currentThread().getName());
	}
	
	// 실행스레드 : JavaFX Application Thread
	@Override
	public void start(Stage primaryStage) throws Exception {
	 
		System.out.println("start()실행");
		System.out.println("start() 스레드 명 : "+Thread.currentThread().getName());
		primaryStage.show();
		
	}
	// 실행스레드 : JavaFX Application Thread
	// 윈도우 창에 X 표시를 클릭시에 자동으로 호출
	// Appliaction 프로그램에서 종료 시에  수행해야할 코드들을 주로 작성한다.
	
	@Override
	public void stop() throws Exception {
		System.out.println("stop()실행");
		System.out.println("stop() 스레드 명 : "+Thread.currentThread().getName());
	}
	
	
	public static void main(String[] args) {

		
		Application.launch(args);
	}
	

}
