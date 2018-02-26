package com.yanxi.designmode.factorymethod;

public class SendarFactory {
	
	public Sendar createSendar(String sendarType){
		Sendar sendar=null;
		if ("mail".equals(sendarType)) {
			sendar=new MailSendar();
		}else if ("sms".equals(sendarType)) {
			sendar=new SMSSendar();
		} 
		return sendar;
	}
	
}
