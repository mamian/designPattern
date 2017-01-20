package net.mamian.designpattern.中介者模式;

/**
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2016-10-2 21:26:45
 * @copyright ©2016 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public class Buy extends AbstractColleague {
    public Buy(AbstractMediator mediator) {
        super(mediator);
    }

    public void startBuy(int num) {
        super.mediator.execute("购买", num);
        System.out.println("Buy对象执行startBuy方法");
    }

    public void NotBuy() {
        System.out.println("Buy对象执行NotBuy方法");
    }
}