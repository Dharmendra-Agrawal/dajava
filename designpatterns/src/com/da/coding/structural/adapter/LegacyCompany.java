package com.da.coding.structural.adapter;

public class LegacyCompany {
	private Integer id;
	private String name;
	private String field;
	private String addressLane;
	private String city;
	private String country;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public String getAddressLane() {
		return addressLane;
	}
	public void setAddressLane(String addressLane) {
		this.addressLane = addressLane;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LegacyCompany(Integer id, String name, String field,
			String addressLane, String city, String country) {
		super();
		this.id = id;
		this.name = name;
		this.field = field;
		this.addressLane = addressLane;
		this.city = city;
		this.country = country;
	}
}
