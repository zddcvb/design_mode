package com.yanxi.designmode.command;

public class MyCommand implements Command{
	private Reserver reserver;
	public MyCommand(Reserver reserver){
		this.reserver=reserver;
	}
	@Override
	public void exe() {
		reserver.action();
	}
	
}
