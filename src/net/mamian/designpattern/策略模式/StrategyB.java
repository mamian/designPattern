package net.mamian.designpattern.策略模式;

/**
 * 具体策略B
 * 具体策略类，实现具体策略的方法
 *
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2016-9-19 11:39:42
 * @copyright ©2016 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public class StrategyB extends Strategy {
    public StrategyB() {
        System.out.println("StrategyB的构造方法执行！");
    }

    public void operate() {
        System.out.println("策略B的方法开始执行！");
    }
}
