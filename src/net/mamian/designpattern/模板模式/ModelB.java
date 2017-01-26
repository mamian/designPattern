package net.mamian.designpattern.模板模式;

/**
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2017-01-31 21:25:54
 * @copyright ©2017 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public class ModelB extends Model {

    @Override
    protected void start() {
        System.out.println("车辆B启动");
    }

    @Override
    protected void alarm() {
        System.out.println("车辆B鸣迪");
    }

    @Override
    protected void stop() {
        System.out.println("车辆B刹车");
    }

}
