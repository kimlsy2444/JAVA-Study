package example01;

public class IncreDreEx {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		
		System.out.println("----------------");
		System.out.println("x = "+ (x++));
		System.out.println("x = "+ x);
		System.out.println();
		System.out.println("y = "+ (++y));
		System.out.println("x = "+ y);
		System.out.println("----------------");
		
		System.out.println("(x++) + (++y) : "+ ((x++)+(++y)));
	

	}

}
