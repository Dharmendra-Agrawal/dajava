package com.da.coding.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class ProtoTypeTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Map<String, String> configs= new HashMap<String, String>();
		configs.put("db_url", "jdbc:mysql:mem:dbconnection");
		configs.put("user_name", "sa");
		configs.put("password", "12345");
		configs.put("max_connection", "10");
		DBConnection<String> dbConnection= new DBConnection<String>();
		dbConnection.loadConfig(configs);
		
		DBConnection<String> prototype1= (DBConnection<String>) dbConnection.clone();
		prototype1.getConfigurations().put("db_url", "jdbc:mysql:mem:prototype1");
		
		DBConnection<String> prototype2= (DBConnection<String>) dbConnection.clone();
		prototype2.getConfigurations().put("db_url", "jdbc:mysql:mem:prototype2");
		
		System.out.println(dbConnection);
		System.out.println(prototype1);
		System.out.println(prototype2);
	}
}
