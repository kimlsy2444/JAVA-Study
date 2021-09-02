package example02;


class A{
	
	int data1= 10;
	int data2= 30;
}
public class AccumulatorEx {

	public static void main(String[] args) {
		
		Accumulator ac =new Accumulator();
		
		int iresult = ac.add(10, 50);
		System.out.println("iresult : "+iresult);
		System.out.println(); 
		// 접미사를 붙이는것이 원칙임 
		long lresult =  ac.add(100, 7500L);
		System.out.println("lresult : "+lresult);
		System.out.println(); 
		
		lresult =  ac.add(1000L, 10);
		System.out.println("lresult : "+lresult);
		System.out.println(); 
		
		
		double dresult= ac.add(107.88, 11.55);
		System.out.printf("dresult : %.2f\n",dresult);	
		System.out.println();
		
		long arrResult=ac.add(new int [] {1,2,3,4,5});
		System.out.println("arrResult : "+arrResult);		
		System.out.println();
		
		iresult= ac.add(new A());
		System.out.println("iresult : "+iresult);
	

	
	
	}
}
