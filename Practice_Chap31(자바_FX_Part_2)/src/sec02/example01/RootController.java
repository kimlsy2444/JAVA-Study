package sec02.example01;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.text.Font;

public class RootController implements Initializable{
	
	// FXML에 참조를 얻어온다
	@FXML private Label label1;
	@FXML private Label label2;
	
	
	// Slider 0.0에서 100.0까지의 double값을 지닌다.
	@FXML private Slider slider;
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		

			 
		// slider컨트롤의 속성값(0.0~100.0)을 감시하기 위해서 valueProperty()에
		// ChangeListener를 등록을 한다.
		slider.valueProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number>
			observable, Number oldValue, Number newValue) {
				
				// oldValuer값은 변경되기 이전 값, newValue는 변경된 값을 의미한다.
				// 아울러 <? extends Number>는 제네릭 와일드 카드 타입으로 
				// Number이거나 Nnmber클래스를 상속받는 하위클래스만 오도록
				// 상위타입을 제한을 의미한다.
				
				
				
				// slider의 값의 변경(속성감시)에 따라서 Label컨트롤의 Font설정의 값을 
				// 매핑함으로써, 글자의 크기가 변경이 되는 것이다.
				label1.setFont(new Font(newValue.doubleValue()));
				label2.setFont(new Font(newValue.doubleValue()));
				
//				System.out.println("변경전 값 : "+oldValue.doubleValue());
//				System.out.println("변경후 값 : "+newValue.doubleValue());
				
			}
		});
		
	}
}
