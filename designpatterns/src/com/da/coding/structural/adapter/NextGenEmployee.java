package com.da.coding.structural.adapter;

public class NextGenEmployee {
	private Integer id;
	private String fullName;
	private NextGenAddress address;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public NextGenAddress getAddress() {
		return address;
	}
	public void setAddress(NextGenAddress address) {
		this.address = address;
	}
	public NextGenEmployee(Integer id, String fullName, NextGenAddress address) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.address = address;
	}
	@Override
	public String toString() {
		return "NextGenEmployee [id=" + id + ", fullName=" + fullName
				+ ", address=" + address + "]";
	}
}
