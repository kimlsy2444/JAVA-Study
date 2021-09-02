package example02;

public class SwitchNestedEx {

	public static void main(String[] args) {
		
		int number = 6;
		
		switch(number) {
			case 1:
			case 7:
				switch(number) {
				case 1:
					System.out.println("011");
					break;
				case 7:
					System.out.println("017");
					break;
				}
				break;
			case 6:
			case 9:
//				switch(number) {
//				case 1:
//					System.out.println("016");
//					break;
//				case 9:
//					System.out.println("019");
//					break;
//				}
				if(number == 6) {
					System.out.println("016");
				}
				else if(number == 9){
					System.out.println("019");
				}
				
				break;
		}

	}

}
