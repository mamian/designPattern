package net.mamian.designpattern.简单工厂模式;

/**
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2017-02-02 20:16:33
 * @copyright ©2017 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public class Client {
    public static void main(String[] args) {
        Operater operater = Factory.createOperater('+');
        int result = operater.getResult(15, 25);
        System.out.println(result);
    }
}
