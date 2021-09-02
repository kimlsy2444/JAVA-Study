package example05;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableEx {

	public static void main(String[] args) {

		//Hashtable : 구버전 기능동일
		
		Map<String,String> map = new Hashtable<String,String>();
		// 객체 추가
		map.put("spring","12");
		map.put("summer","123");
		map.put("fall","1234");
		map.put("winter","12");
		
		System.out.println("총 Entry 수 : "+map.size());
		
		int count = 0;// 비밀번호 틀린 횟수 측정
		// 객체 검색 
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("ID PASSWARD 입력 ");
			System.out.print("ID : ");
			String id = scanner.nextLine();
			System.out.print("PASSWARD : ");
			String passward = scanner.nextLine();
			System.out.println();
			
			// 저장되어 있는 객체를 검색 하여 (일종의 DB 라고 생각하자) 아이디와 비밀번호가 일치하면 로그인성공
			// 아니라면 무한루프를 빠져나간다.
			
			if(map.containsKey(id)) {
				// id 즉 키를 주고 얻오는 값은 당연히 passward 이니까 
				// 같다면 로그인 성공
				// 아니면 비밀번호가 불일치  count++ 하기 
				if(map.get(id).equals(passward)) {
					System.out.println(id+"님이 로그인 되었습니다.");
					break;
				}
				else{
					count++;
					System.out.println("비밀번호 가 "+count+"회 틀렷습니다. ");
					if(count == 3) {
					System.out.println("비밀번호 가 "+count+"회 틀렷습니다."
							+ "지점 방분 하십시오");
						break;}}}
			else {System.out.println("없는 ID 입니다.");}
			
		}
		scanner.close();
	}

}
