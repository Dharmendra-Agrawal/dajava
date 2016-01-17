package com.da.coding.structural.adapter;

/**
 * 
 * @author dagraw1
 * Class level adapter
 */
public class LegacyNXTGNAdapterImpl implements LegacyNextGenAdapter{

	LegacyDataFetcher legacyDataFetcher= LegacyDataFetcher.getInstance();
	NextGenDataFetcher nextGenDataFetcher= NextGenDataFetcher.getInstance();
	
	@Override
	public NextGenCompany convertToNextGenCmpny(Integer legacyCompanyId) {
		LegacyCompany legacyCompany = legacyDataFetcher.getCompany(legacyCompanyId);
		NextGenCompany nextGenCompany= new NextGenCompany(legacyCompanyId, legacyCompany.getName(), 
				legacyCompany.getField(), new NextGenAddress(legacyCompany.getAddressLane(), 
				legacyCompany.getCity(), legacyCompany.getCountry()));
		nextGenDataFetcher.getCompaniesMap().put(nextGenCompany.getId(), nextGenCompany);
		return nextGenCompany;
	}

	@Override
	public NextGenEmployee convertToNextGenEmployee(Integer legacyEmployeeId) {
		LegacyEmployee legacyEmployee= legacyDataFetcher.getEmployee(legacyEmployeeId);
		NextGenEmployee nextGenEmployee= new NextGenEmployee(legacyEmployeeId, 
				legacyEmployee.getFirstName()+ (legacyEmployee.getLastName()==null?"":legacyEmployee.getLastName()), 
				new NextGenAddress(legacyEmployee.getAddressLane(), legacyEmployee.getCity(), legacyEmployee.getCountry()));
		nextGenDataFetcher.getEmployeeMap().put(legacyEmployeeId, nextGenEmployee);
		return nextGenEmployee;
	}
	



}
