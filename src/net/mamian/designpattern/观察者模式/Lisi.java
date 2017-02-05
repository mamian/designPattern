package net.mamian.designpattern.观察者模式;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者对象，实现Observer接口的update(Observable observable, Object arg1)方法，第一个参数为其所观察的对象，第二个参数为被观察者对象传递给自己的信息
 *
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2017-02-04 20:51:38
 * @copyright ©2017 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public class Lisi implements Observer {
    @Override
    public void update(Observable observable, Object arg1) {
        System.out.println("Lisi观察者李斯观察到被观察者韩非子开始进行活动了：" + arg1.toString());
        System.out.println("Lisi观察者李斯观察完毕！");
        System.out.println("Lisi=====================================================");
    }
}
