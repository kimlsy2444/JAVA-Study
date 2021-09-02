package example14;

import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FileDialongEx {

	public static void main(String[] args) {
		 
		Frame frame = new Frame("파일 다이얼로그");
		
		frame.setSize(200,200);
		
		// mode는 기본 값은 FileDialog.LOAD이지만 통상 , FileDialog.SAVE로
		// 나누어진다. 
		FileDialog fileOpen = new FileDialog(frame, "파일열기",FileDialog.LOAD);
		FileDialog fileSave = new FileDialog(frame, "파일열기",FileDialog.SAVE);
		
		frame.setVisible(true);
		fileOpen.setVisible(true);
		fileSave.setVisible(true);
		
		System.out.println("선택 파일 경로 및 이름 : "+fileOpen.getDirectory()+fileOpen.getFile());
		
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		
	}

}
