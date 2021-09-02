package example13;

public class WaitNotifyEx {

	public static void main(String[] args) {
		
		DataBox dataBox = new DataBox();
		
		ProducerThread producerThread = new ProducerThread(dataBox);
		ConsumerThread consumerThread = new ConsumerThread(dataBox);
		
		
		producerThread.start();
		
		consumerThread.start();
		
	
		
	
	
	}
	

}


