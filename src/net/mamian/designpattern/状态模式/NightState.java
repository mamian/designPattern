package net.mamian.designpattern.状态模式;

/**
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2017-02-01 18:16:59
 * @copyright ©2017 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public class NightState extends State {

    @Override
    public void Coding(Work work) {
        if (work.getHour() < 21) {
            System.out.println("晚上时间，努力编码！");
        } else {
            System.out.println("该下班了！");
        }
    }

}
