package exercise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class PhoneManger {
	
	// 메뉴 번호를 위한 상수를 정의 한다.
	final int INSERT = 1;  // 전화 번호 저장
	final int DELETE = 2;  // 전화번호 삭제
	final int SEARCH = 3;  // 전화번호 검색
	final int SHOWALL = 4; // 전체 전화번호 보여주기
	final int EXIT = 5;    // 프로그램 종료
	
	private Scanner scanner;
	
	private HashMap<String, Phone> map = new HashMap<String, Phone>();
	public PhoneManger() {
		
		this.scanner = new Scanner(System.in);
	}
	
	// 전화 번호 관리 메서드
	
	public void run() {
		System.out.println("==============================");
		System.out.println("전화 번호 관리 프로그램을 시작합니다.");
		System.out.println("==============================");
		
		
		while(true) {
			System.out.print("1:저장, 2:삭제, 3:찾기,4:전체보기,5:종료 >> ");
			// nextInt() 는 사용자가 입력의 가장 마지막 개행 문자 (엔터)를 제거 하지 않느다
			// 개행 문자 전에 숫자만 입력 받는다.
			
			// 해결방번
			// Scanner.nextLine(); --> 버퍼에 있는 내용이 다 비워진다.
			
			int meue = scanner.nextInt();
			scanner.nextLine(); // 버퍼비우기
			switch (meue) {
			case INSERT:
				insert();
				break;
				
			case DELETE:
				delete();
				break;
				
			case SEARCH:
				search();
				break;
				
			case SHOWALL:
				showAll();
				break;
				
			case EXIT:
				System.out.println("프로그램을 종료 합니다");
				return;
				
			default:
				System.out.println("입력이 잘못 되었습니다 다시 입력 하세요");
				continue;
			
			}
		}
	}
	
	// 전화 번호 저장 메서드
	
	public void insert() {
		System.out.print("이름 >> ");
		String name = scanner.nextLine();
		
		
		// 이름으로 중복 확인
		if(map.get(name)!= null) {
			System.out.println(name+"님은 이미 등록 되었습니다.");
		}
		
		
		System.out.print("주소 >> ");
		String address = scanner.nextLine();
		
		System.out.print("전화번호 >> ");
		String telNum = scanner.nextLine();
		
		
		// HashMap에 저장하기
		map.put(name,new Phone(name, address, telNum));
		System.out.println(name +"님이 저장되었습니다.");
	}
	
	// 전화 번호 삭제 메서드
	
	public void delete() {
		System.out.print("이름 >> ");
	
		String name = scanner.nextLine();
		
		Phone phone = map.remove(name);
		// 등록 여부에 따라도 분기
		if(phone == null) {
			System.out.println(name+"님은 등록되지 않은 사람입니다.");
		}
		else {
			System.out.println(name+"님의 정보가 삭제 되었습니다.");
		}
		
		
	}
	
	// 전화 번호 찾기 메서드
	
	public void search(){
		
		System.out.print("이름 >> ");
		String name = scanner.nextLine();
		
		Phone phone = map.get(name);
		
		if(phone == null) {
			System.out.println(name+"님은 등록되지 않은 사람입니다.");
		}
		else {
			System.out.println(phone.toString());
		}
	}
	
	// 전체 전화번호 보기
	
	public void showAll() {
		
		int count = 1 ;
		
		Set<String> keys = map.keySet();
		
		Iterator<String> iterator = keys.iterator();
		
		System.out.println("현재 저장 되어있는 고객 정보 리스트 입니다.");
		
		while(iterator.hasNext()) {
			
			String name = iterator.next();
			
			Phone phone = map.get(name);
			
			System.out.println(count + ". "+phone.toString());
			
			count ++;
			System.out.println("==============================");

		}
		
		
	}

	
	
}
