package example04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionEx {

	public static void main(String[] args) throws ClassNotFoundException  {
		
		Class class1 = Class.forName("example04.Person");
		System.out.println("[생성자 정보]");
		
		Constructor[] constructors = class1.getDeclaredConstructors();
		
		for(Constructor constructor : constructors) {
			System.out.print(constructor.getName()+ "(");
			
			//생성자의 매개변수 타입정보
			Class[] param = constructor.getParameterTypes();
			
			for(int i = 0 ;i<param.length;i++) {
				System.out.print(param[i].getSimpleName());
				if(i<param.length-1) {
					System.out.print(",");
				}
			}
			System.out.println(")");
			
		}
		System.out.println();
		Field[] fields = class1.getDeclaredFields();
		System.out.println("[필드정보]");
		for(Field field : fields) {
			
			System.out.println(field.getType().getSimpleName()+" "+field.getName());;
			
		}
		System.out.println("[메서드 정보]");
		Method[] methods = class1.getDeclaredMethods();
		for(Method method: methods) {
			System.out.print(method.getReturnType().getSimpleName()+" ");
			System.out.print(method.getName()+"(");
			Class[] class2 = method.getParameterTypes();
			for(int i = 0;i<class2.length;i++) {
				System.out.print(class2[i].getSimpleName());
				if(i<(class2.length-1)) {
					System.out.print(",");
				}
			
			}
			System.out.println(")");
		}
	}
}
