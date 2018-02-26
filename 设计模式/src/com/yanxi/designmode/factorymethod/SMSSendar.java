package com.yanxi.designmode.factorymethod;

public class SMSSendar implements Sendar{

	@Override
	public void send() {
		System.out.println("smssendar");
	}
	
}
