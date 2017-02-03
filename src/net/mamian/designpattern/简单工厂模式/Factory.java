package net.mamian.designpattern.简单工厂模式;

/**
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2017-02-02 20:15:19
 * @copyright ©2017 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public class Factory {
    private static Operater operater;

    public Factory() {

    }

    public static Operater createOperater(char choose) {
        switch (choose) {
            case '+':
                operater = new OperaterAdd();
                break;
            case '/':
                operater = new OperaterDiv();
                break;
        }
        return operater;
    }
}
