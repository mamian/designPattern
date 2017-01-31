package net.mamian.designpattern.桥接模式;

/**
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2017-01-30 19:17:39
 * @copyright ©2017 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public class BrandB extends Brand {
    @Override
    public void brandRun() {
        soft.softRun();
    }
}
