package com.da.coding.creational.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * prototype design pattern can be used when it is costly affair to create an instance
 * instead of creating an object from all over beginning, we can clone an existing object and
 * modify it according to our need
 * 
 * By default clone() does Shallow copy and object variable like Map in below example will be 
 * shared and can result in unexpected behavior
 * override clone to do deep copy
 * @author dagraw1
 *
 * @param <T>
 */
public class DBConnection<T> implements Cloneable{
	Map<String, T> configurations;

	public Map<String, T> getConfigurations() {
		return configurations;
	}

	public void setConfigurations(Map<String, T> configurations) {
		this.configurations = configurations;
	}
	
	public void loadConfig(Map<String, T> configs){
		configurations= configs;
	}

	@Override
	public String toString() {
		return "DBConnection [configurations=" + configurations + "]";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		DBConnection<T> dbconnection = (DBConnection<T>) super.clone();
		Map<String,T> map= new HashMap<String, T>();
		map.putAll(this.configurations);
		dbconnection.setConfigurations(map);
		return dbconnection;
	}
	
}
