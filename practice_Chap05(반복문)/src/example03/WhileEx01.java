package example03;

public class WhileEx01 {

	public static void main(String[] args) {
		
		int sum=0;
		int i= 0;
		//while 문은 초기화하는 부분이 따로 존재하지않는다.
		
		// while 문 옆에는 조건식만 들어가기 떄문에  for문에 비해서
		// 일반적 루핑에서는 가독성이 떨어진다.
		
		// c언어 에서는 따로 boolean 타입이 없다 .하여 0 거짓
		// 0을 제외한 모든 값을든 참으로 인식한다.
		while(true) {
			sum+=i;
			if (i>=100)
			{
				break;
			}
			i++;	
		}
		System.out.println("1~100 sum = "+ sum);

		
		
		
	}

}
