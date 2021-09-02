package sec03.example06;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.Slider;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.util.Duration;



public class RootController implements Initializable{
	
	// FXML에 참조를 얻어온다
	@FXML private MediaView mediaView;
	@FXML private ImageView imageView;
	@FXML private Button btnPlay;
	@FXML private Button btnPause;
	@FXML private Button btnStop;
	
	/////////////////////////////////////
	
	@FXML private Label labelTime;
	@FXML private ProgressBar progressBar;
	@FXML private ProgressIndicator progressIndicator;
	@FXML private Slider sliderVolume;
	@FXML private Slider sliderMedia;
	
	
	private boolean endOfMedia;// 플래그 변수
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		// 재생할 소스 (Media)를 생성하는 코드
		
		//오디오
		//Media media = new Media(getClass().getResource("media/audio.mp3").toString());
		// 동영상
		Media media = new Media(getClass().getResource("media/테스트동영상.mp4").toString());
		
		//MediaView를 컨트롤할 MediaPlayer클래스를 생성하는 코드
		MediaPlayer mediaPlayer = new MediaPlayer(media);
		
		//MediaPlayer클래스가 제어하는 내용을 MediaView에 보여주기 위해서 아래와같이 작성
		mediaView.setMediaPlayer(mediaPlayer);
		
		// 소스가 분석도 제대로 안되었는데 play()호출하면 안됨(주의 사항)
		// mediaPlayer.play();
		// 소스분석이 끝나고 Unknown에서 Ready상태가 되면 아래와 같이 코드를 작성하면 된다.
		
		mediaPlayer.setOnReady(new Runnable() {
			@Override
			public void run() {
				// setDisable() 매개값이 true 이면 비활성화 ,false면 활성화
				btnPlay.setDisable(false); // 재생버튼을 활성화
				btnPause.setDisable(true); // 일시정지 버튼 비활성화
				btnStop.setDisable(true);  // 중지 버튼 비활성화	
				
				/////////////////////////////////////////
				
				// 재생정도를 미디어 슬라이더에 최고값과 최소값을 초단위로 매핑함
				sliderMedia.setMin(0.0);
				sliderMedia.setValue(0.0);
				sliderMedia.setMax(mediaPlayer.getTotalDuration().toSeconds());
				
				// MediaPlayer의 현재 시간을 속성감시하는 코드를 작성한다.
				// 시간이기에 제네릭 타입은 Duration이다.
				// 재이 되면서 currentTime이 변경이 되면, 그값은 newValue에 계속 들어오게 된다
				// currentTime을 ProgressBar,ProgressIndiator에 나타내기 위해서 0.0~1.0 사이의 값으로
				// 환산하여 나타 내줘야 하기 때문에 속성감시를 한다.
				mediaPlayer.currentTimeProperty().addListener(new ChangeListener<Duration>() {

					@Override
					public void changed(ObservableValue<? extends Duration> observable, 
										Duration oldValue,Duration newValue) {
						// 현재 재생시간 / 총재생시간 하면 , 0.0~1.0이 나올 것이다.
						double progress = mediaPlayer.getCurrentTime().toSeconds()/
						mediaPlayer.getTotalDuration().toSeconds();
 						// 0.0~1.0 값으로 각각 설정 해준다.
						progressBar.setProgress(progress);
						progressIndicator.setProgress(progress);
						// 슬라이더에 미디어 소스의 재생정도를 나타낸다.
						sliderMedia.setValue(mediaPlayer.getCurrentTime().toSeconds());
						// 재생시간을 Label에 표식 하기위한 설정
						labelTime.setText((int)mediaPlayer.getCurrentTime().toSeconds()+
									"/"+(int)mediaPlayer.getTotalDuration().toSeconds()+"초");
					
						System.out.println("재생 중");
					}
				});
			}
		});
		
		
		// 미디어소스가 실행되고 있을 때를 감지해서 실행할 내용을 람다식으로 코드 작성
		mediaPlayer.setOnPlaying(()-> {
		
			btnPlay.setDisable(true); 	// 재생버튼을 비활성화
			btnPause.setDisable(false); // 일시정지 버튼 활성화
			btnStop.setDisable(false);  // 중지 버튼 활성화	
			
		});
		// 미디어소스가 일시정지 되고 있을 때를 감지해서 실행할 내용을 람다식으로 코드 작성
		mediaPlayer.setOnPaused(()-> {
			
			btnPlay.setDisable(false); // 재생버튼을 활성화
			btnPause.setDisable(true); // 일시정지 버튼 비활성화
			btnStop.setDisable(false);  // 중지 버튼 활성화	
			
		});
		
