package example03;

public class ReverseEx {

	public static void main(String[] args) {
	
		String str = "안녕하세요";
		
		String reverse = "";
		
		int count = 0;
		
		
		count = str.length();
		
		System.out.println(count);
		
		for(int i=0;i<count;i++) {
			
			reverse +=str.charAt(count-(i+1));
			System.out.println(reverse);
			
		}
		// 단점 : charAt은 새로운 인스턴스 객체를 생성하기 때문에
		// 메모리의 누수가 발생함 
		
		System.out.println("역순 출력 : "+ reverse);

		
		String r = reverseString(str);
		System.out.println("reverseString() 호출 : "+r);
	}
	public static String reverseString(String str) {
		
		return  new StringBuilder(str).reverse().toString();
	}
	
	
}
