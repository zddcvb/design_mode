package com.yanxi.designmode.meditar;

public class User1 extends User{

	public User1(Meditar meditar) {
		super(meditar);
		
	}

	@Override
	public void work() {
		System.out.println("user1 work");
	}

}
