package com.da.coding.structural.proxy;


/**
 * 
 * @author dagraw1
 *	proxy holds the references to another object and provide limited access to the end user
 *	Java RMI usage proxy design patterns
 */
public interface CommandExecutor {
	void execute(String cmd) throws Exception;
}
