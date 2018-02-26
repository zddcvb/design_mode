package com.yanxi.designmode.iterator;

public class MyCollection implements Collection{
	int[] arrayInts={1,2,3};
	@Override
	public Iterator iterator() {
		return new MyIterator(this);
	}

	@Override
	public Object get(int index) {
		return arrayInts[index];
	}

	@Override
	public long size() {
		return arrayInts.length;
	}

}
