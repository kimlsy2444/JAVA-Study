package example01;

public class FieldInit {

	byte byteField;    // 1
	short shortField;  // 2
	int intField;      // 4
	long longField;    // 8
	
	boolean boolField; // 1
	char charField;    // 2
	
	float floatField;  // 4
	double doubleField;// 8
	
	
	//참조형 변수
	
	int[] arrField;    // 4
	String strField;   // 4
	
	
	// annotation : 컴파일러에게 강한 컴파일을 요구
	// toString() : 클래스의 멤버변수의 값들을 수시로 확인하고자 할때나,
	// 원하는 포맷으로 멤버변수들을 출력하고자 할때 사용을 많이 함.
	@Override
	public String toString() {
	
		
		String str = "byteField :  " + byteField + " shortField : " +shortField+
					  " intField : " + intField;
		return str;
	}
	
	
	
}
