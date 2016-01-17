package com.da.coding.structural.composite;

/**
 * 
 * @author dagraw1
 *	Composite Design pattern is used when group of objects are treated in the same way as 
 *	individual object
 *	it has three components
 *	Base component- an interface which common behavior declared
 * 	Leaf component- an individual object class which implements Base component
 * 	Composite component- a group of leaf components
 * 
 * common usages are java.awt..Container #add and many other Swing classes
 */
//Base component
public interface Folder {
	void changePermission(int permissionCode);
}
