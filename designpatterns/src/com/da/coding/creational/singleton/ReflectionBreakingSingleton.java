package com.da.coding.creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionBreakingSingleton {
	
	//Eager and lazy singletons with double check, thread safe can be broken using reflections
	public static void breakSingleton() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		EagerSingleton singleton1= EagerSingleton.getInstance();
		EagerSingleton singleton2=singleton1;
		
		Constructor<?>[] constructors = EagerSingleton.class.getDeclaredConstructors();
		if(constructors!=null){
			for (Constructor<?> constructor : constructors) {
				constructor.setAccessible(true);
				singleton2= (EagerSingleton) constructor.newInstance();
			}
		}
		
		if(singleton1!=singleton2){
			System.out.println("Singleton is broken, another instance is created");
		}
	}
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		//ReflectionBreakingSingleton.breakSingleton();
		ReflectionBreakingSingleton.breakBillPughSingleton();
		//ReflectionBreakingSingleton.breakDoubleCheckSingleton();
	}
	
	//breaking bill pugh singleton
	public static void breakBillPughSingleton() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		BillPughSingleton singleton1= BillPughSingleton.getInstance();
		BillPughSingleton singleton2= singleton1;
		Constructor<?>[] constructors = BillPughSingleton.class.getDeclaredConstructors();
		for (Constructor<?> constructor : constructors) {
			constructor.setAccessible(true);
			if(constructor.getParameterCount()==0)
				singleton2= (BillPughSingleton) constructor.newInstance();
		}
		
		if(singleton1!=singleton2)
			System.out.println("second instance of the singleton created");
	}
	
	public static void breakDoubleCheckSingleton() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		DoubleCheckThreadSafeSingleton singleton1= DoubleCheckThreadSafeSingleton.getInstance();
		DoubleCheckThreadSafeSingleton singleton2= singleton1;
		Constructor<?>[] constructors = DoubleCheckThreadSafeSingleton.class.getDeclaredConstructors();
		for (Constructor<?> constructor : constructors) {
			constructor.setAccessible(true);
			singleton2= (DoubleCheckThreadSafeSingleton) constructor.newInstance();
		}
		
		if(singleton1!=singleton2)
			System.out.println("second instance of the singleton created");
	}
}
