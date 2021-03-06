package net.mamian.designpattern.中介者模式;

/**
 * 
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2016-10-2 21:26:45
 * @copyright ©2016 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public class Sell extends AbstractColleague {
    public Sell(AbstractMediator mediator) {
        super(mediator);
    }

    public void startSell(int num) {
        super.mediator.execute("销售", num);
        System.out.println("Sell对象执行startSell方法");
    }
}
