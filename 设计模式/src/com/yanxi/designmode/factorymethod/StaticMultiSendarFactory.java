package com.yanxi.designmode.factorymethod;

public class StaticMultiSendarFactory {
	//
	public static Sendar createmailSendarSendar() {

		return new MailSendar();
	}

	public static Sendar createsmsSendarSendar() {

		return new SMSSendar();
	}

}
