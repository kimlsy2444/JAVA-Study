package PattenExample;

import java.util.regex.Pattern;

public class PattenEx01 {

	public static void main(String[] args) {
	// 010,02 시작하는 휴대폰 번호나 서울 지역 전화 번호를 패턴으로 정의
		
		String pattern = "(010|02)-\\d{3,4}-\\d{4}";
		String phoneNum = "010-5544-1234";
		String seoulNum = "02-766-1234";
		//boolean result =  Pattern.matches(pattern, phoneNum);
		
		boolean result =  Pattern.matches(pattern, seoulNum);
		if(result) {
			System.out.println("전화번호 양식이 맞습니다.");
		}
		else {
			System.out.println("전화번호 양식이 맞지 않습니다. 다시입력해주세요");
		}
		
		// 이메일 양식으  검증하는 방법
		String email = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		String emailData1 = "7@naver.com";
		String emailData2 = "abcd7@lg.co.kr";
		
		boolean emailResult = Pattern.matches(email, emailData2);
		
		if(emailResult) {
			System.out.println("이메일 양식이 맞습니다.");
		}
		else {
			System.out.println("이메일  양식이 맞지 않습니다. 다시입력해주세요");
		}
		
		
	}
	




}
