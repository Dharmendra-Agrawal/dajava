package com.da.coding.structural.adapter;

public interface LegacyNextGenAdapter {
	NextGenCompany convertToNextGenCmpny(Integer legacyCompanyId);
	NextGenEmployee convertToNextGenEmployee(Integer legacyEmployeeId);
}
