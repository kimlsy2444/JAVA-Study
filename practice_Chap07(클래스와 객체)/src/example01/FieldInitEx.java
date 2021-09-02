package example01;

public class FieldInitEx {

	public static void main(String[] args) {
		
		FieldInit fi = new FieldInit();
		
		
		// new 연산자가 클래스에 있는 맴버들의 바이트 크기만큼
		// 힙에다가 메모리를 할당흘하며 동시에 초기화를 한다.
		System.out.println(fi.arrField);
		System.out.println(fi.floatField);
		System.out.println(fi.byteField);
		System.out.println(fi.boolField);
		
		
		
		System.out.println(fi);
	}

}
