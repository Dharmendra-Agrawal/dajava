package com.da.coding.structural.adapter;

import java.util.HashMap;
import java.util.Map;

public class LegacyDataFetcher {
	Map<Integer,LegacyCompany> companiesMap= new HashMap<>();
	Map<Integer,LegacyEmployee> employeesMap= new HashMap<>();
	
	public LegacyCompany getCompany(Integer companyId){
		return companiesMap.get(companyId);
	}
	
	public LegacyEmployee getEmployee(Integer employeeId){
		return employeesMap.get(employeeId);
	}

	public Map<Integer, LegacyCompany> getCompaniesMap() {
		return companiesMap;
	}

	public Map<Integer, LegacyEmployee> getEmployeesMap() {
		return employeesMap;
	}
	
	private LegacyDataFetcher(){
		
	}
	
	public static class LegacyDataFetcherSingleton{
		private static final LegacyDataFetcher LEGACY_DATA_FETCHER= new LegacyDataFetcher();
	}
	
	public static LegacyDataFetcher getInstance(){
		return LegacyDataFetcherSingleton.LEGACY_DATA_FETCHER;
	}
}
