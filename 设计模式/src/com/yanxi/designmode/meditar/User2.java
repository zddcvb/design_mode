package com.yanxi.designmode.meditar;

public class User2 extends User{

	public User2(Meditar meditar) {
		super(meditar);
		
	}

	@Override
	public void work() {
		System.out.println("user2 work");
	}

}
