package objectsExample;

import java.util.Arrays;
import java.util.Objects;

public class EqualsAndDeepEqualsEx {

	public static void main(String[] args) {


		Integer integer1 = new Integer(100);
		Integer integer2 = new Integer(100);
		Integer integer3 = new Integer(100);
		
		
		// 모든 포장 클래스 에서는  Object클래스의 equals() 오버라이딩 되어있다.
		System.out.println(integer1.equals(integer2));
		
		// Object의 equals()는 기준이 되는 객체, 비교가 되어지는 객체 따로 분리가 되어있는 형태
		// Objects 의 equals() 비교하는 2대상만 매개변수로 주면된다.-- 유지보수 혹은 개발에 유리
		System.out.println(Objects.equals(integer1,integer2));
		
		Integer[] arr1 = {new Integer(10),new Integer(50)};
		Integer[] arr2 = {new Integer(10),new Integer(50)};
		
		
		// Objects.equals() 매개변수가 참조타입이 들어오면 주소비교(얕은 비교) 
		System.out.println(Objects.equals(arr1,arr2));
		
		// Objects.deepEquals() 는 매개변수로 배열이 들어오면 깊은 비교 (항목 값)를 한다.
		
		System.out.println(Objects.deepEquals(arr1, arr2));
		System.out.println(Arrays.deepEquals(arr1, arr2));
	}

}
