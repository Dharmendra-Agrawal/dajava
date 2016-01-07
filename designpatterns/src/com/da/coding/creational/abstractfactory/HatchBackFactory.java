package com.da.coding.creational.abstractfactory;

public class HatchBackFactory extends AbstractCarFactory{

	@Override
	public Car createInstance(String brand) {
		return new HatchBack(brand);
	}

}
