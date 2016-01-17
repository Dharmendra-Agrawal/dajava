package com.da.coding.structural.proxy;

import java.io.IOException;

public class CommandExecutorImpl implements CommandExecutor{

	private String userId;

	public CommandExecutorImpl(String userId) {
		super();
		this.userId = userId;
	}

	@Override
	public void execute(String cmd) throws IOException {
		System.out.println("User: "+userId+" is running command :"+cmd);
		//System.out.println("command returned :"+Runtime.getRuntime().exec(cmd));
	}

}
