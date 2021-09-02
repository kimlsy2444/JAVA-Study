package example02;

public class CarEx {

	public static void main(String[] args) {
		
		
		Car c1 = new Car();
		
		Car c2 = new Car("»¡°­","ÀÚµ¿",2);
		
		Car c3 = new Car("ÆÄ¶û","¼öµ¿");
		
		System.out.println(c1);  
		
		
		System.out.println(c2);
		
		
		System.out.println(c3); 
		
	
		
		for(int i = 0; i<10; i++) {
			Car c = new Car(c2);
		System.out.println(i+" ¹ø¤Š Â÷ : "+c); 
		
		}
			
	}

}
