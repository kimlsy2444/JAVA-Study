package tokenExample;

import java.util.StringTokenizer;

public class SplitStringTokenizerEx {

	public static void main(String[] args) {
		
		String data = "baby cat     dog a b c d e f g h i ";
		// split()는 구분자를 공백으로 주면 데이터가 공백을 다수 포함하고 있다면
		// 공백도 하나의 토큰 단어로 인식한다
		long start = System.nanoTime();
		String[] result = data.split(" ");
		for(String str : result) {
			System.out.println(str); 
		}
		long end = System.nanoTime();
		System.out.println("걸린시간 : "+(end-start)+"ns"); 
	//	System.out.println("토큰 갯수 : "+result.length);
		System.out.println();
		
		// StringTokenizer()는 구분자를 공백으로 주면 데이터가 공백을 다수 포함하고 있다면
		// 공백은 토큰으로 인식하지 않는다.
		long start1 = System.nanoTime();
		StringTokenizer stringTokenizer = new StringTokenizer(data," ");
		
		while (stringTokenizer.hasMoreElements()) {
		//	System.out.println("남은 토큰 "+stringTokenizer.countTokens());
			String str =  stringTokenizer.nextToken();
			System.out.println(str);
			
		}
		long end1 = System.nanoTime();
		System.out.println("걸린시간 : "+(end1-start1)+"ns"); 
	}

}
