package example05;

public class SamsungPhone {
	
	
	private String company;
	private String model;
	private String color;
	private int release;
	 

	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		//øπø‹ √≥∏Æ ƒ⁄µÂ
		
		if (!company.equals("ªÔº∫"))
		{
			System.out.println("ªÔº∫ ∆˘¿Ã æ∆¥‘");
			return;
		}
		this.company = company;
	}
	
	
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		
		
		if (!(model.equals("∞∂∑∞Ω√7")||model.equals("∞∂∑∞Ω√8"))){
			System.out.println("ªÔº∫ ∏µ® æ∆¥‘");
			this.model = null;
			return;
			
		}
		this.model = model;
	}
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	public int getRelease() {
		return release;
	}
	public void setRelease(int release) {
		this.release = release;
	}
	
	
	@Override
	public String toString() {
		
		return this.getCompany()+"»∏ªÁ¿« " +this.getModel()+
				"∏µ®¿Ã∏Á, √‚Ω√¿œ¿∫ "+this.getRelease()+"≥‚ ¿‘¥œ¥Ÿ.";
	}
	
	
	
}
