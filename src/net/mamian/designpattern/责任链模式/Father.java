package net.mamian.designpattern.责任链模式;

/**
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2017-02-07 20:48:43
 * @copyright ©2017 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public class Father extends Handler {

    public Father() {//父亲只处理女儿的请求
        super(1);
    }

    //父亲的答复
    @Override
    public void response(WomenInterface women) {
        System.out.println("--------女儿向父亲请示-------");
        System.out.println(women.getRequest());
        System.out.println("父亲的答复是:同意\n");
    }
}
