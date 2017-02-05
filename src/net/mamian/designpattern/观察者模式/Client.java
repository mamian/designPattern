package net.mamian.designpattern.观察者模式;

/**
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2017-02-04 20:53:10
 * @copyright ©2017 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public class Client {
    public static void main(String[] args) {
        HanFeiZi haiFeiZi = new HanFeiZi();

        Lisi lisi = new Lisi();
        Wangsi wangsi = new Wangsi();
        haiFeiZi.addObserver(lisi);
        haiFeiZi.addObserver(wangsi);


        haiFeiZi.activeOne();
        System.out.println("*******************\n*******************\n*******************");
        haiFeiZi.activeTwo();
    }
}
