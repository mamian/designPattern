package net.mamian.designpattern.策略模式;

/**
 * 策略模式 入口
 * <p/>
 * 客户端类
 * 实例化一个容器对象，此对象中会包含一个具体的策略
 * 再执行容器实例的方法（此方法会调用具体策略的方法）
 *
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2016-9-19 11:39:42
 * @copyright ©2016 马面 All Rights Reserved DO NOT ALTER OR REMOVE COPYRIGHT
 * NOTICES OR THIS FILE HEADER.
 */
public class Client {
    public static void main(String[] args) {
        Context ctx1 = new Context(new StrategyA());
        ctx1.myOperate();

        Context ctx2 = new Context(new StrategyB());
        ctx2.myOperate();
    }
}
