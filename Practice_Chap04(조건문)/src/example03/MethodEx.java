package example03;

import java.util.Scanner;

public class MethodEx {
	
	// 매서드의 선언부  구성
	// 1. 리턴 타입 (반환값) : int 
	// 2. 매서드명  // 함수 를 매서드라고 부른다.
	// 3. ()ㅣ 매개변수, 인자값  Arguments
	// 매서드 선언부, 매서드 구현부 (정의부)
	// 매서드 선언부 중요도 (99%)
	
	public static int add(int x, int y, int z1)//매서드 선언부
	{
		//매서드 구현부
//		int temp =0;
//		temp =x+y+z1;
		System.out.println("add 매서드 호출");
		return x+y+z1;
		//매서드 구현부
	}
	public static int minus(int x1,int y1) {
		
		
		System.out.println("minus 매서드 호출");
		return x1-y1;
		
		
	}
	
	
	public static int multiply(int x1,int y1) {
		System.out.println("multiply 호출");
		return x1*y1;
	}
	
	public static int divide(int x1,int y1) {
		System.out.println("divide 호출");
		return x1/y1;
	}
	public static void main(String[] args) {
		
		int num1 = 6;
		int num2 = 2;
		
		// 값에 의한 복사 call by value
		int reslut =add(num1 ,num2, 10);
		
		System.out.println(reslut);
		
		reslut = minus(num1,num2);
		System.out.println(reslut);
		
		reslut = multiply(num1,num2);
		System.out.println(reslut);
		
		reslut = divide(num1,num2);
		System.out.println(reslut);
		
		
	}

}
