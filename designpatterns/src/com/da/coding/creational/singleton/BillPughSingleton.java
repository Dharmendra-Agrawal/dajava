package com.da.coding.creational.singleton;

/*
 * Most widely used way to create singleton
 * it does not require any synchronization
 * inner class Singleton is only loaded when getInstance method is called
 * */
public class BillPughSingleton {
	private BillPughSingleton(){
		
	}
	
	public static class Singleton{
		private final static BillPughSingleton SINGLETON= new BillPughSingleton();
	}
	
	public static BillPughSingleton getInstance(){
		return BillPughSingleton.Singleton.SINGLETON;
	}
	
	public static void main(String[] args) {
		System.out.println(BillPughSingleton.getInstance().hashCode()==BillPughSingleton.getInstance().hashCode());
	}
}
