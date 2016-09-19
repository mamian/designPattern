package net.mamian.designpattern.策略模式;

/**
 * 策略模式 入口
 *
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2016-9-19 11:39:42
 * @copyright ©2016 马面 All Rights Reserved DO NOT ALTER OR REMOVE COPYRIGHT
 * NOTICES OR THIS FILE HEADER.
 */
public class Client {
	public static void main(String[] args){
		Context ctx1 = new Context(new StrategyA());
		ctx1.myOperate();
		
		Context ctx2 = new Context(new StrategyB());
		ctx2.myOperate();
	}
}
