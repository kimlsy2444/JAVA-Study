package example01;

public class CardEx {

	public static void main(String[] args) {
		
		
		Card card1 = new Card();
		Card card2 = new Card();
		card1.setColor("노랑");
		card1.setCompany("국민은행");
		
		System.out.println(card1);
		
		
		// static 변수는 반드시 클래스명.static 변수명으로 접근
		// 웬만하면 공유변수는 분석하는 단계에서는 바꾸지 않는게 바람직한 방법
		Card.width = 80;
		Card.height = 50;
		
		card2.setColor("파랑");
		card2.setCompany("농협");
		System.out.println(card2);
		
		card1.show();
	}

}
