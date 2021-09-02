package test;

public class B extends Thread{
	
	private Test test;
	
	
	public void setB(Test test) {
		this.test=test;
	}
	@Override
	public void run() {
		
		this.test.setData(200);
		
		this.test.setMemory(1000);
		

		this.test.printData();
		
		this.test.printMemory();
		
		
	}

}
