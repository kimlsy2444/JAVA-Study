package sec03.example05;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;



public class RootController implements Initializable{
	
	// FXML에 참조를 얻어온다
	@FXML private MediaView mediaView;
	@FXML private ImageView imageView;
	@FXML private Button btnPlay;
	@FXML private Button btnPause;
	@FXML private Button btnStop;
	
	
	private boolean endOfMedia;// 플래그 변수
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		// 재생할 소스 (Media)를 생성하는 코드
		
		// 오디오
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
				// setDisable() 매개값이 true 이면 비활성화 ,flase면 활성화
				btnPlay.setDisable(false); // 재생버튼을 활성화
				btnPause.setDisable(true); // 일시정지 버튼 비활성화
				btnStop.setDisable(true);  // 중지 버튼 비활성화	
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
	}

}
