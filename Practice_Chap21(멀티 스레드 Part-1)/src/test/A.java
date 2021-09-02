package test;

public class A extends Thread{
	
	private Test test;
	
	public void setA(Test test) {
		
		this.test=test;
		
	}
	
	@Override
	public void run() {

	  this.test.setMemory(500);
		
	   this.test.setData(100);
		
	
		this.test.printData();
		
		this.test.printMemory();
	}
	

}
