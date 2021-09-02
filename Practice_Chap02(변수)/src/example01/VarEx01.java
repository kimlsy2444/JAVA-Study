package example01;

public class VarEx01 {

	public static void main(String[] args) {
		int year = 0;
		int age = 24;
		long result = 10;
		float result2 =10.1f;
		double d= 9.999;
		
		char ch =  'A';
		// sys ctar+ space 자동완성 
		System.out.println(year+age);
		System.out.println("ch: "+ age+ ch);
		System.out.println(result);
		System.out.println(result2);
		System.out.println(d);
		String str = new String("java");
		
		System.out.println(str);
		System.out.println(str.toString());
	
		
		Object obj1 = new Object();
		System.out.println(obj1);
	}

}
