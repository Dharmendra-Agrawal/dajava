package com.da.coding.structural.composite;

//Leaf component
public class Directory implements Folder{

	@Override
	public void changePermission(int permissionCode) {
		System.out.println("Added permission :"+permissionCode);
	}

}
