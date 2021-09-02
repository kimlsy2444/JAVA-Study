package example05;

public class SamsungPhoenEx {

	public static void main(String[] args) {
		SamsungPhone sam = new SamsungPhone();
		SamsungPhone sam1 = new SamsungPhone();
		
		sam.setCompany("ªÔº∫");
		sam.setModel("∞∂∑∞Ω√8");
		sam.setRelease(2018);
		sam.setColor("∞À¡§");
		
		System.out.println(sam.toString());
		
		
		
		sam1.setCompany("lG");
		sam1.setModel("G6");
		sam1.setRelease(2018);
		sam1.setColor("∞À¡§");
		System.out.println(sam1.toString());
		
		sam.setCompany("ªÔº∫");
		sam.setModel("∞∂∑∞Ω√7");
		sam.setRelease(2008);
		
		System.out.println(sam.toString());
		
		
	}

}
