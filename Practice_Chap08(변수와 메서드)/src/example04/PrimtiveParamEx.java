package example04;

class A{
	int data;
	int test;
}

public class PrimtiveParamEx {

	public static void main(String[] args) {
	
		A a = new A();
		a.data = 77;
		System.out.println("메서드 호출전 main()값 ㅣ "+a.data);
		// 일방적으로 값을 호출 EX 지금 몇시임?? 물어보는 형태라서 값만 읽을 수 있다.
		// call by Value (값에 의한 복사)
		PrimtiveParamEx.dataChange(a.data);
		System.out.println("메서드 호출후 main()값 ㅣ "+a.data);
	}
	
	public static void dataChange(int data) {
		// 지역변수 data 라는 값은 값복사가 이루어졌기 떄문에
		// 호출한 곳에서 아무런 영향을 받지 않느다.
		data =44;
		System.out.println("dataChange()값 : "+data);
		return;
	}

}
