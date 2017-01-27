package net.mamian.designpattern.多例模式;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 多例模式
 *
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2017-01-26 19:17:19
 * @copyright ©2017 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public class Multiton {
    private static int maxInstanceNum = 10;//最大实例数量
    private static int nowInstanceNum = 0;//当前实便编号
    private static List<Multiton> instanceList = new ArrayList<Multiton>();//实例列表
    private static List<String> instanceNameList = new ArrayList<String>();//实例名称的列表

    static {//把所有的皇帝都产生出来
        for (int i = 0; i < maxInstanceNum; i++) {
            instanceList.add(new Multiton("皇" + (i + 1) + "帝"));
        }
    }

    //private Multiton() {}
    private Multiton(String name) {
        instanceNameList.add(name);
    }

    public static Multiton getInstance() {
        Random random = new Random();
        nowInstanceNum = random.nextInt(maxInstanceNum); //随机拉出一个皇帝，只要是个精神领袖就成
        return (Multiton) instanceList.get(nowInstanceNum);
    }

    public static void emperorInfo() {
        System.out.println(instanceNameList.get(nowInstanceNum));
    }
}