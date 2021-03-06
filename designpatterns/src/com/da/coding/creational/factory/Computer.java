package com.da.coding.creational.factory;

public abstract class Computer {
	private String modelNo;
	private String brand;
	private Integer ramSize;
	
	public Computer(String modelNo, String brand, Integer ramSize) {
		super();
		this.modelNo = modelNo;
		this.brand = brand;
		this.ramSize = ramSize;
	}
	
	public String getModelNo() {
		return modelNo;
	}
	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Integer getRamSize() {
		return ramSize;
	}
	public void setRamSize(Integer ramSize) {
		this.ramSize = ramSize;
	}
	
	
}
