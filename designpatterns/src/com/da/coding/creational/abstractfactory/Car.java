package com.da.coding.creational.abstractfactory;

public abstract class Car {
	private String brand;

	public Car(String brand) {
		super();
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
}
