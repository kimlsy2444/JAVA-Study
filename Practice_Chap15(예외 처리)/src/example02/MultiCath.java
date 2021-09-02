package example02;

import java.util.Arrays;

public class MultiCath {

	public static void main(String[] args) {
		
		try {
			int [] arr = new int [3];
			
			System.out.println(Arrays.toString(arr));
			
			//arr [3] = 100;    // 예외발생
			
			int result = 10/0;// 예외발생
			System.out.println(result);
			// Catch구문에서 항상 Exception 클래스는 맨 마지막에 와야한다.
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스를 초과하였습니다.");
		} catch (ArithmeticException e) {
			System.out.println("0 으로 나눌 수 없습니다.");
		} catch (Exception e) {
			System.out.println("예외 발생 ");
		} finally {
			System.out.println("프로그램 종료");
		}

	}

}
