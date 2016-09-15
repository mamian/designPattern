/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mamian.designpattern.代理模式.statics;

/**
 * 静态代理-代理类(包含被代理对象)
 *
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2016-8-18 11:39:42
 * @copyright ©2016 马面 All Rights Reserved 
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public class Proxy implements Same_ProxyAndGG {
	
	//被代理人
	private GG gg;

	public Proxy(GG gg) {
		this.gg = gg;
	}

	@Override
	public void giveGiftA() {
		gg.giveGiftA();
	}

	@Override
	public void giveGiftB() {
		gg.giveGiftB();
	}

	@Override
	public void giveGiftC() {
		gg.giveGiftC();
	}
}
