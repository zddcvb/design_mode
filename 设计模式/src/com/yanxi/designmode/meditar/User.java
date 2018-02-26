package com.yanxi.designmode.meditar;

public abstract class User {
	private Meditar meditar;
	
	public Meditar getMeditar() {
		return meditar;
	}

	public void setMeditar(Meditar meditar) {
		this.meditar = meditar;
	}
	
	public User(Meditar meditar) {
		super();
		this.meditar = meditar;
	}

	public abstract void work();
}
