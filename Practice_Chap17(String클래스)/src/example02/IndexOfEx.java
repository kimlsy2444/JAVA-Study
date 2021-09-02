package example02;

public class IndexOfEx {

	public static void main(String[] args) {
		
		//indexOf 메서드는 찾기 기능을 할때 , 자주 쓰인다.(문서  등)
		
		String  str = "오늘은 자바 공부가 하기 싫음..ㅠㅜ";
		int index = str.indexOf("안공부");
		System.out.println("공부의 시작 방 번호  배열 번호 : " +index);
		// 공부라는 문자열이 포함되어 있으면..
		
		if(str.indexOf("공부")!= -1) {
			System.out.println("공부와 관련된 내용");
		}
		else {
			System.out.println("공부와 관련없는 내용");
		}

	}

}
