package example04;

public class Account {
	
	private long balnce;
	
	public Account() {
	
	}
	// 현재의 잔액을 가져오가
	public long getBalnce() {
		
		return this.balnce;
	}
	// 입금하기
	public void deposit(int money){
		this.balnce += money;
	}
	// 출금하기
	public void withdraw(int money) throws BalanceException{
		if(this.balnce < money) {
			// 강제 예외 발생
			throw new BalanceException("잔액 부족");
		}
		this.balnce -= money;
	}
}
