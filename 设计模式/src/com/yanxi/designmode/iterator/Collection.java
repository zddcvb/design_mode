package com.yanxi.designmode.iterator;

public interface Collection {
	public Iterator iterator();
	public Object get(int index);
	public long size();
}
