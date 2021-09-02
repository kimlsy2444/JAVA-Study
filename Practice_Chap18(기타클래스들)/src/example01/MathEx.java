package example01;

public class MathEx {

	public static void main(String[] args) {
	
		
		// 절대값
		int v1 =Math.abs(-5);
		double v2 = Math.abs(-7.88);
		System.out.println(v1);
		System.out.println(v2);
		
		// 올림값
		double v3= Math.ceil(5.1);
		System.out.println(v3);
		
		// 내림값
		double v4 = Math.floor(5.9);
		System.out.println(v4);
		
		// 둘중 최대값
		int v5 = Math.max(10, 5);
		System.out.println(v5);
		
		// 둘중 최소 값 
		int v6 = Math.min(10,5);
		System.out.println(v6);
		
		// 난수
		double v7 = Math.random();
	
		System.out.println(v7);
		
		// 가까운 정수의 실수값()
		double v8 = Math.rint(5.4);
		System.out.println(v8); 
		
		// 반올림 (소수점 첫재짜리 반올림)
		long v9 = Math.round(5.39);
		System.out.println(v9);
		
		//소수 셋째자리 반올림 -> 메스클래스 내에서 따로 처리해주는 부분이없어서 번거롭다
		double value = 12.3456;
		double temp1 = value*100;
		
		System.out.println(temp1);
		long temp2 = Math.round(temp1);
		
		double v10 = temp2/100.0;
		
		System.out.println(v10);
	}

}
