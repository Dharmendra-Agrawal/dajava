package com.da.coding.structural.adapter;

public class RunAdapterTest {
	public static void main(String[] args) {
		LegacyEmployee emp= new LegacyEmployee(1, "DA", "Agarawal", "Marathalli", "Bangalore", "India");
		LegacyCompany cmp= new LegacyCompany(1, "abc", "IT", "Marathalli", "Bangalore", "India");
		
		LegacyDataFetcher legacyDataFetcher= LegacyDataFetcher.getInstance();
		legacyDataFetcher.getEmployeesMap().put(1, emp);
		legacyDataFetcher.getCompaniesMap().put(1, cmp);
		
		LegacyNextGenAdapter adapter= new LegacyNXTGNAdapterImpl();
		adapter.convertToNextGenCmpny(1);
		adapter.convertToNextGenEmployee(1);
		
		NextGenDataFetcher nextGenFetcher= NextGenDataFetcher.getInstance();
		System.out.println(nextGenFetcher.getCompaniesMap());
		System.out.println(nextGenFetcher.getEmployeeMap());
	}
}
