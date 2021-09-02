package example01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx01 {

	public static void main(String[] args) {

		ArrayList list = new ArrayList<>(); // 기본적으로 10개의 방생성함
		
		
		
		System.out.println("총 크기 : "+list.size()); // 저장된 객체가 하나도 없기 떄문에 0을 리턴함
		// 객체 추가하기
		
		list.add("111"); // boolean add(Object o)-> 순차적 추가
		list.add("222");
		list.add("333");
		list.add("222");
		
		
		
		list.add(333);
		
		System.out.println("총 크기 : "+list.size()); 
		System.out.println("ArrayList의 주소 : "+list.hashCode());
		System.out.println("ArrayList에 있는 값 : "+list.toString());
		
		// 0 번째 인덱스에  "333"추가
		list.add(0,"333");
		
		System.out.println("ArrayList에 있는 값 : "+list.toString());
		
		// 앞에서 부터 검색하여  가까운 "333"을 삭제한다.(가까운 것 한 개만 삭제)
		//객체 삭제하기
		list.remove("333");
		System.out.println("ArrayList에 있는 값 : "+list.toString());
		System.out.println(list.remove("333"));
		System.out.println("ArrayList에 있는 값 : "+list.toString());
		
		// 저장된 객체의 인덱스를 찾아오기 (없으면 -1 리턴)
		System.out.println("index = "+ +list.indexOf("333"));
		System.out.println("index = "+ +list.indexOf(333));
		
		// 객체 전부 삭제 하기
		//list.clear();
		
		//아래와 같이 삭제하면 객체가 남는다.
		// 인덱스 0을 삭제할 때 i가 0이니까 당연히 0인덱스에 있는 객체는 삭제 되지만
		// 이후 i값이 증가되면서 제대로 삭제가 되지 않는 것이다.
		// 앞쪽 객체가 삭제되고 뒷객체가 떙겨지면서
		// 증감된 i값이 땡겨진 객체를 찾지못하여서 완전한 객체삭제가 이루어지지않는다
		// 하여 삭제를 시킬려면 항상 뒈에서 부터 삭제를 해주는것이다.
//		for(int i=0; i<list.size();i++) {
//			list.remove(i);
//	
//		}
		
		
		// size 값이 4인데 인덱스 0~3까지 있기 때문이다.
//		for(int i=list.size();i>=0;i--) {
//			list.remove(i);
//		}

		
		for(int i=list.size()-1;i>=0;i--) {
			list.remove(i);
		}
		System.out.println("ArrayList에 있는 값 : "+list.toString());
		
	}

}
