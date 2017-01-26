package net.mamian.designpattern.策略模式;

/**
 * 具体策略A
 * 具体策略类，实现具体策略的方法
 *
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2016-9-19 11:39:42
 * @copyright ©2016 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public class StrategyA extends Strategy {
    public StrategyA() {
        System.out.println("StrategyA的构造方法执行！");
    }

    public void operate() {
        System.out.println("策略A的方法开始执行！");
    }
}
