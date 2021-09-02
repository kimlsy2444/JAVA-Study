package PattenExample;

import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PattenEx02 {

	public static void main(String[] args){
		String[] data = {
						"bat","baby","bonus","ca","cd","c.","car",
						"com","date","zoo","disc"
						};
		
		//Matcher 클래스를 이용한 방법
		//Pattern pattern = Pattern.compile("b[a-z]*");
		String pattern = ("c[a-z]*");
		
		Vector <String> vString = new Vector<String>();
		for(String str : data) {
			
			boolean result =  Pattern.matches(pattern, str);
			//Matcher 클래스를 이용한 방법
//			Matcher matcher = pattern.matcher(str);
//			
//			// 정의한 패턴과 일치하는가?
//			if(matcher.matches()) {
//				System.out.println(str);
//				vString.add(str);
//			}
//		}
			if(result) {
				System.out.println(str);
				vString.add(str);
			}
		}
		System.out.println();
		System.out.println("c로 시작하는 소문자 영단어 : "+ vString.toString());
		
		
	}
}
