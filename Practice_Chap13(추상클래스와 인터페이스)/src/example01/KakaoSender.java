package example01;

public  class  KakaoSender extends ContentSender {
	
	 private String content;

	 
	public KakaoSender(String title, String name, String content) {
		super(title, name);
		this.content = content;
	}

	 
	public String getContent() {
		return content;
	}

	// 조상클래스의 추상메서드를 오버라이딩함.
	@Override
	public void sendMessage(String recipient) {
		
		System.out.println("제목 : " + this.getTitle());
		System.out.println("이름 : " + this.getName());
		System.out.println("내용 : " + this.getContent());
		System.out.println("받는 사람 : " + recipient);
	}
	
	
}
