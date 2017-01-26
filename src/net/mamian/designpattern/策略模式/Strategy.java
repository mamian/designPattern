package net.mamian.designpattern.策略模式;

/**
 * 抽象策略类
 * 策略父类，定义所有策略的公共方法
 *
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2016-9-19 11:39:42
 * @copyright ©2016 马面 All Rights Reserved DO NOT ALTER OR REMOVE COPYRIGHT
 * NOTICES OR THIS FILE HEADER.
 */
public abstract class Strategy {
    public Strategy() {
        System.out.println("Strategy的构造方法执行！");
    }

    public abstract void operate();
}
