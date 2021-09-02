package example05;
//조상 클래스
public class Parent {

	int x = 100;
//	  public Parent(){
//		System.out.println("조상 클래스 기본  생성자 호출"); 
//	 }
	  // 매개변수가 있는 생성자 
	  // 매개변수가 있는 생성자 가 있으면 컴파일러 실행시 생성자 호출이 안됨
	  public Parent(int x){
		  System.out.println("조상클래스 매개변수가 있는 생성자 호출"); 
			this.x = x;
		 }
	  
	  
		public void show() {
			
			System.out.println("조상클래스의 show() 호출 "); 
		}
}
