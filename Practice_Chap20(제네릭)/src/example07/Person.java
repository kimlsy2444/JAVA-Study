package example07;

public class Person {
	
	private String name;
	
	public Person(String name) {
		this.name =name;
	}
	public String getName() {
		return this.name;
	}
	
	@Override
	public String toString() {
		
		return this.name;
	}
}
