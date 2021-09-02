package example02;

public class StringtoPrimitiveEx {

	public static void main(String[] args) {
	
		// 문자열을 숫자로 바꾸는 방법
		int value1 = Integer.parseInt("100");
		double value2 = Double.parseDouble("3.14");
		boolean value3= Boolean.parseBoolean("true");
		
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
	}

}
