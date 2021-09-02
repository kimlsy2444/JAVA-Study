package sec03.example02;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class RootController implements Initializable{
	
	// FXML에 참조를 얻어온다
	@FXML private TextField txtTitle;
	@FXML private PasswordField txtPassword;
	@FXML private ComboBox<String> comboTxt;
	@FXML private DatePicker date;
	@FXML private TextArea textArea;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}
	
	
	public void handleBtnPrint() {
		
		String title = 	txtTitle.getText();
		System.out.println("제목 : "+title);
	
		String passWord = 	txtPassword.getText();
		System.out.println("패스워드 : "+passWord);
	
		String combo = comboTxt.getValue();
		// 선택이 되지 않았을 경우도 있어 조건문을 넣어야한다
		if(combo !=null) {
			System.out.println("공개여부 : "+combo);
		}
		// DatePick는 사용자로부터 날짜가 선택이 되야지만
		// 그 값을 LocalDate 타입으로 리턴을한다.
		// 선택을 안했다면 null 리턴되어지므로 유효성 검사하는 코드가 필요하다
		LocalDate localDate = date.getValue();
		
		if(localDate !=null) {
			System.out.println("게시 종료일 : " +localDate.toString());
		}
		
		String content = textArea.getText();
		System.out.println("내용 : "+ content);
		
	
		
	}
	
	
	public void handleBtnExit() {
		System.exit(0);
	}
	
	
}
