package net.mamian.designpattern.责任链模式;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 责任链模式：一个请求，依次交给多个对象去处理，若对象A无法处理，则交给下一下对象B处理，若B无法处理，则交给下一个对象C处理
 * 在父夫子的父类中定义：如果本对象无法处理某项请求，则交给下一个对象处理
 * 而处理请求的对象的顺序在client中实时定义
 *
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2017-02-07 20:54:14
 * @copyright ©2017 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public class Client {
    public static void main(String[] args) {
        //随机挑选几个女性
        Random rand = new Random();
        List<WomenInterface> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList.add(new Women(rand.nextInt(4), "我要出去逛街"));
        }
        //定义三个请示对象
        Handler father = new Father();
        Handler husband = new Husband();
        Handler son = new Son();

        //设置请示顺序
        father.setNext(husband);
        husband.setNext(son);
        for (WomenInterface women : arrayList) {
            father.HandleMessage(women);
        }
    }
}