		// 미디어소스가 중지상태 를 감지해서 실행할 내용을 람다식으로 코드 작성
		mediaPlayer.setOnStopped(()-> {
			
			btnPlay.setDisable(false); // 재생버튼을 활성화
			btnPause.setDisable(true); // 일시정지 버튼 비활성화
			btnStop.setDisable(true);  // 중지 버튼 비활성화	
			
		});
		// 미디어소스가  정상적인 상태로 재상완료를 
		// 감지해서 실행할 내용을 람다식으로 코드 작성
		mediaPlayer.setOnEndOfMedia(() -> {
			
			btnPlay.setDisable(false); // 재생버튼을 활성화
			btnPause.setDisable(true); // 일시정지 버튼 비활성화
			btnStop.setDisable(true);  // 중지 버튼 비활성화	
			
		// 문제는 재생이 완료가 되어도 재생 버튼은 활성하가 되어 클릭은 되지만
		// 재생이 되질 않는다 그 이유는 재생완료 시점에 그 미디어 소스의 상태가
		// 머물러 있기 때문이다. 하여 명시적으로 stop() 호출을 하고 그 소스의
		// 미디어의 상태를 처음으로 돌리는 코드를 작성을 해야한다. 
		// 위의 플래그 변수를 사용하면 된다.
			endOfMedia = true;
			
			// 강제적으로 1.0을 설정하여 완료 상태가 나오도록 만드는 코드
			progressBar.setProgress(1.0);
			progressIndicator.setProgress(1.0);
			
		});
		
		// 재생 버튼의 이벤트 처리 코드
		btnPlay.setOnAction( event -> {
		
			// 플래그 변수가 true 가 되었다는 것은 미디어 상태가 재생완료 (endOfMedia)상태를 가진다
			// 명시적으로 stop() 호출하고, 미디어 처음시간으로 돌려주는 코드를 작성함
			if(endOfMedia) {
				mediaPlayer.stop();
				mediaPlayer.seek(mediaPlayer.getStartTime());
				endOfMedia = false;
			}
			mediaPlayer.play();
		});
		
		// 일시정지 버튼을 클릭했을때 이벤트 처리 코드
		btnPause.setOnAction(event -> mediaPlayer.pause());
		// 중지 버튼을 클릭했을때 이벤트 처리 코드
		btnStop.setOnAction(event -> mediaPlayer.stop());
		
		
		// SliderVolume이 변경되었을 때 볼륨의 크기를 조절하는 속성감시 코드가 필요하다
		// Slider의 value값의 범위는 0.0~100.0이다 mediaPlayer의 value의 범위는
		// 0.0~1.0이기 때문에 100.0으로 나눈다
		sliderVolume.valueProperty().addListener(new ChangeListener<Number>() {

			
			
			@Override
			public void changed(ObservableValue<? extends Number> observable, 
								Number oldValue, Number newValue) {

				//mediaPlayer.setVolume(newValue.doubleValue()/100.0);
				mediaPlayer.setVolume(sliderVolume.getValue()/100.0);
				System.out.println("볼륨 조정");

			}

		});
	
		sliderVolume.setValue(50.0);
		
		
		///////////////////////////////////////
		// sliderMedia 부분을 마우스로 드래그를 하거나 움직일 대 미디어 소스도 같이
		// 변화가 일어나게끔 하는 코드를 작성을 해본다.
		
		sliderMedia.valueProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> observable, 
								Number oldValue, Number newValue) {

				// 마우스로 드래그할 때
				
				if(sliderMedia.isValueChanging()) {
					System.out.println("마우스 드래그");
					mediaPlayer.seek(Duration.seconds(sliderMedia.getValue()));
				}
				// 정상 재생 또는 마우스를 클릭할 때
				
				else {
					// 정상재생일 경우 (변화값 0.5미만)seek하지 않겠다.
					if(Math.abs(oldValue.doubleValue() - newValue.doubleValue()) > 0.5) {
						System.out.println("마우스 클릭");
						mediaPlayer.seek(Duration.seconds(sliderMedia.getValue()));
					}
				
				}
			}
		});
		
		
		
	}

}
