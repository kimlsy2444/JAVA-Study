package example01;

public class NumberFormatEx {

	public static void main(String[] args) {
		
		String str1 = "100";
		String str2 = "100가"; // 숫자로 바꿀수 없다.
		
		// 둘다 String 타입
		System.out.println(str1+" "+str2);
		
		int value1 = Integer.parseInt(str1);
		
		System.out.println(value1);
		
		int value2 = Integer.parseInt(str2);
	
		System.out.println(value1+value2);

	}

}
