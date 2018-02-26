package com.yanxi.designmode.observer;

public class MySubject extends AbstractObserver{

	@Override
	public void operation() {
		System.out.println("mysubject operation");
	}

}
