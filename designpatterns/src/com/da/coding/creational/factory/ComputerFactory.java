package com.da.coding.creational.factory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ComputerFactory {
	public static Computer getInstance(Class<?> cls, String modelNo, String brand, Integer ramSize ) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		Computer computer=null;
		Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
		for (Constructor<?> constructor : declaredConstructors) {
			constructor.setAccessible(true);
			computer= (Computer)constructor.newInstance(modelNo,brand, ramSize);
		}
		return computer;
	}
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Computer computer = ComputerFactory.getInstance(PersonalComputer.class, null, null, 0);
		System.out.println(computer);
	}
}
