package com.da.coding.structural.adapter;

public class NextGenAddress {
	private String addressLane;
	private String city;
	private String country;
	
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
	public NextGenAddress(String addressLane, String city, String country) {
		super();
		this.addressLane = addressLane;
		this.city = city;
		this.country = country;
	}
	@Override
	public String toString() {
		return "NextGenAddress [addressLane=" + addressLane + ", city=" + city
				+ ", country=" + country + "]";
	}
}
