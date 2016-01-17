package com.da.coding.structural.adapter;

public class NextGenCompany {
	private Integer id;
	private String name;
	private String stream;
	private NextGenAddress address;
	
	public NextGenCompany(Integer id, String name, String stream,
			NextGenAddress address) {
		super();
		this.id = id;
		this.name = name;
		this.stream = stream;
		this.address = address;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public NextGenAddress getAddress() {
		return address;
	}

	public void setAddress(NextGenAddress address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "NextGenCompany [id=" + id + ", name=" + name + ", stream="
				+ stream + ", address=" + address + "]";
	}
	
}
