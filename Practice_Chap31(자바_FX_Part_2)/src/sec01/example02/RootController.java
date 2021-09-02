package sec01.example02;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
// fxml 파일당 하나의 컨트롤러를 지정을 한다.
// 각종 이벤트에 대한 처리 내용들을 기술하는데 , 반드시 해야 할 것은
// Initializable 인터페이스를 구현을 해야 한다는 것을 명심 해야한다.
import javafx.scene.control.Button;

public class RootController implements Initializable {
	
	public RootController() {
		
		System.out.println("RootController 생성자 호출");
	}
	
	@FXML private Button button1;
	@FXML private Button button2;
	@FXML private Button button3;
	
	// 이벤트 처리 원리 
	// initializa()는 AppMain.java파일이 로딩이 될 때, FXMLLoader.load() 가 실행 될때
	// RootController객체가 만들어지고, FXML파일에 선언되어 있는 컨트롤의 참조가 이루어진
	// 다음 initialize()를 자동으로 JavaFX Application Thread 가 호출해 준다.
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		// 보통 initialize() 이벤트 처리 코드의 내용이 단순 복잡하든 
		// 직접 작성하면 난잡 해진다 하여 이벤트 등록만 해주고 그 실질적인 내용을 담당하는
		// 메서드들은 외부로 빼서 메서드를 작성하는 것이 바람직한 방법이다.
		
		
		System.out.println("initializa 메서드호출 ");
		// 여기서는 이벤트 등록만 하는 편이 좋다
		button1.setOnAction(e-> buttonHandle1(e));
		button2.setOnAction(e-> buttonHandle2(e));
		button3.setOnAction(e-> buttonHandle3(e));
		 
	}
	// button1의 실질적인 이벤트 처리 메서드 분리
	public void buttonHandle1(ActionEvent event) {
		System.out.println("Button1 이 클릭되었습니다.");
	}
	
	public void buttonHandle2(ActionEvent event) {
		System.out.println("Button2 이 클릭되었습니다.");
	}
	
	public void buttonHandle3(ActionEvent event) {
		System.out.println("Button3 이 클릭되었습니다.");
	}
	
	public void buttonHandle4(ActionEvent event) {
		System.out.println("Button4 이 클릭되었습니다.");
	}
	
}
