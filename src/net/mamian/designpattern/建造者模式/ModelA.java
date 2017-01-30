package net.mamian.designpattern.建造者模式;

/**
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2017-01-28 20:16:32
 * @copyright ©2017 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public class ModelA extends Model {

    @Override
    protected void start() {
        System.out.println("车辆A启动");
    }

    @Override
    protected void alarm() {
        System.out.println("车辆A鸣迪");
    }

    @Override
    protected void stop() {
        System.out.println("车辆A刹车");
    }

}
