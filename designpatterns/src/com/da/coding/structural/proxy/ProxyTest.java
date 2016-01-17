package com.da.coding.structural.proxy;

public class ProxyTest {
	public static void main(String[] args) throws Exception {
		CommandExecutor commandExecutor= new CommandExecutorImpl("DA");
		CommandExecutorProxy proxy= new CommandExecutorProxy(true, commandExecutor);
		proxy.execute("dir");
		proxy.execute("rm -r *");
	}
}	
