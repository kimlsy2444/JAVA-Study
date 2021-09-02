package example04;

public class ReferenceParamEx {
	
	public static void main(String[] args) {
		A a = new A();
		a.data = 77;
		System.out.println("메서드 호출전 main()값 ㅣ "+a.data);
		
		// call by Reference (주소에 의한 복사)
		ReferenceParamEx.dataChange(a);
		System.out.println("메서드 호출후 main()값 ㅣ "+a.data);
	}
	
	
	 // int[] ,int [] String  --> 참조 변수 형태  호출
	public static void dataChange(A a) {
		// a라는 주소값이 매개변수로 넘어 왔기 떄문에 주소를 공유한다.
		// a라는 주소를 공유하를 하게 되면 호출한 곳에서 무조건 영향을 받는다.
		a.data = 44;
		
		System.out.println("dataChange()값 : "+a.data);
		return;
	}
}


	
	
	
	
	
	
