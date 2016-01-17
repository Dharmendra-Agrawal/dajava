package com.da.coding.structural.composite;

import java.util.ArrayList;
import java.util.List;

//composite component
public class RootDirectory implements Folder{

	List<Folder> folders= new ArrayList<Folder>();
	
	@Override
	public void changePermission(int permissionCode) {
		System.out.println("permission is updated rootNode: "+permissionCode);
		changeSubFoldersPermissions(permissionCode);
	}
	
	private void changeSubFoldersPermissions(int permissionCode){
		folders.parallelStream().forEach(folder -> folder.changePermission(permissionCode));
	}

	public List<Folder> getFolders() {
		return folders;
	}
	
}
