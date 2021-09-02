package example02;

// Person 이라는 클래스를 제너릭 타입으로 설계함
public class Person<T> {
	
	// T라는 타입이 아직 정해지지 않았다.
	// T는 개발코드에서 정해진다.
	// 하여 , static은 올수가 없다.(인스턴스가 만들어져야 사용 가능하기때문)

		private T t;

		
		
		public T getT() {
			return t;
		}

		public void setT(T t) {
			this.t = t;
		}
		
	
}
