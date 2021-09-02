package sec02.example07;

public class People {
	
	private String name;
	private String id;
	private Address address;
	public People(String name, String id, Address address) {
		 
		this.name = name;
		this.id = id;
		this.address = address;
	}
	
	
	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}
	public Address getAddress() {
		return address;
	}
	
	
	
	
}
