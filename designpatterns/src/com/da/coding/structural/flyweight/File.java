package com.da.coding.structural.flyweight;

public class File implements IFile{
	private String type="FILE";

	@Override
	public void getFileType() {
		System.out.println("File type is :"+type);
	}
	
}
