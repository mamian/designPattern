package net.mamian.designpattern.责任链模式;

/**
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2017-02-07 20:49:51
 * @copyright ©2017 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public class Husband extends Handler {

    //丈夫只处理妻子的请求
    public Husband() {
        super(2);
    }

    //丈夫请示的答复
    @Override
    public void response(WomenInterface women) {
        System.out.println("--------妻子向丈夫请示-------");
        System.out.println(women.getRequest());
        System.out.println("丈夫的答复是：同意\n");
    }
}