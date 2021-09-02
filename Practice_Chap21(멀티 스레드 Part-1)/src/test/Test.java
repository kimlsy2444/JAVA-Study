package test;

public class Test {

	private int data;
	
	private int memory;
	
	
	public  int getMemory() {
		return memory;
	}

	public  synchronized void setMemory(int memory) {
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 	this.memory = memory;
	}

	public  int getData() {
		return data;
	}

	public   synchronized void  setData(int data) {
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.data = data;
		
		
	}
	
	public void printData() {
		System.out.println(Thread.currentThread().getName()+" :data: "+" "+this.data);
	
	}
	public void printMemory() {
		System.out.println(Thread.currentThread().getName()+" :memory: "+" "+this.memory);
	
	}
	
	
	
	
	
}
