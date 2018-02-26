package com.yanxi.designmode.restore;

public class Origianl {
	private String value;

	public Origianl(String value) {
		super();
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	public MemoryTo createMemoryTo(){
		return new MemoryTo(value);
	}
	public void restoreMemoryTo(MemoryTo memoryTo){
		this.value=memoryTo.getValue();
	}
}
