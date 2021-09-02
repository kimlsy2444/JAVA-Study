package example07;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetSaechEx {

	public static void main(String[] args) {
		
		TreeSet<String> treeSet = new TreeSet<String>();
		TreeSet<String> treeSet2 = new TreeSet<String>();
		// 알파벳의 유니코드에 따라 이진트리에 각각 좌측부터 저장이 된다.
		treeSet.add("apple");
		treeSet.add("f");
		treeSet.add("fo     rever");
		treeSet.add("description");
		treeSet.add("ever");
		treeSet.add("zoo");
		treeSet.add("guess");
		treeSet.add("cherry");
		
		System.out.println(treeSet);
		treeSet2.add("가라");
		treeSet2.add("나가");
		treeSet2.add("다시는");
		treeSet2.add("라");
		treeSet2.add("라면");
		treeSet2.add("마");
		treeSet2.add("바");
		treeSet2.add("사");
		
		// 여기서 헷갈릴 수가 있는데 c~f 사이라는것은 c 부터 해서 끝이
		// f 부분이 f 한글자만 검색을 해주지만 , f포함 2자 이상은 검색을 하지 않는다.
		// 라는 사실을 알 수있다.
		// 즉 ,f 한자는 허용하지만 f포함 2자 이상은 허용안한다.
		
		System.out.println("[c ~ f] 사이의 단어 검색");
		NavigableSet<String> rangeSet = treeSet.subSet("c", true, "f", true);
		System.out.println(rangeSet);
		
		System.out.println("======================================");
		System.out.println(treeSet2);
		System.out.println("[가 ~ 리] 사이의 단어 검색");
		NavigableSet<String> rangeSet1 = treeSet2.subSet("가", true, "라", true);
		System.out.println(rangeSet1);
		
		
	}

}
