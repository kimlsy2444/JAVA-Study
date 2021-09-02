package sec02.example02;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class RootController implements Initializable{
	
	// FXML에 참조를 얻어온다
	@FXML private TextArea textArea;
	@FXML private TextField textField;
	
	
	
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		// 단방향 바인드 처리
		// textArea.textProperty().bind(textField.textProperty());
		
		// 단방향 바인드 해제
		// textArea.textProperty().unbind();
		
		// 양방향 바인드 처리
		// textArea.textProperty().bindBidirectional(textField.textProperty());
		
		// Bindings 클래스를 이용하여 사용하는것이 편하다 바람직 하다
		Bindings.bindBidirectional(textArea.textProperty(), textField.textProperty());
		
		// 양방향 바인드 해제
		// Bindings.unbindBidirectional(textArea.textProperty(), textField.textProperty());
		
		
	}
}
