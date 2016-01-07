package com.da.coding.creational.abstractfactory;

public class SUVFactory extends AbstractCarFactory{

	@Override
	public Car createInstance(String brand) {
		return new SUV(brand);
	}

}
