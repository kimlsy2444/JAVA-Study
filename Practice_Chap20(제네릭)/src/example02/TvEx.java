package example02;

public class TvEx {

	public static void main(String[] args) {
		
		Tv<String> tv1 = new Tv<>(); //<string> 생략 가능
		tv1.setE("LG OLED TV");
		
		String tvName = tv1.getE(); // 리턴타입이 String
		System.out.println("TV NAME : "+tvName);
	}

}
