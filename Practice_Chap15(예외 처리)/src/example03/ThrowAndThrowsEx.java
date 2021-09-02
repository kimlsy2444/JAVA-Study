package example03;

public class ThrowAndThrowsEx {

	public static void main(String[] args) {
		
		//boolean result = false;
		
		
		try {
			 findClass();
			 System.out.println("클래스가 있습니다");
//			if (result) {
//				System.out.println("클래스가 있습니다");
//			}
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("알수없는 예외 발생");
			// 개발자용, 배포시에는 제거나 주석처리
		e.printStackTrace();
		} finally {
			System.out.println("정상 종료");
		}
		

	}
	
	public static void findClass() throws Exception{
		
		
		Class class1 = Class.forName("java.lang.String");
		throw new Exception("강제 예외 발생");
//		if(class1 != null)
//		{
//			return true;
//		}
//		else
//		{
//			return false;
//		}
	}

}
