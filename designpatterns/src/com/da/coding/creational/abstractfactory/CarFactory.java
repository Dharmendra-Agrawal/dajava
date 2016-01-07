package com.da.coding.creational.abstractfactory;

public class CarFactory {
	public static Car getInstance(AbstractCarFactory factory, String brand){
		return factory.createInstance(brand);
	}
}
