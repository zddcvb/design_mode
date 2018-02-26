package com.yanxi.designmode.abstractfactory;

public class MailProduce implements Produce {

	@Override
	public Sendar produce() {

		return new MailSendar();
	}

}
