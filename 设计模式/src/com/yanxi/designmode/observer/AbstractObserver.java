package com.yanxi.designmode.observer;

import java.util.Iterator;
import java.util.Vector;

public abstract class AbstractObserver implements Subject{
	Vector<Observer> observers=new Vector<Observer>();
	@Override
	public void add(Observer observer) {
		System.out.println("observer add");
		observers.add(observer);
	}

	@Override
	public void del(Observer observer) {
		System.out.println("observer del");
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		System.out.println("observer notifyObservers");
		Iterator<Observer> iterator = observers.iterator();
		while (iterator.hasNext()) {
			Observer observer = (Observer) iterator.next();
			observer.update();
		}
	}
}
