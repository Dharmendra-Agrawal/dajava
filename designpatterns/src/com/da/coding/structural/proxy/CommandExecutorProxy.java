package com.da.coding.structural.proxy;


public class CommandExecutorProxy implements CommandExecutor{
	
	private boolean isAdmin=false;
	private CommandExecutor executor;

	public CommandExecutorProxy(boolean isAdmin, CommandExecutor executor) {
		super();
		this.isAdmin = isAdmin;
		this.executor = executor;
	}

	@Override
	public void execute(String cmd) throws Exception {
		if(!isAdmin && cmd.startsWith("rm")){
			throw new Exception("User does not have suffiecient privilesges");
		}else {
			executor.execute(cmd);
		}
	}

}
