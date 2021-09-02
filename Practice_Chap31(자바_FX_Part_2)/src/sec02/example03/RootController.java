package sec02.example03;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.binding.Bindings;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class RootController implements Initializable{
	
	// FXML에 참조를 얻어온다
	@FXML private TextArea textA2_1;
	@FXML private TextArea textA10_1;
	
	@FXML private TextArea textA8_2;
	@FXML private TextArea textA10_2;
	
	@FXML private TextArea textA16_3;
	@FXML private TextArea textA10_3;

	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		// 10진수를 입력하면 TextArea를 속성감시하여 10진수가 입력되면 2진수로 변환해서
		// TextArea부분에 나타낸다.
		textA10_1.textProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> observable, 
								String oldValue, String newValue) {
				String temp="";
				try {
					temp = Integer.toBinaryString(Integer.parseInt(newValue));
					textA2_1.setText(temp);
					
				} catch (Exception e) {
				 System.out.println("숫자를 입력하세요");
				}
			}
		});
		
		// 10진수를 입력하면 TextArea를 속성감시하여 10진수가 입력되면 8진수로 변환해서
		// TextArea부분에 나타낸다.
		textA10_2.textProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> observable, 
								String oldValue, String newValue) {
				String temp="";
				try {
					temp = Integer.toOctalString(Integer.parseInt(newValue));
					textA8_2.setText(temp);
					
				} catch (Exception e) {
				 System.out.println("숫자를 입력하세요");
				}
			}
		});
		
		// 10진수를 입력하면 TextArea를 속성감시하여 10진수가 입력되면 16진수로 변환해서
		// TextArea부분에 나타낸다.
		textA10_3.textProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> observable, 
								String oldValue, String newValue) {
				String temp="";
				try {
					temp = Integer.toHexString (Integer.parseInt(newValue));
					textA16_3.setText(temp);
					
				} catch (Exception e) {
				 System.out.println("숫자를 입력하세요");
				}
			}
		});
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
