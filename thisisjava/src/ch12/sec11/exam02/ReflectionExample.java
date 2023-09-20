package ch12.sec11.exam02;

import java.lang.reflect.*;

public class ReflectionExample {

	public static void main(String[] args) {
		Class clazz = Car.class;
		
		System.out.println("[생성자 정보]");
		Constructor[] constructors = clazz.getDeclaredConstructors();
		for(Constructor constructor : constructors) {
			System.out.println(constructor.getName() + "()");
			Class[] parameters = constructor.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}
	}
	
	private static void printParameters( ) {
		
	}

}
