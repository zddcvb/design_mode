package com.yanxi.designmode.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/**
 * 原型模式
 * @author 邹丹丹
 *
 */
public class PrototypeMode implements Cloneable {
	/**
	 * 浅复制
	 */
	public PrototypeMode clone() throws CloneNotSupportedException {
		PrototypeMode mode = (PrototypeMode) super.clone();
		return mode;
	}
	/**
	 * 深复制
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public PrototypeMode deepClone() throws IOException, ClassNotFoundException{
		//将对象写入
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		ObjectOutputStream oos=new ObjectOutputStream(bos);
		oos.writeObject(this);
		//将对象输出
		ByteArrayInputStream bis=new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois=new ObjectInputStream(bis);
		return (PrototypeMode) ois.readObject();
	}
}
