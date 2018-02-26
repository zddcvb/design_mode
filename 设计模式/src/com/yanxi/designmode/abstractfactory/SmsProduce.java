package com.yanxi.designmode.abstractfactory;

public class SmsProduce implements Produce {

	@Override
	public Sendar produce() {

		return new SMSSendar();
	}

}
