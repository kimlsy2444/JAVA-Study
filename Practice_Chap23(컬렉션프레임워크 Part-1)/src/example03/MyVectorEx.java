package example03;

public class MyVectorEx {

	public static void main(String[] args) {
	
		MyVector myVector = new MyVector();
		System.out.println("용량수 : "+myVector.capacity());
		
		myVector.add("2000");
		myVector.add("20");
		myVector.add("-15");
		myVector.add("홍길동");
		myVector.add("7.5");
		
		System.out.println("1번 인덱스 값 : "+myVector.get(1));
		System.out.println("삭제전 "+myVector.toString());
		System.out.println("객체수  : "+myVector.size());
		System.out.println("============================");
		
		myVector.remove(1);
		//myVector.remove(1);
		System.out.println("삭제후 "+myVector.toString());
		System.out.println("객체수  : "+myVector.size());
		System.out.println("============================");
		
		myVector.clear();
		System.out.println("삭제전 "+myVector.toString());
		System.out.println("객체수  : "+myVector.size());
		System.out.println("============================");
		
	}

}
