package example06;

public class ConversationBook extends Book {
	

	private String languge;

	public ConversationBook(int proudctID, String description, String maker, int price, int iSBN, String title,
			String author, String languge) {
		super(proudctID, description, maker, price, iSBN, title, author);
		this.languge = languge;
	}
	


	public String getLanguge() {
		return languge;
	}





	@Override
	public void showInfo() {
	
		super.showInfo(); // 조상크래스의 매서드를 명시적 호출
		System.out.println("언어 >> " + this.getLanguge()); 
	
	
		 
	}
	
}
