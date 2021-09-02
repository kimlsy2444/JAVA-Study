package example01;

public class DenyEx {

	public static void main(String[] args) {
		
		
		//! 논리 부정 연산자 연습~
		
		boolean power = false; 
		
		System.out.println("power : "+power);
		power =!power;
		System.out.println("power : "+power);
		power =!power;
		System.out.println("power : "+power);
		
		if (power) {
			System.out.println("if 실행됨");
		}
	}

}
