package com.yanxi.designmode.abstractfactory;

import java.util.ArrayList;
import java.util.List;
/**
 * 建造者模式
 * 
 * @author 邹丹丹
 *
 */
public class Builder {
	List<Sendar> sendars = new ArrayList<>();
	public void builderMail() {
		sendars.add(new MailSendar());
	}

	public void builderSms() {
		sendars.add(new SMSSendar());
	}
}
