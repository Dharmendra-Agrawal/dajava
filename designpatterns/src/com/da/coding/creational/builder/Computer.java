package com.da.coding.creational.builder;

/*
 * This is creational design pattern- Builder
 * */
public class Computer {
	//Mandatory fields
	private String systemName;
	private String modelNo;
	private Integer ramSize;
	
	//optional fields
	private boolean isGraphicsCard;
	private boolean isOctaCore;
	
	private Computer(ComputerBuilder computerBuilder) {
		this.systemName= computerBuilder.systemName;
		this.modelNo= computerBuilder.modelNo;
		this.ramSize= computerBuilder.ramSize;
		this.isGraphicsCard= computerBuilder.isGraphicsCard;
		this.isOctaCore= computerBuilder.isOctaCore;
	}
	public String getSystemName() {
		return systemName;
	}
	public String getModelNo() {
		return modelNo;
	}
	public Integer getRamSize() {
		return ramSize;
	}
	public boolean isGraphicsCard() {
		return isGraphicsCard;
	}
	public boolean isOctaCore() {
		return isOctaCore;
	}
	
	@Override
	public String toString() {
		return "Computer [systemName=" + systemName + ", modelNo=" + modelNo
				+ ", ramSize=" + ramSize + ", isGraphicsCard=" + isGraphicsCard
				+ ", isOctaCore=" + isOctaCore + "]";
	}

	public static class ComputerBuilder{
		//Mandatory fields
		private String systemName;
		private String modelNo;
		private Integer ramSize;
		
		//optional fields
		private boolean isGraphicsCard;
		private boolean isOctaCore;
		
		public ComputerBuilder(String systemName, String modelNo,
				Integer ramSize) {
			super();
			this.systemName = systemName;
			this.modelNo = modelNo;
			this.ramSize = ramSize;
		}

		public ComputerBuilder setGraphicsCard(boolean isGraphicsCard) {
			this.isGraphicsCard = isGraphicsCard;
			return this;
		}

		public ComputerBuilder setOctaCore(boolean isOctaCore) {
			this.isOctaCore = isOctaCore;
			return this;
		}
		
		public Computer build(){
			return new Computer(this);
		}
		
	}
	
	public static void main(String[] args) {
		Computer computer = new Computer.ComputerBuilder("COMP001", "DELL001", 10000).setGraphicsCard(true).setOctaCore(true).build();
		System.out.println(computer);
	}
	
}
