package example02;

public class DefaultTypeEx {

	public static void main(String[] args) {
		
		byte b1 =127;
		byte b2 = 1;
		char ch = 'A';
		float f1 = 15.5f;
		double d1 =10.5;
		
		
		int  i1 = (b1+b2); // 자동 캐스팅
		byte b3 = (byte) (b1+b2); // 강제적 형변환
		
		int  i2 = ch + b2;
		
		float f2 = b1+f1;
		
		double d2= f1 + d1;
		
		System.out.println(i1+"  "+ b3+"  "+ i2+"  "+f2);
		System.out.println(f2+"  "+d2);

	}

}
