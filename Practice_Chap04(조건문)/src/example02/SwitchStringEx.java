package example02;

public class SwitchStringEx {

	public static void main(String[] args) {
	
		String str ="부장";
		
		switch(str) {
			case  "부장" : 
				System.out.println(450);
				break;
			case  "차장" : 
				System.out.println(400);
				break;
			case  "과장" : 
				System.out.println(350);
				break;
			case  "대리장" : 
				System.out.println(250);
				break;
			case  "사원" : 
				System.out.println(200);
				break;
			default : 
				System.out.println("X");
				break;
		
		}

	}

}
