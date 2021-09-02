package sec02.example04;

public class Population {
	
	private String region;  // 지역
	private int population; // 인구수
	
	
	public Population(String region, int population) {
		 
		this.region = region;
		this.population = population;
	}

	

	public String getRegion() {
		return region;
	}


	public int getPopulation() {
		return population;
	}
	
	
	
}
