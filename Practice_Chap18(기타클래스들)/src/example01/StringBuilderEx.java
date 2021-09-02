package example01;

public class StringBuilderEx {

	public static void main(String[] args) {
		
		// StringBuilder, StringBuffer 클래스는 버퍼 (임시저장메모리) 를
		// 이용하기 때문에 새로운 인스턴스가 생성되는 것이 아니라 하나의 인스턴스를
		// 가지고 문자열을 조작 할 수 있다
		StringBuilder sBuilder = new StringBuilder("JAVA");
	
		System.out.println(sBuilder);
		//System.out.println(sBuilder.hashCode());
		
		sBuilder.append("Program");
		System.out.println(sBuilder);
		//System.out.println(sBuilder.hashCode());
		
		
		
		sBuilder.insert(1,"나"); // 인덱스 중간 삽입
		sBuilder.insert(1,100); // 자동 문자열로 인식
		System.out.println(sBuilder);
		
		sBuilder.setCharAt(0,'R');// 인덱스 덮어쓰기
		System.out.println(sBuilder);
		
		sBuilder.reverse(); // 역순 으로 덮어쓰기
		System.out.println(sBuilder);
		
		sBuilder.delete(0,3);
		System.out.println(sBuilder); // string 클래스느는 마지막 부분은 인덱스가 되지 않음
		
		int length = sBuilder.length();
		System.out.println("총문자수 " + length);
	
		
	}

}
