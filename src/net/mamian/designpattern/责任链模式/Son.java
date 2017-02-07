package net.mamian.designpattern.责任链模式;

/**
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2017-02-07 20:51:12
 * @copyright ©2017 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public class Son extends Handler {

    //儿子只处理母亲的请求
    public Son() {
        super(3);
    }

    //儿子的答复
    public void response(WomenInterface women) {
        System.out.println("--------母亲向儿子请示-------");
        System.out.println(women.getRequest());
        System.out.println("儿子的答复是：同意\n");
    }
}