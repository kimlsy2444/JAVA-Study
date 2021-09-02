package example05;

public class MemberEx {
	//제네릭 클래스인 Member를 리턴함 MemberEx 클래스의 인스턴스 메서드
	public <T> Member<T>boxong(T t){
		
	Member<T> member = new Member<T>();
	member.setT(t);
	return member;
}	
	//MemberEx 클래스의 정적 메서드
	public static <T> Member<T>  wrapping(T t){
		
		Member<T> member = new Member<T>();
		member.setT(t);
		return member;
	}
	
	public static void main(String[] args) {
	
	MemberEx memberEx = new MemberEx();
	Member<Integer> member = memberEx.boxong(new Integer(100));
	
	System.out.println("Member 클래스의 값 : "+ member.getT());
	
	Member<String>member2 = wrapping("홍길동");
	
	System.out.println("Member 클래스의 값 : "+ member2.getT());
	
	}

}
