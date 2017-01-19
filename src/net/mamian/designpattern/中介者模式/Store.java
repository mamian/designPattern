package net.mamian.designpattern.中介者模式;

/**
 *
 *
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2017-1-19 23:57:41
 * @copyright ?2016 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public class Store extends AbstractColleague {
    public Store(AbstractMediator mediator) {
        super(mediator);
    }

    public void startStore(int num) {
        super.mediator.execute("存储", num);
        System.out.println("Store对象执行startStore方法");
    }
}