/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mamian.designpattern.代理模式.statics;

/**
 * 静态代理
 *
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2016-8-18 11:39:42
 * @copyright ©2016 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public class MM {
	
	private String name;

	public MM(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
