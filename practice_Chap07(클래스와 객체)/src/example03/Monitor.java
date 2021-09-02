package example03;

public class Monitor {

		// 멤버 변수 (필드)
		String color ;
		int channel;
		boolean power;
		
		//멤버 메서드
		
		public void power(){
			
			 if (!this.power){
				System.out.println("모니터 on");
				this.power = !power;
				}
			 else {
				System.out.println("모니터  off"); 
				this.power = !power;
			 }
		}
		
		
		
		public void channelUp() {
			this.channel++;
			System.out.println("ch : "+this.channel);
			
		}
		public void channelDown(){
			System.out.println("ch : "+ --this.channel);
		}
		
		@Override
		public String toString() {
	
			
		return "현재 채널 : "+this.channel+" 현재 색  : "+ this.color;
		}
		
		
		
		
		
		
		
		
		
}
