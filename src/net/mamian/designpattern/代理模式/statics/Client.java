/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mamian.designpattern.代理模式.statics;

/**
 * 静态代理 入口
 *
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2016-8-18 11:39:42
 * @copyright ©2016 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public class Client {
	
	public static void main(String[] args) {
		
		MM mm = new MM("漂亮妹纸");
		GG gg = new GG(mm);
		Proxy proxy = new Proxy(gg);

		proxy.giveGiftA();
		proxy.giveGiftB();
		proxy.giveGiftC();
	}
	
}