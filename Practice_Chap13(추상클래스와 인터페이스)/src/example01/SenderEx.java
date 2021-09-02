package example01;

public class SenderEx {

	public static void main(String[] args) {
		// ContentSender 는 추상 클래스 이니 절대 인스턴스를 생성 할 수가 없다.
		// ContentSender contentSender = new ContentSender();
		// 추상클래스도 조상이니깐 필드의 다형성이 적용됨
		ContentSender contentSender1 = new KakaoSender("사이코지만 괜찮아", "장규리"
														, "간호사");
		
		contentSender1.sendMessage("송하영");
		System.out.println();
		
		ContentSender contentSender2 = new SmsSender("SMS", "송하영"
													, "프로미스나인");
		
		contentSender2.sendMessage("이채영");
		
		
	}

}
