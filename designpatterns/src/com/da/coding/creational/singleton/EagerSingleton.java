package com.da.coding.creational.singleton;

/*
 * Eager instantiation of Singleton creates instance even though it might not be required
 * could be waste of resources as Singleton are mostly required for heavy resources like file system or DB connection
 * no way to do exception handling
 * */
public class EagerSingleton {
	private static final EagerSingleton SINGLETON= new EagerSingleton();
	
	private EagerSingleton(){
		
	}
	
	public static EagerSingleton getInstance(){
		return SINGLETON;
	}
	
	public static void main(String[] args) {
		System.out.println(EagerSingleton.getInstance());
	}
}
