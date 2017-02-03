package net.mamian.designpattern.简单工厂模式;

/**
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2017-02-02 20:14:26
 * @copyright ©2017 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public class OperaterDiv extends Operater {
    public int getResult(int divA, int divB) {
        System.out.println("除法");
        return divA / divB;
    }
}
