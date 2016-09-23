package net.mamian.designpattern.单例模式;

/**
 * 单例模式-单线程
 *
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2016-9-23 22:45:42
 * @copyright ©2016 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public class Singleton2 {

	private static Singleton2 item = new Singleton2();

	private Singleton2() {
	}

	public static Singleton2 getInstance() {
		return item;
	}
	
}
