package example01;

public class VarEx03 {

	public static void main(String[] args) {
		
		byte b1 =127;
		byte b2= (byte)(b1+2); 
		System.out.println(b1);
		System.out.println(b2);
		
		int i1 = b1;
		System.out.println("자동 " + i1);
		
		
		byte b3 = 127;
		int i2 = 400; 
		
		b3 = (byte)i2;
		
		System.out.println(b3);
		
		
		int i3 = 100;
		float f1 = (float)i3;
		System.out.println(f1);
		
		
		float f2 = 10.55f;
		int i4 =100;
		i4 = (int)f2;
		System.out.println(i4);
		
		char ch1 = 'a';
		int i5 = (int)ch1;
		
		System.out.println(i5);
		
		int i6= 100;
		String str= "자바" + i6;
		System.out.println(str);
	
		
	}

}
