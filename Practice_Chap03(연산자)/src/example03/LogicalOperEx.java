package example03;

public class LogicalOperEx {

	public static void main(String[] args) {
		
		//논리연산자 코드로 이해
		
		boolean result= false;
		boolean result2= false;
		int i=10;
		int  ch = 1;
		
		result = (i>5);
		
		System.out.println(result);
		
		result = (i>=9) && (i< - 8);
		System.out.println(result);

		
		result = (i>=9) || (i< - 8);
		System.out.println(result);
		
		
		result = (ch > 'a' && ch < 'z');
		System.out.println(result);
		
		result2 = (ch >= 'a' && ch <= 'z') ||(ch >= 'A' && ch <= 'Z');
		System.out.println(result2);
	}

}
