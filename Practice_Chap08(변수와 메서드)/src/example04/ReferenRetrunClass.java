package example04;

class Data{
	int data;
}
public class ReferenRetrunClass {

	public static Data copy(Data d) {
		Data cloned = new Data();
		System.out.println("d 林家 : "+d);
		
		
		System.out.println("cloned 林家 : "+cloned);
		
		cloned.data = d.data;
	
		return cloned;
		
	}
	
	public static void main(String[] args) {
		
		Data ori= new Data();
		ori.data =100;
		
		System.out.println("ori 林家 : "+ori);

		Data cloned = copy(ori);
		
		System.out.println("cloned 林家 : "+cloned);
		
		System.out.println(cloned.data);
		
	}
	

}
