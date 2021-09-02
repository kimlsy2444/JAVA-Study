package CardDeck;

public class DeckEx {

	public static void main(String[] args) {
		
		Deck d = new Deck();
		//Deck 의 생성자를 호출하면 항상 ,포함된 클래스부터 생성을 먼저함(중요)
		Card c = d.pick(51);
		System.out.printf("카드 섞기전에 제일 밑 있는 카드 : "); 
		System.out.println(c.toString()); 
		
		d.shuffle();
		c= d.pick(51);
		System.out.printf("카드 섞기은 후 제일 밑 있는 카드 : "); 
		System.out.println(c.toString()); 
		
		
		c= d.pick();
		System.out.printf(" 카드 섞기은 후 임의로 뽑은 카드 : "); 
		System.out.println(c.toString());
	}

}
