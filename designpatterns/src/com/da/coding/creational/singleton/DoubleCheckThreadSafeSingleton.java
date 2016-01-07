package com.da.coding.creational.singleton;

/*
 * This is a thread safe singleton with double check
 * it used to have issues prior to java 5 as JVM memory model was having so many issues
 * */
public class DoubleCheckThreadSafeSingleton {
	private static DoubleCheckThreadSafeSingleton singleton;
	
	private DoubleCheckThreadSafeSingleton(){
		
	}
	
	public static DoubleCheckThreadSafeSingleton getInstance(){
		if(singleton==null){
			synchronized (DoubleCheckThreadSafeSingleton.class) {
				if(singleton==null)
					singleton= new DoubleCheckThreadSafeSingleton();
			}
		}
		
		return singleton;
	}
	
	public static void main(String[] args) {
		System.out.println(DoubleCheckThreadSafeSingleton.getInstance());
	}
}
