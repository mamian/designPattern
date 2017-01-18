package net.mamian.designpattern.单例模式;

/**
 * 单例模式-单线程
 * 
 * 实例为静态成员
 * 构造方法为private
 * 静态方法返回惟一实例
 *
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2016-9-23 22:45:42
 * @copyright ©2016 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public class Singleton {
	private static Singleton item;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (item == null)
			item = new Singleton();
		return item;
	}

}
