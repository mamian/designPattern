package net.mamian.designpattern.中介者模式;

/**
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2016-10-2 21:26:45
 * @copyright ©2016 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public class Client {
    public static void main(String[] args) {
        AbstractMediator mediator = new Mediator();

        Buy buy = new Buy(mediator);
        buy.startBuy(100);

        Sell sell = new Sell(mediator);
        sell.startSell(200);

        Store store = new Store(mediator);
        store.startStore(300);
    }
}
