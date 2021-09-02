package example05;

public class Driver {

	// new Taxi() new Bus() 만 들어올수 있다.
	// 위 2개의 클래스가 Vehicalble 인터페이스를 구연했기 때문에
	
	//인터페잇  매개변수의 다형성 
	public void drive(Vehicalble vehicalble) {
		vehicalble.run();
	//	System.out.println(vehicalble); // 주소출력
		
	}
	public void stop(Vehicalble vehicalble){
		vehicalble.stop();
	}
	
	public Vehicalble newCarmethod(Vehicalble vehicalble) {
		
		if(vehicalble instanceof Taxi) {
			
			System.out.println("택시 ㅇㅇ "); 
			Taxi taxi = (Taxi) vehicalble;
			System.out.println(vehicalble); 
			System.out.println(taxi); 
			return taxi;
		}
		
		else if(vehicalble instanceof Bus) {
			System.out.println("버스 ㅇㅇ "); 
			Bus bus = (Bus) vehicalble;
			System.out.println(vehicalble); 
			System.out.println(bus); 
		return bus;
		}
		
		return null;
	}
}
