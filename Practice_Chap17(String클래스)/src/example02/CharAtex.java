package example02;

public class CharAtex {

	public static void main(String[] args) {
	
		String ssn = "980203-2234567";
		//                   o
		// 특정문자를 받고자 할 때 charAt() 메서드 사용
		
		char sex = ssn.charAt(7);
		
		if(sex == '1' || sex == '3') {
			System.out.println("남자 입니다."); 
		}
		else if(sex == '2' || sex == '4'){
			System.out.println("여자 입니다."); 
		}
		else {
			System.out.println("사람이 아님");
		}

	}

}
