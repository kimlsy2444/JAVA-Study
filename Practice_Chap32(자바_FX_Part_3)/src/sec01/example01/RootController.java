package sec01.example01;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;


public class RootController implements Initializable{
	
	// FXML에 참조를 얻어온다
	@FXML private TextArea textArea;
	@FXML private ComboBox<String> comboBox;

	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}
	

	public void handleNew(ActionEvent eveent) {
		//setText는 이벤트가 처리가 될 때마다 새로 갱신하므로 appendText()를사용한다
		//textArea.setText("새로만들기\n");.
		textArea.appendText("새로만들기\n");
	}
	
	public void handleOpen() {
		textArea.appendText("열기\n");
	}
	

	public void handleSave() {
		textArea.appendText("저장하기\n");
	}

	public void handleExit() {
		textArea.appendText("끝내기\n");
	}
	public void handleCombo() {
		if(comboBox.getValue().equals("공개")) {
			textArea.appendText("공개\n");
	 	}
	 	else {
	 		textArea.appendText("비공개\n");
	 	}
	}
	
}
