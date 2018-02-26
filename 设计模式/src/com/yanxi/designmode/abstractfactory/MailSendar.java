package com.yanxi.designmode.abstractfactory;

public class MailSendar implements Sendar{

	@Override
	public void send() {
		System.out.println("mailSendar");
	}

}
