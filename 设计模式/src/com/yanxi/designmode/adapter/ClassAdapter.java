package com.yanxi.designmode.adapter;

public class ClassAdapter extends Factory implements Builder{

	@Override
	public void print() {
		System.out.println("print");
	}

}
