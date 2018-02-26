package com.yanxi.designmode.test;

import org.junit.Test;

import com.yanxi.designmode.abstractfactory.MailProduce;
import com.yanxi.designmode.abstractfactory.Produce;
import com.yanxi.designmode.adapter.Builder;
import com.yanxi.designmode.adapter.ClassAdapter;
import com.yanxi.designmode.adapter.Factory;
import com.yanxi.designmode.adapter.Interface1;
import com.yanxi.designmode.adapter.Interface2;
import com.yanxi.designmode.adapter.ObjectAdapter;
import com.yanxi.designmode.adapter.ObjectBuilder;
import com.yanxi.designmode.bridge.BridgeInstance1;
import com.yanxi.designmode.bridge.MyBridge;
import com.yanxi.designmode.chain.Handler;
import com.yanxi.designmode.chain.MyHandler;
import com.yanxi.designmode.command.Command;
import com.yanxi.designmode.command.Invoke;
import com.yanxi.designmode.command.MyCommand;
import com.yanxi.designmode.command.Reserver;
import com.yanxi.designmode.decotor.FactoryBuilder;
import com.yanxi.designmode.facade.Computer;
import com.yanxi.designmode.factorymethod.MultiSendarFactory;
import com.yanxi.designmode.factorymethod.Sendar;
import com.yanxi.designmode.factorymethod.SendarFactory;
import com.yanxi.designmode.iterator.Collection;
import com.yanxi.designmode.iterator.Iterator;
import com.yanxi.designmode.iterator.MyCollection;
import com.yanxi.designmode.meditar.Meditar;
import com.yanxi.designmode.meditar.MyMeditar;
import com.yanxi.designmode.observer.MySubject;
import com.yanxi.designmode.observer.Observer;
import com.yanxi.designmode.observer.Observer1;
import com.yanxi.designmode.observer.Observer2;
import com.yanxi.designmode.observer.Subject;
import com.yanxi.designmode.proxy.Proxy;
import com.yanxi.designmode.proxy.ProxyInterface;
import com.yanxi.designmode.restore.MemoryTo;
import com.yanxi.designmode.restore.Origianl;
import com.yanxi.designmode.restore.RestoreMemoryTo;
import com.yanxi.designmode.status.Context;
import com.yanxi.designmode.status.State;
import com.yanxi.designmode.strategy.StrategyInterface;
import com.yanxi.designmode.strategy.StrategyPlus;
import com.yanxi.designmode.template.TemplateAbstract;
import com.yanxi.designmode.template.TemplateSub;
import com.yanxi.designmode.visitor.MyVistor;
import com.yanxi.designmode.visitor.MyVistorSub;
import com.yanxi.designmode.visitor.Vistor;
import com.yanxi.designmode.visitor.VistorSub;

public class TestFactory {
	/**
	 * 工厂方法模式
	 */
	@Test
	public void test_factorymethod() {
		SendarFactory factory = new SendarFactory();
		Sendar sendar = factory.createSendar("mail");
		sendar.send();

		MultiSendarFactory multiSendarFactory = new MultiSendarFactory();
		Sendar createmailSendarSendar = multiSendarFactory
				.createmailSendarSendar();
		createmailSendarSendar.send();
	}
	/**
	 * 抽象工厂模式
	 */
	@Test
	public void test_abstractfactory() {
		Produce produce = new MailProduce();
		com.yanxi.designmode.abstractfactory.Sendar sendar = produce.produce();
		sendar.send();
	}
	/**
	 * 适配器模式
	 */
	@Test
	public void test_adapter() {
		// 类适配器
		Builder builder = new ClassAdapter();
		builder.print();
		builder.produce();
		// 对象适配器
		ObjectBuilder objectBuilder = new ObjectAdapter(new Factory());
		objectBuilder.print();
		objectBuilder.produce();
		// 接口适配器
		Builder builder2 = new Interface1();
		builder2.print();
		Builder builder3 = new Interface2();
		builder3.produce();
	}
	/**
	 * 装饰模式
	 */
	@Test
	public void test_decotor() {
		com.yanxi.designmode.decotor.Builder builder = new FactoryBuilder(
				new com.yanxi.designmode.decotor.Factory());
		builder.print();
	}
	/**
	 * 代理模式
	 */
	@Test
	public void test_proxy(){
		ProxyInterface proxyInterface=new Proxy();
		proxyInterface.methon1();
	}
	/**
	 * 外观模式
	 */
	@Test
	public void test_facade(){
		Computer computer=new Computer();
		computer.open();
		computer.close();
	}
	/**
	 * 桥接模式
	 */
	@Test
	public void test_bridge(){
		MyBridge bridge=new MyBridge();
		bridge.setBridgeInterface(new BridgeInstance1());
		bridge.method();
	}
	/**
	 * 策略模式
	 */
	@Test
	public void test_strategy(){
		String exp="5+5";
		StrategyInterface strategyInterface=new StrategyPlus();
		int result = strategyInterface.calculate(exp);
		System.out.println(result);
	}
	/**
	 * 模板模式
	 */
	@Test
	public void test_template(){
		TemplateAbstract templateAbstract=new TemplateSub();
		int calcuate = templateAbstract.calcuate("5+4", "\\+");
		System.out.println(calcuate);
	}
	/**
	 * 观察者模式
	 */
	@Test
	public void test_observer(){
		Observer observer1=new Observer1();
		Observer observer2=new Observer2();
		Subject subject=new MySubject();
		subject.add(observer1);
		subject.add(observer2);
		subject.operation();
		subject.notifyObservers();
	}
	/**
	 * 迭代子模式
	 */
	@Test
	public void test_iterator(){
		Collection collection=new MyCollection();
		Iterator iterator = collection.iterator();
		while(iterator.hasNext()){
			int result=(int) iterator.next();
			System.out.println(result);
		}
	}
	/**
	 * 责任链模式
	 */
	@Test
	public void test_chain(){
		MyHandler handler1=new MyHandler("H1");
		MyHandler handler2=new MyHandler("H2");
		MyHandler handler3=new MyHandler("H3");
		handler1.setHandler(handler2);
		handler2.setHandler(handler3);
		handler1.operation();
	}
	/**
	 * 命令模式
	 */
	@Test
	public void test_command(){
		Command command=new MyCommand(new Reserver());
		Invoke invoke=new Invoke(command);
		invoke.action();
	}
	/**
	 * 备忘录模式
	 */
	@Test
	public void test_memory(){
		Origianl origianl=new Origianl("name");
		//创建备份
		MemoryTo memoryTo = origianl.createMemoryTo();
		//保存备份
		RestoreMemoryTo restoreMemoryTo=new RestoreMemoryTo(memoryTo);
		//修改数据备份
		origianl.setValue("jack");
		System.out.println("修改后："+origianl.getValue());
		//恢復备份
		origianl.restoreMemoryTo(memoryTo);
		System.out.println("恢复后："+origianl.getValue());
	}
	/**
	 * 状态模式
	 */
	@Test
	public void test_state(){
		State state=new State();
		state.setValue("state2");
		Context context=new Context(state);
		context.method();
	}
	/**
	 * 访问者模式
	 */
	@Test
	public void test_vistor(){
		VistorSub vistorSub=new MyVistorSub();
		vistorSub.accept(new MyVistor());
	}
	/**
	 * 中介模式
	 */
	@Test
	public void test_meditar(){
		Meditar meditar=new MyMeditar();
		meditar.createMeditar();
		meditar.workAll();
	}
}

