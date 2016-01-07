package com.da.coding.creational.singleton;

/**
 * 
 * @author dagraw1
 * all other singleton can be destroyed using reflections
 * enum is the only way it can not be destroyed using reflections
 * though there is no way to do lazy initialization here
 */
public enum SINGLETON {
	INSTANCE;
	
	public void doSomeThing(){
		
	}
}
