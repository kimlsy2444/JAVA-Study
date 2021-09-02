package example02;

public class ToLowerUpperEx {

	public static void main(String[] args) {
		
		
		String str1 =  "Java Programming";
		String str2 =  "JAVA Programming";
		
		System.out.println("대문자 : "+ str1.toUpperCase());
		
		System.out.println("소문자 : " +str2.toLowerCase());
		
		//equals 대소 문자 비교 함
		System.out.println(str1.equals(str2));
		
		//equalsIgnoreCase 대소 문자 비교 하지 않음 
		System.out.println(str1.equalsIgnoreCase(str2));

	}

}
