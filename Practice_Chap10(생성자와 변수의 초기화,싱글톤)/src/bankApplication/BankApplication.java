package bankApplication;

import java.util.Scanner;

public class BankApplication {

	
	// 배얼 100 개 정적 멤버로 되어있고, 배열이므로 한계가 있다.(메모리 낭비 ,정적)
	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		//atm 기기는 계속 돌기 떄문에 무한루프를 만들예정
		
		boolean run = true;
		
		while(run) {
			System.out.println("----------------------------------------------");
			System.out.println("|1.계좌생성|2.계좌목록|3.예금하기|4.출금하기|5.종료하기|");
			System.out.println("----------------------------------------------");
			System.out.print("선택->");
		
		int choice =sc.nextInt();
			if(choice == 1) {
				createAccount();
				
				
			}
			else if(choice == 2) {
				accountlist();
				
			}
			
			else if (choice == 3) {
				deposit();
				
			}
			
			
			else if (choice == 4) {
				withdraw();
				
			}
			
			else if (choice == 5) {
				System.out.println("계좌 관리 프로그램을 종료합니다.");
				run= false;
			}
			else {
				System.out.println("잘못 입력 하셧습니다.!!");
			}
			
		}
		
	}
	public static void  createAccount() {
		System.out.println("---------------"); 
		System.out.println("계좌를 생성합니다.");
		System.out.println("---------------"); 
		
		System.out.print("계좌번호 : "); 
		//next () : 한 단어를 입력받을 떄 용이한 메서드 (공백을 발견하면 그 앞까지만 String 리턴)
		//nextLine() : 한 문장이나 한 줄을 입력받을 댸 용이한 메서드() 
		String ano = sc.next();
		System.out.print("계좌주 : "); 
		String owner = sc.next();
		
		System.out.print("초기 입금액 : "); 
		int balance = sc.nextInt();
		
		Account newAccount = new Account( ano, owner,balance);
		
		for(int i = 0;i<accountArray.length;i++) {
			if(accountArray[i] == null) {
				//어태치 작업중
				accountArray[i] = newAccount;
				System.out.println("결과 : 계좌 생성 완료");
//				System.out.println(accountArray[i].getAno()+","
//						+accountArray[i].getOwner()+","
//						+accountArray[i].getBalance());
				break;
			}
		}
	}
	
	public static void accountlist() {
		System.out.println("---------------"); 
		System.out.println("계좌목록을 출력합니다.");
		System.out.println("---------------"); 
		
		for(int i = 0;i<accountArray.length;i++) {
			Account account =accountArray[i];
			if(account != null) {
				System.out.print(account.getAno()); 
				System.out.print("\t"); 
				System.out.print(account.getOwner()); 
				System.out.print("\t"); 
				System.out.print(account.getBalance()); 
				System.out.println(); 
				
			}
		}
	}
	
	public static void deposit() {
		System.out.println("---------------"); 
		System.out.println("예금을 합니다.");
		System.out.println("---------------"); 	
		
		System.out.print("계좌번호 입력 : ");
		String ano = sc.next(); 
		System.out.print("예금액 입력 : ");
		int money = sc.nextInt(); 
		
		Account account = findAccount(ano);
		
		if(account == null){
			System.out.println("결과 : 계좌가 없습니다. 확인 바랍니다.");
			return;
		}
		account.setBalance(account.getBalance() + money);
		System.out.println("겔과 : 예금 완료  현재 잔액 : "+account.getBalance());
		
	}
	
	public static void withdraw() {
		System.out.println("---------------"); 
		System.out.println("출금을 합니다.");
		System.out.println("---------------"); 	
		
		System.out.print("계좌번호 입력 : ");
		String ano = sc.next(); 
		System.out.print("출금액 입력 : ");
		int money = sc.nextInt(); 
		
Account account = findAccount(ano);
		
	if(account == null){
		System.out.println("결과 : 계좌가 없습니다. 확인 바랍니다.");
		return;
	}
	account.setBalance(account.getBalance() - money);
	System.out.println("겔과 : 출금 완료  현재 잔액 : "+account.getBalance());
	}
	
	
	
	
	
	
	
	
	
	
	public static Account findAccount(String ano) {
		
		Account account = null;
		for(int i = 0;i<accountArray.length;i++) {
			if(accountArray[i] !=null) {
				if(accountArray[i].getAno().equals(ano)){
					account = accountArray[i];
					break;
				}
			}
		}
		return account;
	}
	
	
	
}
