package example01;

public class NullPointerEx {

	public static void main(String[] args) {
		
		
		String str = null;
		// 이 예외는 객체(인스턴스) 가 없는데 어쩧게 인스턴스에 있는 toString()호출??
		
		try {
			System.out.println(str.toString());
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	
		
		

	}

}
