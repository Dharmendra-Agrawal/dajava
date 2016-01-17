package com.da.coding.structural.composite;

import java.util.List;

public class CompositeTest {
	public static void main(String[] args) {
		RootDirectory rootDirectory= new RootDirectory();
		List<Folder> subFolders= rootDirectory.getFolders();
		subFolders.add(new Directory());
		subFolders.add(new Directory());
		subFolders.add(new Directory());
		
		rootDirectory.changePermission(777);
	}
}
