package sec02.example04;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class PopulationEx {

	public static ArrayList<Population> populations = new ArrayList<Population>();
	
	public static void main(String[] args) {
		
		//Population 객체 추가
		populations.add(new Population("서울 강남구", 156800));
		populations.add(new Population("서울 강서구", 10800));
		populations.add(new Population("서울 구로구", 78800));
		populations.add(new Population("서울 영등포구", 126800));
		
		// Function<T,R>을 이용해서 Population객체를 주고 지역을 리턴받게끔 하고있다.
		
		Function<Population, String> function =  t -> {return t.getRegion();};
		regionPrint(function);
		
		// ToDoubleFunction<Population> 를 이용하여 람다식으로 인구수를 리턴하게 만들고있다.
		
		
		ToDoubleFunction<Population> toDoubleFunction = t-> {return t.getPopulation();};
		avgPrint(toDoubleFunction);

	}

	
	// 지역 추가 메서드
	public static void regionPrint(Function<Population, String> function) {
		
		for(Population population : populations) {
			String region = function.apply(population);
			
			System.out.print("지역 : "+region+"\t");
		}
		System.out.println();
	}
	
	// 각지역에 인구수 출력및 평균 인구수 출력
	
	public static void avgPrint(ToDoubleFunction<Population> toDoubleFunction) {
		
		double sum =0.0;
		
		for(Population population : populations) {
			double value = toDoubleFunction.applyAsDouble(population);
			System.out.print("인구수 : "+value+ " \t");
			sum+= value;
			
		}
		System.out.println();
		System.out.println("서울 평균 인수구 : "+(sum/populations.size()));
		
	}
	
	
	
	
	
}
