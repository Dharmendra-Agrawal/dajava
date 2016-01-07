package com.da.coding.creational.singleton;

import javax.management.RuntimeErrorException;

/*
 * This is similar to eager singleton
 * only advantage is we can have Exception Handling
 * */
public class StaticBlockSingleton {
	private static StaticBlockSingleton singleton;
	
	static{
		try{
			singleton= new StaticBlockSingleton();
		}catch(Error e){
			throw new RuntimeErrorException(e, "Error in initializing StaticBlockSingleton");
		}
	}
	
	private StaticBlockSingleton(){
		
	}
	
	public static StaticBlockSingleton getInstance(){
		return singleton;
	}
	
	public static void main(String[] args) {
		System.out.println(StaticBlockSingleton.getInstance());
	}
}
