package sec03.example03;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionModel;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;



public class RootController implements Initializable{
	
	// FXML에 참조를 얻어온다
	@FXML private ListView<String> listView;
	@FXML private ImageView imageView;
	@FXML private Button btn1_print;
	@FXML private Button btn2_exit;
	
	
	String str = null;
	
	
	
	 
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		//리스뷰 에 대해서 속성감시를 통해서 파일 경로를 알아내어서 이미지 뷰에 이미지 출력
		
		ListView l = null;
		
		
		listView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> observable, 
								String oldValue, String newValue) {
				
				str = newValue.toString(); // 이미지의 경로 저장
				// 이미지뷰에 리스트뷰에서 선택한 이미지를 보여주는 코드
				imageView.setImage(new Image(getClass().getResource("images/"+
								   newValue.toString()).toString()));
				}
		});
		
		btn1_print.setOnAction(event -> btn1Print(event,str));
		btn2_exit.setOnAction(event -> btn2Exit(event));
	}





	public void btn2Exit(ActionEvent event) {
		
		System.exit(0);
	 
	}





	public void  btn1Print(ActionEvent event, String str) {
		
		System.out.println("이미지 경로 : images/"+str);
	}



















	
	
	
	
}
