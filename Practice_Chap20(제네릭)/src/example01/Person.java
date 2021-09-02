package example01;


public class Person {
	
		private Object object;
		

		// 리턴타입이  Object 이고, 매개변수가 Object 이다.
		// 모든 클래스를 다 매개변수,리턴 타입으로 하겠다.(다형성)
		
		public Object getObject() {
			return object;
		}

		public void setObject(Object object) {
			this.object = object;
		}
}
