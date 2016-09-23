package net.mamian.designpattern.单例模式;

/**
 * 单例模式-多线程
 *
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2016-9-23 22:47:36
 * @copyright ©2016 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public class Singleton3 {

	private static Singleton3 item;

	private Singleton3() {
	}

	public static Singleton3 getInstance() {
		if(null == item){
			synchronized(Singleton3.class){
				if(null == item){
					item = new Singleton3();
				}
			}
		}
		return item;
	}
	
}
