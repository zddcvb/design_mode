package com.yanxi.designmode.factorymethod;

public class MultiSendarFactory {
	//
	public Sendar createmailSendarSendar(){
		
		return new MailSendar();
	}
	
public Sendar createsmsSendarSendar(){
		
		return new SMSSendar();
	}
	
}
