package net.mamian.designpattern.简单工厂模式;

/**
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2017-02-02 20:13:47
 * @copyright ©2017 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public class OperaterAdd extends Operater {
    public int getResult(int addA, int addB) {
        System.out.println("加法");
        return addA + addB;
    }
}
