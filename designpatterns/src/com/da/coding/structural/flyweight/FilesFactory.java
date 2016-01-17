package com.da.coding.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author dagraw1
 *	FlyWeight can be used to cache some objects when there creation and instantiation is heavy and
 *	time taking
 */

public class FilesFactory {
	Map<String, File> filesCache= new HashMap<>();
	
	public File getFile(String filePath){
		File file = filesCache.get(filePath);
		if(file==null)
		{
			//This is a network operation and too slow
			try {
				Thread.sleep(500);
				file= new File();
				filesCache.put(filePath, file);
			} catch (InterruptedException e) {
				System.out.println("Error in reading file over network");
			}
			
		}
		return file;
	}
	
	private FilesFactory() {
	}

	public static FilesFactory getInstance(){
		return FileFactorySinlgeton.FILES_FACTORY;
	}
	public static class FileFactorySinlgeton{
		private static final FilesFactory FILES_FACTORY= new FilesFactory(); 
	}
}
