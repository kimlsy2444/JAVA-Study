package example02;


public class Accumulator {
	
	
	// add 라는 매서드 명으로 오버로딩 하고 있다
	public int add(int x,int y) {
		System.out.println("add(int x,int y)");
		return x+y;
	}
	public long add(int x,long y) {
		System.out.println("add(int x,long y)"); 
	return x+y;
	}
	
	public long add(long x,int y){
		System.out.println("add(long x,int y)"); 
		return x+y;
	}
	
	public double add(double x,double y) {
		System.out.println("add(double x,double y)"); 
		return x+y;
	}
	
	
	// 참조형 변수를 받아서 오버로딩 하는 케이스
	
	public long add(int[] arr) {
		System.out.println("add(int[] arr)"); 
		// 배열의 주소를 받ㅂ아서 그값의 총합을 구하여 리턴하고 있는 매서드
		long sum = 0L;
		for(int i = 0; i< arr.length;i++) {
			sum+=arr[i];
		}
		return sum;
	}
	// 클래스를 매게 변수로 받아서 오버로딩을 하는 케이스
	public int add(A a) {
		System.out.println("add(A a)"); 
		return a.data1+a.data2;
	}
	
}
