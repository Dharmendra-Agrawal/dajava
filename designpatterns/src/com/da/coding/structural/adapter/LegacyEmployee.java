package com.da.coding.structural.adapter;

public class LegacyEmployee {
	private Integer id;
	private String firstName;
	private String lastName;
	private String addressLane;
	private String city;
	private String country;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
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
	public LegacyEmployee(Integer id, String firstName, String lastName,
			String addressLane, String city, String country) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.addressLane = addressLane;
		this.city = city;
		this.country = country;
	}
	
}
