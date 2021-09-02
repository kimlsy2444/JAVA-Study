package example05;

public class FactorialEx {

	public static void main(String[] args) {
			
		long result =  FactorialEx.factorial(5L);
		
		System.out.println("5! : "+result);
		
	}
	
	
	
	public static long factorial(long n) {
		long result = 0L;
		// 1 일떄 재귀 호출이 이루어지지않는다  f(1) = 1
		if(n==1){
			result =1 ;
		}
		else {
			System.out.println("result : "+result+" n : "+n);
		
			result = n *factorial(n-1); // 직접적인 재귀호출
		}
		
		return result;
	}
	

}
