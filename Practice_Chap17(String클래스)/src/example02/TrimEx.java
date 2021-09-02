package example02;

public class TrimEx {

	public static void main(String[] args) {

		
		
		// trim() 좌우 공백만 제거함 ,중간에 있는 공백은 
		// 직접 프로그래머가 직접 제거하는  코드를 작성해야됨

		String tel1 = "            010";
		String tel2 = "-4644       ";
		
		String tel3 = "   -9538";

		System.out.println(tel1.trim() + tel2.trim() + tel3.trim());
		
		
	}

}
