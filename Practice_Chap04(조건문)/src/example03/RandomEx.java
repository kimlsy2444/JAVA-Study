package example03;

public class RandomEx {

	public static void main(String[] args) {
		
		
		// Math random ()°ªÀº 0.0000~0.999999»çÀÌ °ª
		// System.out.println(Math.random()); 
		
		
		// ÁÖ»çÀ§ ´«À» ·£´ý ¹ß»ý
		int num = (int) (Math.random()*6)+1;
		System.out.println(num);
		
		
		
//		if(num == 1 ) {
//			System.out.println("1³ª¿È");
//		}
//		else if (num == 2) {
//			System.out.println("2³ª¿È");
//		}
//		else if (num == 3) {
//			System.out.println("3³ª¿È");
//		}
//		else if (num == 4) {
//			System.out.println("4³ª¿È");
//		}
//		else if (num == 5) {
//			System.out.println("5³ª¿È");
//		}
//		else {
//			System.out.println("6³ª¿È");
//		}
		
		
		switch(num) {
		case 1: 
			System.out.println("1³ª¿È");
			break;
		case 2: 
			System.out.println("2³ª¿È");
			break;
		case 3: 
			System.out.println("3³ª¿È");
			break;
		case 4: 
			System.out.println("4³ª¿È");
			break;
		case 5: 
			System.out.println("5³ª¿È");
			break;
			default:
				System.out.println("6³ª¿È");
		
		}
	}
	
	

}
