package net.mamian.designpattern.桥接模式;

/**
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2017-01-30 19:21:46
 * @copyright ©2017 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public class SoftAddressList implements Soft {
    @Override
    public void softRun() {
        System.out.println("手机通讯录运行");
    }

}
