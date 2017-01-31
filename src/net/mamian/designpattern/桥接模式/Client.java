package net.mamian.designpattern.桥接模式;

/**
 * 手机品牌（品牌A、品牌B）与手机软件（游戏、通讯录）是聚合关系
 * 手机品牌包含手机软件：品牌<>------软件
 *
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2017-01-30 19:25:29
 * @copyright ©2017 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public class Client {
    public static void main(String[] args) {
        Brand brandA = new BrandA();

        brandA.setSoft(new SoftGame());
        brandA.brandRun();

        brandA.setSoft(new SoftAddressList());
        brandA.brandRun();


        Brand brandB = new BrandB();
        brandB.setSoft(new SoftGame());
        brandB.brandRun();
        brandB.setSoft(new SoftAddressList());
        brandB.brandRun();
    }
}
