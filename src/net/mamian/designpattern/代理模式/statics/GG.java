/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mamian.designpattern.代理模式.statics;

/**
 * 静态代理-被代理类
 *
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2016-8-18 11:39:42
 * @copyright ©2016 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public class GG implements Same_ProxyAndGG {
	
	private MM mm;

	public GG(MM mm) {
		this.mm = mm;
	}

	@Override
	public void giveGiftA() {
		System.out.println("GG送给" + mm.getName() + " GiftA");
	}

	@Override
	public void giveGiftB() {
		System.out.println("GG送给" + mm.getName() + " GiftB");
	}

	@Override
	public void giveGiftC() {
		System.out.println("GG送给" + mm.getName() + " GiftC");
	}
	
}
