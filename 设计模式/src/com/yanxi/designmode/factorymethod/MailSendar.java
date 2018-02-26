package com.yanxi.designmode.factorymethod;

public class MailSendar implements Sendar{

	@Override
	public void send() {
		System.out.println("mailSendar");
	}

}
