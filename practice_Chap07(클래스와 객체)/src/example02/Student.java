package example02;

public class Student {
    // 맴버 변수 (필드 )
	String name;
	int age;
	
	
	// Object 클래스의 toString() 오버라이딩(재정의)
	@Override
	public String toString() {

		String str =  "이름 : " +this.name + ", "+"나이 : "+this.age; 
		// super 오브젝트 조상 클래스
		// this : 클래스 의  주소(new 연산자 인스턴스를 생성하면 비로소 활성화 )
		// this 는 static 매서느다 클래스 안에서 사용할수 없다 절대로
		return str;
	}
}
