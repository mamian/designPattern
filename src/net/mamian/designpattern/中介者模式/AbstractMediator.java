package net.mamian.designpattern.中介者模式;

/**
 * 抽象中介者：包含所有需将其作为中介者来互相交互信息的子系统或对象
 *
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2016-10-2 21:26:45
 * @copyright ©2016 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public abstract class AbstractMediator {

    protected Buy buy;
    protected Sell sell;
    protected Store store;

    public AbstractMediator() {
        buy = new Buy(this);
        sell = new Sell(this);
        store = new Store(this);
    }

    public abstract void execute(String message, Object obj1);
}