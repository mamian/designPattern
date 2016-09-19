package net.mamian.designpattern.策略模式;

/**
 * 存储策略的容器类
 * 容器类要实现一个方法，在此方法中调用其所包含的具体策略的方法
 *
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2016-9-19 11:39:42
 * @copyright ©2016 马面 All Rights Reserved DO NOT ALTER OR REMOVE COPYRIGHT
 * NOTICES OR THIS FILE HEADER.
 */
public class Context {
	Strategy myStrategy;
	public Context(Strategy strategy) {
		System.out.println("Context的构造方法执行！");
		myStrategy = strategy;
	}
	
	public void myOperate(){
		myStrategy.operate();
	}
}
