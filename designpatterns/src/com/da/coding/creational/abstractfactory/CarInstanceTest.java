package com.da.coding.creational.abstractfactory;

public class CarInstanceTest {
	public static void main(String[] args) {
		HatchBackFactory hatchBackFactory= new HatchBackFactory();
		Car car1 = CarFactory.getInstance(hatchBackFactory, "Hyundai");
		System.out.println(car1);
		
		SUVFactory suvFactory= new SUVFactory();
		Car car2= CarFactory.getInstance(suvFactory, "Mahindra");
		System.out.println(car2);
	}
}
