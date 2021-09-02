package example05;

public class VehicalbleEx {

	public static void main(String[] args) {
	
		Driver drivar  = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		bus.setSpeed(-1);
		bus.setSpeed(80);
		// 직접 참조변수를 넘기는번
		drivar.drive(bus);
		drivar.stop(bus);
		System.out.println();
		
		// 직접 참조변수를 넘기는번
		taxi.setSpeed(-2);
		taxi.setSpeed(150);
		drivar.drive(taxi);
		drivar.stop(taxi);
		
		// 직접 매개변수를 생성하여 넘기는 방법
		System.out.println();
		drivar.drive(new Taxi());
		drivar.drive(new Bus());
		
		
		//drivar.drive(new AICar()); 
		// AICar 는 Vehicalble를 구현하지 않았기 때문에
	
		System.out.println();
		
		// 리턴타입 ,매개변수타입이 전푸  Vehicalble 인터페이스 타입이다.
		// 리턴타입도 구현클래스가 와야 하며 , 매개변수 타입도 역시
		// 구현 클레스가 와야한다.
		
		Vehicalble vehicalble = (Taxi)drivar.newCarmethod(new Taxi());
		vehicalble.run();
		vehicalble.stop();
		
		System.out.println();
		
		vehicalble = (Bus)drivar.newCarmethod(new Bus());
		vehicalble.run();
		vehicalble.stop();
		
		
	}

}
