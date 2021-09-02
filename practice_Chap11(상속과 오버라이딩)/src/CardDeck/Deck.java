package CardDeck;

public class Deck {

	
		final int CARD_NUM = 52; // 카드의 개수
		// 객체배열(2차원 배열 타입)
		Card[] c = new Card[CARD_NUM];		
		
		int i = 0;
		// 인스턴스 초기화 블럭
		{
			// 52번 돌면서 카드를 초기화
			for(int  k = Card.KIND_MAX;k > 0;k--) {
				for(int n = 1;n<Card.NUM_MAX+1;n++) {
					c[i++] = new Card(k,n);
					
				}
				
			}
			// 제대로 초기화가 이루어 졋는지 확인 내용을 직접 출력해봄
			for(int j = 0;j<c.length;j++) {
				System.out.printf("C[%d] 의 무늬 : %d, C[%d]의 숫자 : %d",j,c[j].kind,
						j,c[j].number); 
				System.out.println();
			}
		}
		
		public Deck() {
			super();
			System.out.println("Deck 기본생성자 호출");
		}
		
		
		// 지정된 위치(intdex)에 있는 카드 하나를 선택
		public Card pick(int index) {
			if(0 <= index && index <CARD_NUM) {
				return c[index];
			}
			else {
				return pick();
			}
		}
		// Deck 에서 카드 하나를 임의로 선택
		
		public Card pick() {
			int index = (int)(Math.random()*CARD_NUM);
			System.out.println();
			System.out.printf("%d\n",index);
			return pick(index);
		}
		// 단순히 섞는 메서드
		public void shuffle() {
			for(int n = 0; n<1000;n++) {
				// 카드를 무작위로 섞는다.
				int i = (int)(Math.random()*CARD_NUM);
				Card temp = c[0];
				c[0]= c[i];
				c[i] = temp;
			}
			System.out.println();
			System.out.println("카드 섞은후 결과");
			for(int j = 0;j<c.length;j++) {
				System.out.printf("C[%d] 의 무늬 : %d, C[%d]의 숫자 : %d",j,c[j].kind,
						j,c[j].number); 
				System.out.println();
				
			}
		}
		
}
