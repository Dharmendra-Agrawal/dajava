package com.da.coding.structural.adapter;

import java.util.HashMap;
import java.util.Map;

public class NextGenDataFetcher {
	private Map<Integer,NextGenCompany> companiesMap= new HashMap<>();
	private Map<Integer,NextGenEmployee> employeeMap= new HashMap<>();
	
	public NextGenEmployee getEmployee(Integer employeeId){
		return employeeMap.get(employeeId);
	}
	
	public NextGenCompany getCompany(Integer companyId){
		return companiesMap.get(companyId);
	}

	public Map<Integer, NextGenCompany> getCompaniesMap() {
		return companiesMap;
	}

	public Map<Integer, NextGenEmployee> getEmployeeMap() {
		return employeeMap;
	}
	
	private NextGenDataFetcher(){
		
	}
	
	public static class NextGenDataFetcherSingleton{
		private static final NextGenDataFetcher NEXT_GEN_DATA_FETCHER= new NextGenDataFetcher();
	}
	
	public static  NextGenDataFetcher getInstance(){
		return NextGenDataFetcherSingleton.NEXT_GEN_DATA_FETCHER;
	}
	
}
