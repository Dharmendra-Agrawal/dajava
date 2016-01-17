package com.da.coding.structural.flyweight;


public class FileWeightTest {
	public static void main(String[] args) {
		FilesFactory factory = FilesFactory.getInstance();
		int suffix=1;
		long startTime= System.currentTimeMillis();
		while(suffix<100){
			factory.getFile("{network}/file"+suffix++);
		}
		System.out.println("Time Taken to fetch file over network first Time :"+(System.currentTimeMillis()-startTime));
		
		suffix=1;
		startTime=System.currentTimeMillis();
		while(suffix<100){
			factory.getFile("{network}/file"+suffix++);
		}
		System.out.println("Time Taken to fetch file over network Second Time :"+(System.currentTimeMillis()-startTime));
		
	}
}
