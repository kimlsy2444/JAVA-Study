package example01;

public class VarEx02 {

	
	public static void main(String[] args) {
		
	int number; // 4bity만큼 메모리 스택에 할당함 ㅇㅇ
	number=200;
	int number2= 500;
	double dnum = 10.01;
	final int MAX = 100;
	
	System.out.println(number);
	System.out.println(number2);	
	System.out.println("상수 : "+ MAX);	
	System.out.println("실수 :" + dnum);	
	
	
	
	
	
	String str= new String("붕어빵 ");
	System.out.println(str);
	str = null;
	System.out.println(str);
	}

}
