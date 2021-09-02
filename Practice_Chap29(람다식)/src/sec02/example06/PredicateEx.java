package sec02.example06;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateEx {
	
	public static ArrayList<Student> arrayList = new ArrayList<Student>();
	
	public static void main(String[] args) {
		
		//객체들 추가
		
		 arrayList.add(new Student("김동년", "여자", 20));
		 arrayList.add(new Student("이민기", "남자", 60));
		 arrayList.add(new Student("김연아", "여자", 100));
		 arrayList.add(new Student("신윽혁", "남자", 100));
		 arrayList.add(new Student("홍길동", "남자", 80));
		// Predicate<T> 함수적 인터페이스는 test()의 추상메서드의 실체를
		// 람다식으로 아래와 같이 익명구현했고
		// 남자이냐 여자이냐에 다라서 값이 달라짐 역시 확인할 수가 있다.
		Predicate<Student> predicateMale = t-> {return t.getSex().equals("남자");};
		 
		double male =  avg(predicateMale);
		System.out.println("남자 평균 : "+male);
		
		 Predicate<Student> predicateFemale = t-> {return t.getSex().equals("여자");};
		 
		double female =  avg(predicateFemale);
		System.out.println("여자 평균 : "+female);
	}
	
	
	//Predicate<T>함수적 인터페이스는 test() 추상메서드를 가지고 있다.
	// 아울러, 매개변수로 Predicate<Student>이다. 하여 호출하는 곳에서는 
	// Predicate<Student>의 추상메서드 test()구현한 객체를 받아야 하는 것이다.
	
	public static double avg(Predicate<Student> predicate) {
		int count = 0;
		int sum = 0;
		
		for(Student student : arrayList) {
			if(predicate.test(student)) {
				count++;
				sum+=student.getScore();
			}
		}
		return (double)sum/count;
	}
}
