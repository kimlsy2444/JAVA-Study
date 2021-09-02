package example03;

public class ThrowEx {

	public static void main(String[] args)  {
		
		try {
			// 강제 예외 발생 키워드 throw
			throw new Exception("고의 예외 발생");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("정상 종료");
	
		
		
	}

}
