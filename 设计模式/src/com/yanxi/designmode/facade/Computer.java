package com.yanxi.designmode.facade;

public class Computer {
	private CPU cpu;
	private Disk disk;
	private Memory memory;
	private Power power;
	public Computer(){
		cpu=new CPU();
		disk=new Disk();
		memory=new Memory();
		power=new Power();
	}
	public  void open(){
		power.startup();
		cpu.startup();
		memory.startup();
		disk.startup();
	}
	public void close(){
		disk.shutdown();
		memory.shutdown();
		cpu.shutdown();
		power.shutdown();
	}
}
