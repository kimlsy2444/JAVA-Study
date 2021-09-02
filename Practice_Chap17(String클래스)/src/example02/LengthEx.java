package example02;

public class LengthEx {

	public static void main(String[] args) {
		 
		
		String phoneNum = "01046449538";
		
		System.out.println("문자열의 길이 : " + phoneNum.length());
		
		int length = phoneNum.length();
		
		if(length == 11)
		{
			System.out.println("핸드폰 번호 자리가 맞습니다");
			
		}
		else {
			System.out.println("다시 입력해주세요");
		}
		
	}


	
}
