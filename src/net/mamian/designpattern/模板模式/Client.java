package net.mamian.designpattern.模板模式;

/**
 * 模板模式：抽象父类中定义好各子类要执行的某一个final方法，此方法中调用了抽象父类中的其他方法，并且方法是有序的
 *
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2017-01-31 21:27:18
 * @copyright ©2017 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public class Client {
    public static void main(String[] args) {
        Model modelA = new ModelA();
        modelA.run();

        Model modelB = new ModelB();
        modelB.run();
    }
}
