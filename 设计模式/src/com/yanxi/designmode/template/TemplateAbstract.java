package com.yanxi.designmode.template;

public abstract class TemplateAbstract {
	//主方法
	public int calcuate(String exp,String split){
		int[] arrayInts = split(exp, split);
		return calcuate(arrayInts[0], arrayInts[1]);
	}
	//被重写的方法
	public abstract int calcuate(int num1,int num2);
	
	public int[] split(String exp,String split){
		String[] strings = exp.split(split);
		int[] arrayInts=new int[2];
		arrayInts[0]=Integer.parseInt(strings[0]);
		arrayInts[1]=Integer.parseInt(strings[1]);
		return arrayInts;
	}
}
