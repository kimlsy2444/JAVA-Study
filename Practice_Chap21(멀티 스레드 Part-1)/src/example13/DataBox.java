package example13;

// 공유객체
public class DataBox {

	private String data;
	
	public synchronized String getData() {
		if(this.data == null) {
			try {
				System.out.println("!!!");
				wait();
				
			} catch (InterruptedException e) {}
		}
		String returnValue = this.data;
		
		System.out.println(Thread.currentThread().getName()+"가 읽은 데이터 "+ this.data);
		this.data = null;
		notify();
		return returnValue;
	}
	
	public synchronized void setData(String data) {
	
		// Consumer  스레드가 데이터를 소비하지 않았다면...
		if(this.data != null) {
			try {
				System.out.println("zzz");
				wait();
			} catch (InterruptedException e) {}
			
		}
		
		this.data = data;
		System.out.println(Thread.currentThread().getName()+"가 생성한 데이터 : "+this.data);
		
		notify();
	}
}
