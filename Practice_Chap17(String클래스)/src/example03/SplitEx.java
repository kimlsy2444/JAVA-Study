package example03;

public class SplitEx {

	public static void main(String[] args) {
	
		String str1 = "사랑해,너를,교촌치킨/양념치킨&순살치킨";
		
		
		// 정규 표현식 : /,& 
		// split(정규표현식) : 매개변수로 정규 표현식이온다. 리턴타입은 정규표현식으로
		// 구분되어진 String[]을 리턴한다.
		
		// or | 연산자로 구분해줌
		String[] strArr = str1.split(",|&|/");
		
		for(String str : strArr) {
			System.out.println(str);
		}
		

	}

}
