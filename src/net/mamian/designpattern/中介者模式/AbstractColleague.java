package net.mamian.designpattern.中介者模式;

/**
 * 包含一个protected修饰的抽象中介者对象mediator，其所有的对象可共享此中介者并调用此中介者的方法
 *
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2016-10-2 21:26:45
 * @copyright ©2016 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public class AbstractColleague {

    protected AbstractMediator mediator;

    public AbstractColleague(AbstractMediator mediator) {
        this.mediator = mediator;
    }

}