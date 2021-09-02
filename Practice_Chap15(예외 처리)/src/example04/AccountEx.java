package example04;

public class AccountEx {

	public static void main(String[] args) {
	
		Account account = new Account();
		
		account.deposit(50000);
		System.out.println("현재 잔액 : "+account.getBalnce());
		
		
		try {
			// 예외처리 코드가 반드시 들어가야함
			// withdraw() 예외를 던지고 있기때문
			account.withdraw(10000);
			System.out.println("현재 잔액 : "+account.getBalnce());
			System.out.println();
			account.withdraw(50000);
			System.out.println("현재 잔액 : "+account.getBalnce());
		} catch (BalanceException e) {
			System.err.println("예외 원인 : "+e.getMessage());
		//	 e.printStackTrace();
		} finally {
			System.out.println("정상 종료 됨");
		}
		
	}

}
